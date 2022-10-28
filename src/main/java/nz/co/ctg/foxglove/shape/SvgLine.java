package nz.co.ctg.foxglove.shape;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.google.common.base.MoreObjects.ToStringHelper;

import javafx.scene.shape.Line;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "line")
@XmlRootElement(name = "line")
public class SvgLine extends AbstractSvgShape implements ISvgShape<Line> {

    @XmlAttribute(name = "x1")
    protected double startX;

    @XmlAttribute(name = "y1")
    protected double startY;

    @XmlAttribute(name = "x2")
    protected double endX;

    @XmlAttribute(name = "y2")
    protected double endY;

    @Override
    public Line createShape() {
        parseStyle();
        Line line = new Line(startX, startY, endX, endY);
        setColors(line);
        setStrokeProperties(line);
        setTransforms(line);
        return line;
    }

    /**
     * Gets the value of the x2 property.
     *
     * @return
     *     possible object is
     *     {@link double }
     *
     */
    public double getEndX() {
        return endX;
    }

    /**
     * Gets the value of the y2 property.
     *
     * @return
     *     possible object is
     *     {@link double }
     *
     */
    public double getEndY() {
        return endY;
    }

    /**
     * Gets the value of the x1 property.
     *
     * @return
     *     possible object is
     *     {@link double }
     *
     */
    public double getStartX() {
        return startX;
    }

    /**
     * Gets the value of the y1 property.
     *
     * @return
     *     possible object is
     *     {@link double }
     *
     */
    public double getStartY() {
        return startY;
    }

    /**
     * Sets the value of the x2 property.
     *
     * @param value
     *     allowed object is
     *     {@link double }
     *
     */
    public void setEndX(double value) {
        this.endX = value;
    }

    /**
     * Sets the value of the y2 property.
     *
     * @param value
     *     allowed object is
     *     {@link double }
     *
     */
    public void setEndY(double value) {
        this.endY = value;
    }

    /**
     * Sets the value of the x1 property.
     *
     * @param value
     *     allowed object is
     *     {@link double }
     *
     */
    public void setStartX(double value) {
        this.startX = value;
    }

    /**
     * Sets the value of the y1 property.
     *
     * @param value
     *     allowed object is
     *     {@link double }
     *
     */
    public void setStartY(double value) {
        this.startY = value;
    }

    @Override
    protected void toStringDetail(ToStringHelper builder) {
        builder.add("x1", startX);
        builder.add("y1", startY);
        builder.add("x2", endX);
        builder.add("y2", endY);
        super.toStringDetail(builder);
    }

}
