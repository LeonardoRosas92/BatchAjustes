
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAdjustLogPetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAdjustLogPetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryObj3AccType"/>
 *         &lt;element name="queryDetailInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryDetailInfoType" minOccurs="0"/>
 *         &lt;element name="pendingPenaltyFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/>
 *         &lt;element name="extTransID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/>
 *         &lt;element name="totalRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Entero10dType" minOccurs="0"/>
 *         &lt;element name="beginRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Entero10dType" minOccurs="0"/>
 *         &lt;element name="fetchRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Entero10dType" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAdjustLogPetType", propOrder = {
    "queryObj",
    "queryDetailInfo",
    "pendingPenaltyFlag",
    "extTransID",
    "totalRowNum",
    "beginRowNum",
    "fetchRowNum",
    "startTime",
    "endTime"
})
public class QueryAdjustLogPetType {

    @XmlElement(required = true)
    protected QueryObj3AccType queryObj;
    protected QueryDetailInfoType queryDetailInfo;
    protected String pendingPenaltyFlag;
    protected String extTransID;
    protected Integer totalRowNum;
    protected Integer beginRowNum;
    protected Integer fetchRowNum;
    protected String startTime;
    protected String endTime;

    /**
     * Gets the value of the queryObj property.
     * 
     * @return
     *     possible object is
     *     {@link QueryObj3AccType }
     *     
     */
    public QueryObj3AccType getQueryObj() {
        return queryObj;
    }

    /**
     * Sets the value of the queryObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObj3AccType }
     *     
     */
    public void setQueryObj(QueryObj3AccType value) {
        this.queryObj = value;
    }

    /**
     * Gets the value of the queryDetailInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QueryDetailInfoType }
     *     
     */
    public QueryDetailInfoType getQueryDetailInfo() {
        return queryDetailInfo;
    }

    /**
     * Sets the value of the queryDetailInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryDetailInfoType }
     *     
     */
    public void setQueryDetailInfo(QueryDetailInfoType value) {
        this.queryDetailInfo = value;
    }

    /**
     * Gets the value of the pendingPenaltyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingPenaltyFlag() {
        return pendingPenaltyFlag;
    }

    /**
     * Sets the value of the pendingPenaltyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingPenaltyFlag(String value) {
        this.pendingPenaltyFlag = value;
    }

    /**
     * Gets the value of the extTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTransID() {
        return extTransID;
    }

    /**
     * Sets the value of the extTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTransID(String value) {
        this.extTransID = value;
    }

    /**
     * Gets the value of the totalRowNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRowNum() {
        return totalRowNum;
    }

    /**
     * Sets the value of the totalRowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRowNum(Integer value) {
        this.totalRowNum = value;
    }

    /**
     * Gets the value of the beginRowNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBeginRowNum() {
        return beginRowNum;
    }

    /**
     * Sets the value of the beginRowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBeginRowNum(Integer value) {
        this.beginRowNum = value;
    }

    /**
     * Gets the value of the fetchRowNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFetchRowNum() {
        return fetchRowNum;
    }

    /**
     * Sets the value of the fetchRowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFetchRowNum(Integer value) {
        this.fetchRowNum = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

}
