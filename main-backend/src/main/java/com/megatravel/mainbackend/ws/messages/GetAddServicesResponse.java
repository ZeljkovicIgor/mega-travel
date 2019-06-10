
package com.megatravel.mainbackend.ws.messages;

import com.megatravel.mainbackend.ws.model.AddServiceSoap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="add_servce" type="{http://megatravel.com/booking/ws}add_serviceSoap" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addServce"
})
@XmlRootElement(name = "getAddServicesResponse", namespace = "http://megatravel.com/booking/ws")
public class GetAddServicesResponse {

    @XmlElement(name = "add_servce", namespace = "http://megatravel.com/booking/ws", required = true)
    protected List<AddServiceSoap> addServce;

    /**
     * Gets the value of the addServce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addServce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddServce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddServiceSoap }
     * 
     * 
     */
    public List<AddServiceSoap> getAddServce() {
        if (addServce == null) {
            addServce = new ArrayList<AddServiceSoap>();
        }
        return this.addServce;
    }

}
