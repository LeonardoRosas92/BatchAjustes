
package batchPagos.arServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="cardPayment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CardPaymentType"/>
 *           &lt;element name="cashPayment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CashPaymentType" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfoType", propOrder = {
    "cardPayment",
    "cashPayment"
})
public class PaymentInfoType {

    protected CardPaymentType cardPayment;
    protected List<CashPaymentType> cashPayment;

    /**
     * Gets the value of the cardPayment property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentType }
     *     
     */
    public CardPaymentType getCardPayment() {
        return cardPayment;
    }

    /**
     * Sets the value of the cardPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentType }
     *     
     */
    public void setCardPayment(CardPaymentType value) {
        this.cardPayment = value;
    }

    /**
     * Gets the value of the cashPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashPaymentType }
     * 
     * 
     */
    public List<CashPaymentType> getCashPayment() {
        if (cashPayment == null) {
            cashPayment = new ArrayList<CashPaymentType>();
        }
        return this.cashPayment;
    }

}
