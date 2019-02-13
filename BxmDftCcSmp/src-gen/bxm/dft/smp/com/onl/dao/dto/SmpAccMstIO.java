/******************************************************************************
 * Bxm Object Message Mapping(OMM) - Source Generator V7
 *
 * 생성된 자바파일은 수정하지 마십시오.
 * IO 파일 수정시 Java파일을 덮어쓰게 됩니다.
 *
 ******************************************************************************/

package bxm.dft.smp.com.onl.dao.dto;


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
@XmlType(propOrder={"opBrch", "amt"}, name="SmpAccMstIO")
@XmlRootElement(name="SmpAccMstIO")
@SuppressWarnings("all")
public class SmpAccMstIO  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = -1931854779L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

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
	public SmpAccMstIO clone(){
		try{
			SmpAccMstIO object= (SmpAccMstIO)super.clone();
			
			
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
		
		result = prime * result + ((opBrch==null)?0:opBrch.hashCode());
		result = prime * result + ((amt==null)?0:amt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.com.onl.dao.dto.SmpAccMstIO other= (bxm.dft.smp.com.onl.dao.dto.SmpAccMstIO)obj;
		if ( opBrch == null){
			if ( other.opBrch != null ) return false;
		}
		else if ( !opBrch.equals(other.opBrch) )
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
	
		sb.append( "\n[bxm.dft.smp.com.onl.dao.dto.SmpAccMstIO:\n");
		sb.append("\topBrch: ");
		sb.append(opBrch==null?"null":getOpBrch());
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
	
		messageLen+= 1; /* opBrch */
		messageLen+= 20; /* amt */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("opBrch");
		fieldNames.add("amt");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("opBrch", get("opBrch"));
		fieldValueMap.put("amt", get("amt"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1011618250 : /* opBrch */
			return getOpBrch();
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
		case -1011618250 : /* opBrch */
			setOpBrch((java.lang.Integer) value);
			return;
		case 96712 : /* amt */
			setAmt((java.math.BigDecimal) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
