
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentRollBackPetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentRollBackPetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentSerialNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/>
 *         &lt;element name="opType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type" minOccurs="0"/>
 *         &lt;element name="paymentObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}PaymentObjType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRollBackPetType", propOrder = {
    "paymentSerialNo",
    "opType",
    "paymentObj"
})
public class PaymentRollBackPetType {

    @XmlElement(required = true)
    protected String paymentSerialNo;
    protected String opType;
    @XmlElement(required = true)
    protected PaymentObjType paymentObj;

    /**
     * Gets the value of the paymentSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSerialNo() {
        return paymentSerialNo;
    }

    /**
     * Sets the value of the paymentSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSerialNo(String value) {
        this.paymentSerialNo = value;
    }

    /**
     * Gets the value of the opType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpType() {
        return opType;
    }

    /**
     * Sets the value of the opType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpType(String value) {
        this.opType = value;
    }

    /**
     * Gets the value of the paymentObj property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentObjType }
     *     
     */
    public PaymentObjType getPaymentObj() {
        return paymentObj;
    }

    /**
     * Sets the value of the paymentObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentObjType }
     *     
     */
    public void setPaymentObj(PaymentObjType value) {
        this.paymentObj = value;
    }

}
