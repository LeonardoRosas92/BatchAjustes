
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import batchPagos.controlData.ControlDataRequestHeaderType;


/**
 * <p>Java class for Adv2Deposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adv2Deposit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/>
 *         &lt;element name="adv2Deposit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Adv2DepositPetType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adv2Deposit", propOrder = {
    "controlData",
    "adv2Deposit"
})
public class Adv2Deposit {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected Adv2DepositPetType adv2Deposit;

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
     * Gets the value of the adv2Deposit property.
     * 
     * @return
     *     possible object is
     *     {@link Adv2DepositPetType }
     *     
     */
    public Adv2DepositPetType getAdv2Deposit() {
        return adv2Deposit;
    }

    /**
     * Sets the value of the adv2Deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adv2DepositPetType }
     *     
     */
    public void setAdv2Deposit(Adv2DepositPetType value) {
        this.adv2Deposit = value;
    }

}
