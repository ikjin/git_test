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
 * @Description 
 */
@XmlType(propOrder={"cusNm", "accNum", "amt"}, name="DepositServiceOut")
@XmlRootElement(name="DepositServiceOut")
@SuppressWarnings("all")
public class DepositServiceOut  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = 1287792373L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

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

	@Override
	public DepositServiceOut clone(){
		try{
			DepositServiceOut object= (DepositServiceOut)super.clone();
			
			
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
		
		result = prime * result + ((cusNm==null)?0:cusNm.hashCode());
		result = prime * result + ((accNum==null)?0:accNum.hashCode());
		result = prime * result + ((amt==null)?0:amt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.dep.onl.sc.dto.DepositServiceOut other= (bxm.dft.smp.dep.onl.sc.dto.DepositServiceOut)obj;
		if ( cusNm == null){
			if ( other.cusNm != null ) return false;
		}
		else if ( !cusNm.equals(other.cusNm) )
			return false;
		if ( accNum == null){
			if ( other.accNum != null ) return false;
		}
		else if ( !accNum.equals(other.accNum) )
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
	
		sb.append( "\n[bxm.dft.smp.dep.onl.sc.dto.DepositServiceOut:\n");
		sb.append("\tcusNm: ");
		sb.append(cusNm==null?"null":getCusNm());
		sb.append("\n");
		sb.append("\taccNum: ");
		sb.append(accNum==null?"null":getAccNum());
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
	
		messageLen+= 20; /* cusNm */
		messageLen+= 6; /* accNum */
		messageLen+= 20; /* amt */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("cusNm");
		fieldNames.add("accNum");
		fieldNames.add("amt");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("cusNm", get("cusNm"));
		fieldValueMap.put("accNum", get("accNum"));
		fieldValueMap.put("amt", get("amt"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 95027168 : /* cusNm */
			return getCusNm();
		case -1423483067 : /* accNum */
			return getAccNum();
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
		case 95027168 : /* cusNm */
			setCusNm((java.lang.String) value);
			return;
		case -1423483067 : /* accNum */
			setAccNum((java.lang.String) value);
			return;
		case 96712 : /* amt */
			setAmt((java.math.BigDecimal) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
