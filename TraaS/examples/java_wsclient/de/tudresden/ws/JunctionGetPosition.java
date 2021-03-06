
package de.tudresden.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Junction_getPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Junction_getPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="junctionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Junction_getPosition", propOrder = {
    "junctionID"
})
public class JunctionGetPosition {

    protected String junctionID;

    /**
     * Gets the value of the junctionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJunctionID() {
        return junctionID;
    }

    /**
     * Sets the value of the junctionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJunctionID(String value) {
        this.junctionID = value;
    }

}
