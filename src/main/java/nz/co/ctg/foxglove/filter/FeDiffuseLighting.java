package nz.co.ctg.foxglove.filter;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.MoreObjects.ToStringHelper;

import nz.co.ctg.foxglove.AbstractSvgElement;
import nz.co.ctg.foxglove.ISvgGraphicsAttributes;
import nz.co.ctg.foxglove.ISvgPresentationAttributes;
import nz.co.ctg.foxglove.ISvgStylable;
import nz.co.ctg.foxglove.ISvgTextAttributes;
import nz.co.ctg.foxglove.animate.ISvgAnimationElement;
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


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lightSources", "animations"
})
@XmlRootElement(name = "feDiffuseLighting")
public class FeDiffuseLighting extends AbstractSvgElement implements ISvgStylable, ISvgPresentationAttributes, ISvgGraphicsAttributes, ISvgTextAttributes, ISvgFilterPrimitive {

    @XmlAttribute(name = "in")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String in;

    @XmlAttribute(name = "surfaceScale")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String surfaceScale;

    @XmlAttribute(name = "diffuseConstant")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String diffuseConstant;

    @XmlAttribute(name = "kernelUnitLength")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String kernelUnitLength;

    @XmlElements({
        @XmlElement(name = "feDistantLight", required = true, type = FeDistantLight.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "fePointLight", required = true, type = FePointLight.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "feSpotLight", required = true, type = FeSpotLight.class, namespace = "http://www.w3.org/2000/svg")
    })
    private List<ISvgFilterLightSource> lightSources;

    @XmlElements({
        @XmlElement(name = "animate", type = SvgAnimateAttribute.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "set", type = SvgSetAttribute.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animateColor", type = SvgAnimateColor.class, namespace = "http://www.w3.org/2000/svg")
    })
    private List<ISvgAnimationElement> animations;

    @XmlAttribute(name = "style")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String style;

    @XmlAttribute(name = "class")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String className;

    public String getIn() {
        return in;
    }

    public void setIn(String value) {
        this.in = value;
    }

    public String getSurfaceScale() {
        return surfaceScale;
    }

    public void setSurfaceScale(String value) {
        this.surfaceScale = value;
    }

    public String getDiffuseConstant() {
        return diffuseConstant;
    }

    public void setDiffuseConstant(String value) {
        this.diffuseConstant = value;
    }

    public String getKernelUnitLength() {
        return kernelUnitLength;
    }

    public void setKernelUnitLength(String value) {
        this.kernelUnitLength = value;
    }

    @Override
    public String getStyle() {
        return style;
    }

    @Override
    public void setStyle(String value) {
        this.style = value;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void setClassName(String value) {
        this.className = value;
    }

    public List<ISvgFilterLightSource> getLightSources() {
        if (lightSources == null) {
            lightSources = new ArrayList<>();
        }
        return this.lightSources;
    }

    public List<ISvgAnimationElement> getAnimations() {
        if (animations == null) {
            animations = new ArrayList<>();
        }
        return this.animations;
    }

    @Override
    public void toStringDetail(ToStringHelper builder) {
        builder.add("in", in);
        builder.add("surfaceScale", surfaceScale);
        builder.add("diffuseConstant", diffuseConstant);
        builder.add("kernelUnitLength", kernelUnitLength);
        super.toStringDetail(builder);
        builder.add("style", style);
        builder.add("className", className);
        ISvgPresentationAttributes.super.toStringDetail(builder);
        ISvgGraphicsAttributes.super.toStringDetail(builder);
        ISvgTextAttributes.super.toStringDetail(builder);
        ISvgFilterPrimitive.super.toStringDetail(builder);
    }

}
