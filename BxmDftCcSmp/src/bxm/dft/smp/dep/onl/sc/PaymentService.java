package bxm.dft.smp.dep.onl.sc;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import bxm.common.annotaion.BxmCategory;
import bxm.common.util.StringUtils;
import bxm.container.annotation.BxmService;
import bxm.container.annotation.BxmServiceOperation;
import bxm.dft.app.DefaultApplicationException;
import bxm.dft.smp.com.onl.bc.CustomerAccountCommon;
import bxm.dft.smp.com.onl.bc.dto.CustomerAccountCommonIn;
import bxm.dft.smp.com.onl.bc.dto.CustomerAccountCommonOut;
import bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO;
import bxm.dft.smp.dep.onl.dao.PaymentDAO;
import bxm.dft.smp.dep.onl.sc.dto.PaymentServiceIn;
import bxm.dft.smp.dep.onl.sc.dto.PaymentServiceOut;
import bxm.instance.NestedCheckedException;
import bxm.instance.NestedRuntimeException;

/**
 * @file kdb.poc.dep.onl.sc.PaymentService.java
 * @filetype java source file
 * @brief
 * @author 개발자(한글이름)
 * @version 0.1
 * @history
 * 
 * 			<pre>
 * 버전          성명                   일자              변경내용
 * -------       ----------------       -----------       -----------------
 * 0.1           개발자(한글이름)       2015. 12. 9.       신규 작성
 *          </pre>
 */
@BxmService("PaymentService")
@BxmCategory(logicalName = "출금서비스", description = "출금을 하는 서비스 입니다.")
public class PaymentService {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PaymentDAO paymentDAO;

	@Autowired
	private CustomerAccountCommon customerAccountCommon;

	@BxmServiceOperation("payment_service")
	@BxmCategory(logicalName = "출금서비스", description = "입력값을 받아 출금을 처리하는 프로세스")
	public PaymentServiceOut payment_service(PaymentServiceIn in)
			throws NestedRuntimeException, NestedCheckedException, DefaultApplicationException {

		/**
		 * 입력 항목 체크
		 */
		this.inputValidation(in);

		/**
		 * 고객/계좌조회 공통 호출
		 */
		CustomerAccountCommonOut customerAccountCommonOut = this.callCustomerAccountCommon(in.getCusNo(),
				in.getAccNum());

		/**
		 * 비밀번호 검증
		 */
		this.checkPassword(customerAccountCommonOut.getAccPW(), in.getAccPw());

		/**
		 * 출금금액검증
		 */
		this.checkPaymentAmt(customerAccountCommonOut.getAmt(), in.getAmt());

		/**
		 * 변경금액 계산 (잔액-입금금액)
		 */
		BigDecimal amt = this.calculateAmt(customerAccountCommonOut.getAmt(), in.getAmt());

		/**
		 * 계좌 잔액 UPDATE
		 */
		this.updateAccountAmt(customerAccountCommonOut, amt);

		/**
		 * 총계정반영용 업무로그 설정
		 */
		this.setApplog(in, customerAccountCommonOut);

		/**
		 * 고객/계좌 조회 응답값 설정
		 */
		PaymentServiceOut out = this.createOutput(customerAccountCommonOut, amt);

		return out;

	}

	@BxmCategory(logicalName = "입력값 체크", description = "필수입력값에 대해 체크")
	private void inputValidation(PaymentServiceIn in) throws DefaultApplicationException {
		/**
		 * 입력값 null 체크
		 */
		if (in == null) {
			/**
			 * 입력값 null
			 */
			throw new DefaultApplicationException("BXM30000", new Object[]{"입력값이 없습니다"});
		}
		/** 입력항목 누락 체크 */
		else {
			/**
			 * 고객번호 항목 누락 체크
			 */
			if (StringUtils.isEmpty(in.getCusNo())) {
				/**
				 * 고객번호 항목 누락
				 */
				throw new DefaultApplicationException("BXM30000", new Object[]{"고객번호를 입력해주세요"});
			}
			/**
			 * 계좌번호 항목 누락 체크
			 */
			if (StringUtils.isEmpty(in.getAccNum())) {
				/**
				 * 계좌번호 항목 누락
				 */
				throw new DefaultApplicationException("BXM30000", new Object[]{"계좌번호를 입력해주세요"});
			}
			/**
			 * 출금 금액 체크
			 */
			if (in.getAmt() == null || in.getAmt().compareTo(BigDecimal.ZERO) <= 0) {
				/**
				 * 출금 금액이 비었거나 0보다 작거나 같음
				 */
				throw new DefaultApplicationException("BXM30000", new Object[]{"출금금액을 정확히 입력해주세요"});
			}
			/**
			 * 비밀번호 항목 누락 체크
			 */
			if (StringUtils.isEmpty(in.getAccPw())) {
				/**
				 * 비밀번호 항목 누락
				 */
				throw new DefaultApplicationException("BXM30000", new Object[]{"비밀번호를 입력해주세요"});
			}
		}

	}

	@BxmCategory(logicalName = "고객계좌공통모듈호출", description = "고객/계좌정보를 조회하기 위해 공통모듈 호출")
	private CustomerAccountCommonOut callCustomerAccountCommon(String cusNo, String accNum)
			throws DefaultApplicationException {

		CustomerAccountCommonIn customerAccountCommonIn = new CustomerAccountCommonIn();
		customerAccountCommonIn.setCusNo(cusNo);
		customerAccountCommonIn.setAccNum(accNum);

		CustomerAccountCommonOut customerAccountCommonOut = customerAccountCommon
				.customer_account_common(customerAccountCommonIn);

		/** 고객/계좌조회 공통 조회에 대한 응답 검증 */
		if (customerAccountCommonOut == null) {
			/** 고객/계좌정보 없음 */
			throw new DefaultApplicationException("BXM30000", new Object[]{"고객/계좌정보가 존재하지 않습니다"});
		}

		return customerAccountCommonOut;

	}

	@BxmCategory(logicalName = "비밀번호검증", description = "입력한 비밀번호와 계좌정보의 비밀번호를 비교한다")
	private void checkPassword(String accPw, String inAccPw) throws DefaultApplicationException {
		/**
		 * 비밀번호 검증
		 */
		if (!accPw.equals(inAccPw)) {
			/**
			 * 비밀번호 불일치
			 */
			throw new DefaultApplicationException("BXM30000", new Object[]{"비밀번호가 일치하지 않습니다"});
		}
	}

	@BxmCategory(logicalName = "출금금액검증", description = "출금금액과 고객/계좌조회공통 출력 잔액 비교")
	private void checkPaymentAmt(BigDecimal amt, BigDecimal inAmt) throws DefaultApplicationException {

		/**
		 * 출금금액 검증
		 */
		if (amt.compareTo(inAmt) < 0) {
			/**
			 * 잔액부족
			 */
			throw new DefaultApplicationException("BXM30000", new Object[]{"잔액 부족"});
		}
	}

	@BxmCategory(logicalName = "변경금액계산", description = "계좌잔액에 출금금액을 감한다")
	private BigDecimal calculateAmt(BigDecimal bfAmt, BigDecimal deAmt) {

		BigDecimal afAmt = bfAmt.subtract(deAmt); // 현재잔액 - 출금금액

		return afAmt;
	}

	@BxmCategory(logicalName = "잔액업데이트", description = "입금처리를 위해 잔액 업데이트, 잔액변경 후 1초 sleep")
	private void updateAccountAmt(CustomerAccountCommonOut customerAccountCommonOut, BigDecimal amt)
			throws DefaultApplicationException {

		SmpRcpMstIO kdbRcpMstIO = new SmpRcpMstIO();
		kdbRcpMstIO.setCusId(customerAccountCommonOut.getCusId());
		kdbRcpMstIO.setAccNum(customerAccountCommonOut.getAccNum());
		kdbRcpMstIO.setAmt(amt);

		int rslt = paymentDAO.payment_dao(kdbRcpMstIO);

		/** 잔액변경 정상여부 */
		if (rslt != 1) {
			/** 잔액변경 오류 */
			throw new DefaultApplicationException("BXM30000", new Object[]{"잔액변경오류"});
		}

	}

	@BxmCategory(logicalName = "업무로그설정", description = "총계정반영을 위한 업무로그 설정")
	private void setApplog(PaymentServiceIn in, CustomerAccountCommonOut customerAccountCommonOut) {

		logger.debug("============== APP LOG SETTING START ==============");
//		BxmApplicationContext.getBxmAppLogComm().setOpBrch(customerAccountCommonOut.getOpBrch()); // 계좌개설점
//		BxmApplicationContext.getBxmAppLogComm().setTrxAmt(in.getAmt()); // 거래금액
//		BxmApplicationContext.getBxmAppLogComm().setTrxType(2); // 거래종류
//		BxmApplicationContext.getBxmAppLogComm().setAccNum(in.getAccNum()); // 계좌번호
		logger.debug("============== APP LOG SETTING END ================");

	}

	@BxmCategory(logicalName = "응답전문조립", description = "출금계좌정보와 출금 후 잔액을 표시")
	private PaymentServiceOut createOutput(CustomerAccountCommonOut customerAccountCommonOut, BigDecimal amt) {

		PaymentServiceOut out = new PaymentServiceOut();
		out.setCusNm(customerAccountCommonOut.getCusNm());
		out.setAccNum(customerAccountCommonOut.getAccNum());
		out.setAmt(amt);

		return out;
	}
}
