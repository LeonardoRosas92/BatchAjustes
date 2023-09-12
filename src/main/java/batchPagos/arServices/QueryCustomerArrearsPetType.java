
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCustomerArrearsPetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCustomerArrearsPetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryObjArrType"/>
 *         &lt;element name="queryResultMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/>
 *         &lt;element name="totalRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/>
 *         &lt;element name="beginRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/>
 *         &lt;element name="fetchRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCustomerArrearsPetType", propOrder = {
    "queryObj",
    "queryResultMode",
    "totalRowNum",
    "beginRowNum",
    "fetchRowNum"
})
public class QueryCustomerArrearsPetType {

    @XmlElement(required = true)
    protected QueryObjArrType queryObj;
    @XmlElement(required = true)
    protected String queryResultMode;
    protected Long totalRowNum;
    protected Long beginRowNum;
    protected Long fetchRowNum;

    /**
     * Gets the value of the queryObj property.
     * 
     * @return
     *     possible object is
     *     {@link QueryObjArrType }
     *     
     */
    public QueryObjArrType getQueryObj() {
        return queryObj;
    }

    /**
     * Sets the value of the queryObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObjArrType }
     *     
     */
    public void setQueryObj(QueryObjArrType value) {
        this.queryObj = value;
    }

    /**
     * Gets the value of the queryResultMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryResultMode() {
        return queryResultMode;
    }

    /**
     * Sets the value of the queryResultMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryResultMode(String value) {
        this.queryResultMode = value;
    }

    /**
     * Gets the value of the totalRowNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRowNum() {
        return totalRowNum;
    }

    /**
     * Sets the value of the totalRowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRowNum(Long value) {
        this.totalRowNum = value;
    }

    /**
     * Gets the value of the beginRowNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBeginRowNum() {
        return beginRowNum;
    }

    /**
     * Sets the value of the beginRowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBeginRowNum(Long value) {
        this.beginRowNum = value;
    }

    /**
     * Gets the value of the fetchRowNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFetchRowNum() {
        return fetchRowNum;
    }

    /**
     * Sets the value of the fetchRowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFetchRowNum(Long value) {
        this.fetchRowNum = value;
    }

}
