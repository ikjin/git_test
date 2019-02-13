/******************************************************************************
 * Bxm Object Message Mapping(OMM) - Source Generator V6-1
 *
 * 생성된 자바파일은 수정하지 마십시오.
 * OMM 파일 수정시 Java파일을 덮어쓰게 됩니다.
 *
 ******************************************************************************/

package bxm.dft.cc.bat.bean.dto;


import bxm.omm.predict.Predictable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Hashtable;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlRootElement;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import bxm.omm.predict.FieldInfo;

/**
 * @Description 
 */
@XmlRootElement(name="ReportCcBatchBean01Dto")
@SuppressWarnings("all")
public class ReportCcBatchBean01Dto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = -1692547967L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "";


	@Override
	public ReportCcBatchBean01Dto clone(){
		try{
			ReportCcBatchBean01Dto object= (ReportCcBatchBean01Dto)super.clone();
			
			return object;
		} 
		catch(Exception e){
			throw new bxm.omm.exception.CloneFailedException(e);
		}
	}

	
	@Override
	public int hashCode(){
		int result = 1;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.cc.bat.bean.dto.ReportCcBatchBean01Dto:\n");
		sb.append("]\n");
	
		return sb.toString();
	}

	/**
	 * Only for Fixed-Length Data
	 */
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
	
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) {
		switch( key.hashCode() ){
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		default : htDynamicVariable.put(key, value);
		}
	}
}
