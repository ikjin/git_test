/**
 * DBIO 에디터에서 생성된 파일입니다. 인터페이스 파일을 직접 수정하지 마십시오.
 * @Generated Fri Mar 17 15:49:20 KST 2017
 */
package bxm.dft.smp.com.onl.dao;

import bxm.container.annotation.BxmDataAccess;
import bxm.common.annotaion.BxmCategory;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "all" })
@BxmDataAccess(mapper = "bxm/dft/smp/com/onl/dao/CustomerAccountCommonDAO.dbio", datasource = "MainDS")
@BxmCategory(logicalName = "고객계좌조회공통DAO", description = "고객계좌조회공통DAO")
public interface CustomerAccountCommonDAO
{

	/**
	 * @TestValues 	cusNo=501;
	 */
	@BxmCategory(description = "")
	bxm.dft.smp.com.onl.dao.dto.SmpCusMstIO customer_account_common_dao(@Param("cusNo") java.lang.String cusNo);

	/**
	 * @TestValues 	cusId=CID_00501;	accNum=100501;
	 */
	@BxmCategory(description = "")
	bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO customer_account_common_dao_acc(@Param("cusId") java.lang.String cusId,
			@Param("accNum") java.lang.String accNum);
}