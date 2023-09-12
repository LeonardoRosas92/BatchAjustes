
package batchPagos.arServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDepositBalanceRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDepositBalanceRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depositBalanceList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DepositBalanceListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDepositBalanceRespType", propOrder = {
    "depositBalanceList"
})
public class QueryDepositBalanceRespType {

    protected List<DepositBalanceListType> depositBalanceList;

    /**
     * Gets the value of the depositBalanceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositBalanceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositBalanceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepositBalanceListType }
     * 
     * 
     */
    public List<DepositBalanceListType> getDepositBalanceList() {
        if (depositBalanceList == null) {
            depositBalanceList = new ArrayList<DepositBalanceListType>();
        }
        return this.depositBalanceList;
    }

}
