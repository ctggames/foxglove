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
@XmlRootElement(name = "feSpotLight")
public class FeSpotLight {

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
    @XmlAttribute(name = "x")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x;
    @XmlAttribute(name = "y")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y;
    @XmlAttribute(name = "z")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String z;
    @XmlAttribute(name = "pointsAtX")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pointsAtX;
    @XmlAttribute(name = "pointsAtY")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pointsAtY;
    @XmlAttribute(name = "pointsAtZ")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pointsAtZ;
    @XmlAttribute(name = "specularExponent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String specularExponent;
    @XmlAttribute(name = "limitingConeAngle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String limitingConeAngle;
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
     * Gets the value of the x property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setY(String value) {
        this.y = value;
    }

    /**
     * Gets the value of the z property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZ(String value) {
        this.z = value;
    }

    /**
     * Gets the value of the pointsAtX property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPointsAtX() {
        return pointsAtX;
    }

    /**
     * Sets the value of the pointsAtX property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPointsAtX(String value) {
        this.pointsAtX = value;
    }

    /**
     * Gets the value of the pointsAtY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPointsAtY() {
        return pointsAtY;
    }

    /**
     * Sets the value of the pointsAtY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPointsAtY(String value) {
        this.pointsAtY = value;
    }

    /**
     * Gets the value of the pointsAtZ property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPointsAtZ() {
        return pointsAtZ;
    }

    /**
     * Sets the value of the pointsAtZ property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPointsAtZ(String value) {
        this.pointsAtZ = value;
    }

    /**
     * Gets the value of the specularExponent property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpecularExponent() {
        return specularExponent;
    }

    /**
     * Sets the value of the specularExponent property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpecularExponent(String value) {
        this.specularExponent = value;
    }

    /**
     * Gets the value of the limitingConeAngle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLimitingConeAngle() {
        return limitingConeAngle;
    }

    /**
     * Sets the value of the limitingConeAngle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLimitingConeAngle(String value) {
        this.limitingConeAngle = value;
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
