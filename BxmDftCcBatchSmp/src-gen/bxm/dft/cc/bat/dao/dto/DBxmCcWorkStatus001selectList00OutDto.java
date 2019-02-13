/******************************************************************************
 * Bxm Object Message Mapping(OMM) - Source Generator V7
 *
 * 생성된 자바파일은 수정하지 마십시오.
 * IO 파일 수정시 Java파일을 덮어쓰게 됩니다.
 *
 ******************************************************************************/

package bxm.dft.cc.bat.dao.dto;


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
@XmlType(propOrder={"domainId", "ccId", "procDt", "acptNo", "tnNo", "execNo", "ccProcStatusCd", "firstStartDt", "firstStartTime", "reStartDt", "reStartTime", "endDt", "endTime", "maxProcCnt", "lastProcNo", "totalTargetCnt", "totalTargetAmt", "normalProcCnt", "normalProcAmt", "errProcCnt", "errProcAmt", "delProcCnt", "delProcAmt", "modifyUserId", "modifyOccurDttm"}, name="DBxmCcWorkStatus001selectList00OutDto")
@XmlRootElement(name="DBxmCcWorkStatus001selectList00OutDto")
@SuppressWarnings("all")
public class DBxmCcWorkStatus001selectList00OutDto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = -1324026393L;

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
	* Property set << procDt >> [[ */
	
	@XmlTransient
	private boolean isSet_procDt = false;
	
	protected boolean isSet_procDt()
	{
		return this.isSet_procDt;
	}
	
	protected void setIsSet_procDt(boolean value)
	{
		this.isSet_procDt = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="처리일자", formatType="", format="", align="left", length=8, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String procDt  = null;
	
	/**
	 * @Description 처리일자
	 */
	public java.lang.String getProcDt(){
		return procDt;
	}
	
	/**
	 * @Description 처리일자
	 */
	@JsonProperty("procDt")
	public void setProcDt( java.lang.String procDt ) {
		isSet_procDt = true;
		this.procDt = procDt;
	}
	
	/** Property set << procDt >> ]]
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
	
	
	@BxmOmm_Field(referenceType="reference", description="접수번호", formatType="", format="", align="right", length=5, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
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
	
	
	@BxmOmm_Field(referenceType="reference", description="회차번호", formatType="", format="", align="right", length=2, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
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
	
	
	@BxmOmm_Field(referenceType="reference", description="실행번호", formatType="", format="", align="right", length=6, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
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
	* Property set << ccProcStatusCd >> [[ */
	
	@XmlTransient
	private boolean isSet_ccProcStatusCd = false;
	
	protected boolean isSet_ccProcStatusCd()
	{
		return this.isSet_ccProcStatusCd;
	}
	
	protected void setIsSet_ccProcStatusCd(boolean value)
	{
		this.isSet_ccProcStatusCd = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="처리상태", formatType="", format="", align="right", length=2, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.Integer ccProcStatusCd  = 0;
	
	/**
	 * @Description 처리상태
	 */
	public java.lang.Integer getCcProcStatusCd(){
		return ccProcStatusCd;
	}
	
	/**
	 * @Description 처리상태
	 */
	@JsonProperty("ccProcStatusCd")
	public void setCcProcStatusCd( java.lang.Integer ccProcStatusCd ) {
		isSet_ccProcStatusCd = true;
		this.ccProcStatusCd = ccProcStatusCd;
	}
	
	/** Property set << ccProcStatusCd >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << firstStartDt >> [[ */
	
	@XmlTransient
	private boolean isSet_firstStartDt = false;
	
	protected boolean isSet_firstStartDt()
	{
		return this.isSet_firstStartDt;
	}
	
	protected void setIsSet_firstStartDt(boolean value)
	{
		this.isSet_firstStartDt = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="최초시작일자", formatType="", format="", align="left", length=8, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String firstStartDt  = null;
	
	/**
	 * @Description 최초시작일자
	 */
	public java.lang.String getFirstStartDt(){
		return firstStartDt;
	}
	
	/**
	 * @Description 최초시작일자
	 */
	@JsonProperty("firstStartDt")
	public void setFirstStartDt( java.lang.String firstStartDt ) {
		isSet_firstStartDt = true;
		this.firstStartDt = firstStartDt;
	}
	
	/** Property set << firstStartDt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << firstStartTime >> [[ */
	
	@XmlTransient
	private boolean isSet_firstStartTime = false;
	
	protected boolean isSet_firstStartTime()
	{
		return this.isSet_firstStartTime;
	}
	
	protected void setIsSet_firstStartTime(boolean value)
	{
		this.isSet_firstStartTime = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="최초시작시각", formatType="", format="", align="left", length=6, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String firstStartTime  = null;
	
	/**
	 * @Description 최초시작시각
	 */
	public java.lang.String getFirstStartTime(){
		return firstStartTime;
	}
	
	/**
	 * @Description 최초시작시각
	 */
	@JsonProperty("firstStartTime")
	public void setFirstStartTime( java.lang.String firstStartTime ) {
		isSet_firstStartTime = true;
		this.firstStartTime = firstStartTime;
	}
	
	/** Property set << firstStartTime >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << reStartDt >> [[ */
	
	@XmlTransient
	private boolean isSet_reStartDt = false;
	
	protected boolean isSet_reStartDt()
	{
		return this.isSet_reStartDt;
	}
	
	protected void setIsSet_reStartDt(boolean value)
	{
		this.isSet_reStartDt = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="재시작일자", formatType="", format="", align="left", length=8, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String reStartDt  = null;
	
	/**
	 * @Description 재시작일자
	 */
	public java.lang.String getReStartDt(){
		return reStartDt;
	}
	
	/**
	 * @Description 재시작일자
	 */
	@JsonProperty("reStartDt")
	public void setReStartDt( java.lang.String reStartDt ) {
		isSet_reStartDt = true;
		this.reStartDt = reStartDt;
	}
	
	/** Property set << reStartDt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << reStartTime >> [[ */
	
	@XmlTransient
	private boolean isSet_reStartTime = false;
	
	protected boolean isSet_reStartTime()
	{
		return this.isSet_reStartTime;
	}
	
	protected void setIsSet_reStartTime(boolean value)
	{
		this.isSet_reStartTime = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="재시작시각", formatType="", format="", align="left", length=6, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.String reStartTime  = null;
	
	/**
	 * @Description 재시작시각
	 */
	public java.lang.String getReStartTime(){
		return reStartTime;
	}
	
	/**
	 * @Description 재시작시각
	 */
	@JsonProperty("reStartTime")
	public void setReStartTime( java.lang.String reStartTime ) {
		isSet_reStartTime = true;
		this.reStartTime = reStartTime;
	}
	
	/** Property set << reStartTime >> ]]
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
	* Property set << maxProcCnt >> [[ */
	
	@XmlTransient
	private boolean isSet_maxProcCnt = false;
	
	protected boolean isSet_maxProcCnt()
	{
		return this.isSet_maxProcCnt;
	}
	
	protected void setIsSet_maxProcCnt(boolean value)
	{
		this.isSet_maxProcCnt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 최대처리개수
	 */
	public void setMaxProcCnt(java.lang.String value) {
		isSet_maxProcCnt = true;
		this.maxProcCnt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 최대처리개수
	 */
	public void setMaxProcCnt(double value) {
		isSet_maxProcCnt = true;
		this.maxProcCnt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 최대처리개수
	 */
	public void setMaxProcCnt(long value) {
		isSet_maxProcCnt = true;
		this.maxProcCnt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="최대처리개수", formatType="", format="", align="right", length=19, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal maxProcCnt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 최대처리개수
	 */
	public java.math.BigDecimal getMaxProcCnt(){
		return maxProcCnt;
	}
	
	/**
	 * @Description 최대처리개수
	 */
	@JsonProperty("maxProcCnt")
	public void setMaxProcCnt( java.math.BigDecimal maxProcCnt ) {
		isSet_maxProcCnt = true;
		this.maxProcCnt = maxProcCnt;
	}
	
	/** Property set << maxProcCnt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << lastProcNo >> [[ */
	
	@XmlTransient
	private boolean isSet_lastProcNo = false;
	
	protected boolean isSet_lastProcNo()
	{
		return this.isSet_lastProcNo;
	}
	
	protected void setIsSet_lastProcNo(boolean value)
	{
		this.isSet_lastProcNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="최종처리번호", formatType="", format="", align="right", length=9, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.lang.Integer lastProcNo  = 0;
	
	/**
	 * @Description 최종처리번호
	 */
	public java.lang.Integer getLastProcNo(){
		return lastProcNo;
	}
	
	/**
	 * @Description 최종처리번호
	 */
	@JsonProperty("lastProcNo")
	public void setLastProcNo( java.lang.Integer lastProcNo ) {
		isSet_lastProcNo = true;
		this.lastProcNo = lastProcNo;
	}
	
	/** Property set << lastProcNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << totalTargetCnt >> [[ */
	
	@XmlTransient
	private boolean isSet_totalTargetCnt = false;
	
	protected boolean isSet_totalTargetCnt()
	{
		return this.isSet_totalTargetCnt;
	}
	
	protected void setIsSet_totalTargetCnt(boolean value)
	{
		this.isSet_totalTargetCnt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 총대상건수
	 */
	public void setTotalTargetCnt(java.lang.String value) {
		isSet_totalTargetCnt = true;
		this.totalTargetCnt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 총대상건수
	 */
	public void setTotalTargetCnt(double value) {
		isSet_totalTargetCnt = true;
		this.totalTargetCnt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 총대상건수
	 */
	public void setTotalTargetCnt(long value) {
		isSet_totalTargetCnt = true;
		this.totalTargetCnt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="총대상건수", formatType="", format="", align="right", length=19, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal totalTargetCnt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 총대상건수
	 */
	public java.math.BigDecimal getTotalTargetCnt(){
		return totalTargetCnt;
	}
	
	/**
	 * @Description 총대상건수
	 */
	@JsonProperty("totalTargetCnt")
	public void setTotalTargetCnt( java.math.BigDecimal totalTargetCnt ) {
		isSet_totalTargetCnt = true;
		this.totalTargetCnt = totalTargetCnt;
	}
	
	/** Property set << totalTargetCnt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << totalTargetAmt >> [[ */
	
	@XmlTransient
	private boolean isSet_totalTargetAmt = false;
	
	protected boolean isSet_totalTargetAmt()
	{
		return this.isSet_totalTargetAmt;
	}
	
	protected void setIsSet_totalTargetAmt(boolean value)
	{
		this.isSet_totalTargetAmt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 총대상금액
	 */
	public void setTotalTargetAmt(java.lang.String value) {
		isSet_totalTargetAmt = true;
		this.totalTargetAmt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 총대상금액
	 */
	public void setTotalTargetAmt(double value) {
		isSet_totalTargetAmt = true;
		this.totalTargetAmt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 총대상금액
	 */
	public void setTotalTargetAmt(long value) {
		isSet_totalTargetAmt = true;
		this.totalTargetAmt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="총대상금액", formatType="", format="", align="right", length=19, decimal=2, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal totalTargetAmt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 총대상금액
	 */
	public java.math.BigDecimal getTotalTargetAmt(){
		return totalTargetAmt;
	}
	
	/**
	 * @Description 총대상금액
	 */
	@JsonProperty("totalTargetAmt")
	public void setTotalTargetAmt( java.math.BigDecimal totalTargetAmt ) {
		isSet_totalTargetAmt = true;
		this.totalTargetAmt = totalTargetAmt;
	}
	
	/** Property set << totalTargetAmt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << normalProcCnt >> [[ */
	
	@XmlTransient
	private boolean isSet_normalProcCnt = false;
	
	protected boolean isSet_normalProcCnt()
	{
		return this.isSet_normalProcCnt;
	}
	
	protected void setIsSet_normalProcCnt(boolean value)
	{
		this.isSet_normalProcCnt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 정상처리건수
	 */
	public void setNormalProcCnt(java.lang.String value) {
		isSet_normalProcCnt = true;
		this.normalProcCnt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 정상처리건수
	 */
	public void setNormalProcCnt(double value) {
		isSet_normalProcCnt = true;
		this.normalProcCnt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 정상처리건수
	 */
	public void setNormalProcCnt(long value) {
		isSet_normalProcCnt = true;
		this.normalProcCnt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="정상처리건수", formatType="", format="", align="right", length=19, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal normalProcCnt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 정상처리건수
	 */
	public java.math.BigDecimal getNormalProcCnt(){
		return normalProcCnt;
	}
	
	/**
	 * @Description 정상처리건수
	 */
	@JsonProperty("normalProcCnt")
	public void setNormalProcCnt( java.math.BigDecimal normalProcCnt ) {
		isSet_normalProcCnt = true;
		this.normalProcCnt = normalProcCnt;
	}
	
	/** Property set << normalProcCnt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << normalProcAmt >> [[ */
	
	@XmlTransient
	private boolean isSet_normalProcAmt = false;
	
	protected boolean isSet_normalProcAmt()
	{
		return this.isSet_normalProcAmt;
	}
	
	protected void setIsSet_normalProcAmt(boolean value)
	{
		this.isSet_normalProcAmt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 정상처리금액
	 */
	public void setNormalProcAmt(java.lang.String value) {
		isSet_normalProcAmt = true;
		this.normalProcAmt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 정상처리금액
	 */
	public void setNormalProcAmt(double value) {
		isSet_normalProcAmt = true;
		this.normalProcAmt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 정상처리금액
	 */
	public void setNormalProcAmt(long value) {
		isSet_normalProcAmt = true;
		this.normalProcAmt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="정상처리금액", formatType="", format="", align="right", length=19, decimal=2, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal normalProcAmt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 정상처리금액
	 */
	public java.math.BigDecimal getNormalProcAmt(){
		return normalProcAmt;
	}
	
	/**
	 * @Description 정상처리금액
	 */
	@JsonProperty("normalProcAmt")
	public void setNormalProcAmt( java.math.BigDecimal normalProcAmt ) {
		isSet_normalProcAmt = true;
		this.normalProcAmt = normalProcAmt;
	}
	
	/** Property set << normalProcAmt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << errProcCnt >> [[ */
	
	@XmlTransient
	private boolean isSet_errProcCnt = false;
	
	protected boolean isSet_errProcCnt()
	{
		return this.isSet_errProcCnt;
	}
	
	protected void setIsSet_errProcCnt(boolean value)
	{
		this.isSet_errProcCnt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 오류처리건수
	 */
	public void setErrProcCnt(java.lang.String value) {
		isSet_errProcCnt = true;
		this.errProcCnt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 오류처리건수
	 */
	public void setErrProcCnt(double value) {
		isSet_errProcCnt = true;
		this.errProcCnt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 오류처리건수
	 */
	public void setErrProcCnt(long value) {
		isSet_errProcCnt = true;
		this.errProcCnt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="오류처리건수", formatType="", format="", align="right", length=19, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal errProcCnt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 오류처리건수
	 */
	public java.math.BigDecimal getErrProcCnt(){
		return errProcCnt;
	}
	
	/**
	 * @Description 오류처리건수
	 */
	@JsonProperty("errProcCnt")
	public void setErrProcCnt( java.math.BigDecimal errProcCnt ) {
		isSet_errProcCnt = true;
		this.errProcCnt = errProcCnt;
	}
	
	/** Property set << errProcCnt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << errProcAmt >> [[ */
	
	@XmlTransient
	private boolean isSet_errProcAmt = false;
	
	protected boolean isSet_errProcAmt()
	{
		return this.isSet_errProcAmt;
	}
	
	protected void setIsSet_errProcAmt(boolean value)
	{
		this.isSet_errProcAmt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 오류처리금액
	 */
	public void setErrProcAmt(java.lang.String value) {
		isSet_errProcAmt = true;
		this.errProcAmt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 오류처리금액
	 */
	public void setErrProcAmt(double value) {
		isSet_errProcAmt = true;
		this.errProcAmt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 오류처리금액
	 */
	public void setErrProcAmt(long value) {
		isSet_errProcAmt = true;
		this.errProcAmt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="오류처리금액", formatType="", format="", align="right", length=19, decimal=2, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal errProcAmt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 오류처리금액
	 */
	public java.math.BigDecimal getErrProcAmt(){
		return errProcAmt;
	}
	
	/**
	 * @Description 오류처리금액
	 */
	@JsonProperty("errProcAmt")
	public void setErrProcAmt( java.math.BigDecimal errProcAmt ) {
		isSet_errProcAmt = true;
		this.errProcAmt = errProcAmt;
	}
	
	/** Property set << errProcAmt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << delProcCnt >> [[ */
	
	@XmlTransient
	private boolean isSet_delProcCnt = false;
	
	protected boolean isSet_delProcCnt()
	{
		return this.isSet_delProcCnt;
	}
	
	protected void setIsSet_delProcCnt(boolean value)
	{
		this.isSet_delProcCnt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 삭제처리건수
	 */
	public void setDelProcCnt(java.lang.String value) {
		isSet_delProcCnt = true;
		this.delProcCnt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 삭제처리건수
	 */
	public void setDelProcCnt(double value) {
		isSet_delProcCnt = true;
		this.delProcCnt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 삭제처리건수
	 */
	public void setDelProcCnt(long value) {
		isSet_delProcCnt = true;
		this.delProcCnt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="삭제처리건수", formatType="", format="", align="right", length=19, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal delProcCnt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 삭제처리건수
	 */
	public java.math.BigDecimal getDelProcCnt(){
		return delProcCnt;
	}
	
	/**
	 * @Description 삭제처리건수
	 */
	@JsonProperty("delProcCnt")
	public void setDelProcCnt( java.math.BigDecimal delProcCnt ) {
		isSet_delProcCnt = true;
		this.delProcCnt = delProcCnt;
	}
	
	/** Property set << delProcCnt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << delProcAmt >> [[ */
	
	@XmlTransient
	private boolean isSet_delProcAmt = false;
	
	protected boolean isSet_delProcAmt()
	{
		return this.isSet_delProcAmt;
	}
	
	protected void setIsSet_delProcAmt(boolean value)
	{
		this.isSet_delProcAmt = value;
	}
	
	/**
	 * java.math.BigDecimal - String value setter
	 * @Description 삭제처리금액
	 */
	public void setDelProcAmt(java.lang.String value) {
		isSet_delProcAmt = true;
		this.delProcAmt = new java.math.BigDecimal(value);
	}
	/**
	 * java.math.BigDecimal - Double value setter
	 * @Description 삭제처리금액
	 */
	public void setDelProcAmt(double value) {
		isSet_delProcAmt = true;
		this.delProcAmt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * java.math.BigDecimal - Long value setter
	 * @Description 삭제처리금액
	 */
	public void setDelProcAmt(long value) {
		isSet_delProcAmt = true;
		this.delProcAmt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="삭제처리금액", formatType="", format="", align="right", length=19, decimal=2, arrayReference="", fill="", comment="", encrypt="", validationRule="")
	private java.math.BigDecimal delProcAmt  = new java.math.BigDecimal("0.0");
	
	/**
	 * @Description 삭제처리금액
	 */
	public java.math.BigDecimal getDelProcAmt(){
		return delProcAmt;
	}
	
	/**
	 * @Description 삭제처리금액
	 */
	@JsonProperty("delProcAmt")
	public void setDelProcAmt( java.math.BigDecimal delProcAmt ) {
		isSet_delProcAmt = true;
		this.delProcAmt = delProcAmt;
	}
	
	/** Property set << delProcAmt >> ]]
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
	
	
	@BxmOmm_Field(referenceType="reference", description="변경사용자ID", formatType="", format="", align="left", length=50, decimal=0, arrayReference="", fill="", comment="", encrypt="", validationRule="")
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
	public DBxmCcWorkStatus001selectList00OutDto clone(){
		try{
			DBxmCcWorkStatus001selectList00OutDto object= (DBxmCcWorkStatus001selectList00OutDto)super.clone();
			
			
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
		result = prime * result + ((procDt==null)?0:procDt.hashCode());
		result = prime * result + ((acptNo==null)?0:acptNo.hashCode());
		result = prime * result + ((tnNo==null)?0:tnNo.hashCode());
		result = prime * result + ((execNo==null)?0:execNo.hashCode());
		result = prime * result + ((ccProcStatusCd==null)?0:ccProcStatusCd.hashCode());
		result = prime * result + ((firstStartDt==null)?0:firstStartDt.hashCode());
		result = prime * result + ((firstStartTime==null)?0:firstStartTime.hashCode());
		result = prime * result + ((reStartDt==null)?0:reStartDt.hashCode());
		result = prime * result + ((reStartTime==null)?0:reStartTime.hashCode());
		result = prime * result + ((endDt==null)?0:endDt.hashCode());
		result = prime * result + ((endTime==null)?0:endTime.hashCode());
		result = prime * result + ((maxProcCnt==null)?0:maxProcCnt.hashCode());
		result = prime * result + ((lastProcNo==null)?0:lastProcNo.hashCode());
		result = prime * result + ((totalTargetCnt==null)?0:totalTargetCnt.hashCode());
		result = prime * result + ((totalTargetAmt==null)?0:totalTargetAmt.hashCode());
		result = prime * result + ((normalProcCnt==null)?0:normalProcCnt.hashCode());
		result = prime * result + ((normalProcAmt==null)?0:normalProcAmt.hashCode());
		result = prime * result + ((errProcCnt==null)?0:errProcCnt.hashCode());
		result = prime * result + ((errProcAmt==null)?0:errProcAmt.hashCode());
		result = prime * result + ((delProcCnt==null)?0:delProcCnt.hashCode());
		result = prime * result + ((delProcAmt==null)?0:delProcAmt.hashCode());
		result = prime * result + ((modifyUserId==null)?0:modifyUserId.hashCode());
		result = prime * result + ((modifyOccurDttm==null)?0:modifyOccurDttm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.cc.bat.dao.dto.DBxmCcWorkStatus001selectList00OutDto other= (bxm.dft.cc.bat.dao.dto.DBxmCcWorkStatus001selectList00OutDto)obj;
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
		if ( procDt == null){
			if ( other.procDt != null ) return false;
		}
		else if ( !procDt.equals(other.procDt) )
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
		if ( ccProcStatusCd == null){
			if ( other.ccProcStatusCd != null ) return false;
		}
		else if ( !ccProcStatusCd.equals(other.ccProcStatusCd) )
			return false;
		if ( firstStartDt == null){
			if ( other.firstStartDt != null ) return false;
		}
		else if ( !firstStartDt.equals(other.firstStartDt) )
			return false;
		if ( firstStartTime == null){
			if ( other.firstStartTime != null ) return false;
		}
		else if ( !firstStartTime.equals(other.firstStartTime) )
			return false;
		if ( reStartDt == null){
			if ( other.reStartDt != null ) return false;
		}
		else if ( !reStartDt.equals(other.reStartDt) )
			return false;
		if ( reStartTime == null){
			if ( other.reStartTime != null ) return false;
		}
		else if ( !reStartTime.equals(other.reStartTime) )
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
		if ( maxProcCnt == null){
			if ( other.maxProcCnt != null ) return false;
		}
		else if ( !maxProcCnt.equals(other.maxProcCnt) )
			return false;
		if ( lastProcNo == null){
			if ( other.lastProcNo != null ) return false;
		}
		else if ( !lastProcNo.equals(other.lastProcNo) )
			return false;
		if ( totalTargetCnt == null){
			if ( other.totalTargetCnt != null ) return false;
		}
		else if ( !totalTargetCnt.equals(other.totalTargetCnt) )
			return false;
		if ( totalTargetAmt == null){
			if ( other.totalTargetAmt != null ) return false;
		}
		else if ( !totalTargetAmt.equals(other.totalTargetAmt) )
			return false;
		if ( normalProcCnt == null){
			if ( other.normalProcCnt != null ) return false;
		}
		else if ( !normalProcCnt.equals(other.normalProcCnt) )
			return false;
		if ( normalProcAmt == null){
			if ( other.normalProcAmt != null ) return false;
		}
		else if ( !normalProcAmt.equals(other.normalProcAmt) )
			return false;
		if ( errProcCnt == null){
			if ( other.errProcCnt != null ) return false;
		}
		else if ( !errProcCnt.equals(other.errProcCnt) )
			return false;
		if ( errProcAmt == null){
			if ( other.errProcAmt != null ) return false;
		}
		else if ( !errProcAmt.equals(other.errProcAmt) )
			return false;
		if ( delProcCnt == null){
			if ( other.delProcCnt != null ) return false;
		}
		else if ( !delProcCnt.equals(other.delProcCnt) )
			return false;
		if ( delProcAmt == null){
			if ( other.delProcAmt != null ) return false;
		}
		else if ( !delProcAmt.equals(other.delProcAmt) )
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
	
		sb.append( "\n[bxm.dft.cc.bat.dao.dto.DBxmCcWorkStatus001selectList00OutDto:\n");
		sb.append("\tdomainId: ");
		sb.append(domainId==null?"null":getDomainId());
		sb.append("\n");
		sb.append("\tccId: ");
		sb.append(ccId==null?"null":getCcId());
		sb.append("\n");
		sb.append("\tprocDt: ");
		sb.append(procDt==null?"null":getProcDt());
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
		sb.append("\tccProcStatusCd: ");
		sb.append(ccProcStatusCd==null?"null":getCcProcStatusCd());
		sb.append("\n");
		sb.append("\tfirstStartDt: ");
		sb.append(firstStartDt==null?"null":getFirstStartDt());
		sb.append("\n");
		sb.append("\tfirstStartTime: ");
		sb.append(firstStartTime==null?"null":getFirstStartTime());
		sb.append("\n");
		sb.append("\treStartDt: ");
		sb.append(reStartDt==null?"null":getReStartDt());
		sb.append("\n");
		sb.append("\treStartTime: ");
		sb.append(reStartTime==null?"null":getReStartTime());
		sb.append("\n");
		sb.append("\tendDt: ");
		sb.append(endDt==null?"null":getEndDt());
		sb.append("\n");
		sb.append("\tendTime: ");
		sb.append(endTime==null?"null":getEndTime());
		sb.append("\n");
		sb.append("\tmaxProcCnt: ");
		sb.append(maxProcCnt==null?"null":getMaxProcCnt());
		sb.append("\n");
		sb.append("\tlastProcNo: ");
		sb.append(lastProcNo==null?"null":getLastProcNo());
		sb.append("\n");
		sb.append("\ttotalTargetCnt: ");
		sb.append(totalTargetCnt==null?"null":getTotalTargetCnt());
		sb.append("\n");
		sb.append("\ttotalTargetAmt: ");
		sb.append(totalTargetAmt==null?"null":getTotalTargetAmt());
		sb.append("\n");
		sb.append("\tnormalProcCnt: ");
		sb.append(normalProcCnt==null?"null":getNormalProcCnt());
		sb.append("\n");
		sb.append("\tnormalProcAmt: ");
		sb.append(normalProcAmt==null?"null":getNormalProcAmt());
		sb.append("\n");
		sb.append("\terrProcCnt: ");
		sb.append(errProcCnt==null?"null":getErrProcCnt());
		sb.append("\n");
		sb.append("\terrProcAmt: ");
		sb.append(errProcAmt==null?"null":getErrProcAmt());
		sb.append("\n");
		sb.append("\tdelProcCnt: ");
		sb.append(delProcCnt==null?"null":getDelProcCnt());
		sb.append("\n");
		sb.append("\tdelProcAmt: ");
		sb.append(delProcAmt==null?"null":getDelProcAmt());
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
		messageLen+= 8; /* procDt */
		messageLen+= 5; /* acptNo */
		messageLen+= 2; /* tnNo */
		messageLen+= 6; /* execNo */
		messageLen+= 2; /* ccProcStatusCd */
		messageLen+= 8; /* firstStartDt */
		messageLen+= 6; /* firstStartTime */
		messageLen+= 8; /* reStartDt */
		messageLen+= 6; /* reStartTime */
		messageLen+= 8; /* endDt */
		messageLen+= 6; /* endTime */
		messageLen+= 19; /* maxProcCnt */
		messageLen+= 9; /* lastProcNo */
		messageLen+= 19; /* totalTargetCnt */
		messageLen+= 19; /* totalTargetAmt */
		messageLen+= 19; /* normalProcCnt */
		messageLen+= 19; /* normalProcAmt */
		messageLen+= 19; /* errProcCnt */
		messageLen+= 19; /* errProcAmt */
		messageLen+= 19; /* delProcCnt */
		messageLen+= 19; /* delProcAmt */
		messageLen+= 50; /* modifyUserId */
		messageLen+= 23; /* modifyOccurDttm */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("domainId");
		fieldNames.add("ccId");
		fieldNames.add("procDt");
		fieldNames.add("acptNo");
		fieldNames.add("tnNo");
		fieldNames.add("execNo");
		fieldNames.add("ccProcStatusCd");
		fieldNames.add("firstStartDt");
		fieldNames.add("firstStartTime");
		fieldNames.add("reStartDt");
		fieldNames.add("reStartTime");
		fieldNames.add("endDt");
		fieldNames.add("endTime");
		fieldNames.add("maxProcCnt");
		fieldNames.add("lastProcNo");
		fieldNames.add("totalTargetCnt");
		fieldNames.add("totalTargetAmt");
		fieldNames.add("normalProcCnt");
		fieldNames.add("normalProcAmt");
		fieldNames.add("errProcCnt");
		fieldNames.add("errProcAmt");
		fieldNames.add("delProcCnt");
		fieldNames.add("delProcAmt");
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
		fieldValueMap.put("procDt", get("procDt"));
		fieldValueMap.put("acptNo", get("acptNo"));
		fieldValueMap.put("tnNo", get("tnNo"));
		fieldValueMap.put("execNo", get("execNo"));
		fieldValueMap.put("ccProcStatusCd", get("ccProcStatusCd"));
		fieldValueMap.put("firstStartDt", get("firstStartDt"));
		fieldValueMap.put("firstStartTime", get("firstStartTime"));
		fieldValueMap.put("reStartDt", get("reStartDt"));
		fieldValueMap.put("reStartTime", get("reStartTime"));
		fieldValueMap.put("endDt", get("endDt"));
		fieldValueMap.put("endTime", get("endTime"));
		fieldValueMap.put("maxProcCnt", get("maxProcCnt"));
		fieldValueMap.put("lastProcNo", get("lastProcNo"));
		fieldValueMap.put("totalTargetCnt", get("totalTargetCnt"));
		fieldValueMap.put("totalTargetAmt", get("totalTargetAmt"));
		fieldValueMap.put("normalProcCnt", get("normalProcCnt"));
		fieldValueMap.put("normalProcAmt", get("normalProcAmt"));
		fieldValueMap.put("errProcCnt", get("errProcCnt"));
		fieldValueMap.put("errProcAmt", get("errProcAmt"));
		fieldValueMap.put("delProcCnt", get("delProcCnt"));
		fieldValueMap.put("delProcAmt", get("delProcAmt"));
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
		case -979816826 : /* procDt */
			return getProcDt();
		case -1423060473 : /* acptNo */
			return getAcptNo();
		case 3563995 : /* tnNo */
			return getTnNo();
		case -1289493966 : /* execNo */
			return getExecNo();
		case -544291351 : /* ccProcStatusCd */
			return getCcProcStatusCd();
		case -1976329278 : /* firstStartDt */
			return getFirstStartDt();
		case -876421761 : /* firstStartTime */
			return getFirstStartTime();
		case -193726753 : /* reStartDt */
			return getReStartDt();
		case -1487346340 : /* reStartTime */
			return getReStartTime();
		case 96650955 : /* endDt */
			return getEndDt();
		case -1607243192 : /* endTime */
			return getEndTime();
		case 864385071 : /* maxProcCnt */
			return getMaxProcCnt();
		case 1851909613 : /* lastProcNo */
			return getLastProcNo();
		case 4625204 : /* totalTargetCnt */
			return getTotalTargetCnt();
		case 4623251 : /* totalTargetAmt */
			return getTotalTargetAmt();
		case 1965193036 : /* normalProcCnt */
			return getNormalProcCnt();
		case 1965191083 : /* normalProcAmt */
			return getNormalProcAmt();
		case -92389106 : /* errProcCnt */
			return getErrProcCnt();
		case -92391059 : /* errProcAmt */
			return getErrProcAmt();
		case 259268520 : /* delProcCnt */
			return getDelProcCnt();
		case 259266567 : /* delProcAmt */
			return getDelProcAmt();
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
		case -979816826 : /* procDt */
			setProcDt((java.lang.String) value);
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
		case -544291351 : /* ccProcStatusCd */
			setCcProcStatusCd((java.lang.Integer) value);
			return;
		case -1976329278 : /* firstStartDt */
			setFirstStartDt((java.lang.String) value);
			return;
		case -876421761 : /* firstStartTime */
			setFirstStartTime((java.lang.String) value);
			return;
		case -193726753 : /* reStartDt */
			setReStartDt((java.lang.String) value);
			return;
		case -1487346340 : /* reStartTime */
			setReStartTime((java.lang.String) value);
			return;
		case 96650955 : /* endDt */
			setEndDt((java.lang.String) value);
			return;
		case -1607243192 : /* endTime */
			setEndTime((java.lang.String) value);
			return;
		case 864385071 : /* maxProcCnt */
			setMaxProcCnt((java.math.BigDecimal) value);
			return;
		case 1851909613 : /* lastProcNo */
			setLastProcNo((java.lang.Integer) value);
			return;
		case 4625204 : /* totalTargetCnt */
			setTotalTargetCnt((java.math.BigDecimal) value);
			return;
		case 4623251 : /* totalTargetAmt */
			setTotalTargetAmt((java.math.BigDecimal) value);
			return;
		case 1965193036 : /* normalProcCnt */
			setNormalProcCnt((java.math.BigDecimal) value);
			return;
		case 1965191083 : /* normalProcAmt */
			setNormalProcAmt((java.math.BigDecimal) value);
			return;
		case -92389106 : /* errProcCnt */
			setErrProcCnt((java.math.BigDecimal) value);
			return;
		case -92391059 : /* errProcAmt */
			setErrProcAmt((java.math.BigDecimal) value);
			return;
		case 259268520 : /* delProcCnt */
			setDelProcCnt((java.math.BigDecimal) value);
			return;
		case 259266567 : /* delProcAmt */
			setDelProcAmt((java.math.BigDecimal) value);
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
