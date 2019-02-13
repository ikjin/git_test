/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Fri Mar 17 14:28:15 KST 2017
 */
package bxm.dft.smp.dep.onl.dao;

import bxm.container.annotation.BxmDataAccess;
import bxm.common.annotaion.BxmCategory;
import bxm.container.das.DasHistory;

@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/dep/onl/dao/PaymentDAO.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "출금DAO", description = "출금DAO")
public interface PaymentDAO
{

	/**
	 * 출금 처리를 위한 수신원장 업데이트
	 * @TestValues 	cusId=CID_00643;	accNum=100643;	opBrch=;	amt=1;	accPw=;
	 */
	@BxmCategory(logicalName = "출금 처리 SQL", description = "출금 처리를 위한 수신원장 업데이트")
	int payment_dao(bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO kdbRcpMstIO);
}