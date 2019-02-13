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
import bxm.dft.context.DefaultApplicationContext;
import bxm.dft.smp.com.onl.bc.CustomerAccountCommon;
import bxm.dft.smp.com.onl.bc.dto.CustomerAccountCommonIn;
import bxm.dft.smp.com.onl.bc.dto.CustomerAccountCommonOut;
import bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO;
import bxm.dft.smp.dep.onl.dao.DepositDAO;
import bxm.dft.smp.dep.onl.sc.dto.DepositServiceIn;
import bxm.dft.smp.dep.onl.sc.dto.DepositServiceOut;
import bxm.instance.NestedCheckedException;
import bxm.instance.NestedRuntimeException;

/**
 * @file kdb.poc.dep.onl.sc.DepositService.java
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
@BxmService("DepositService")
@BxmCategory(logicalName = "입금서비스", description = "입금을 하는 서비스 입니다.")
public class DepositService {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CustomerAccountCommon customerAccountCommon;

	@Autowired
	private DepositDAO depositDAO;

	@BxmServiceOperation("deposit_service")
	@BxmCategory(logicalName = "입금서비스", description = "입력값을 받아 입금을 처리하는 프로세스")
	public DepositServiceOut deposit_service(DepositServiceIn in)
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
		 * 변경금액 계산 (잔액+입금금액)
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
		DepositServiceOut out = this.createOutput(customerAccountCommonOut, amt);

		return out;

	}

	@BxmCategory(logicalName = "입력값 체크", description = "필수입력값에 대해 체크")
	private void inputValidation(DepositServiceIn in) throws DefaultApplicationException {

		/**
		 * 입력값 null 체크
		 */
		if (in == null) {
			/**
			 * 입력값 null
			 */
			throw new DefaultApplicationException("BXM30000", new Object[]{"입력값이 없습니다"});
		}
		/**
		 * 입력항목 누락 체크
		 */
		else {
			/**
			 * 고객번호 누락 체크
			 */
			if (StringUtils.isEmpty(in.getCusNo())) {
				/**
				 * 고객번호 항목 누락
				 */
				throw new DefaultApplicationException("BXM30000", new Object[]{"고객번호를 입력해주세요"});
			}
			/**
			 * 계좌번호 누락 체크
			 */
			if (StringUtils.isEmpty(in.getAccNum())) {
				/**
				 * 계좌번호 항목 누락
				 */
				throw new DefaultApplicationException("BXM30000", new Object[]{"계좌번호를 입력해주세요"});
			}
			/**
			 * 입금 금액 체크
			 */
			if (in.getAmt() == null || in.getAmt().compareTo(BigDecimal.ZERO) <= 0) {
				/**
				 * 입금 금액이 비었거나 0보다 작거나 같음
				 */
				throw new DefaultApplicationException("BXM30000", new Object[]{"입금하실 금액을 정확히 입력해주세요"});
			}
		}

		/* TODO 4.6.2 특정고객번호 강제 에러 처리 ( 고객번호 2 일 때 )
		if ("2".equals(in.getCusNo())) {
			// 고객 번호
			throw new BxmApplicationException("BXM30000", "입금처리 강제 오류발생");
		}
		//*/

	}

	@BxmCategory(logicalName = "고객계좌공통모듈호출", description = "고객/계좌정보를 조회하기 위해 공통모듈 호출")
	private CustomerAccountCommonOut callCustomerAccountCommon(String cusNo, String accNum)
			throws DefaultApplicationException {

		CustomerAccountCommonIn customerAccountCommonIn = new CustomerAccountCommonIn();
		customerAccountCommonIn.setCusNo(cusNo);
		customerAccountCommonIn.setAccNum(accNum);

		CustomerAccountCommonOut customerAccountCommonOut = customerAccountCommon
				.customer_account_common(customerAccountCommonIn);

		/**
		 * 고객/계좌조회 공통 조회에 대한 응답 검증
		 */
		if (customerAccountCommonOut == null) {
			/**
			 * 고객/계좌정보 없음
			 */
			throw new DefaultApplicationException("BXM30000", new Object[]{"고객/계좌정보가 없습니다"});
		}

		return customerAccountCommonOut;
	}

	@BxmCategory(logicalName = "변경금액계산", description = "계좌잔액에 입금금액을 더한다")
	private BigDecimal calculateAmt(BigDecimal bfAmt, BigDecimal adAmt) {

		BigDecimal afAmt = bfAmt.add(adAmt);

		return afAmt;
	}

	@BxmCategory(logicalName = "잔액업데이트", description = "입금처리를 위해 잔액 업데이트, 잔액변경 후 1초 sleep")
	private void updateAccountAmt(CustomerAccountCommonOut customerAccountCommonOut, BigDecimal amt)
			throws DefaultApplicationException {

		SmpRcpMstIO kdbRcpMstIO = new SmpRcpMstIO();
		kdbRcpMstIO.setCusId(customerAccountCommonOut.getCusId());
		kdbRcpMstIO.setAccNum(customerAccountCommonOut.getAccNum());
		kdbRcpMstIO.setAmt(amt);

		int rslt = depositDAO.deposit_dao(kdbRcpMstIO);

		/** 잔액변경 정상여부 */
		if (rslt != 1) {
			/** 잔액변경 오류 */
			throw new DefaultApplicationException("BXM30000", new Object[]{"잔액변경 오류"});
		}

		/** 1초 sleep */
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			logger.debug("skip");
		}

	}

	@BxmCategory(logicalName = "업무로그설정", description = "총계정반영을 위한 업무로그 설정")
	private void setApplog(DepositServiceIn in, CustomerAccountCommonOut customerAccountCommonOut) {

		logger.debug("============== APP LOG SETTING START ==============");
		DefaultApplicationContext.getBxmTrxLog().setOpenBranchNo(String.valueOf(customerAccountCommonOut.getOpBrch()));
		DefaultApplicationContext.getBxmTrxLog().setTrxAmt(in.getAmt());
		DefaultApplicationContext.getBxmTrxLog().setAcctNo(in.getAccNum());
		DefaultApplicationContext.getBxmTrxLog().setTrxTypeCd("01");
//		BxmApplicationContext.getBxmAppLogComm().setOpBrch(customerAccountCommonOut.getOpBrch()); // 계좌개설점
//		BxmApplicationContext.getBxmAppLogComm().setTrxAmt(in.getAmt()); // 거래금액
//		BxmApplicationContext.getBxmAppLogComm().setTrxType(1); // 거래종류
//		BxmApplicationContext.getBxmAppLogComm().setAccNum(in.getAccNum()); // 계좌번호
		logger.debug("============== APP LOG SETTING END ================");

	}

	@BxmCategory(logicalName = "응답전문조립", description = "입금계좌정보와 입금 후 잔액을 표시")
	private DepositServiceOut createOutput(CustomerAccountCommonOut customerAccountCommonOut, BigDecimal amt) {

		DepositServiceOut out = new DepositServiceOut();
		out.setCusNm(customerAccountCommonOut.getCusNm());
		out.setAccNum(customerAccountCommonOut.getAccNum());
		out.setAmt(amt);

		return out;

	}

}
