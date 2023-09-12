
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import batchPagos.controlData.ControlDataResponseHeaderType;
import batchPagos.controlData.DetailResponseType;


/**
 * <p>Java class for QueryDepositBalanceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDepositBalanceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataResponseHeaderType"/>
 *         &lt;element name="detailResponse" type="{http://amx.com/mexico/telcel/esb/v1_2}DetailResponseType"/>
 *         &lt;element name="queryDepositBalanceResponse" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryDepositBalanceRespType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDepositBalanceResponse", propOrder = {
    "controlData",
    "detailResponse",
    "queryDepositBalanceResponse"
})
public class QueryDepositBalanceResponse {

    @XmlElement(required = true)
    protected ControlDataResponseHeaderType controlData;
    @XmlElement(required = true)
    protected DetailResponseType detailResponse;
    protected QueryDepositBalanceRespType queryDepositBalanceResponse;

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
     * Gets the value of the queryDepositBalanceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QueryDepositBalanceRespType }
     *     
     */
    public QueryDepositBalanceRespType getQueryDepositBalanceResponse() {
        return queryDepositBalanceResponse;
    }

    /**
     * Sets the value of the queryDepositBalanceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryDepositBalanceRespType }
     *     
     */
    public void setQueryDepositBalanceResponse(QueryDepositBalanceRespType value) {
        this.queryDepositBalanceResponse = value;
    }

}
