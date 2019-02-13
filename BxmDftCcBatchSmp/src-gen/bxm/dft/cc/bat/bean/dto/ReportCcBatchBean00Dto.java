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
@XmlType(propOrder={"domainId", "ccId", "pcsnDt", "acptNo", "tnNo", "execNo", "pcsnStat", "fstSrtDt", "fstSrtTime", "reSrtDt", "reSrtTime", "endDt", "endTime", "maxPcsnCnt", "lastPcsnNo", "ttObjCnt", "ttObjAmt", "nomlPcsnCnt", "nomlPcsnAmt", "errPcsnCnt", "errPcsnAmt", "delPcsnCnt", "delPcsnAmt", "modifyUserId", "modifyOccurDttm"}, name="ReportCcBatchBean00Dto")
@XmlRootElement(name="ReportCcBatchBean00Dto")
@SuppressWarnings("all")
public class ReportCcBatchBean00Dto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = -1692577758L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << domainId >> [[ */
	
	@XmlTransient
	private boolean isSet_domainId = false;
	
	protected boolean isSet_domainId()
	{
		return this.isSet_domainId;
	}
	
	protected void setIsSet_domainId(boolean value)
	{
		this.isSet_domainId = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="도메인ID", formatType="", format="", align="left", length=14, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String domainId  = null;
	
	/**
	 * @Description 도메인ID
	 */
	public java.lang.String getDomainId(){
		return domainId;
	}
	
	/**
	 * @Description 도메인ID
	 */
	@JsonProperty("domainId")
	public void setDomainId( java.lang.String domainId ) {
		isSet_domainId = true;
		this.domainId = domainId;
	}
	
	/** Property set << domainId >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << ccId >> [[ */
	
	@XmlTransient
	private boolean isSet_ccId = false;
	
	protected boolean isSet_ccId()
	{
		return this.isSet_ccId;
	}
	
	protected void setIsSet_ccId(boolean value)
	{
		this.isSet_ccId = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="센터컷ID", formatType="", format="", align="left", length=9, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String ccId  = null;
	
	/**
	 * @Description 센터컷ID
	 */
	public java.lang.String getCcId(){
		return ccId;
	}
	
	/**
	 * @Description 센터컷ID
	 */
	@JsonProperty("ccId")
	public void setCcId( java.lang.String ccId ) {
		isSet_ccId = true;
		this.ccId = ccId;
	}
	
	/** Property set << ccId >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << pcsnDt >> [[ */
	
	@XmlTransient
	private boolean isSet_pcsnDt = false;
	
	protected boolean isSet_pcsnDt()
	{
		return this.isSet_pcsnDt;
	}
	
	protected void setIsSet_pcsnDt(boolean value)
	{
		this.isSet_pcsnDt = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="처리일자", formatType="", format="", align="left", length=8, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String pcsnDt  = null;
	
	/**
	 * @Description 처리일자
	 */
	public java.lang.String getPcsnDt(){
		return pcsnDt;
	}
	
	/**
	 * @Description 처리일자
	 */
	@JsonProperty("pcsnDt")
	public void setPcsnDt( java.lang.String pcsnDt ) {
		isSet_pcsnDt = true;
		this.pcsnDt = pcsnDt;
	}
	
	/** Property set << pcsnDt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << acptNo >> [[ */
	
	@XmlTransient
	private boolean isSet_acptNo = false;
	
	protected boolean isSet_acptNo()
	{
		return this.isSet_acptNo;
	}
	
	protected void setIsSet_acptNo(boolean value)
	{
		this.isSet_acptNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="접수번호", formatType="", format="", align="right", length=9, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.Integer acptNo  = 0;
	
	/**
	 * @Description 접수번호
	 */
	public java.lang.Integer getAcptNo(){
		return acptNo;
	}
	
	/**
	 * @Description 접수번호
	 */
	@JsonProperty("acptNo")
	public void setAcptNo( java.lang.Integer acptNo ) {
		isSet_acptNo = true;
		this.acptNo = acptNo;
	}
	
	/** Property set << acptNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << tnNo >> [[ */
	
	@XmlTransient
	private boolean isSet_tnNo = false;
	
	protected boolean isSet_tnNo()
	{
		return this.isSet_tnNo;
	}
	
	protected void setIsSet_tnNo(boolean value)
	{
		this.isSet_tnNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="회차번호", formatType="", format="", align="right", length=9, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.Integer tnNo  = 0;
	
	/**
	 * @Description 회차번호
	 */
	public java.lang.Integer getTnNo(){
		return tnNo;
	}
	
	/**
	 * @Description 회차번호
	 */
	@JsonProperty("tnNo")
	public void setTnNo( java.lang.Integer tnNo ) {
		isSet_tnNo = true;
		this.tnNo = tnNo;
	}
	
	/** Property set << tnNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << execNo >> [[ */
	
	@XmlTransient
	private boolean isSet_execNo = false;
	
	protected boolean isSet_execNo()
	{
		return this.isSet_execNo;
	}
	
	protected void setIsSet_execNo(boolean value)
	{
		this.isSet_execNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="실행번호", formatType="", format="", align="right", length=9, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.Integer execNo  = 0;
	
	/**
	 * @Description 실행번호
	 */
	public java.lang.Integer getExecNo(){
		return execNo;
	}
	
	/**
	 * @Description 실행번호
	 */
	@JsonProperty("execNo")
	public void setExecNo( java.lang.Integer execNo ) {
		isSet_execNo = true;
		this.execNo = execNo;
	}
	
	/** Property set << execNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << pcsnStat >> [[ */
	
	@XmlTransient
	private boolean isSet_pcsnStat = false;
	
	protected boolean isSet_pcsnStat()
	{
		return this.isSet_pcsnStat;
	}
	
	protected void setIsSet_pcsnStat(boolean value)
	{
		this.isSet_pcsnStat = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="처리상태", formatType="", format="", align="left", length=9, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String pcsnStat  = null;
	
	/**
	 * @Description 처리상태
	 */
	public java.lang.String getPcsnStat(){
		return pcsnStat;
	}
	
	/**
	 * @Description 처리상태
	 */
	@JsonProperty("pcsnStat")
	public void setPcsnStat( java.lang.String pcsnStat ) {
		isSet_pcsnStat = true;
		this.pcsnStat = pcsnStat;
	}
	
	/** Property set << pcsnStat >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << fstSrtDt >> [[ */
	
	@XmlTransient
	private boolean isSet_fstSrtDt = false;
	
	protected boolean isSet_fstSrtDt()
	{
		return this.isSet_fstSrtDt;
	}
	
	protected void setIsSet_fstSrtDt(boolean value)
	{
		this.isSet_fstSrtDt = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="최초시작일자", formatType="", format="", align="left", length=8, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String fstSrtDt  = null;
	
	/**
	 * @Description 최초시작일자
	 */
	public java.lang.String getFstSrtDt(){
		return fstSrtDt;
	}
	
	/**
	 * @Description 최초시작일자
	 */
	@JsonProperty("fstSrtDt")
	public void setFstSrtDt( java.lang.String fstSrtDt ) {
		isSet_fstSrtDt = true;
		this.fstSrtDt = fstSrtDt;
	}
	
	/** Property set << fstSrtDt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << fstSrtTime >> [[ */
	
	@XmlTransient
	private boolean isSet_fstSrtTime = false;
	
	protected boolean isSet_fstSrtTime()
	{
		return this.isSet_fstSrtTime;
	}
	
	protected void setIsSet_fstSrtTime(boolean value)
	{
		this.isSet_fstSrtTime = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="최초시작시각", formatType="", format="", align="left", length=6, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String fstSrtTime  = null;
	
	/**
	 * @Description 최초시작시각
	 */
	public java.lang.String getFstSrtTime(){
		return fstSrtTime;
	}
	
	/**
	 * @Description 최초시작시각
	 */
	@JsonProperty("fstSrtTime")
	public void setFstSrtTime( java.lang.String fstSrtTime ) {
		isSet_fstSrtTime = true;
		this.fstSrtTime = fstSrtTime;
	}
	
	/** Property set << fstSrtTime >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << reSrtDt >> [[ */
	
	@XmlTransient
	private boolean isSet_reSrtDt = false;
	
	protected boolean isSet_reSrtDt()
	{
		return this.isSet_reSrtDt;
	}
	
	protected void setIsSet_reSrtDt(boolean value)
	{
		this.isSet_reSrtDt = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="재시작일자", formatType="", format="", align="left", length=8, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String reSrtDt  = null;
	
	/**
	 * @Description 재시작일자
	 */
	public java.lang.String getReSrtDt(){
		return reSrtDt;
	}
	
	/**
	 * @Description 재시작일자
	 */
	@JsonProperty("reSrtDt")
	public void setReSrtDt( java.lang.String reSrtDt ) {
		isSet_reSrtDt = true;
		this.reSrtDt = reSrtDt;
	}
	
	/** Property set << reSrtDt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << reSrtTime >> [[ */
	
	@XmlTransient
	private boolean isSet_reSrtTime = false;
	
	protected boolean isSet_reSrtTime()
	{
		return this.isSet_reSrtTime;
	}
	
	protected void setIsSet_reSrtTime(boolean value)
	{
		this.isSet_reSrtTime = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="재시작시각", formatType="", format="", align="left", length=6, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String reSrtTime  = null;
	
	/**
	 * @Description 재시작시각
	 */
	public java.lang.String getReSrtTime(){
		return reSrtTime;
	}
	
	/**
	 * @Description 재시작시각
	 */
	@JsonProperty("reSrtTime")
	public void setReSrtTime( java.lang.String reSrtTime ) {
		isSet_reSrtTime = true;
		this.reSrtTime = reSrtTime;
	}
	
	/** Property set << reSrtTime >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << endDt >> [[ */
	
	@XmlTransient
	private boolean isSet_endDt = false;
	
	protected boolean isSet_endDt()
	{
		return this.isSet_endDt;
	}
	
	protected void setIsSet_endDt(boolean value)
	{
		this.isSet_endDt = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="종료일자", formatType="", format="", align="left", length=8, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String endDt  = null;
	
	/**
	 * @Description 종료일자
	 */
	public java.lang.String getEndDt(){
		return endDt;
	}
	
	/**
	 * @Description 종료일자
	 */
	@JsonProperty("endDt")
	public void setEndDt( java.lang.String endDt ) {
		isSet_endDt = true;
		this.endDt = endDt;
	}
	
	/** Property set << endDt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << endTime >> [[ */
	
	@XmlTransient
	private boolean isSet_endTime = false;
	
	protected boolean isSet_endTime()
	{
		return this.isSet_endTime;
	}
	
	protected void setIsSet_endTime(boolean value)
	{
		this.isSet_endTime = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="종료시각", formatType="", format="", align="left", length=6, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String endTime  = null;
	
	/**
	 * @Description 종료시각
	 */
	public java.lang.String getEndTime(){
		return endTime;
	}
	
	/**
	 * @Description 종료시각
	 */
	@JsonProperty("endTime")
	public void setEndTime( java.lang.String endTime ) {
		isSet_endTime = true;
		this.endTime = endTime;
	}
	
	/** Property set << endTime >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << maxPcsnCnt >> [[ */
	
	@XmlTransient
	private boolean isSet_maxPcsnCnt = false;
	
	protected boolean isSet_maxPcsnCnt()
	{
		return this.isSet_maxPcsnCnt;
	}
	
	protected void setIsSet_maxPcsnCnt(boolean value)
	{
		this.isSet_maxPcsnCnt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 최대처리개수
	 */
	public void setMaxPcsnCnt(java.lang.String value) {
		isSet_maxPcsnCnt = true;
		this.maxPcsnCnt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 최대처리개수
	 */
	public void setMaxPcsnCnt(double value) {
		isSet_maxPcsnCnt = true;
		this.maxPcsnCnt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 최대처리개수
	 */
	public void setMaxPcsnCnt(long value) {
		isSet_maxPcsnCnt = true;
		this.maxPcsnCnt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="최대처리개수", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal maxPcsnCnt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 최대처리개수
	 */
	public java.math.BigDecimal getMaxPcsnCnt(){
		return maxPcsnCnt;
	}
	
	/**
	 * @Description 최대처리개수
	 */
	@JsonProperty("maxPcsnCnt")
	public void setMaxPcsnCnt( java.math.BigDecimal maxPcsnCnt ) {
		isSet_maxPcsnCnt = true;
		this.maxPcsnCnt = maxPcsnCnt;
	}
	
	/** Property set << maxPcsnCnt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << lastPcsnNo >> [[ */
	
	@XmlTransient
	private boolean isSet_lastPcsnNo = false;
	
	protected boolean isSet_lastPcsnNo()
	{
		return this.isSet_lastPcsnNo;
	}
	
	protected void setIsSet_lastPcsnNo(boolean value)
	{
		this.isSet_lastPcsnNo = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 최종처리번호
	 */
	public void setLastPcsnNo(java.lang.String value) {
		isSet_lastPcsnNo = true;
		this.lastPcsnNo = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 최종처리번호
	 */
	public void setLastPcsnNo(double value) {
		isSet_lastPcsnNo = true;
		this.lastPcsnNo = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 최종처리번호
	 */
	public void setLastPcsnNo(long value) {
		isSet_lastPcsnNo = true;
		this.lastPcsnNo = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="최종처리번호", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal lastPcsnNo  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 최종처리번호
	 */
	public java.math.BigDecimal getLastPcsnNo(){
		return lastPcsnNo;
	}
	
	/**
	 * @Description 최종처리번호
	 */
	@JsonProperty("lastPcsnNo")
	public void setLastPcsnNo( java.math.BigDecimal lastPcsnNo ) {
		isSet_lastPcsnNo = true;
		this.lastPcsnNo = lastPcsnNo;
	}
	
	/** Property set << lastPcsnNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << ttObjCnt >> [[ */
	
	@XmlTransient
	private boolean isSet_ttObjCnt = false;
	
	protected boolean isSet_ttObjCnt()
	{
		return this.isSet_ttObjCnt;
	}
	
	protected void setIsSet_ttObjCnt(boolean value)
	{
		this.isSet_ttObjCnt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 총대상건수
	 */
	public void setTtObjCnt(java.lang.String value) {
		isSet_ttObjCnt = true;
		this.ttObjCnt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 총대상건수
	 */
	public void setTtObjCnt(double value) {
		isSet_ttObjCnt = true;
		this.ttObjCnt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 총대상건수
	 */
	public void setTtObjCnt(long value) {
		isSet_ttObjCnt = true;
		this.ttObjCnt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="총대상건수", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal ttObjCnt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 총대상건수
	 */
	public java.math.BigDecimal getTtObjCnt(){
		return ttObjCnt;
	}
	
	/**
	 * @Description 총대상건수
	 */
	@JsonProperty("ttObjCnt")
	public void setTtObjCnt( java.math.BigDecimal ttObjCnt ) {
		isSet_ttObjCnt = true;
		this.ttObjCnt = ttObjCnt;
	}
	
	/** Property set << ttObjCnt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << ttObjAmt >> [[ */
	
	@XmlTransient
	private boolean isSet_ttObjAmt = false;
	
	protected boolean isSet_ttObjAmt()
	{
		return this.isSet_ttObjAmt;
	}
	
	protected void setIsSet_ttObjAmt(boolean value)
	{
		this.isSet_ttObjAmt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 총대상금액
	 */
	public void setTtObjAmt(java.lang.String value) {
		isSet_ttObjAmt = true;
		this.ttObjAmt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 총대상금액
	 */
	public void setTtObjAmt(double value) {
		isSet_ttObjAmt = true;
		this.ttObjAmt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 총대상금액
	 */
	public void setTtObjAmt(long value) {
		isSet_ttObjAmt = true;
		this.ttObjAmt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="총대상금액", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal ttObjAmt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 총대상금액
	 */
	public java.math.BigDecimal getTtObjAmt(){
		return ttObjAmt;
	}
	
	/**
	 * @Description 총대상금액
	 */
	@JsonProperty("ttObjAmt")
	public void setTtObjAmt( java.math.BigDecimal ttObjAmt ) {
		isSet_ttObjAmt = true;
		this.ttObjAmt = ttObjAmt;
	}
	
	/** Property set << ttObjAmt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << nomlPcsnCnt >> [[ */
	
	@XmlTransient
	private boolean isSet_nomlPcsnCnt = false;
	
	protected boolean isSet_nomlPcsnCnt()
	{
		return this.isSet_nomlPcsnCnt;
	}
	
	protected void setIsSet_nomlPcsnCnt(boolean value)
	{
		this.isSet_nomlPcsnCnt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 정상처리건수
	 */
	public void setNomlPcsnCnt(java.lang.String value) {
		isSet_nomlPcsnCnt = true;
		this.nomlPcsnCnt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 정상처리건수
	 */
	public void setNomlPcsnCnt(double value) {
		isSet_nomlPcsnCnt = true;
		this.nomlPcsnCnt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 정상처리건수
	 */
	public void setNomlPcsnCnt(long value) {
		isSet_nomlPcsnCnt = true;
		this.nomlPcsnCnt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="정상처리건수", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal nomlPcsnCnt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 정상처리건수
	 */
	public java.math.BigDecimal getNomlPcsnCnt(){
		return nomlPcsnCnt;
	}
	
	/**
	 * @Description 정상처리건수
	 */
	@JsonProperty("nomlPcsnCnt")
	public void setNomlPcsnCnt( java.math.BigDecimal nomlPcsnCnt ) {
		isSet_nomlPcsnCnt = true;
		this.nomlPcsnCnt = nomlPcsnCnt;
	}
	
	/** Property set << nomlPcsnCnt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << nomlPcsnAmt >> [[ */
	
	@XmlTransient
	private boolean isSet_nomlPcsnAmt = false;
	
	protected boolean isSet_nomlPcsnAmt()
	{
		return this.isSet_nomlPcsnAmt;
	}
	
	protected void setIsSet_nomlPcsnAmt(boolean value)
	{
		this.isSet_nomlPcsnAmt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 정상처리금액
	 */
	public void setNomlPcsnAmt(java.lang.String value) {
		isSet_nomlPcsnAmt = true;
		this.nomlPcsnAmt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 정상처리금액
	 */
	public void setNomlPcsnAmt(double value) {
		isSet_nomlPcsnAmt = true;
		this.nomlPcsnAmt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 정상처리금액
	 */
	public void setNomlPcsnAmt(long value) {
		isSet_nomlPcsnAmt = true;
		this.nomlPcsnAmt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="정상처리금액", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal nomlPcsnAmt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 정상처리금액
	 */
	public java.math.BigDecimal getNomlPcsnAmt(){
		return nomlPcsnAmt;
	}
	
	/**
	 * @Description 정상처리금액
	 */
	@JsonProperty("nomlPcsnAmt")
	public void setNomlPcsnAmt( java.math.BigDecimal nomlPcsnAmt ) {
		isSet_nomlPcsnAmt = true;
		this.nomlPcsnAmt = nomlPcsnAmt;
	}
	
	/** Property set << nomlPcsnAmt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << errPcsnCnt >> [[ */
	
	@XmlTransient
	private boolean isSet_errPcsnCnt = false;
	
	protected boolean isSet_errPcsnCnt()
	{
		return this.isSet_errPcsnCnt;
	}
	
	protected void setIsSet_errPcsnCnt(boolean value)
	{
		this.isSet_errPcsnCnt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 오류처리건수
	 */
	public void setErrPcsnCnt(java.lang.String value) {
		isSet_errPcsnCnt = true;
		this.errPcsnCnt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 오류처리건수
	 */
	public void setErrPcsnCnt(double value) {
		isSet_errPcsnCnt = true;
		this.errPcsnCnt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 오류처리건수
	 */
	public void setErrPcsnCnt(long value) {
		isSet_errPcsnCnt = true;
		this.errPcsnCnt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="오류처리건수", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal errPcsnCnt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 오류처리건수
	 */
	public java.math.BigDecimal getErrPcsnCnt(){
		return errPcsnCnt;
	}
	
	/**
	 * @Description 오류처리건수
	 */
	@JsonProperty("errPcsnCnt")
	public void setErrPcsnCnt( java.math.BigDecimal errPcsnCnt ) {
		isSet_errPcsnCnt = true;
		this.errPcsnCnt = errPcsnCnt;
	}
	
	/** Property set << errPcsnCnt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << errPcsnAmt >> [[ */
	
	@XmlTransient
	private boolean isSet_errPcsnAmt = false;
	
	protected boolean isSet_errPcsnAmt()
	{
		return this.isSet_errPcsnAmt;
	}
	
	protected void setIsSet_errPcsnAmt(boolean value)
	{
		this.isSet_errPcsnAmt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 오류처리금액
	 */
	public void setErrPcsnAmt(java.lang.String value) {
		isSet_errPcsnAmt = true;
		this.errPcsnAmt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 오류처리금액
	 */
	public void setErrPcsnAmt(double value) {
		isSet_errPcsnAmt = true;
		this.errPcsnAmt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 오류처리금액
	 */
	public void setErrPcsnAmt(long value) {
		isSet_errPcsnAmt = true;
		this.errPcsnAmt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="오류처리금액", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal errPcsnAmt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 오류처리금액
	 */
	public java.math.BigDecimal getErrPcsnAmt(){
		return errPcsnAmt;
	}
	
	/**
	 * @Description 오류처리금액
	 */
	@JsonProperty("errPcsnAmt")
	public void setErrPcsnAmt( java.math.BigDecimal errPcsnAmt ) {
		isSet_errPcsnAmt = true;
		this.errPcsnAmt = errPcsnAmt;
	}
	
	/** Property set << errPcsnAmt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << delPcsnCnt >> [[ */
	
	@XmlTransient
	private boolean isSet_delPcsnCnt = false;
	
	protected boolean isSet_delPcsnCnt()
	{
		return this.isSet_delPcsnCnt;
	}
	
	protected void setIsSet_delPcsnCnt(boolean value)
	{
		this.isSet_delPcsnCnt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 삭제처리건수
	 */
	public void setDelPcsnCnt(java.lang.String value) {
		isSet_delPcsnCnt = true;
		this.delPcsnCnt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 삭제처리건수
	 */
	public void setDelPcsnCnt(double value) {
		isSet_delPcsnCnt = true;
		this.delPcsnCnt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 삭제처리건수
	 */
	public void setDelPcsnCnt(long value) {
		isSet_delPcsnCnt = true;
		this.delPcsnCnt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="삭제처리건수", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal delPcsnCnt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 삭제처리건수
	 */
	public java.math.BigDecimal getDelPcsnCnt(){
		return delPcsnCnt;
	}
	
	/**
	 * @Description 삭제처리건수
	 */
	@JsonProperty("delPcsnCnt")
	public void setDelPcsnCnt( java.math.BigDecimal delPcsnCnt ) {
		isSet_delPcsnCnt = true;
		this.delPcsnCnt = delPcsnCnt;
	}
	
	/** Property set << delPcsnCnt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << delPcsnAmt >> [[ */
	
	@XmlTransient
	private boolean isSet_delPcsnAmt = false;
	
	protected boolean isSet_delPcsnAmt()
	{
		return this.isSet_delPcsnAmt;
	}
	
	protected void setIsSet_delPcsnAmt(boolean value)
	{
		this.isSet_delPcsnAmt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 삭제처리금액
	 */
	public void setDelPcsnAmt(java.lang.String value) {
		isSet_delPcsnAmt = true;
		this.delPcsnAmt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 삭제처리금액
	 */
	public void setDelPcsnAmt(double value) {
		isSet_delPcsnAmt = true;
		this.delPcsnAmt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 삭제처리금액
	 */
	public void setDelPcsnAmt(long value) {
		isSet_delPcsnAmt = true;
		this.delPcsnAmt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="삭제처리금액", formatType="", format="", align="right", length=20, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal delPcsnAmt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 삭제처리금액
	 */
	public java.math.BigDecimal getDelPcsnAmt(){
		return delPcsnAmt;
	}
	
	/**
	 * @Description 삭제처리금액
	 */
	@JsonProperty("delPcsnAmt")
	public void setDelPcsnAmt( java.math.BigDecimal delPcsnAmt ) {
		isSet_delPcsnAmt = true;
		this.delPcsnAmt = delPcsnAmt;
	}
	
	/** Property set << delPcsnAmt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << modifyUserId >> [[ */
	
	@XmlTransient
	private boolean isSet_modifyUserId = false;
	
	protected boolean isSet_modifyUserId()
	{
		return this.isSet_modifyUserId;
	}
	
	protected void setIsSet_modifyUserId(boolean value)
	{
		this.isSet_modifyUserId = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="변경사용자ID", formatType="", format="", align="left", length=32, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String modifyUserId  = null;
	
	/**
	 * @Description 변경사용자ID
	 */
	public java.lang.String getModifyUserId(){
		return modifyUserId;
	}
	
	/**
	 * @Description 변경사용자ID
	 */
	@JsonProperty("modifyUserId")
	public void setModifyUserId( java.lang.String modifyUserId ) {
		isSet_modifyUserId = true;
		this.modifyUserId = modifyUserId;
	}
	
	/** Property set << modifyUserId >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << modifyOccurDttm >> [[ */
	
	@XmlTransient
	private boolean isSet_modifyOccurDttm = false;
	
	protected boolean isSet_modifyOccurDttm()
	{
		return this.isSet_modifyOccurDttm;
	}
	
	protected void setIsSet_modifyOccurDttm(boolean value)
	{
		this.isSet_modifyOccurDttm = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="변경발생일시", formatType="", format="", align="left", length=23, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String modifyOccurDttm  = null;
	
	/**
	 * @Description 변경발생일시
	 */
	public java.lang.String getModifyOccurDttm(){
		return modifyOccurDttm;
	}
	
	/**
	 * @Description 변경발생일시
	 */
	@JsonProperty("modifyOccurDttm")
	public void setModifyOccurDttm( java.lang.String modifyOccurDttm ) {
		isSet_modifyOccurDttm = true;
		this.modifyOccurDttm = modifyOccurDttm;
	}
	
	/** Property set << modifyOccurDttm >> ]]
	*******************************************************************************************************************************/

	@Override
	public ReportCcBatchBean00Dto clone(){
		try{
			ReportCcBatchBean00Dto object= (ReportCcBatchBean00Dto)super.clone();
			
			
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
		
		result = prime * result + ((domainId==null)?0:domainId.hashCode());
		result = prime * result + ((ccId==null)?0:ccId.hashCode());
		result = prime * result + ((pcsnDt==null)?0:pcsnDt.hashCode());
		result = prime * result + ((acptNo==null)?0:acptNo.hashCode());
		result = prime * result + ((tnNo==null)?0:tnNo.hashCode());
		result = prime * result + ((execNo==null)?0:execNo.hashCode());
		result = prime * result + ((pcsnStat==null)?0:pcsnStat.hashCode());
		result = prime * result + ((fstSrtDt==null)?0:fstSrtDt.hashCode());
		result = prime * result + ((fstSrtTime==null)?0:fstSrtTime.hashCode());
		result = prime * result + ((reSrtDt==null)?0:reSrtDt.hashCode());
		result = prime * result + ((reSrtTime==null)?0:reSrtTime.hashCode());
		result = prime * result + ((endDt==null)?0:endDt.hashCode());
		result = prime * result + ((endTime==null)?0:endTime.hashCode());
		result = prime * result + ((maxPcsnCnt==null)?0:maxPcsnCnt.hashCode());
		result = prime * result + ((lastPcsnNo==null)?0:lastPcsnNo.hashCode());
		result = prime * result + ((ttObjCnt==null)?0:ttObjCnt.hashCode());
		result = prime * result + ((ttObjAmt==null)?0:ttObjAmt.hashCode());
		result = prime * result + ((nomlPcsnCnt==null)?0:nomlPcsnCnt.hashCode());
		result = prime * result + ((nomlPcsnAmt==null)?0:nomlPcsnAmt.hashCode());
		result = prime * result + ((errPcsnCnt==null)?0:errPcsnCnt.hashCode());
		result = prime * result + ((errPcsnAmt==null)?0:errPcsnAmt.hashCode());
		result = prime * result + ((delPcsnCnt==null)?0:delPcsnCnt.hashCode());
		result = prime * result + ((delPcsnAmt==null)?0:delPcsnAmt.hashCode());
		result = prime * result + ((modifyUserId==null)?0:modifyUserId.hashCode());
		result = prime * result + ((modifyOccurDttm==null)?0:modifyOccurDttm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.cc.bat.bean.dto.ReportCcBatchBean00Dto other= (bxm.dft.cc.bat.bean.dto.ReportCcBatchBean00Dto)obj;
		if ( domainId == null){
			if ( other.domainId != null ) return false;
		}
		else if ( !domainId.equals(other.domainId) )
			return false;
		if ( ccId == null){
			if ( other.ccId != null ) return false;
		}
		else if ( !ccId.equals(other.ccId) )
			return false;
		if ( pcsnDt == null){
			if ( other.pcsnDt != null ) return false;
		}
		else if ( !pcsnDt.equals(other.pcsnDt) )
			return false;
		if ( acptNo == null){
			if ( other.acptNo != null ) return false;
		}
		else if ( !acptNo.equals(other.acptNo) )
			return false;
		if ( tnNo == null){
			if ( other.tnNo != null ) return false;
		}
		else if ( !tnNo.equals(other.tnNo) )
			return false;
		if ( execNo == null){
			if ( other.execNo != null ) return false;
		}
		else if ( !execNo.equals(other.execNo) )
			return false;
		if ( pcsnStat == null){
			if ( other.pcsnStat != null ) return false;
		}
		else if ( !pcsnStat.equals(other.pcsnStat) )
			return false;
		if ( fstSrtDt == null){
			if ( other.fstSrtDt != null ) return false;
		}
		else if ( !fstSrtDt.equals(other.fstSrtDt) )
			return false;
		if ( fstSrtTime == null){
			if ( other.fstSrtTime != null ) return false;
		}
		else if ( !fstSrtTime.equals(other.fstSrtTime) )
			return false;
		if ( reSrtDt == null){
			if ( other.reSrtDt != null ) return false;
		}
		else if ( !reSrtDt.equals(other.reSrtDt) )
			return false;
		if ( reSrtTime == null){
			if ( other.reSrtTime != null ) return false;
		}
		else if ( !reSrtTime.equals(other.reSrtTime) )
			return false;
		if ( endDt == null){
			if ( other.endDt != null ) return false;
		}
		else if ( !endDt.equals(other.endDt) )
			return false;
		if ( endTime == null){
			if ( other.endTime != null ) return false;
		}
		else if ( !endTime.equals(other.endTime) )
			return false;
		if ( maxPcsnCnt == null){
			if ( other.maxPcsnCnt != null ) return false;
		}
		else if ( !maxPcsnCnt.equals(other.maxPcsnCnt) )
			return false;
		if ( lastPcsnNo == null){
			if ( other.lastPcsnNo != null ) return false;
		}
		else if ( !lastPcsnNo.equals(other.lastPcsnNo) )
			return false;
		if ( ttObjCnt == null){
			if ( other.ttObjCnt != null ) return false;
		}
		else if ( !ttObjCnt.equals(other.ttObjCnt) )
			return false;
		if ( ttObjAmt == null){
			if ( other.ttObjAmt != null ) return false;
		}
		else if ( !ttObjAmt.equals(other.ttObjAmt) )
			return false;
		if ( nomlPcsnCnt == null){
			if ( other.nomlPcsnCnt != null ) return false;
		}
		else if ( !nomlPcsnCnt.equals(other.nomlPcsnCnt) )
			return false;
		if ( nomlPcsnAmt == null){
			if ( other.nomlPcsnAmt != null ) return false;
		}
		else if ( !nomlPcsnAmt.equals(other.nomlPcsnAmt) )
			return false;
		if ( errPcsnCnt == null){
			if ( other.errPcsnCnt != null ) return false;
		}
		else if ( !errPcsnCnt.equals(other.errPcsnCnt) )
			return false;
		if ( errPcsnAmt == null){
			if ( other.errPcsnAmt != null ) return false;
		}
		else if ( !errPcsnAmt.equals(other.errPcsnAmt) )
			return false;
		if ( delPcsnCnt == null){
			if ( other.delPcsnCnt != null ) return false;
		}
		else if ( !delPcsnCnt.equals(other.delPcsnCnt) )
			return false;
		if ( delPcsnAmt == null){
			if ( other.delPcsnAmt != null ) return false;
		}
		else if ( !delPcsnAmt.equals(other.delPcsnAmt) )
			return false;
		if ( modifyUserId == null){
			if ( other.modifyUserId != null ) return false;
		}
		else if ( !modifyUserId.equals(other.modifyUserId) )
			return false;
		if ( modifyOccurDttm == null){
			if ( other.modifyOccurDttm != null ) return false;
		}
		else if ( !modifyOccurDttm.equals(other.modifyOccurDttm) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.cc.bat.bean.dto.ReportCcBatchBean00Dto:\n");
		sb.append("\tdomainId: ");
		sb.append(domainId==null?"null":getDomainId());
		sb.append("\n");
		sb.append("\tccId: ");
		sb.append(ccId==null?"null":getCcId());
		sb.append("\n");
		sb.append("\tpcsnDt: ");
		sb.append(pcsnDt==null?"null":getPcsnDt());
		sb.append("\n");
		sb.append("\tacptNo: ");
		sb.append(acptNo==null?"null":getAcptNo());
		sb.append("\n");
		sb.append("\ttnNo: ");
		sb.append(tnNo==null?"null":getTnNo());
		sb.append("\n");
		sb.append("\texecNo: ");
		sb.append(execNo==null?"null":getExecNo());
		sb.append("\n");
		sb.append("\tpcsnStat: ");
		sb.append(pcsnStat==null?"null":getPcsnStat());
		sb.append("\n");
		sb.append("\tfstSrtDt: ");
		sb.append(fstSrtDt==null?"null":getFstSrtDt());
		sb.append("\n");
		sb.append("\tfstSrtTime: ");
		sb.append(fstSrtTime==null?"null":getFstSrtTime());
		sb.append("\n");
		sb.append("\treSrtDt: ");
		sb.append(reSrtDt==null?"null":getReSrtDt());
		sb.append("\n");
		sb.append("\treSrtTime: ");
		sb.append(reSrtTime==null?"null":getReSrtTime());
		sb.append("\n");
		sb.append("\tendDt: ");
		sb.append(endDt==null?"null":getEndDt());
		sb.append("\n");
		sb.append("\tendTime: ");
		sb.append(endTime==null?"null":getEndTime());
		sb.append("\n");
		sb.append("\tmaxPcsnCnt: ");
		sb.append(maxPcsnCnt==null?"null":getMaxPcsnCnt());
		sb.append("\n");
		sb.append("\tlastPcsnNo: ");
		sb.append(lastPcsnNo==null?"null":getLastPcsnNo());
		sb.append("\n");
		sb.append("\tttObjCnt: ");
		sb.append(ttObjCnt==null?"null":getTtObjCnt());
		sb.append("\n");
		sb.append("\tttObjAmt: ");
		sb.append(ttObjAmt==null?"null":getTtObjAmt());
		sb.append("\n");
		sb.append("\tnomlPcsnCnt: ");
		sb.append(nomlPcsnCnt==null?"null":getNomlPcsnCnt());
		sb.append("\n");
		sb.append("\tnomlPcsnAmt: ");
		sb.append(nomlPcsnAmt==null?"null":getNomlPcsnAmt());
		sb.append("\n");
		sb.append("\terrPcsnCnt: ");
		sb.append(errPcsnCnt==null?"null":getErrPcsnCnt());
		sb.append("\n");
		sb.append("\terrPcsnAmt: ");
		sb.append(errPcsnAmt==null?"null":getErrPcsnAmt());
		sb.append("\n");
		sb.append("\tdelPcsnCnt: ");
		sb.append(delPcsnCnt==null?"null":getDelPcsnCnt());
		sb.append("\n");
		sb.append("\tdelPcsnAmt: ");
		sb.append(delPcsnAmt==null?"null":getDelPcsnAmt());
		sb.append("\n");
		sb.append("\tmodifyUserId: ");
		sb.append(modifyUserId==null?"null":getModifyUserId());
		sb.append("\n");
		sb.append("\tmodifyOccurDttm: ");
		sb.append(modifyOccurDttm==null?"null":getModifyOccurDttm());
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
	
		messageLen+= 14; /* domainId */
		messageLen+= 9; /* ccId */
		messageLen+= 8; /* pcsnDt */
		messageLen+= 9; /* acptNo */
		messageLen+= 9; /* tnNo */
		messageLen+= 9; /* execNo */
		messageLen+= 9; /* pcsnStat */
		messageLen+= 8; /* fstSrtDt */
		messageLen+= 6; /* fstSrtTime */
		messageLen+= 8; /* reSrtDt */
		messageLen+= 6; /* reSrtTime */
		messageLen+= 8; /* endDt */
		messageLen+= 6; /* endTime */
		messageLen+= 20; /* maxPcsnCnt */
		messageLen+= 20; /* lastPcsnNo */
		messageLen+= 20; /* ttObjCnt */
		messageLen+= 20; /* ttObjAmt */
		messageLen+= 20; /* nomlPcsnCnt */
		messageLen+= 20; /* nomlPcsnAmt */
		messageLen+= 20; /* errPcsnCnt */
		messageLen+= 20; /* errPcsnAmt */
		messageLen+= 20; /* delPcsnCnt */
		messageLen+= 20; /* delPcsnAmt */
		messageLen+= 32; /* modifyUserId */
		messageLen+= 23; /* modifyOccurDttm */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("domainId");
		fieldNames.add("ccId");
		fieldNames.add("pcsnDt");
		fieldNames.add("acptNo");
		fieldNames.add("tnNo");
		fieldNames.add("execNo");
		fieldNames.add("pcsnStat");
		fieldNames.add("fstSrtDt");
		fieldNames.add("fstSrtTime");
		fieldNames.add("reSrtDt");
		fieldNames.add("reSrtTime");
		fieldNames.add("endDt");
		fieldNames.add("endTime");
		fieldNames.add("maxPcsnCnt");
		fieldNames.add("lastPcsnNo");
		fieldNames.add("ttObjCnt");
		fieldNames.add("ttObjAmt");
		fieldNames.add("nomlPcsnCnt");
		fieldNames.add("nomlPcsnAmt");
		fieldNames.add("errPcsnCnt");
		fieldNames.add("errPcsnAmt");
		fieldNames.add("delPcsnCnt");
		fieldNames.add("delPcsnAmt");
		fieldNames.add("modifyUserId");
		fieldNames.add("modifyOccurDttm");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("domainId", get("domainId"));
		fieldValueMap.put("ccId", get("ccId"));
		fieldValueMap.put("pcsnDt", get("pcsnDt"));
		fieldValueMap.put("acptNo", get("acptNo"));
		fieldValueMap.put("tnNo", get("tnNo"));
		fieldValueMap.put("execNo", get("execNo"));
		fieldValueMap.put("pcsnStat", get("pcsnStat"));
		fieldValueMap.put("fstSrtDt", get("fstSrtDt"));
		fieldValueMap.put("fstSrtTime", get("fstSrtTime"));
		fieldValueMap.put("reSrtDt", get("reSrtDt"));
		fieldValueMap.put("reSrtTime", get("reSrtTime"));
		fieldValueMap.put("endDt", get("endDt"));
		fieldValueMap.put("endTime", get("endTime"));
		fieldValueMap.put("maxPcsnCnt", get("maxPcsnCnt"));
		fieldValueMap.put("lastPcsnNo", get("lastPcsnNo"));
		fieldValueMap.put("ttObjCnt", get("ttObjCnt"));
		fieldValueMap.put("ttObjAmt", get("ttObjAmt"));
		fieldValueMap.put("nomlPcsnCnt", get("nomlPcsnCnt"));
		fieldValueMap.put("nomlPcsnAmt", get("nomlPcsnAmt"));
		fieldValueMap.put("errPcsnCnt", get("errPcsnCnt"));
		fieldValueMap.put("errPcsnAmt", get("errPcsnAmt"));
		fieldValueMap.put("delPcsnCnt", get("delPcsnCnt"));
		fieldValueMap.put("delPcsnAmt", get("delPcsnAmt"));
		fieldValueMap.put("modifyUserId", get("modifyUserId"));
		fieldValueMap.put("modifyOccurDttm", get("modifyOccurDttm"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1129430271 : /* domainId */
			return getDomainId();
		case 3046811 : /* ccId */
			return getCcId();
		case -993539906 : /* pcsnDt */
			return getPcsnDt();
		case -1423060473 : /* acptNo */
			return getAcptNo();
		case 3563995 : /* tnNo */
			return getTnNo();
		case -1289493966 : /* execNo */
			return getExecNo();
		case -1308659966 : /* pcsnStat */
			return getPcsnStat();
		case -237120418 : /* fstSrtDt */
			return getFstSrtDt();
		case -238985445 : /* fstSrtTime */
			return getFstSrtTime();
		case 1067910898 : /* reSrtDt */
			return getReSrtDt();
		case -234341201 : /* reSrtTime */
			return getReSrtTime();
		case 96650955 : /* endDt */
			return getEndDt();
		case -1607243192 : /* endTime */
			return getEndTime();
		case 438969591 : /* maxPcsnCnt */
			return getMaxPcsnCnt();
		case 1838186533 : /* lastPcsnNo */
			return getLastPcsnNo();
		case -1765785710 : /* ttObjCnt */
			return getTtObjCnt();
		case -1765787663 : /* ttObjAmt */
			return getTtObjAmt();
		case 296284091 : /* nomlPcsnCnt */
			return getNomlPcsnCnt();
		case 296282138 : /* nomlPcsnAmt */
			return getNomlPcsnAmt();
		case -517804586 : /* errPcsnCnt */
			return getErrPcsnCnt();
		case -517806539 : /* errPcsnAmt */
			return getErrPcsnAmt();
		case -166146960 : /* delPcsnCnt */
			return getDelPcsnCnt();
		case -166148913 : /* delPcsnAmt */
			return getDelPcsnAmt();
		case 245931936 : /* modifyUserId */
			return getModifyUserId();
		case 2126602619 : /* modifyOccurDttm */
			return getModifyOccurDttm();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1129430271 : /* domainId */
			setDomainId((java.lang.String) value);
			return;
		case 3046811 : /* ccId */
			setCcId((java.lang.String) value);
			return;
		case -993539906 : /* pcsnDt */
			setPcsnDt((java.lang.String) value);
			return;
		case -1423060473 : /* acptNo */
			setAcptNo((java.lang.Integer) value);
			return;
		case 3563995 : /* tnNo */
			setTnNo((java.lang.Integer) value);
			return;
		case -1289493966 : /* execNo */
			setExecNo((java.lang.Integer) value);
			return;
		case -1308659966 : /* pcsnStat */
			setPcsnStat((java.lang.String) value);
			return;
		case -237120418 : /* fstSrtDt */
			setFstSrtDt((java.lang.String) value);
			return;
		case -238985445 : /* fstSrtTime */
			setFstSrtTime((java.lang.String) value);
			return;
		case 1067910898 : /* reSrtDt */
			setReSrtDt((java.lang.String) value);
			return;
		case -234341201 : /* reSrtTime */
			setReSrtTime((java.lang.String) value);
			return;
		case 96650955 : /* endDt */
			setEndDt((java.lang.String) value);
			return;
		case -1607243192 : /* endTime */
			setEndTime((java.lang.String) value);
			return;
		case 438969591 : /* maxPcsnCnt */
			setMaxPcsnCnt((java.math.BigDecimal) value);
			return;
		case 1838186533 : /* lastPcsnNo */
			setLastPcsnNo((java.math.BigDecimal) value);
			return;
		case -1765785710 : /* ttObjCnt */
			setTtObjCnt((java.math.BigDecimal) value);
			return;
		case -1765787663 : /* ttObjAmt */
			setTtObjAmt((java.math.BigDecimal) value);
			return;
		case 296284091 : /* nomlPcsnCnt */
			setNomlPcsnCnt((java.math.BigDecimal) value);
			return;
		case 296282138 : /* nomlPcsnAmt */
			setNomlPcsnAmt((java.math.BigDecimal) value);
			return;
		case -517804586 : /* errPcsnCnt */
			setErrPcsnCnt((java.math.BigDecimal) value);
			return;
		case -517806539 : /* errPcsnAmt */
			setErrPcsnAmt((java.math.BigDecimal) value);
			return;
		case -166146960 : /* delPcsnCnt */
			setDelPcsnCnt((java.math.BigDecimal) value);
			return;
		case -166148913 : /* delPcsnAmt */
			setDelPcsnAmt((java.math.BigDecimal) value);
			return;
		case 245931936 : /* modifyUserId */
			setModifyUserId((java.lang.String) value);
			return;
		case 2126602619 : /* modifyOccurDttm */
			setModifyOccurDttm((java.lang.String) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
