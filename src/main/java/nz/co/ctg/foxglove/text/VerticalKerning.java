package nz.co.ctg.foxglove.text;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "vkern")
public class VerticalKerning {

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
    @XmlAttribute(name = "u1")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String u1;
    @XmlAttribute(name = "g1")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String g1;
    @XmlAttribute(name = "u2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String u2;
    @XmlAttribute(name = "g2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String g2;
    @XmlAttribute(name = "k", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String k;

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
     * Gets the value of the u1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getU1() {
        return u1;
    }

    /**
     * Sets the value of the u1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setU1(String value) {
        this.u1 = value;
    }

    /**
     * Gets the value of the g1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getG1() {
        return g1;
    }

    /**
     * Sets the value of the g1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setG1(String value) {
        this.g1 = value;
    }

    /**
     * Gets the value of the u2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getU2() {
        return u2;
    }

    /**
     * Sets the value of the u2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setU2(String value) {
        this.u2 = value;
    }

    /**
     * Gets the value of the g2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getG2() {
        return g2;
    }

    /**
     * Sets the value of the g2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setG2(String value) {
        this.g2 = value;
    }

    /**
     * Gets the value of the k property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setK(String value) {
        this.k = value;
    }

}
