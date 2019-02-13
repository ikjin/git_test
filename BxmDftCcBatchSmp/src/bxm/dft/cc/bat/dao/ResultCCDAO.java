/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Fri May 04 19:22:12 KST 2018
 */
package bxm.dft.cc.bat.dao;

import bxm.common.annotaion.BxmCategory;
import org.apache.ibatis.annotations.Param;
import bxm.container.annotation.BxmDataAccess;
import bxm.container.das.ExecutorType;
import bxm.container.das.DasExecutor;


@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/cc/bat/dao/ResultCCDAO.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "", description = "")
public interface ResultCCDAO
{
	/**
	 * @TestValues 	domainId=;	ccId=;	pcsnDt=;	acptNo=;	tnNo=;
	 */
	@DasExecutor(executor = ExecutorType.CONNECTED_BATCH)
	@BxmCategory(description = "")
	java.util.List<bxm.dft.cc.bat.dao.dto.DBxmCcWorkStatus001selectList00OutDto> selectList00(
			@Param("domainId") java.lang.String domainId, @Param("ccId") java.lang.String ccId,
			@Param("pcsnDt") java.lang.String pcsnDt, @Param("acptNo") java.lang.Integer acptNo,
			@Param("tnNo") java.lang.Integer tnNo);
	
}