/******************************************************************************
 * Bxm Object Message Mapping(OMM) - Source Generator V7
 *
 * 생성된 자바파일은 수정하지 마십시오.
 * IO 파일 수정시 Java파일을 덮어쓰게 됩니다.
 *
 ******************************************************************************/

package bxm.dft.cc.bat.bean.dto;


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
@XmlType(propOrder={"cusNo", "accNum", "intAmt"}, name="InterestCalculationBatchOut")
@XmlRootElement(name="InterestCalculationBatchOut")
@SuppressWarnings("all")
public class InterestCalculationBatchOut  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = -581688998L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = " ";
	
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
	* Property set << intAmt >> [[ */
	
	@XmlTransient
	private boolean isSet_intAmt = false;
	
	protected boolean isSet_intAmt()
	{
		return this.isSet_intAmt;
	}
	
	protected void setIsSet_intAmt(boolean value)
	{
		this.isSet_intAmt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 이자
	 */
	public void setIntAmt(java.lang.String value) {
		isSet_intAmt = true;
		this.intAmt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 이자
	 */
	public void setIntAmt(double value) {
		isSet_intAmt = true;
		this.intAmt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 이자
	 */
	public void setIntAmt(long value) {
		isSet_intAmt = true;
		this.intAmt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="이자", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal intAmt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 이자
	 */
	public java.math.BigDecimal getIntAmt(){
		return intAmt;
	}
	
	/**
	 * @Description 이자
	 */
	@JsonProperty("intAmt")
	public void setIntAmt( java.math.BigDecimal intAmt ) {
		isSet_intAmt = true;
		this.intAmt = intAmt;
	}
	
	/** Property set << intAmt >> ]]
	*******************************************************************************************************************************/

	@Override
	public InterestCalculationBatchOut clone(){
		try{
			InterestCalculationBatchOut object= (InterestCalculationBatchOut)super.clone();
			
			
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
		result = prime * result + ((accNum==null)?0:accNum.hashCode());
		result = prime * result + ((intAmt==null)?0:intAmt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.cc.bat.bean.dto.InterestCalculationBatchOut other= (bxm.dft.cc.bat.bean.dto.InterestCalculationBatchOut)obj;
		if ( cusNo == null){
			if ( other.cusNo != null ) return false;
		}
		else if ( !cusNo.equals(other.cusNo) )
			return false;
		if ( accNum == null){
			if ( other.accNum != null ) return false;
		}
		else if ( !accNum.equals(other.accNum) )
			return false;
		if ( intAmt == null){
			if ( other.intAmt != null ) return false;
		}
		else if ( !intAmt.equals(other.intAmt) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.cc.bat.bean.dto.InterestCalculationBatchOut:\n");
		sb.append("\tcusNo: ");
		sb.append(cusNo==null?"null":getCusNo());
		sb.append("\n");
		sb.append("\taccNum: ");
		sb.append(accNum==null?"null":getAccNum());
		sb.append("\n");
		sb.append("\tintAmt: ");
		sb.append(intAmt==null?"null":getIntAmt());
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
		messageLen+= 6; /* accNum */
		messageLen+= 20; /* intAmt */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("cusNo");
		fieldNames.add("accNum");
		fieldNames.add("intAmt");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("cusNo", get("cusNo"));
		fieldValueMap.put("accNum", get("accNum"));
		fieldValueMap.put("intAmt", get("intAmt"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 95027170 : /* cusNo */
			return getCusNo();
		case -1423483067 : /* accNum */
			return getAccNum();
		case -1183797415 : /* intAmt */
			return getIntAmt();
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
		case -1423483067 : /* accNum */
			setAccNum((java.lang.String) value);
			return;
		case -1183797415 : /* intAmt */
			setIntAmt((java.math.BigDecimal) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
