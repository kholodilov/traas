
package de.tudresden.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Poi_getColor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Poi_getColor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poiID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Poi_getColor", propOrder = {
    "poiID"
})
public class PoiGetColor {

    protected String poiID;

    /**
     * Gets the value of the poiID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoiID() {
        return poiID;
    }

    /**
     * Sets the value of the poiID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoiID(String value) {
        this.poiID = value;
    }

}
