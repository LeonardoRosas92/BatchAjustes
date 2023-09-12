
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import batchPagos.controlData.ControlDataRequestHeaderType;


/**
 * <p>Java class for QueryPaymentLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryPaymentLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/>
 *         &lt;element name="queryPaymentLog" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryPaymentLogPetType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPaymentLog", propOrder = {
    "controlData",
    "queryPaymentLog"
})
public class QueryPaymentLog {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected QueryPaymentLogPetType queryPaymentLog;

    /**
     * Gets the value of the controlData property.
     * 
     * @return
     *     possible object is
     *     {@link ControlDataRequestHeaderType }
     *     
     */
    public ControlDataRequestHeaderType getControlData() {
        return controlData;
    }

    /**
     * Sets the value of the controlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlDataRequestHeaderType }
     *     
     */
    public void setControlData(ControlDataRequestHeaderType value) {
        this.controlData = value;
    }

    /**
     * Gets the value of the queryPaymentLog property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPaymentLogPetType }
     *     
     */
    public QueryPaymentLogPetType getQueryPaymentLog() {
        return queryPaymentLog;
    }

    /**
     * Sets the value of the queryPaymentLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPaymentLogPetType }
     *     
     */
    public void setQueryPaymentLog(QueryPaymentLogPetType value) {
        this.queryPaymentLog = value;
    }

}
