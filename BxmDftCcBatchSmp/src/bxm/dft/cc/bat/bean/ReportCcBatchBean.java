package bxm.dft.cc.bat.bean;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.context.annotation.Scope;

import bxm.batch.BatchApplicationContext;
import bxm.common.annotaion.BxmCategory;
import bxm.container.LApplicationContext;
import bxm.container.annotation.BxmBean;
import bxm.context.das.DasUtils;
import bxm.dft.cc.bat.bean.dto.ReportCcBatchBean00Dto;
import bxm.dft.cc.bat.dao.ResultCCDAO;
import bxm.dft.cc.bat.dao.dto.DBxmCcWorkStatus001selectList00OutDto;


@BxmBean("ReportCcBatchBean")
@Scope("step")
@BxmCategory(logicalName = "test", description = "test")
public class ReportCcBatchBean implements ItemReader<ReportCcBatchBean00Dto>,
ItemProcessor<ReportCcBatchBean00Dto, String>,
ItemStream
{
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	private ResultCCDAO resultCCDAO;

	private Iterator<DBxmCcWorkStatus001selectList00OutDto> iterator;

	@Override
	@BxmCategory(logicalName = "", description = "")
	public void open(ExecutionContext executionContext) throws ItemStreamException
	{
		if(resultCCDAO == null)
		{
			resultCCDAO = LApplicationContext.getBean(ResultCCDAO.class);
		}

		String domainId = BatchApplicationContext.getJobParameters().getString("domainId");
		String ccId = BatchApplicationContext.getJobParameters().getString("ccId");
		String pcsnDt = BatchApplicationContext.getJobParameters().getString("pcsnDt");
		int acptNo = Integer.parseInt(BatchApplicationContext.getJobParameters().getString("acptNo"));
		int tnNo = Integer.parseInt(BatchApplicationContext.getJobParameters().getString("tnNo"));
		
		logger.info("Parameters: [{}], [{}], [{}], [{}]", new Object[]{domainId, ccId, pcsnDt, acptNo, tnNo});
		/**
		 * TODO : DB 조회 처리 로직을 작성하세요
		 */
		iterator = resultCCDAO.selectList00(domainId, ccId, pcsnDt, acptNo, tnNo).iterator();
		if(iterator == null) {
			throw new ItemStreamException("Connected result is not prepared.");
		}
	}

	@Override
	@BxmCategory(logicalName = "", description = "")
	public ReportCcBatchBean00Dto read() throws Exception, UnexpectedInputException, 
	ParseException, NonTransientResourceException
	{
		ReportCcBatchBean00Dto out = null;

		/**
		 * TODO : ItemProcessor로 넘겨야 할 데이터 처리 로직을 작성하세요
		 */
		if(iterator.hasNext())
		{
			out = new ReportCcBatchBean00Dto();
			DBxmCcWorkStatus001selectList00OutDto input = iterator.next();

			out.setDomainId(input.getDomainId());
			out.setCcId(input.getCcId());
			out.setPcsnDt(input.getProcDt());
			out.setAcptNo(input.getAcptNo());
			out.setExecNo(input.getExecNo());
			out.setTnNo(input.getTnNo());
			out.setPcsnStat(this.getPcsnStatStr(input.getCcProcStatusCd()));
			out.setFstSrtDt(input.getFirstStartDt());
			out.setFstSrtTime(input.getFirstStartTime());
			out.setReSrtDt(input.getReStartDt());
			out.setReSrtTime(input.getReStartTime());
			out.setEndDt(input.getEndDt());
			out.setEndTime(input.getEndTime());
			out.setMaxPcsnCnt(input.getMaxProcCnt());
			out.setLastPcsnNo(input.getLastProcNo());
			out.setTtObjCnt(input.getTotalTargetCnt());
			out.setTtObjAmt(input.getTotalTargetAmt());
			out.setNomlPcsnCnt(input.getNormalProcCnt());
			out.setNomlPcsnAmt(input.getNormalProcAmt());
			out.setErrPcsnCnt(input.getErrProcCnt());
			out.setErrPcsnAmt(input.getErrProcAmt());
			out.setDelPcsnCnt(input.getDelProcCnt());
			out.setDelPcsnAmt(input.getDelProcAmt());
			out.setModifyOccurDttm(input.getModifyOccurDttm());
			out.setModifyUserId(input.getModifyUserId());
		}

		return out;
	}

	@Override
	@BxmCategory(logicalName = "", description = "")
	public String process(ReportCcBatchBean00Dto in) throws Exception {
		return in.toString();
	}

	@Override
	@BxmCategory(logicalName = "", description = "")
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		// skip
	}

	@Override
	@BxmCategory(logicalName = "", description = "")
	public void close() throws ItemStreamException 
	{
		DasUtils.disconnectDasExecutor(iterator);

	}
	
	private String getPcsnStatStr(Integer pcsnStat){
		if(pcsnStat == null){
			return null;
		}
		String status = null;
		switch (pcsnStat){
			case 0: status = "초기화";
					break;
			case 1: status = "준비중";
					break;
			case 2: status = "발췌중";
					break;
			case 3: status = "발췌완료";
					break;
			case 4: status = "발췌오류";
					break;
			case 8: status = "처리중";
					break;
			case 9: status = "처리완료";
					break;
			case 10: status = "처리오류";
					break;
			case 14: status = "처리중지";
					break;
			case 15: status = "처리중단";
					break;
			case 16: status = "삭제완료";
					break;
			case 17: status = "비정상종료";
					break;
			case 18: status = "오류중지";
					break;
			case 19: status = "처리대기중";
					break;
			case 20: status = "모든작업중지";
					break;
			case 21: status = "처리중지중";
					break;
			case 99: status = "해제";
					break;
		}
			
		return status;
	}
}
