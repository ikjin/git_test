/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Fri Mar 17 13:20:30 KST 2017
 */
package bxm.dft.cc.bat.dao;

import bxm.container.annotation.BxmDataAccess;
import bxm.common.annotaion.BxmCategory;
import bxm.container.das.ExecutorType;
import bxm.container.das.DasExecutor;

@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/cc/bat/dao/RcpMstDAO.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "수신원장", description = "수신원장")
public interface RcpMstDAO
{

	/**
	 * 수신원장전체조회
	 */
	@DasExecutor(executor = ExecutorType.CONNECTED_BATCH)
	@BxmCategory(logicalName = "수신원장전체조회", description = "수신원장전체조회")
	java.util.List<bxm.dft.cc.bat.bean.dto.InterestCalculationBatchOut> smp_rcp_mst();
}