package bxm.dft.cc.bat.bean;


import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.slf4j.Logger;

import bxm.batch.BatchApplicationContext;
import bxm.centercut.util.BXMCcutExecutorUtils;
import bxm.common.annotaion.BxmCategory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.batch.core.scope.context.ChunkContext;
import bxm.container.annotation.BxmBean;
import org.springframework.batch.core.StepContribution;


@BxmBean("BxmCcExecutorBean")
@Scope("step")
@BxmCategory(logicalName = "BXM 센터컷 실행 배치", description = "BXM 센터컷 실행 배치")
public class BxmCcExecutorBean implements Tasklet
{
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * Tasklet
	 * - 단순 DB CRUD 수행이나 반드시 한 번에 Commit/Rollback 되어야 하는 배치에서 사용하는 패턴
	 */
	@Override
	@BxmCategory(logicalName = "", description = "")
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		String domainId = BatchApplicationContext.getJobParameters().getString("domainId");
		String ccId = BatchApplicationContext.getJobParameters().getString("ccId");
		String pcsnDt = BatchApplicationContext.getJobParameters().getString("pcsnDt");
		int acptNo = Integer.parseInt(BatchApplicationContext.getJobParameters().getString("acptNo"));
		int tnNo = Integer.parseInt(BatchApplicationContext.getJobParameters().getString("tnNo"));
		
		try{
			BXMCcutExecutorUtils.executeCcutMain(domainId, ccId, pcsnDt, acptNo, tnNo);
		} catch (Throwable th){
			logger.error("Failed to execute Center-Cut Main service. ", th);
			throw th;
		}
		
		return RepeatStatus.FINISHED;
    }
}
