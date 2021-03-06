/******************************************************************************
 * Bxm Object Message Mapping(OMM) - Source Generator V7
 *
 * 생성된 자바파일은 수정하지 마십시오.
 * IO 파일 수정시 Java파일을 덮어쓰게 됩니다.
 *
 ******************************************************************************/

package bxm.dft.smp.dep.onl.sc.dto;


import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import bxm.omm.predict.FieldInfo;
import javax.xml.bind.annotation.XmlType;
import bxm.omm.annotation.BxmOmm_Field;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonGetter;
import bxm.omm.predict.Predictable;
import java.util.Hashtable;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @Description 이체서비스 입력
 */
@XmlType(propOrder={"cusNo", "payAccNum", "accPw", "depCusNo", "depAccNum", "amt"}, name="TransferServiceIn")
@XmlRootElement(name="TransferServiceIn")
@SuppressWarnings("all")
public class TransferServiceIn  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = -98336659L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "이체서비스 입력";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << cusNo >> [[ */
	
	@XmlTransient
	private boolean isSet_cusNo = false;
	
	protected boolean isSet_cusNo()
	{
		return this.isSet_cusNo;
	}
	
	protected void setIsSet_cusNo(boolean value)
	{
		this.isSet_cusNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="고객번호", formatType="", format="", align="left", length=10, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String cusNo  = null;
	
	/**
	 * @Description 고객번호
	 */
	public java.lang.String getCusNo(){
		return cusNo;
	}
	
	/**
	 * @Description 고객번호
	 */
	@JsonProperty("cusNo")
	public void setCusNo( java.lang.String cusNo ) {
		isSet_cusNo = true;
		this.cusNo = cusNo;
	}
	
	/** Property set << cusNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << payAccNum >> [[ */
	
	@XmlTransient
	private boolean isSet_payAccNum = false;
	
	protected boolean isSet_payAccNum()
	{
		return this.isSet_payAccNum;
	}
	
	protected void setIsSet_payAccNum(boolean value)
	{
		this.isSet_payAccNum = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="출금계좌번호", formatType="", format="", align="left", length=6, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String payAccNum  = null;
	
	/**
	 * @Description 출금계좌번호
	 */
	public java.lang.String getPayAccNum(){
		return payAccNum;
	}
	
	/**
	 * @Description 출금계좌번호
	 */
	@JsonProperty("payAccNum")
	public void setPayAccNum( java.lang.String payAccNum ) {
		isSet_payAccNum = true;
		this.payAccNum = payAccNum;
	}
	
	/** Property set << payAccNum >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << accPw >> [[ */
	
	@XmlTransient
	private boolean isSet_accPw = false;
	
	protected boolean isSet_accPw()
	{
		return this.isSet_accPw;
	}
	
	protected void setIsSet_accPw(boolean value)
	{
		this.isSet_accPw = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="비밀번호", formatType="masking", format="ALL", align="left", length=4, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String accPw  = null;
	
	/**
	 * @Description 비밀번호
	 */
	public java.lang.String getAccPw(){
		return accPw;
	}
	
	/**
	 * @Description 비밀번호
	 */
	@JsonProperty("accPw")
	public void setAccPw( java.lang.String accPw ) {
		isSet_accPw = true;
		this.accPw = accPw;
	}
	
	/** Property set << accPw >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << depCusNo >> [[ */
	
	@XmlTransient
	private boolean isSet_depCusNo = false;
	
	protected boolean isSet_depCusNo()
	{
		return this.isSet_depCusNo;
	}
	
	protected void setIsSet_depCusNo(boolean value)
	{
		this.isSet_depCusNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="입금고객번호", formatType="", format="", align="left", length=10, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String depCusNo  = null;
	
	/**
	 * @Description 입금고객번호
	 */
	public java.lang.String getDepCusNo(){
		return depCusNo;
	}
	
	/**
	 * @Description 입금고객번호
	 */
	@JsonProperty("depCusNo")
	public void setDepCusNo( java.lang.String depCusNo ) {
		isSet_depCusNo = true;
		this.depCusNo = depCusNo;
	}
	
	/** Property set << depCusNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << depAccNum >> [[ */
	
	@XmlTransient
	private boolean isSet_depAccNum = false;
	
	protected boolean isSet_depAccNum()
	{
		return this.isSet_depAccNum;
	}
	
	protected void setIsSet_depAccNum(boolean value)
	{
		this.isSet_depAccNum = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="입금계좌번호", formatType="", format="", align="left", length=6, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String depAccNum  = null;
	
	/**
	 * @Description 입금계좌번호
	 */
	public java.lang.String getDepAccNum(){
		return depAccNum;
	}
	
	/**
	 * @Description 입금계좌번호
	 */
	@JsonProperty("depAccNum")
	public void setDepAccNum( java.lang.String depAccNum ) {
		isSet_depAccNum = true;
		this.depAccNum = depAccNum;
	}
	
	/** Property set << depAccNum >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << amt >> [[ */
	
	@XmlTransient
	private boolean isSet_amt = false;
	
	protected boolean isSet_amt()
	{
		return this.isSet_amt;
	}
	
	protected void setIsSet_amt(boolean value)
	{
		this.isSet_amt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 이체금액
	 */
	public void setAmt(java.lang.String value) {
		isSet_amt = true;
		this.amt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 이체금액
	 */
	public void setAmt(double value) {
		isSet_amt = true;
		this.amt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 이체금액
	 */
	public void setAmt(long value) {
		isSet_amt = true;
		this.amt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="이체금액", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal amt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 이체금액
	 */
	public java.math.BigDecimal getAmt(){
		return amt;
	}
	
	/**
	 * @Description 이체금액
	 */
	@JsonProperty("amt")
	public void setAmt( java.math.BigDecimal amt ) {
		isSet_amt = true;
		this.amt = amt;
	}
	
	/** Property set << amt >> ]]
	*******************************************************************************************************************************/

	@Override
	public TransferServiceIn clone(){
		try{
			TransferServiceIn object= (TransferServiceIn)super.clone();
			
			
			return object;
		} 
		catch(CloneNotSupportedException e){
			throw new bxm.omm.exception.CloneFailedException();
		}
	}

	@Override
	public int hashCode(){
		final int prime=31;
		int result = 1;
		
		result = prime * result + ((cusNo==null)?0:cusNo.hashCode());
		result = prime * result + ((payAccNum==null)?0:payAccNum.hashCode());
		result = prime * result + ((accPw==null)?0:accPw.hashCode());
		result = prime * result + ((depCusNo==null)?0:depCusNo.hashCode());
		result = prime * result + ((depAccNum==null)?0:depAccNum.hashCode());
		result = prime * result + ((amt==null)?0:amt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.dep.onl.sc.dto.TransferServiceIn other= (bxm.dft.smp.dep.onl.sc.dto.TransferServiceIn)obj;
		if ( cusNo == null){
			if ( other.cusNo != null ) return false;
		}
		else if ( !cusNo.equals(other.cusNo) )
			return false;
		if ( payAccNum == null){
			if ( other.payAccNum != null ) return false;
		}
		else if ( !payAccNum.equals(other.payAccNum) )
			return false;
		if ( accPw == null){
			if ( other.accPw != null ) return false;
		}
		else if ( !accPw.equals(other.accPw) )
			return false;
		if ( depCusNo == null){
			if ( other.depCusNo != null ) return false;
		}
		else if ( !depCusNo.equals(other.depCusNo) )
			return false;
		if ( depAccNum == null){
			if ( other.depAccNum != null ) return false;
		}
		else if ( !depAccNum.equals(other.depAccNum) )
			return false;
		if ( amt == null){
			if ( other.amt != null ) return false;
		}
		else if ( !amt.equals(other.amt) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.dep.onl.sc.dto.TransferServiceIn:\n");
		sb.append("\tcusNo: ");
		sb.append(cusNo==null?"null":getCusNo());
		sb.append("\n");
		sb.append("\tpayAccNum: ");
		sb.append(payAccNum==null?"null":getPayAccNum());
		sb.append("\n");
		sb.append("\taccPw: ");
		sb.append(accPw==null?"null":getAccPw().toString().replaceAll(".","*"));
		sb.append("\n");
		sb.append("\tdepCusNo: ");
		sb.append(depCusNo==null?"null":getDepCusNo());
		sb.append("\n");
		sb.append("\tdepAccNum: ");
		sb.append(depAccNum==null?"null":getDepAccNum());
		sb.append("\n");
		sb.append("\tamt: ");
		sb.append(amt==null?"null":getAmt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}

	/**
	 * Only for Fixed-Length Data
	 */
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
	
		messageLen+= 10; /* cusNo */
		messageLen+= 6; /* payAccNum */
		messageLen+= 4; /* accPw */
		messageLen+= 10; /* depCusNo */
		messageLen+= 6; /* depAccNum */
		messageLen+= 20; /* amt */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("cusNo");
		fieldNames.add("payAccNum");
		fieldNames.add("accPw");
		fieldNames.add("depCusNo");
		fieldNames.add("depAccNum");
		fieldNames.add("amt");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("cusNo", get("cusNo"));
		fieldValueMap.put("payAccNum", get("payAccNum"));
		fieldValueMap.put("accPw", get("accPw"));
		fieldValueMap.put("depCusNo", get("depCusNo"));
		fieldValueMap.put("depAccNum", get("depAccNum"));
		fieldValueMap.put("amt", get("amt"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 95027170 : /* cusNo */
			return getCusNo();
		case -1348411891 : /* payAccNum */
			return getPayAccNum();
		case 92628584 : /* accPw */
			return getAccPw();
		case 902872339 : /* depCusNo */
			return getDepCusNo();
		case 2144880692 : /* depAccNum */
			return getDepAccNum();
		case 96712 : /* amt */
			return getAmt();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 95027170 : /* cusNo */
			setCusNo((java.lang.String) value);
			return;
		case -1348411891 : /* payAccNum */
			setPayAccNum((java.lang.String) value);
			return;
		case 92628584 : /* accPw */
			setAccPw((java.lang.String) value);
			return;
		case 902872339 : /* depCusNo */
			setDepCusNo((java.lang.String) value);
			return;
		case 2144880692 : /* depAccNum */
			setDepAccNum((java.lang.String) value);
			return;
		case 96712 : /* amt */
			setAmt((java.math.BigDecimal) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
