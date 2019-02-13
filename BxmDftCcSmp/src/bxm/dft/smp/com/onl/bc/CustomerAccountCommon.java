package bxm.dft.smp.com.onl.bc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import bxm.common.annotaion.BxmCategory;
import bxm.common.util.StringUtils;
import bxm.container.annotation.BxmBean;
import bxm.dft.app.DefaultApplicationException;
import bxm.dft.smp.com.onl.bc.dto.CustomerAccountCommonIn;
import bxm.dft.smp.com.onl.bc.dto.CustomerAccountCommonOut;
import bxm.dft.smp.com.onl.dao.CustomerAccountCommonDAO;
import bxm.dft.smp.com.onl.dao.dto.SmpCusMstIO;
import bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO;

/**
 * @file kdb.poc.com.onl.bc.CustomerAccountCommon.java
 * @filetype java source file
 * @brief
 * @author 개발자(한글이름)
 * @version 0.1
 * @history <pre>
 * 버전          성명                   일자              변경내용
 * -------       ----------------       -----------       -----------------
 * 0.1           개발자(한글이름)       2015. 12. 11.       신규 작성
 * </pre>
 */
@BxmBean
@BxmCategory(logicalName = "고객계좌조회공통", description = "고객계좌조회공통")
public class CustomerAccountCommon {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	//* TODO 3.6.1 SQL 호출 프로그램 생성
	@Autowired
	private CustomerAccountCommonDAO customerAccountCommonDAO;
	//*/
	
	/*  TODO 3.10.2 코드 인스펙션 - 비즈니스 로직에서 서비스 호출 
	@Autowired
	private TransferService transferService;
	//*/
	
	@BxmCategory(logicalName = "고객/계좌 조회(공통)", description = "서비스 처리 시 고객/계좌 조회 공통 연동 호출")
	public CustomerAccountCommonOut customer_account_common(
			CustomerAccountCommonIn in) throws DefaultApplicationException {
		
		/*  TODO 3.10.2 코드 인스펙션 - 비즈니스 로직에서 서비스 호출 금지 
		try {
			transferService.transfer_service(new TransferServiceIn());
		} catch (Exception e) {
			logger.debug("");
		}
		//*/
		
		/* TODO 3.10.1. 코드 인스펙션 - System.out.println() 금지
		System.out.println("금지");
		//*/
		
		/**
		 * 입력 항목 체크
		 */
		this.inputValidation(in);
		
		/**
		 * 고객정보조회
		 */
		SmpCusMstIO kdbCusMstIO = this.getCustomerInfo(in.getCusNo());

		/**
		 * 계좌정보조회
		 */
		SmpRcpMstIO kdbRcpMstIO = this.getAccountInfo(kdbCusMstIO.getCusId(),
				in.getAccNum());

		/**
		 * 고객/계좌 조회 응답값 설정
		 */
		CustomerAccountCommonOut out = this.createOutput(kdbCusMstIO,
				kdbRcpMstIO);

		return out;
	}

	@BxmCategory(logicalName="입력값 체크", description="필수입력값인 고객번호 및 계좌번호에 대해 체크")
	private void inputValidation(CustomerAccountCommonIn in)
			throws DefaultApplicationException {

		/**
		 *  입력값 null 체크
		 */
		if (in == null) {
			/** 
			 * 입력값 null
			 */ 
			throw new DefaultApplicationException("BXME30000", new Object[]{"입력값이 없습니다"});
		}
		/**
		 * 입력항목 누락 체크
		 */
		else {
			/**
			 * 고객번호 입력 누락 체크
			 */
			if (StringUtils.isEmpty(in.getCusNo())) {
				/**
				 * 고객번호 항목 누락
				 */
				throw new DefaultApplicationException("BXME30000", new Object[]{"고객번호를 입력해주세요"});
			}
			/**
			 * 계좌번호 입력 누락 체크
			 */
			if (StringUtils.isEmpty(in.getAccNum())) {
				/** 
				 * 계좌번호 항목 누락
				 */
				throw new DefaultApplicationException("BXME30000", new Object[]{"계좌번호를 입력해주세요"});
			}
		}

	}

	@BxmCategory(logicalName="고객정보조회", description="고객번호로 고객정보 조회")
	private SmpCusMstIO getCustomerInfo(String cusNo)
			throws DefaultApplicationException {

		SmpCusMstIO kdbCusMstIO = null;
		
		//* TODO 3.6.2. SQL 호출 프로그램 생성
		kdbCusMstIO= customerAccountCommonDAO
				.customer_account_common_dao(cusNo);
		//*/

		/** 
		 * 고객 유무 체크
		 */
		if (kdbCusMstIO == null) {
			/** 
			 * 고객정보 없음
			 */
			throw new DefaultApplicationException("BXME30000", new Object[]{"고객정보가 존재하지 않습니다"});
		}

		return kdbCusMstIO;

	}

	@BxmCategory(logicalName="계좌정보조회", description="고객ID와 계좌번호를 이용해 계좌정보 조회")
	private SmpRcpMstIO getAccountInfo(String cusId, String accNum)
			throws DefaultApplicationException {

		SmpRcpMstIO kdbRcpMstIO = null;
		
		//* TODO 3.6.3. SQL 호출 프로그램 생성
		kdbRcpMstIO= customerAccountCommonDAO
				.customer_account_common_dao_acc(cusId, accNum);
		//*/

		/** 
		 * 계좌 유무 체크
		 */
		if (kdbRcpMstIO == null) {
			/** 
			 * 계좌정보 없음
			 */
			throw new DefaultApplicationException("BXME30000", new Object[]{"계좌정보가 존재하지 않습니다"});
		}

		return kdbRcpMstIO;

	}

	@BxmCategory(logicalName="응답 전문 조립", description="조회된 정보를 이용하여 응답 전문 조립")
	private CustomerAccountCommonOut createOutput(SmpCusMstIO kdbCusMstIO,
			SmpRcpMstIO kdbRcpMstIO) {
		
		CustomerAccountCommonOut out = new CustomerAccountCommonOut();
		out.setCusId(kdbRcpMstIO.getCusId());
		out.setOpBrch(kdbRcpMstIO.getOpBrch());
		out.setAccNum(kdbRcpMstIO.getAccNum());
		out.setAccPW(kdbRcpMstIO.getAccPw());
		out.setAmt(kdbRcpMstIO.getAmt());
		out.setCusNm(kdbCusMstIO.getCusNm());

		return out;
	}
}
