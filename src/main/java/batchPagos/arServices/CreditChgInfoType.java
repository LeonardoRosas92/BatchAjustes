
package batchPagos.arServices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditChgInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditChgInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditLimitID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/>
 *         &lt;element name="creditLimitType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/>
 *         &lt;element name="creditLimitTypeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica50Type" minOccurs="0"/>
 *         &lt;element name="oldLeftCreditAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/>
 *         &lt;element name="newLeftCreditAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/>
 *         &lt;element name="measureUnit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}IntType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditChgInfoType", propOrder = {
    "creditLimitID",
    "creditLimitType",
    "creditLimitTypeName",
    "oldLeftCreditAmt",
    "newLeftCreditAmt",
    "measureUnit"
})
public class CreditChgInfoType {

    protected Long creditLimitID;
    @XmlElement(required = true)
    protected String creditLimitType;
    protected String creditLimitTypeName;
    protected long oldLeftCreditAmt;
    protected long newLeftCreditAmt;
    @XmlElement(required = true)
    protected BigInteger measureUnit;

    /**
     * Gets the value of the creditLimitID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditLimitID() {
        return creditLimitID;
    }

    /**
     * Sets the value of the creditLimitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditLimitID(Long value) {
        this.creditLimitID = value;
    }

    /**
     * Gets the value of the creditLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimitType() {
        return creditLimitType;
    }

    /**
     * Sets the value of the creditLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimitType(String value) {
        this.creditLimitType = value;
    }

    /**
     * Gets the value of the creditLimitTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimitTypeName() {
        return creditLimitTypeName;
    }

    /**
     * Sets the value of the creditLimitTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimitTypeName(String value) {
        this.creditLimitTypeName = value;
    }

    /**
     * Gets the value of the oldLeftCreditAmt property.
     * 
     */
    public long getOldLeftCreditAmt() {
        return oldLeftCreditAmt;
    }

    /**
     * Sets the value of the oldLeftCreditAmt property.
     * 
     */
    public void setOldLeftCreditAmt(long value) {
        this.oldLeftCreditAmt = value;
    }

    /**
     * Gets the value of the newLeftCreditAmt property.
     * 
     */
    public long getNewLeftCreditAmt() {
        return newLeftCreditAmt;
    }

    /**
     * Sets the value of the newLeftCreditAmt property.
     * 
     */
    public void setNewLeftCreditAmt(long value) {
        this.newLeftCreditAmt = value;
    }

    /**
     * Gets the value of the measureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasureUnit() {
        return measureUnit;
    }

    /**
     * Sets the value of the measureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasureUnit(BigInteger value) {
        this.measureUnit = value;
    }

}
