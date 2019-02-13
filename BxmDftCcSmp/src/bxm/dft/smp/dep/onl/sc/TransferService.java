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
import bxm.dft.service.DefaultServiceExecutor;
import bxm.dft.smp.com.onl.bc.CustomerAccountCommon;
import bxm.instance.NestedCheckedException;
import bxm.instance.NestedRuntimeException;
import bxm.dft.smp.com.onl.bc.dto.CustomerAccountCommonIn;
import bxm.dft.smp.com.onl.bc.dto.CustomerAccountCommonOut;
import bxm.dft.smp.dep.onl.sc.dto.DepositServiceIn;
import bxm.dft.smp.dep.onl.sc.dto.DepositServiceOut;
import bxm.dft.smp.dep.onl.sc.dto.PaymentServiceIn;
import bxm.dft.smp.dep.onl.sc.dto.PaymentServiceOut;
import bxm.dft.smp.dep.onl.sc.dto.TransferServiceIn;
import bxm.dft.smp.dep.onl.sc.dto.TransferServiceOut;

/**
 * @file kdb.poc.dep.onl.sc.TransferService.java
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
@BxmService("TransferService")
@BxmCategory(logicalName = "이체서비스", description = "이체를 하는 서비스 입니다.")
public class TransferService {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CustomerAccountCommon customerAccountCommon;

	@BxmServiceOperation("transfer_service")
	@BxmCategory(logicalName = "이체서비스", description = "입금계좌와 출금계좌 정보를 받아 이체를 하는 서비스")
	public TransferServiceOut transfer_service(TransferServiceIn in)
			throws NestedRuntimeException, NestedCheckedException, DefaultApplicationException {

		logger.debug("service IN {}", in);

		/**
		 * 입력 검증
		 */
		this.inputValidation(in);

		/**
		 * 출금서비스 호출
		 */
		/////////////////////////////////////////////////////////////////////
		// TODO 3.5. 출금 서비스 호출 코드 작성↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
		PaymentServiceIn paymentServiceIn = new PaymentServiceIn();
		paymentServiceIn.setCusNo(in.getCusNo());
		paymentServiceIn.setAccNum(in.getPayAccNum());
		paymentServiceIn.setAmt(in.getAmt());
		paymentServiceIn.setAccPw(in.getAccPw());

/*		PaymentServiceOut paymentServiceOut = 
				(PaymentServiceOut) BxmServiceExecutor.execute(
						"SPOC0001A002"
						, paymentServiceIn
						, true 트랜잭션 분리 TODO 4.6.1 이체 연동 거래 다중 트랜잭션 제어 
						);*/

		PaymentServiceOut paymentServiceOut = 
				(PaymentServiceOut) DefaultServiceExecutor.execute(
						"SPOC0001A002"
						, paymentServiceIn
						);
		/**
		 * 출금 응답 검증
		 */
		if (paymentServiceOut == null) {
			/**
			 * 출금 오류
			 */
			throw new DefaultApplicationException("BXM30000", new Object[]{"출금서비스 오류"});
		}

		// TODO 3.5. 출금 서비스 호출 코드 작성↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
		/////////////////////////////////////////////////////////////////////
		/**
		 * 입금서비스 호출
		 */
		DepositServiceOut depositServiceOut = this.callDepositService(in);

		/**
		 * 총계정반영용 업무로그 설정
		 */
		this.setApplog(in);

		/**
		 * 출금계좌 응답값 설정
		 */
		TransferServiceOut out = this.createOutput(paymentServiceOut, depositServiceOut);

		return out;
	}

	@BxmCategory(logicalName = "입력항목검증", description = "입력항목에 대해 검증한다")
	private void inputValidation(TransferServiceIn in) throws DefaultApplicationException {

		/**
		 * 입력항목 null 체크
		 */
		if (in == null) {
			/**
			 * 입력항목 null
			 */
			throw new DefaultApplicationException("BXM30000", new Object[]{"입력값이 없습니다"});
		}
		/**
		 * 입력항목 누락 체크
		 */
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
			 * 출금계좌번호 항목 누락 체크
			 */
			if (StringUtils.isEmpty(in.getPayAccNum())) {
				/**
				 * 출금계좌번호 항목 누락
				 */
				throw new DefaultApplicationException("BXM30000", new Object[]{"출금계좌번호를 입력해주세요"});
			}
			/**
			 * 비밀번호 항목 누락 체크
			 */
			if (StringUtils.isEmpty(in.getAccPw())) {
				/**
				 * 비밀번호 항목 누락
				 */
				throw new DefaultApplicationException("BXM30000", new Object[]{"출금계좌비밀번호를 입력해주세요"});
			}
			/**
			 * 입금고객번호 항목 누락 체크
			 */
			if (StringUtils.isEmpty(in.getDepCusNo())) {
				/**
				 * 입금고객번호 항목 누락
				 */
				throw new DefaultApplicationException("BXM30000", new Object[]{"입금할 계좌의 고객번호를 입력해주세요"});
			}
			/**
			 * 입금계좌번호 항목 누락 체크
			 */
			if (StringUtils.isEmpty(in.getDepAccNum())) {
				/**
				 * 입금계좌번호 항목 누락
				 */
				throw new DefaultApplicationException("BXM30000", new Object[]{"입금할 계좌번호를 입력해주세요"});
			}
			/**
			 * 금액 체크
			 */
			if (in.getAmt() == null || in.getAmt().compareTo(BigDecimal.ZERO) <= 0) {
				/**
				 * 입금 금액이 비었거나 0보다 작거나 같음
				 */
				throw new DefaultApplicationException("BXM30000", new Object[]{"이체금액을 정확히 입력해주세요"});
			}
		}

		logger.debug("service 입력금액 : {}", in.getAmt());

		/**
		 * 시나리오 4.2 강제 에러 임의 발생 ( 입력금액 800만원일 때 )
		 */
		/* TODO 4.2.2. 800 만원 이체 에러 처리
		if (in.getAmt().compareTo(BigDecimal.valueOf(8000000)) >= 0) {
			// 800만원
			throw new BxmApplicationException("BXM30000", "이체금액 검증 오류입니다.");
		}
		//*/
	}

	@BxmCategory(logicalName = "출금서비스호출", description = "출금서비스호출")
	private PaymentServiceOut callPaymentService(TransferServiceIn in) throws DefaultApplicationException {

		PaymentServiceIn paymentServiceIn = new PaymentServiceIn();
		paymentServiceIn.setCusNo(in.getCusNo());
		paymentServiceIn.setAccNum(in.getPayAccNum());
		paymentServiceIn.setAmt(in.getAmt());
		paymentServiceIn.setAccPw(in.getAccPw());

		PaymentServiceOut paymentServiceOut = 
				(PaymentServiceOut) DefaultServiceExecutor.execute(
						"SPOC0001A002"
						, paymentServiceIn
						);

//		PaymentServiceOut paymentServiceOut = 
//				(PaymentServiceOut) BxmServiceExecutor.execute(
//						"SPOC0001A002"
//						, paymentServiceIn
//						, true /*트랜잭션 분리 TODO 4.6.1 이체 연동 거래 다중 트랜잭션 제어*/ 
//						);
//		
		/**
		 * 출금 응답 검증
		 */
		if (paymentServiceOut == null) {
			/**
			 * 출금 오류
			 */
			throw new DefaultApplicationException("BXM30000", new Object[]{"출금서비스 오류"});
		}

		return paymentServiceOut;
	}

	@BxmCategory(logicalName = "입금서비스호출", description = "입금서비스호출")
	private DepositServiceOut callDepositService(TransferServiceIn in) throws DefaultApplicationException {

		DepositServiceIn depositServiceIn = new DepositServiceIn();
		depositServiceIn.setCusNo(in.getDepCusNo());
		depositServiceIn.setAccNum(in.getDepAccNum());
		depositServiceIn.setAmt(in.getAmt());

		DepositServiceOut depositServiceOut = 
				(DepositServiceOut) DefaultServiceExecutor.execute(
						"SPOC0001A001"
						, depositServiceIn
						);

//		DepositServiceOut depositServiceOut = 
//				(DepositServiceOut) BxmServiceExecutor.execute(
//						"SPOC0001A001"
//						, depositServiceIn
//						, true /*트랜잭션 분리 TODO 4.6.1 이체 연동 거래 다중 트랜잭션 제어*/ 
//						);
//		
		/**
		 * 입금 응답 검증
		 */
		if (depositServiceOut == null) {
			/**
			 * 입금 오류
			 */
			throw new DefaultApplicationException("BXM30000", new Object[]{"입금서비스 오류"});
		}

		return depositServiceOut;
	}

	@BxmCategory(logicalName = "업무로그설정", description = "총계정반영을 위한 업무로그 설정")
	private void setApplog(TransferServiceIn in) throws DefaultApplicationException {

		CustomerAccountCommonOut customerAccountCommonOut = this.callCustomerAccountCommon(in.getCusNo(),
				in.getPayAccNum());

		logger.debug("============== APP LOG SETTING START ==============");
		DefaultApplicationContext.getBxmTrxLog().setOpenBranchNo(String.valueOf(customerAccountCommonOut.getOpBrch()));
		DefaultApplicationContext.getBxmTrxLog().setTrxAmt(in.getAmt());
		DefaultApplicationContext.getBxmTrxLog().setAcctNo(in.getPayAccNum());
//		BxmApplicationContext.getBxmAppLogComm().setOpBrch(customerAccountCommonOut.getOpBrch()); // 계좌개설점
//		BxmApplicationContext.getBxmAppLogComm().setTrxAmt(in.getAmt()); // 거래금액
//		BxmApplicationContext.getBxmAppLogComm().setTrxType(3); // 거래종류
//		BxmApplicationContext.getBxmAppLogComm().setAccNum(in.getPayAccNum()); // 계좌번호
		logger.debug("============== APP LOG SETTING END ================");

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

	@BxmCategory(logicalName = "응답전문조립", description = "출금계좌정보와 출금 후 잔액을 표시")
	private TransferServiceOut createOutput(PaymentServiceOut paymentServiceOut, DepositServiceOut depositServiceOut) {

		TransferServiceOut out = new TransferServiceOut();
		out.setCusNm(paymentServiceOut.getCusNm());
		out.setAccNum(paymentServiceOut.getAccNum());
		out.setAmt(paymentServiceOut.getAmt());

		return out;

	}
}
