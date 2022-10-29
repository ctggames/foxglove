package nz.co.ctg.foxglove.filter;

import java.util.ArrayList;
import java.util.List;

import nz.co.ctg.foxglove.animate.SvgAnimateAttribute;
import nz.co.ctg.foxglove.animate.SvgAnimateColor;
import nz.co.ctg.foxglove.animate.SvgSetAttribute;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lightSources",
    "animateOrSetOrAnimateColor"
})
@XmlRootElement(name = "feSpecularLighting")
public class FeSpecularLighting extends AbstractSvgFilterPrimitive {

    @XmlAttribute(name = "x")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x;
    @XmlAttribute(name = "y")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y;
    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String height;
    @XmlAttribute(name = "result")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String result;
    @XmlAttribute(name = "in")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String in;
    @XmlAttribute(name = "surfaceScale")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String surfaceScale;
    @XmlAttribute(name = "specularConstant")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String specularConstant;
    @XmlAttribute(name = "specularExponent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String specularExponent;
    @XmlAttribute(name = "kernelUnitLength")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String kernelUnitLength;
    @XmlElements({
        @XmlElement(name = "feDistantLight", required = true, type = FeDistantLight.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "fePointLight", required = true, type = FePointLight.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "feSpotLight", required = true, type = FeSpotLight.class, namespace = "http://www.w3.org/2000/svg")
    })
    protected List<ISvgFilterLightSource> lightSources;
    @XmlElements({
        @XmlElement(name = "animate", type = SvgAnimateAttribute.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "set", type = SvgSetAttribute.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animateColor", type = SvgAnimateColor.class, namespace = "http://www.w3.org/2000/svg")
    })
    protected List<Object> animateOrSetOrAnimateColor;

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
     * Gets the value of the width property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the in property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIn() {
        return in;
    }

    /**
     * Sets the value of the in property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIn(String value) {
        this.in = value;
    }

    /**
     * Gets the value of the surfaceScale property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurfaceScale() {
        return surfaceScale;
    }

    /**
     * Sets the value of the surfaceScale property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurfaceScale(String value) {
        this.surfaceScale = value;
    }

    /**
     * Gets the value of the specularConstant property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpecularConstant() {
        return specularConstant;
    }

    /**
     * Sets the value of the specularConstant property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpecularConstant(String value) {
        this.specularConstant = value;
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
     * Gets the value of the kernelUnitLength property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKernelUnitLength() {
        return kernelUnitLength;
    }

    /**
     * Sets the value of the kernelUnitLength property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKernelUnitLength(String value) {
        this.kernelUnitLength = value;
    }

    /**
     * Gets the value of the feDistantLightOrFePointLightOrFeSpotLight property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feDistantLightOrFePointLightOrFeSpotLight property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeDistantLightOrFePointLightOrFeSpotLight().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeDistantLight }
     * {@link FePointLight }
     * {@link FeSpotLight }
     *
     *
     */
    public List<ISvgFilterLightSource> getLightSources() {
        if (lightSources == null) {
            lightSources = new ArrayList<>();
        }
        return this.lightSources;
    }

    /**
     * Gets the value of the animateOrSetOrAnimateColor property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animateOrSetOrAnimateColor property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimateOrSetOrAnimateColor().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvgAnimateAttribute }
     * {@link SvgSetAttribute }
     * {@link SvgAnimateColor }
     *
     *
     */
    public List<Object> getAnimateOrSetOrAnimateColor() {
        if (animateOrSetOrAnimateColor == null) {
            animateOrSetOrAnimateColor = new ArrayList<>();
        }
        return this.animateOrSetOrAnimateColor;
    }

}
