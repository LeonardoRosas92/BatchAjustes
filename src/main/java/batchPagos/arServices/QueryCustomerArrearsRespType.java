
package batchPagos.arServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCustomerArrearsRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCustomerArrearsRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/>
 *         &lt;element name="customerName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/>
 *         &lt;element name="totalArrears" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TotalArrearsType" maxOccurs="unbounded"/>
 *         &lt;element name="accountArrears" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AccountArrearsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCustomerArrearsRespType", propOrder = {
    "customerKey",
    "customerName",
    "totalArrears",
    "accountArrears"
})
public class QueryCustomerArrearsRespType {

    @XmlElement(required = true)
    protected String customerKey;
    @XmlElement(required = true)
    protected String customerName;
    @XmlElement(required = true)
    protected List<TotalArrearsType> totalArrears;
    protected AccountArrearsType accountArrears;

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the totalArrears property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalArrears property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalArrears().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalArrearsType }
     * 
     * 
     */
    public List<TotalArrearsType> getTotalArrears() {
        if (totalArrears == null) {
            totalArrears = new ArrayList<TotalArrearsType>();
        }
        return this.totalArrears;
    }

    /**
     * Gets the value of the accountArrears property.
     * 
     * @return
     *     possible object is
     *     {@link AccountArrearsType }
     *     
     */
    public AccountArrearsType getAccountArrears() {
        return accountArrears;
    }

    /**
     * Sets the value of the accountArrears property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountArrearsType }
     *     
     */
    public void setAccountArrears(AccountArrearsType value) {
        this.accountArrears = value;
    }

}
