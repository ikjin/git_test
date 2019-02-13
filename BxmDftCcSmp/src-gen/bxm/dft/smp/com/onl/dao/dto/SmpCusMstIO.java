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
@XmlType(propOrder={"cusNo", "cusNm", "cusId"}, name="SmpCusMstIO")
@XmlRootElement(name="SmpCusMstIO")
@SuppressWarnings("all")
public class SmpCusMstIO  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = 807029381L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "";
	
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
	
	
	@BxmOmm_Field(referenceType="reference", description="이름", formatType="", format="", align="left", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String cusNm  = null;
	
	/**
	 * @Description 이름
	 */
	public java.lang.String getCusNm(){
		return cusNm;
	}
	
	/**
	 * @Description 이름
	 */
	@JsonProperty("cusNm")
	public void setCusNm( java.lang.String cusNm ) {
		isSet_cusNm = true;
		this.cusNm = cusNm;
	}
	
	/** Property set << cusNm >> ]]
	*******************************************************************************************************************************/
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

	@Override
	public SmpCusMstIO clone(){
		try{
			SmpCusMstIO object= (SmpCusMstIO)super.clone();
			
			
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
		result = prime * result + ((cusNm==null)?0:cusNm.hashCode());
		result = prime * result + ((cusId==null)?0:cusId.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.com.onl.dao.dto.SmpCusMstIO other= (bxm.dft.smp.com.onl.dao.dto.SmpCusMstIO)obj;
		if ( cusNo == null){
			if ( other.cusNo != null ) return false;
		}
		else if ( !cusNo.equals(other.cusNo) )
			return false;
		if ( cusNm == null){
			if ( other.cusNm != null ) return false;
		}
		else if ( !cusNm.equals(other.cusNm) )
			return false;
		if ( cusId == null){
			if ( other.cusId != null ) return false;
		}
		else if ( !cusId.equals(other.cusId) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.com.onl.dao.dto.SmpCusMstIO:\n");
		sb.append("\tcusNo: ");
		sb.append(cusNo==null?"null":getCusNo());
		sb.append("\n");
		sb.append("\tcusNm: ");
		sb.append(cusNm==null?"null":getCusNm());
		sb.append("\n");
		sb.append("\tcusId: ");
		sb.append(cusId==null?"null":getCusId());
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
		messageLen+= 20; /* cusNm */
		messageLen+= 10; /* cusId */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("cusNo");
		fieldNames.add("cusNm");
		fieldNames.add("cusId");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("cusNo", get("cusNo"));
		fieldValueMap.put("cusNm", get("cusNm"));
		fieldValueMap.put("cusId", get("cusId"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 95027170 : /* cusNo */
			return getCusNo();
		case 95027168 : /* cusNm */
			return getCusNm();
		case 95027004 : /* cusId */
			return getCusId();
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
		case 95027168 : /* cusNm */
			setCusNm((java.lang.String) value);
			return;
		case 95027004 : /* cusId */
			setCusId((java.lang.String) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
