
package batchPagos.arServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RechargeBonusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechargeBonusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeUnitItemList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitItemListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="balanceList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargeBonusType", propOrder = {
    "freeUnitItemList",
    "balanceList"
})
public class RechargeBonusType {

    protected List<FreeUnitItemListType> freeUnitItemList;
    protected List<BalanceListType> balanceList;

    /**
     * Gets the value of the freeUnitItemList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitItemList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitItemList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitItemListType }
     * 
     * 
     */
    public List<FreeUnitItemListType> getFreeUnitItemList() {
        if (freeUnitItemList == null) {
            freeUnitItemList = new ArrayList<FreeUnitItemListType>();
        }
        return this.freeUnitItemList;
    }

    /**
     * Gets the value of the balanceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceListType }
     * 
     * 
     */
    public List<BalanceListType> getBalanceList() {
        if (balanceList == null) {
            balanceList = new ArrayList<BalanceListType>();
        }
        return this.balanceList;
    }

}
