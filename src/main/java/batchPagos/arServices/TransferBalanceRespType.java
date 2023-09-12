
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferBalanceRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferBalanceRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferor" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TransferorType" minOccurs="0"/>
 *         &lt;element name="transferee" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TransfereeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferBalanceRespType", propOrder = {
    "transferor",
    "transferee"
})
public class TransferBalanceRespType {

    protected TransferorType transferor;
    protected TransfereeType transferee;

    /**
     * Gets the value of the transferor property.
     * 
     * @return
     *     possible object is
     *     {@link TransferorType }
     *     
     */
    public TransferorType getTransferor() {
        return transferor;
    }

    /**
     * Sets the value of the transferor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferorType }
     *     
     */
    public void setTransferor(TransferorType value) {
        this.transferor = value;
    }

    /**
     * Gets the value of the transferee property.
     * 
     * @return
     *     possible object is
     *     {@link TransfereeType }
     *     
     */
    public TransfereeType getTransferee() {
        return transferee;
    }

    /**
     * Sets the value of the transferee property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransfereeType }
     *     
     */
    public void setTransferee(TransfereeType value) {
        this.transferee = value;
    }

}
