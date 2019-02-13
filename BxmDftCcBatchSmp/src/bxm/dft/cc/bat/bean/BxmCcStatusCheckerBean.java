package bxm.dft.cc.bat.bean;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Scope;

import bxm.batch.BatchApplicationContext;
import bxm.centercut.defs.CcutStatus;
import bxm.centercut.util.BXMCcutWorkUtils;
import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmBean;


@BxmBean("BxmCcStatusCheckerBean")
@Scope("step")
@BxmCategory(logicalName = "BXM 센터컷 상태 체크 빈", description = "BXM 센터컷 상태 체크 빈")
public class BxmCcStatusCheckerBean implements Tasklet
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

		while(true){
//			CcutStatus status = BXMCcutUtils.checkCcutStatus(domainId, ccId, pcsnDt, acptNo, tnNo);
			CcutStatus status = BXMCcutWorkUtils.checkCcutStatus(domainId, ccId, pcsnDt, acptNo, tnNo);
			if(status == null){
				// 상태는 MAIN_STATUS 테이블에 있으며, 이 테이블의 값은 CC가 실행되어야만 하기 때문에 배치가 더 빠른 경우 NULL이 나올 가능성이 있음
				Thread.sleep(1000);
				continue;
			}
			logger.info("============== Current C/C status [{}]", status.getDesc());
			if(!CcutStatus.STATUS_RUN.equals(status)){
				break;
			}
			Thread.sleep(10000);
		}
		
		return RepeatStatus.FINISHED;
    }
}
