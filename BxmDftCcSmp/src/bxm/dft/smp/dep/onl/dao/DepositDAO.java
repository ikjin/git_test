/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Fri Mar 17 15:50:41 KST 2017
 */
package bxm.dft.smp.dep.onl.dao;

import bxm.container.annotation.BxmDataAccess;
import bxm.common.annotaion.BxmCategory;
import bxm.container.das.DasHistory;

@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/dep/onl/dao/DepositDAO.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "입금DAO", description = "입금DAO")
public interface DepositDAO
{

	/**
	 * 입금 처리를 위한 수신원장 업데이트
	 * @TestValues 	cusId=CID_00643;	accNum=100643;	opBrch=;	amt=1;	accPw=;
	 */
	@BxmCategory(logicalName = "입금 처리 SQL", description = "입금 처리를 위한 수신원장 업데이트")
	int deposit_dao(bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO smpRcpMstIO);
}