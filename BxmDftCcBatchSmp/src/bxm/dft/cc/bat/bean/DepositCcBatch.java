package bxm.dft.cc.bat.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Scope;

import bxm.batch.BatchApplicationContext;
import bxm.batch.core.context.util.BatchLogUtils;
import bxm.centercut.context.CcutContext;
import bxm.centercut.util.BXMCcutAcptNumberingUtils;
import bxm.centercut.util.BXMCcutWorkUtils;
import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmBean;
import bxm.dft.cc.bat.bean.dto.InterestCalculationBatchOut;

/**
 * @file kdb.poc.dep.bat.bean.DepositCcBatch.java
 * @filetype java source file
 * @brief
 * @author 개발자(한글이름)
 * @version 0.1
 * @history
 * 
 * 			<pre>
 * 버전          성명                   일자              변경내용
 * -------       ----------------       -----------       -----------------
 * 0.1           개발자(한글이름)       2015. 12. 12.       신규 작성
 *          </pre>
 */

@BxmBean("DepositCcBatchBean")
@Scope("step")
@BxmCategory(logicalName = "이자입금센터컷배치", description = "이자입금센터컷배치")
public class DepositCcBatch implements ItemProcessor<InterestCalculationBatchOut, InterestCalculationBatchOut> {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

//	private CcutSelectionV sltVarl;
	private CcutContext context;
	private final String CCID = "CCID";
	private final String DOMAIN_ID = "domainId";
	private int count = 0;

	@BeforeStep
	public void beforStep(StepExecution stepExecution) throws Exception {
		String domainId = BatchApplicationContext.getJobParameters().getString(DOMAIN_ID);
		String ccId = BatchApplicationContext.getJobParameters().getString(CCID);
		logger.info("Domain ID = [{}]", domainId);
		logger.info("CenterCut ID = [{}]", ccId);
//		sltVarl = new CcutSelectionV();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
		String pcsnDt = date.format(new Date());

		// 접수 번호 자동 채번
		int acptNo = BXMCcutAcptNumberingUtils.getNewAcptNo(domainId, ccId, pcsnDt);
		logger.info("Generated new AcptNo: [{}]", acptNo);
//		BXMCcutUtils.startSelection(sltVarl, domainId, ccId, pcsnDt, acptNo, 1);
		context = BXMCcutWorkUtils.startSelection(domainId, ccId, pcsnDt, acptNo, 1);
		
		logger.debug("%%%%%% CcutContext Info: [{}]", context);
	}

	@Override
	public InterestCalculationBatchOut process(InterestCalculationBatchOut input) throws Exception {
//		BXMCcutUtils.processSelection(sltVarl, input.getCusNo(), input.getIntAmt(), input);
		BXMCcutWorkUtils.processSelection(context, input.getCusNo(), input.getIntAmt(), input);

		if(count%50 == 0) {
			BatchLogUtils.addAppLog("Input Data numbering: " + ++count);
		}
		
		return input;
	}

	@AfterStep
	public ExitStatus afterStep(StepExecution stepExecution) throws Exception {
		if (stepExecution.getExitStatus().getExitCode().equals("COMPLETED")) {
//			BXMCcutUtils.endSelection(sltVarl);
			BXMCcutWorkUtils.endSelection(context);
		}
		return stepExecution.getExitStatus();
	}

}