
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import batchPagos.controlData.ControlDataRequestHeaderType;


/**
 * <p>Java class for QueryCustomerArrears complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCustomerArrears">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/>
 *         &lt;element name="queryCustomerArrears" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryCustomerArrearsPetType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCustomerArrears", propOrder = {
    "controlData",
    "queryCustomerArrears"
})
public class QueryCustomerArrears {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected QueryCustomerArrearsPetType queryCustomerArrears;

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
     * Gets the value of the queryCustomerArrears property.
     * 
     * @return
     *     possible object is
     *     {@link QueryCustomerArrearsPetType }
     *     
     */
    public QueryCustomerArrearsPetType getQueryCustomerArrears() {
        return queryCustomerArrears;
    }

    /**
     * Sets the value of the queryCustomerArrears property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCustomerArrearsPetType }
     *     
     */
    public void setQueryCustomerArrears(QueryCustomerArrearsPetType value) {
        this.queryCustomerArrears = value;
    }

}
