package bxm.dft.smp.com.onl.sc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import bxm.common.annotaion.BxmCategory;
import bxm.container.annotation.BxmService;
import bxm.container.annotation.BxmServiceOperation;
import bxm.dft.smp.com.onl.dao.SmpRcpMstDAO;
import bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO;
import bxm.dft.smp.com.onl.sc.dto.CommonInquiryServiceOut;

/**
 * @file kdb.poc.com.onl.sc.CommonInquiryService.java
 * @filetype java source file
 * @brief
 * @author 개발자(한글이름)
 * @version 0.1
 * @history
 * 
 * 			<pre>
 * 버전          성명                   일자              변경내용
 * -------       ----------------       -----------       -----------------
 * 0.1           개발자(한글이름)       2015. 12. 16.       신규 작성
 *          </pre>
 */
@BxmService("CommonInquiryService")
@BxmCategory(logicalName = "공통조회서비스", description = "공통조회서비스")
public class CommonInquiryService {
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SmpRcpMstDAO kdbRcpMstDAO;

	@BxmServiceOperation("kdbrcpmst")
	@BxmCategory(logicalName = "수신원장조회", description = "수신원장조회")
	public CommonInquiryServiceOut kdbrcpmst(SmpRcpMstIO in) {
		
		List<SmpRcpMstIO> list = kdbRcpMstDAO.selectKdbRcpMstInfo();
		
		CommonInquiryServiceOut out = new CommonInquiryServiceOut();
		out.setCnt(list.size());
		out.setList(list);
		
		return out;
	}
}
