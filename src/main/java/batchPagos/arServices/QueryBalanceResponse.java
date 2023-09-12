
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import batchPagos.controlData.ControlDataResponseHeaderType;
import batchPagos.controlData.DetailResponseType;


/**
 * <p>Java class for QueryBalanceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBalanceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataResponseHeaderType"/>
 *         &lt;element name="detailResponse" type="{http://amx.com/mexico/telcel/esb/v1_2}DetailResponseType"/>
 *         &lt;element name="queryBalanceResponse" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryBalanceRespType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBalanceResponse", propOrder = {
    "controlData",
    "detailResponse",
    "queryBalanceResponse"
})
public class QueryBalanceResponse {

    @XmlElement(required = true)
    protected ControlDataResponseHeaderType controlData;
    @XmlElement(required = true)
    protected DetailResponseType detailResponse;
    protected QueryBalanceRespType queryBalanceResponse;

    /**
     * Gets the value of the controlData property.
     * 
     * @return
     *     possible object is
     *     {@link ControlDataResponseHeaderType }
     *     
     */
    public ControlDataResponseHeaderType getControlData() {
        return controlData;
    }

    /**
     * Sets the value of the controlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlDataResponseHeaderType }
     *     
     */
    public void setControlData(ControlDataResponseHeaderType value) {
        this.controlData = value;
    }

    /**
     * Gets the value of the detailResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DetailResponseType }
     *     
     */
    public DetailResponseType getDetailResponse() {
        return detailResponse;
    }

    /**
     * Sets the value of the detailResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailResponseType }
     *     
     */
    public void setDetailResponse(DetailResponseType value) {
        this.detailResponse = value;
    }

    /**
     * Gets the value of the queryBalanceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QueryBalanceRespType }
     *     
     */
    public QueryBalanceRespType getQueryBalanceResponse() {
        return queryBalanceResponse;
    }

    /**
     * Sets the value of the queryBalanceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryBalanceRespType }
     *     
     */
    public void setQueryBalanceResponse(QueryBalanceRespType value) {
        this.queryBalanceResponse = value;
    }

}
