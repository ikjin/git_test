/******************************************************************************
 * Bxm Object Message Mapping(OMM) - Source Generator V7
 *
 * 생성된 자바파일은 수정하지 마십시오.
 * IO 파일 수정시 Java파일을 덮어쓰게 됩니다.
 *
 ******************************************************************************/

package bxm.dft.smp.com.onl.bc.dto;


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
 * @Description 
 */
@XmlType(propOrder={"cusId", "opBrch", "accNum", "accPW", "amt", "cusNm"}, name="CustomerAccountCommonOut")
@XmlRootElement(name="CustomerAccountCommonOut")
@SuppressWarnings("all")
public class CustomerAccountCommonOut  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = -105409865L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << cusId >> [[ */
	
	@XmlTransient
	private boolean isSet_cusId = false;
	
	protected boolean isSet_cusId()
	{
		return this.isSet_cusId;
	}
	
	protected void setIsSet_cusId(boolean value)
	{
		this.isSet_cusId = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="고객ID", formatType="", format="", align="left", length=10, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String cusId  = null;
	
	/**
	 * @Description 고객ID
	 */
	public java.lang.String getCusId(){
		return cusId;
	}
	
	/**
	 * @Description 고객ID
	 */
	@JsonProperty("cusId")
	public void setCusId( java.lang.String cusId ) {
		isSet_cusId = true;
		this.cusId = cusId;
	}
	
	/** Property set << cusId >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << opBrch >> [[ */
	
	@XmlTransient
	private boolean isSet_opBrch = false;
	
	protected boolean isSet_opBrch()
	{
		return this.isSet_opBrch;
	}
	
	protected void setIsSet_opBrch(boolean value)
	{
		this.isSet_opBrch = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="계좌개설점", formatType="", format="", align="right", length=1, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.Integer opBrch  = 0;
	
	/**
	 * @Description 계좌개설점
	 */
	public java.lang.Integer getOpBrch(){
		return opBrch;
	}
	
	/**
	 * @Description 계좌개설점
	 */
	@JsonProperty("opBrch")
	public void setOpBrch( java.lang.Integer opBrch ) {
		isSet_opBrch = true;
		this.opBrch = opBrch;
	}
	
	/** Property set << opBrch >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << accNum >> [[ */
	
	@XmlTransient
	private boolean isSet_accNum = false;
	
	protected boolean isSet_accNum()
	{
		return this.isSet_accNum;
	}
	
	protected void setIsSet_accNum(boolean value)
	{
		this.isSet_accNum = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="계좌번호", formatType="", format="", align="left", length=6, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String accNum  = null;
	
	/**
	 * @Description 계좌번호
	 */
	public java.lang.String getAccNum(){
		return accNum;
	}
	
	/**
	 * @Description 계좌번호
	 */
	@JsonProperty("accNum")
	public void setAccNum( java.lang.String accNum ) {
		isSet_accNum = true;
		this.accNum = accNum;
	}
	
	/** Property set << accNum >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << accPW >> [[ */
	
	@XmlTransient
	private boolean isSet_accPW = false;
	
	protected boolean isSet_accPW()
	{
		return this.isSet_accPW;
	}
	
	protected void setIsSet_accPW(boolean value)
	{
		this.isSet_accPW = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="비밀번호", formatType="", format="", align="left", length=4, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String accPW  = null;
	
	/**
	 * @Description 비밀번호
	 */
	public java.lang.String getAccPW(){
		return accPW;
	}
	
	/**
	 * @Description 비밀번호
	 */
	@JsonProperty("accPW")
	public void setAccPW( java.lang.String accPW ) {
		isSet_accPW = true;
		this.accPW = accPW;
	}
	
	/** Property set << accPW >> ]]
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
	 * @Description 잔액
	 */
	public void setAmt(java.lang.String value) {
		isSet_amt = true;
		this.amt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 잔액
	 */
	public void setAmt(double value) {
		isSet_amt = true;
		this.amt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 잔액
	 */
	public void setAmt(long value) {
		isSet_amt = true;
		this.amt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="잔액", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal amt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 잔액
	 */
	public java.math.BigDecimal getAmt(){
		return amt;
	}
	
	/**
	 * @Description 잔액
	 */
	@JsonProperty("amt")
	public void setAmt( java.math.BigDecimal amt ) {
		isSet_amt = true;
		this.amt = amt;
	}
	
	/** Property set << amt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << cusNm >> [[ */
	
	@XmlTransient
	private boolean isSet_cusNm = false;
	
	protected boolean isSet_cusNm()
	{
		return this.isSet_cusNm;
	}
	
	protected void setIsSet_cusNm(boolean value)
	{
		this.isSet_cusNm = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="고객명", formatType="", format="", align="left", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String cusNm  = null;
	
	/**
	 * @Description 고객명
	 */
	public java.lang.String getCusNm(){
		return cusNm;
	}
	
	/**
	 * @Description 고객명
	 */
	@JsonProperty("cusNm")
	public void setCusNm( java.lang.String cusNm ) {
		isSet_cusNm = true;
		this.cusNm = cusNm;
	}
	
	/** Property set << cusNm >> ]]
	*******************************************************************************************************************************/

	@Override
	public CustomerAccountCommonOut clone(){
		try{
			CustomerAccountCommonOut object= (CustomerAccountCommonOut)super.clone();
			
			
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
		
		result = prime * result + ((cusId==null)?0:cusId.hashCode());
		result = prime * result + ((opBrch==null)?0:opBrch.hashCode());
		result = prime * result + ((accNum==null)?0:accNum.hashCode());
		result = prime * result + ((accPW==null)?0:accPW.hashCode());
		result = prime * result + ((amt==null)?0:amt.hashCode());
		result = prime * result + ((cusNm==null)?0:cusNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.com.onl.bc.dto.CustomerAccountCommonOut other= (bxm.dft.smp.com.onl.bc.dto.CustomerAccountCommonOut)obj;
		if ( cusId == null){
			if ( other.cusId != null ) return false;
		}
		else if ( !cusId.equals(other.cusId) )
			return false;
		if ( opBrch == null){
			if ( other.opBrch != null ) return false;
		}
		else if ( !opBrch.equals(other.opBrch) )
			return false;
		if ( accNum == null){
			if ( other.accNum != null ) return false;
		}
		else if ( !accNum.equals(other.accNum) )
			return false;
		if ( accPW == null){
			if ( other.accPW != null ) return false;
		}
		else if ( !accPW.equals(other.accPW) )
			return false;
		if ( amt == null){
			if ( other.amt != null ) return false;
		}
		else if ( !amt.equals(other.amt) )
			return false;
		if ( cusNm == null){
			if ( other.cusNm != null ) return false;
		}
		else if ( !cusNm.equals(other.cusNm) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.com.onl.bc.dto.CustomerAccountCommonOut:\n");
		sb.append("\tcusId: ");
		sb.append(cusId==null?"null":getCusId());
		sb.append("\n");
		sb.append("\topBrch: ");
		sb.append(opBrch==null?"null":getOpBrch());
		sb.append("\n");
		sb.append("\taccNum: ");
		sb.append(accNum==null?"null":getAccNum());
		sb.append("\n");
		sb.append("\taccPW: ");
		sb.append(accPW==null?"null":getAccPW());
		sb.append("\n");
		sb.append("\tamt: ");
		sb.append(amt==null?"null":getAmt());
		sb.append("\n");
		sb.append("\tcusNm: ");
		sb.append(cusNm==null?"null":getCusNm());
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
	
		messageLen+= 10; /* cusId */
		messageLen+= 1; /* opBrch */
		messageLen+= 6; /* accNum */
		messageLen+= 4; /* accPW */
		messageLen+= 20; /* amt */
		messageLen+= 20; /* cusNm */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("cusId");
		fieldNames.add("opBrch");
		fieldNames.add("accNum");
		fieldNames.add("accPW");
		fieldNames.add("amt");
		fieldNames.add("cusNm");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("cusId", get("cusId"));
		fieldValueMap.put("opBrch", get("opBrch"));
		fieldValueMap.put("accNum", get("accNum"));
		fieldValueMap.put("accPW", get("accPW"));
		fieldValueMap.put("amt", get("amt"));
		fieldValueMap.put("cusNm", get("cusNm"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 95027004 : /* cusId */
			return getCusId();
		case -1011618250 : /* opBrch */
			return getOpBrch();
		case -1423483067 : /* accNum */
			return getAccNum();
		case 92628552 : /* accPW */
			return getAccPW();
		case 96712 : /* amt */
			return getAmt();
		case 95027168 : /* cusNm */
			return getCusNm();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 95027004 : /* cusId */
			setCusId((java.lang.String) value);
			return;
		case -1011618250 : /* opBrch */
			setOpBrch((java.lang.Integer) value);
			return;
		case -1423483067 : /* accNum */
			setAccNum((java.lang.String) value);
			return;
		case 92628552 : /* accPW */
			setAccPW((java.lang.String) value);
			return;
		case 96712 : /* amt */
			setAmt((java.math.BigDecimal) value);
			return;
		case 95027168 : /* cusNm */
			setCusNm((java.lang.String) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
