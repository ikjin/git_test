package bxm.dft.smp.cc.onl.sc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bxm.centercut.defs.CcutJobInfo;
import bxm.centercut.util.BXMCcutWorkUtils;
import bxm.common.ContextTrace;
import bxm.common.annotaion.BxmCategory;
import bxm.common.util.ThreadSafeSimpleDateFormat;
import bxm.container.ServiceTraceContextImpl;
import bxm.container.annotation.BxmService;
import bxm.container.annotation.BxmServiceOperation;
import bxm.dft.app.DefaultApplicationException;
import bxm.dft.smp.cc.onl.sc.dto.DepositCcServiceIn;
import bxm.omm.root.IOmmObject;
import bxm.transaction.annotation.TransactionalOperation;

/**
 * @file kdb.poc.cc.onl.sc.DepositCcService.java
 * @filetype java source file
 * @brief
 * @author 개발자(한글이름)
 * @version 0.1
 * @history
 * 
 * 			<pre>
 * 버전          성명                   일자              변경내용
 * -------       ----------------       -----------       -----------------
 * 0.1           개발자(한글이름)       2015. 12. 10.       신규 작성
 *          </pre>
 */
@BxmService("DepositCcService")
@BxmCategory(logicalName = "이자입금센터컷", description = "이자입금센터컷")
public class DepositCcService {
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	private static final String EXEC_PARAM = "ccExecParam";

	@BxmServiceOperation("deposit_cc_service")
	@BxmCategory(logicalName = "이자입금센터컷", description = "이자입금센터컷")
	@TransactionalOperation
	public void deposit_cc_service(DepositCcServiceIn in) throws DefaultApplicationException {
		logger.debug("======================================");
		logger.debug("   CenterCut Sample Service Start");
		logger.debug("======================================");
		
		/**
		 * 입력 항목 체크
		 */
		this.inputValidation(in);
		
		logger.debug("======================================");
		logger.debug("   CenterCut Sample Service finished");
		logger.debug("======================================");
	}

	@BxmCategory(logicalName = "입력값 체크", description = "필수입력값에 대해 체크")
	private void inputValidation(DepositCcServiceIn in) throws DefaultApplicationException {
		/**
		 * 입력값 null 체크
		 */
		if (in == null) {
			/**
			 * 입력값 null
			 */
			throw new DefaultApplicationException("BXME30000", new Object[]{}, new Object[]{"입력값이 없습니다"});
		}

		Random r = new Random();
		int randomVal = r.nextInt(100);
		if(in.get(EXEC_PARAM) == null) {
			List<IOmmObject> ccTargetList = new ArrayList<IOmmObject>();
			
			DepositCcServiceIn input = null;
			for(int i=0; i< 1; i++) {
				input = new DepositCcServiceIn();
				input.setCusNo(in.getCusNo());
				input.setAccNum(in.getAccNum());
				input.setAmt(in.getAmt());
				
				ccTargetList.add(input);
			}
			
			ThreadSafeSimpleDateFormat sdf = new ThreadSafeSimpleDateFormat("yyyyMMdd");
//			CcutJobInfo jobInfo = BXMCcutUtils.processCCOnlineSelection(
//					"CZFB00002", sdf.format(new Date()), "accNum", "amt", ccTargetList, false);
			CcutJobInfo jobInfo = BXMCcutWorkUtils.processCCOnlineSelection(
					"CZFB00002", sdf.format(new Date()), "accNum", "amt", ccTargetList, false);
			// 실시간 실행 테스트
//			BXMCcutExecutorUtils.executeCcutMain(jobInfo);
		} else if("F".equals(in.get(EXEC_PARAM))){
			if(1 == randomVal){
				throw new DefaultApplicationException("BXME30000", new Object[]{}, new Object[]{"랜덤 오류 포인트 및 파라미터 F에 의한 에러 처리입니다."});
			} else if(2 == randomVal){
				throw new DefaultApplicationException("BXME39999", new Object[]{}, new Object[]{"랜덤 오류 포인트 및 파라미터 F에 의한 에러 처리입니다."});
			}
		} else if("E".equals(in.get(EXEC_PARAM))){
			throw new DefaultApplicationException("BXME30000", new Object[]{}, new Object[]{"강제 에러 처리입니다."});
		} else if("C".equals(in.get(EXEC_PARAM))) {
			if(1 == randomVal){
				throw new DefaultApplicationException("BXME30000", new Object[]{}, new Object[]{"랜덤 오류 포인트 및 파라미터 F에 의한 에러 처리입니다."});
			} else if(2 == randomVal){
				throw new DefaultApplicationException("BXME39999", new Object[]{}, new Object[]{"랜덤 오류 포인트 및 파라미터 F에 의한 에러 처리입니다."});
			} else if(3 == randomVal) {
				List<IOmmObject> ccTargetList = new ArrayList<IOmmObject>();
				
				DepositCcServiceIn input = null;
				for(int i=0; i< 10; i++) {
					input = new DepositCcServiceIn();
					input.setCusNo(in.getCusNo());
					input.setAccNum(in.getAccNum());
					input.setAmt(in.getAmt());
					
					ccTargetList.add(input);
				}
				
				ThreadSafeSimpleDateFormat sdf = new ThreadSafeSimpleDateFormat("yyyyMMdd");
//				CcutJobInfo info = BXMCcutUtils.processCCOnlineSelection(
//						"CZFB00002", sdf.format(new Date()), "accNum", "amt", ccTargetList, false);
				CcutJobInfo info = BXMCcutWorkUtils.processCCOnlineSelection(
						"CZFB00002", sdf.format(new Date()), "accNum", "amt", ccTargetList, false);
				logger.info("Generated CC Job Info: [{}]", info);
			}
		}

		// rollback 테스트
/*		if(in.get(EXEC_PARAM) == null) {
			throw new DefaultApplicationException("BXME30000", new Object[] {}, new Object[] {"RollBack Test Exception"});
		}*/
		
		ServiceTraceContextImpl trace = (ServiceTraceContextImpl)ContextTrace.getLocalContext();
		if("D".equals(in.get(EXEC_PARAM))){
			if("ccProc03".equals(trace.getContainerName())){
				// 3번 컨테이너이고 실행 파라미터가 D라면 3초 수면
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// ignore
				}
			}
		}

		// 검증 완료 후 0.5초 수면
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// ignore
		}
	}
}
