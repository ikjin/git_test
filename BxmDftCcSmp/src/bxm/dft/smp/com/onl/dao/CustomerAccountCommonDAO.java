/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Thu Feb 14 15:47:57 KST 2019
 */
package bxm.dft.smp.com.onl.dao;

import bxm.common.annotaion.BxmCategory;
import org.apache.ibatis.annotations.Param;
import bxm.container.annotation.BxmDataAccess;

@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/com/onl/dao/CustomerAccountCommonDAO.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "고객계좌조회공통DAO1")
public interface CustomerAccountCommonDAO
{

	/**
	 * @TestValues 	cusNo=501;
	 */
	@BxmCategory()
	bxm.dft.smp.com.onl.dao.dto.SmpCusMstIO customer_account_common_dao(@Param("cusNo") java.lang.String cusNo);

	/**
	 * @TestValues 	cusId=CID_00501;	accNum=100501;
	 */
	@BxmCategory()
	bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO customer_account_common_dao_acc(@Param("cusId") java.lang.String cusId,
			@Param("accNum") java.lang.String accNum);
}