
package batchPagos.arServices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanChgInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanChgInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oldLoanAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/>
 *         &lt;element name="newLoanAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/>
 *         &lt;element name="loanPaymentAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/>
 *         &lt;element name="loanInterestAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/>
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanChgInfoType", propOrder = {
    "oldLoanAmt",
    "newLoanAmt",
    "loanPaymentAmt",
    "loanInterestAmt",
    "currencyID"
})
public class LoanChgInfoType {

    protected long oldLoanAmt;
    protected long newLoanAmt;
    protected long loanPaymentAmt;
    protected long loanInterestAmt;
    @XmlElement(required = true)
    protected BigInteger currencyID;

    /**
     * Gets the value of the oldLoanAmt property.
     * 
     */
    public long getOldLoanAmt() {
        return oldLoanAmt;
    }

    /**
     * Sets the value of the oldLoanAmt property.
     * 
     */
    public void setOldLoanAmt(long value) {
        this.oldLoanAmt = value;
    }

    /**
     * Gets the value of the newLoanAmt property.
     * 
     */
    public long getNewLoanAmt() {
        return newLoanAmt;
    }

    /**
     * Sets the value of the newLoanAmt property.
     * 
     */
    public void setNewLoanAmt(long value) {
        this.newLoanAmt = value;
    }

    /**
     * Gets the value of the loanPaymentAmt property.
     * 
     */
    public long getLoanPaymentAmt() {
        return loanPaymentAmt;
    }

    /**
     * Sets the value of the loanPaymentAmt property.
     * 
     */
    public void setLoanPaymentAmt(long value) {
        this.loanPaymentAmt = value;
    }

    /**
     * Gets the value of the loanInterestAmt property.
     * 
     */
    public long getLoanInterestAmt() {
        return loanInterestAmt;
    }

    /**
     * Sets the value of the loanInterestAmt property.
     * 
     */
    public void setLoanInterestAmt(long value) {
        this.loanInterestAmt = value;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrencyID(BigInteger value) {
        this.currencyID = value;
    }

}
