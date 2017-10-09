//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.09 at 03:49:51 PM PDT 
//


package https.api_ed2go;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StartDateRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartDateRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RangeStartDate" type="{https://api.ed2go.com/}Date" minOccurs="0"/&gt;
 *         &lt;element name="RangeEndDate" type="{https://api.ed2go.com/}Date" minOccurs="0"/&gt;
 *         &lt;element name="NoStartDates" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartDateRange", propOrder = {
    "rangeStartDate",
    "rangeEndDate",
    "noStartDates"
})
public class StartDateRange {

    @XmlElement(name = "RangeStartDate")
    protected Date rangeStartDate;
    @XmlElement(name = "RangeEndDate")
    protected Date rangeEndDate;
    @XmlElement(name = "NoStartDates")
    protected boolean noStartDates;

    /**
     * Gets the value of the rangeStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getRangeStartDate() {
        return rangeStartDate;
    }

    /**
     * Sets the value of the rangeStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setRangeStartDate(Date value) {
        this.rangeStartDate = value;
    }

    /**
     * Gets the value of the rangeEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getRangeEndDate() {
        return rangeEndDate;
    }

    /**
     * Sets the value of the rangeEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setRangeEndDate(Date value) {
        this.rangeEndDate = value;
    }

    /**
     * Gets the value of the noStartDates property.
     * 
     */
    public boolean isNoStartDates() {
        return noStartDates;
    }

    /**
     * Sets the value of the noStartDates property.
     * 
     */
    public void setNoStartDates(boolean value) {
        this.noStartDates = value;
    }

}
