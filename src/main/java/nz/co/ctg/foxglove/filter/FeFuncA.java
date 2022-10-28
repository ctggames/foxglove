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
@XmlRootElement(name = "feFuncA")
public class FeFuncA {

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
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "tableValues")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tableValues;
    @XmlAttribute(name = "slope")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String slope;
    @XmlAttribute(name = "intercept")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String intercept;
    @XmlAttribute(name = "amplitude")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String amplitude;
    @XmlAttribute(name = "exponent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String exponent;
    @XmlAttribute(name = "offset")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String offset;
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
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the tableValues property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTableValues() {
        return tableValues;
    }

    /**
     * Sets the value of the tableValues property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTableValues(String value) {
        this.tableValues = value;
    }

    /**
     * Gets the value of the slope property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSlope() {
        return slope;
    }

    /**
     * Sets the value of the slope property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSlope(String value) {
        this.slope = value;
    }

    /**
     * Gets the value of the intercept property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIntercept() {
        return intercept;
    }

    /**
     * Sets the value of the intercept property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIntercept(String value) {
        this.intercept = value;
    }

    /**
     * Gets the value of the amplitude property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAmplitude() {
        return amplitude;
    }

    /**
     * Sets the value of the amplitude property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAmplitude(String value) {
        this.amplitude = value;
    }

    /**
     * Gets the value of the exponent property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExponent() {
        return exponent;
    }

    /**
     * Sets the value of the exponent property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExponent(String value) {
        this.exponent = value;
    }

    /**
     * Gets the value of the offset property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOffset(String value) {
        this.offset = value;
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
