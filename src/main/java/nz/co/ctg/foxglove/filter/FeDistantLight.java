package nz.co.ctg.foxglove.filter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import nz.co.ctg.foxglove.animate.SvgAnimate;
import nz.co.ctg.foxglove.animate.SvgSet;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "animateOrSet"
})
@XmlRootElement(name = "feDistantLight")
public class FeDistantLight {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "xml:base")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlBase;
    @XmlAttribute(name = "xml:lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String xmlLang;
    @XmlAttribute(name = "xml:space")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String xmlSpace;
    @XmlAttribute(name = "azimuth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String azimuth;
    @XmlAttribute(name = "elevation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String elevation;
    @XmlElements({
        @XmlElement(name = "animate", type = SvgAnimate.class),
        @XmlElement(name = "set", type = SvgSet.class)
    })
    protected List<Object> animateOrSet;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the xmlBase property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXmlBase() {
        return xmlBase;
    }

    /**
     * Sets the value of the xmlBase property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXmlBase(String value) {
        this.xmlBase = value;
    }

    /**
     * Gets the value of the xmlLang property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXmlLang() {
        return xmlLang;
    }

    /**
     * Sets the value of the xmlLang property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * Gets the value of the xmlSpace property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXmlSpace() {
        return xmlSpace;
    }

    /**
     * Sets the value of the xmlSpace property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXmlSpace(String value) {
        this.xmlSpace = value;
    }

    /**
     * Gets the value of the azimuth property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAzimuth() {
        return azimuth;
    }

    /**
     * Sets the value of the azimuth property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAzimuth(String value) {
        this.azimuth = value;
    }

    /**
     * Gets the value of the elevation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setElevation(String value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the animateOrSet property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animateOrSet property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimateOrSet().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvgAnimate }
     * {@link SvgSet }
     *
     *
     */
    public List<Object> getAnimateOrSet() {
        if (animateOrSet == null) {
            animateOrSet = new ArrayList<Object>();
        }
        return this.animateOrSet;
    }

}
