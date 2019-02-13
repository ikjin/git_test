package bxm.dft.cc.bat.bean;

import java.math.BigDecimal;
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
import org.springframework.batch.item.util.ExecutionContextUserSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import bxm.batch.BatchApplicationContext;
import bxm.common.annotaion.BxmCategory;
import bxm.common.util.StringUtils;
import bxm.container.annotation.BxmBean;
import bxm.context.das.DasUtils;
import bxm.dft.cc.bat.bean.dto.InterestCalculationBatchOut;
import bxm.dft.cc.bat.dao.RcpMstDAO;

/**
 * @file kdb.poc.dep.bat.bean.InterestCalculationBatch.java
 * @filetype java source file
 * @brief
 * @author 개발자(한글이름)
 * @version 0.1
 * @history <pre>
 * 버전          성명                   일자              변경내용
 * -------       ----------------       -----------       -----------------
 * 0.1           개발자(한글이름)       2015. 12. 10.       신규 작성
 * </pre>
 */

@BxmBean("InterestCalculationBatchBean")
@Scope("step")
@BxmCategory(logicalName = "이자입금파일생성배치", description = "이자입금파일생성배치")
public class InterestCalculationBatch implements ItemStream,
		ItemReader<InterestCalculationBatchOut>,
		ItemProcessor<InterestCalculationBatchOut, InterestCalculationBatchOut> {

	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RcpMstDAO rcpMstDAO; // 수신원장

	private Iterator<InterestCalculationBatchOut> iterator;

	private int rpCount; // 반복건수

	private String exeParam;

	private static final String READ_COUNT = "read.count";
	private ExecutionContextUserSupport ecSupport = new ExecutionContextUserSupport(
			"InterestCalculationBatchBeanReader");

	@Override
	public void open(ExecutionContext executionContext)
			throws ItemStreamException {
		/**
		 * 배치 입력파라미터 "실행파라미터" Get
		 */
		exeParam = BatchApplicationContext.getJobParameters().getString(
				"eParam");
		if (StringUtils.isEmpty(exeParam)) {
			throw new ItemStreamException(
					"배치 입력아규먼트 'eParam(실행파라미터)' 값이 존재하지 않습니다.");
		}

		/**
		 * 수신 원장 정보를 Iterator로 가져온다.
		 */
		iterator = rcpMstDAO.smp_rcp_mst().iterator();
		if (iterator == null) {
			throw new ItemStreamException("connected result is not prepared.");
		}

		if (executionContext.containsKey(ecSupport.getKey(READ_COUNT))) {
			int itemCount = executionContext.getInt(ecSupport
					.getKey(READ_COUNT));
			try {
				jumpToItem(itemCount);
			} catch (Exception e) {
				throw new ItemStreamException(
						"Could not move to stored position on restart", e);
			}
			rpCount = itemCount;
		}

	}

	@Override
	public InterestCalculationBatchOut read() throws Exception,
			UnexpectedInputException, ParseException,
			NonTransientResourceException {

		/**
		 * iterater 1건씩 읽기
		 */
		InterestCalculationBatchOut out = null;
		if (iterator.hasNext()) {
			out = new InterestCalculationBatchOut();
			InterestCalculationBatchOut input = iterator.next();

			out.setCusNo(input.getCusNo());
			out.setAccNum(input.getAccNum());
			out.setIntAmt(input.getIntAmt());

			rpCount++;
			logger.info("rpCount : " + rpCount);
		}

		return out;
	}

	@Override
	public InterestCalculationBatchOut process(InterestCalculationBatchOut in)
			throws Exception {

		/**
		 * 이자계산
		 */
		BigDecimal intRate = new BigDecimal("0.03");

		in.setIntAmt(in.getIntAmt().multiply(intRate));

		return in;

	}

	@Override
	public void update(ExecutionContext executionContext) throws ItemStreamException {
		
		executionContext.putInt(ecSupport.getKey(READ_COUNT), rpCount);
		
		/**
		 * 5초 sleep
		 */
		//* TODO 5.1.2. 데이터 1초 간격으로 5건 처리
		 try {
		 Thread.sleep(1000);
		 } catch (InterruptedException e) {
			 logger.debug("skip...");
		 }
		//*/

		String eParam = BatchApplicationContext.getJobParameters()
				.getString("eParam");
		if ("F".equals(eParam) && rpCount > 100) {
			logger.debug("#################################");
			logger.debug("실행 파라미터 : F" );
			logger.debug("실행 건수     : 100" );
			logger.debug("#################################");
			throw new ItemStreamException("실행파라미터 F or 반복건수 100 으로 인한 에러 종료");
		}
	}

	@Override
	public void close() throws ItemStreamException {
		if (iterator != null)
			DasUtils.disconnectDasExecutor(iterator);
	}
	
	/**
	 * skip
	 * @param itemCount
	 */
	private void jumpToItem(int itemCount) {
		
		int readCount = 0;
		while(iterator.hasNext())
		{
			iterator.next();
			readCount++;
			if(readCount == itemCount)
			{
				break;
			}
		}
	}

}