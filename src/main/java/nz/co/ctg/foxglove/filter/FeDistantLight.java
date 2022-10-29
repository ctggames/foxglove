package nz.co.ctg.foxglove.filter;

import java.util.ArrayList;
import java.util.List;

import nz.co.ctg.foxglove.AbstractSvgElement;
import nz.co.ctg.foxglove.animate.ISvgAnimationElement;
import nz.co.ctg.foxglove.animate.SvgAnimateAttribute;
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
    "animations"
})
@XmlRootElement(name = "feDistantLight")
public class FeDistantLight extends AbstractSvgElement implements ISvgFilterLightSource {

    @XmlAttribute(name = "azimuth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String azimuth;

    @XmlAttribute(name = "elevation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String elevation;

    @XmlElements({
        @XmlElement(name = "animate", type = SvgAnimateAttribute.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "set", type = SvgSetAttribute.class, namespace = "http://www.w3.org/2000/svg")
    })
    protected List<ISvgAnimationElement> animations;

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
     * Gets the value of the animations property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animations property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimations().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvgAnimateAttribute }
     * {@link SvgSetAttribute }
     *
     *
     */
    @Override
    public List<ISvgAnimationElement> getAnimations() {
        if (animations == null) {
            animations = new ArrayList<>();
        }
        return this.animations;
    }

}
