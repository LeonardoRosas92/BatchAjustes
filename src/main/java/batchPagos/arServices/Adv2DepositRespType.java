
package batchPagos.arServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Adv2DepositRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adv2DepositRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depositAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/>
 *         &lt;element name="depositType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/>
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SimplePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long10Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adv2DepositRespType", propOrder = {
    "depositAmount",
    "depositType",
    "additionalProperty",
    "currencyID"
})
public class Adv2DepositRespType {

    protected long depositAmount;
    @XmlElement(required = true)
    protected String depositType;
    protected List<SimplePropertyType> additionalProperty;
    protected Long currencyID;

    /**
     * Gets the value of the depositAmount property.
     * 
     */
    public long getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     */
    public void setDepositAmount(long value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the depositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositType() {
        return depositType;
    }

    /**
     * Sets the value of the depositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositType(String value) {
        this.depositType = value;
    }

    /**
     * Gets the value of the additionalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyType }
     * 
     * 
     */
    public List<SimplePropertyType> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<SimplePropertyType>();
        }
        return this.additionalProperty;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrencyID(Long value) {
        this.currencyID = value;
    }

}
