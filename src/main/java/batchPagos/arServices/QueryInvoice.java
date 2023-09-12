
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import batchPagos.controlData.ControlDataRequestHeaderType;

/**
 * <p>Java class for QueryInvoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryInvoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/>
 *         &lt;element name="queryInvoice" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryInvoicePetType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryInvoice", propOrder = {
    "controlData",
    "queryInvoice"
})
public class QueryInvoice {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected QueryInvoicePetType queryInvoice;

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
     * Gets the value of the queryInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link QueryInvoicePetType }
     *     
     */
    public QueryInvoicePetType getQueryInvoice() {
        return queryInvoice;
    }

    /**
     * Sets the value of the queryInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryInvoicePetType }
     *     
     */
    public void setQueryInvoice(QueryInvoicePetType value) {
        this.queryInvoice = value;
    }

}
