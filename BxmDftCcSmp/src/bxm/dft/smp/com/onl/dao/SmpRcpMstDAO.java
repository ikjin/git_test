/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Fri Mar 17 15:50:18 KST 2017
 */
package bxm.dft.smp.com.onl.dao;

import bxm.container.annotation.BxmDataAccess;
import bxm.common.annotaion.BxmCategory;

@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/com/onl/dao/SmpRcpMstDAO.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "KdbRcpMstDAO", description = "수신원장DAO")
public interface SmpRcpMstDAO
{

	/**
	 * 수신원장전체조회
	 */
	@BxmCategory(logicalName = "수신원장전체조회", description = "수신원장전체조회")
	java.util.List<bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO> selectKdbRcpMstInfo();
}