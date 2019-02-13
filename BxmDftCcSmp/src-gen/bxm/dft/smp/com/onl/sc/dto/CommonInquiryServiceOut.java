/******************************************************************************
 * Bxm Object Message Mapping(OMM) - Source Generator V7
 *
 * 생성된 자바파일은 수정하지 마십시오.
 * IO 파일 수정시 Java파일을 덮어쓰게 됩니다.
 *
 ******************************************************************************/

package bxm.dft.smp.com.onl.sc.dto;


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
@XmlType(propOrder={"cnt", "list"}, name="CommonInquiryServiceOut")
@XmlRootElement(name="CommonInquiryServiceOut")
@SuppressWarnings("all")
public class CommonInquiryServiceOut  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = 850805505L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << cnt >> [[ */
	
	@XmlTransient
	private boolean isSet_cnt = false;
	
	protected boolean isSet_cnt()
	{
		return this.isSet_cnt;
	}
	
	protected void setIsSet_cnt(boolean value)
	{
		this.isSet_cnt = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="리스트건수", formatType="", format="", align="right", length=6, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.Integer cnt  = 0;
	
	/**
	 * @Description 리스트건수
	 */
	public java.lang.Integer getCnt(){
		/*
		 * 이 변수는 배열 또는 BLOB, CLOB에 의해 참조 되는 변수 입니다.
		 */
		if ( isSet_cnt )	return cnt;
		else
		{
			if ( list == null || list.size() == 0 ) return 0;
			else return list.size();
		}
	}
	
	/**
	 * @Description 리스트건수
	 */
	@JsonProperty("cnt")
	public void setCnt( java.lang.Integer cnt ) {
		isSet_cnt = true;
		this.cnt = cnt;
	}
	
	/** Property set << cnt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << list >> [[ */
	
	@XmlTransient
	private boolean isSet_list = false;
	
	protected boolean isSet_list()
	{
		return this.isSet_list;
	}
	
	protected void setIsSet_list(boolean value)
	{
		this.isSet_list = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="수신원장리스트", formatType="", format="", align="left", length=0, decimal=0, arrayReference="cnt", fill="", comment="", encrypt="", validationRule="")
	private java.util.List<bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO> list  = new java.util.ArrayList<bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO>();
	
	/**
	 * @Description 수신원장리스트
	 */
	public java.util.List<bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO>  getList(){
		return list;
	}
	
	/**
	 * @Description 수신원장리스트
	 */
	@JsonProperty("list")
	public void setList( java.util.List<bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO> list ) {
		isSet_list = true;
		this.list = list;
	}
	
	/** Property set << list >> ]]
	*******************************************************************************************************************************/

	@Override
	public CommonInquiryServiceOut clone(){
		try{
			CommonInquiryServiceOut object= (CommonInquiryServiceOut)super.clone();
			
			if ( this.list== null ) object.list = null;
			else{
				java.util.List<bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO> clonedList = new java.util.ArrayList<bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO>(list.size());
				for( bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO item : list ){
					clonedList.add( (bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO)item.clone());
				}
				object.list = clonedList;
			}
			
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
		
		result = prime * result + ((cnt==null)?0:cnt.hashCode());
		result = prime * result + ((list==null)?0:list.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.com.onl.sc.dto.CommonInquiryServiceOut other= (bxm.dft.smp.com.onl.sc.dto.CommonInquiryServiceOut)obj;
		if ( cnt == null){
			if ( other.cnt != null ) return false;
		}
		else if ( !cnt.equals(other.cnt) )
			return false;
		if ( list == null){
			if ( other.list != null ) return false;
		}
		else if ( !list.equals(other.list) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.com.onl.sc.dto.CommonInquiryServiceOut:\n");
		sb.append("\tcnt: ");
		sb.append(cnt==null?"null":getCnt());
		sb.append("\n");
		sb.append("\tlist: ");
		if ( list == null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(list.size());
			sb.append("(items)\n");
	
			int max= (10<list.size())?10:list.size();
	
			for ( int i = 0; i < max; ++i ){
				sb.append("\tlist[");
				sb.append(i);
				sb.append("] : ");
				sb.append(list.get(i));
				sb.append("\n");
			}
	
			if ( max < list.size() ){
				sb.append("\tlist[.] : ").append("more ").append((list.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}

	/**
	 * Only for Fixed-Length Data
	 */
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
	
		messageLen+= 6; /* cnt */
		{/*list*/
			int size=getCnt();
			int count= list.size();
			int min= size > count?count:size;
			bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO element= list.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Can not predict message length.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Can not predict message length.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("cnt");
		fieldNames.add("list");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("cnt", get("cnt"));
		fieldValueMap.put("list", get("list"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 98665 : /* cnt */
			return getCnt();
		case 3322014 : /* list */
			return getList();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 98665 : /* cnt */
			setCnt((java.lang.Integer) value);
			return;
		case 3322014 : /* list */
			setList((java.util.List<bxm.dft.smp.com.onl.dao.dto.SmpRcpMstIO>) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
