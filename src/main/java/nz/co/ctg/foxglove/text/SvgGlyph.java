package nz.co.ctg.foxglove.text;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.persistence.oxm.annotations.XmlReadTransformer;
import org.eclipse.persistence.oxm.annotations.XmlTransformation;
import org.eclipse.persistence.oxm.annotations.XmlWriteTransformer;
import org.eclipse.persistence.oxm.annotations.XmlWriteTransformers;

import com.google.common.base.MoreObjects.ToStringHelper;

import nz.co.ctg.foxglove.AbstractSvgElement;
import nz.co.ctg.foxglove.ISvgElement;
import nz.co.ctg.foxglove.ISvgStylable;
import nz.co.ctg.foxglove.SvgGraphic;
import nz.co.ctg.foxglove.animate.SvgAnimateAttribute;
import nz.co.ctg.foxglove.animate.SvgAnimateColor;
import nz.co.ctg.foxglove.animate.SvgAnimateMotion;
import nz.co.ctg.foxglove.animate.SvgAnimateTransform;
import nz.co.ctg.foxglove.animate.SvgSetAttribute;
import nz.co.ctg.foxglove.attributes.SvgGraphicsStyleAttributes;
import nz.co.ctg.foxglove.attributes.SvgPresentationStyleAttributes;
import nz.co.ctg.foxglove.attributes.SvgTextStyleAttributes;
import nz.co.ctg.foxglove.clip.SvgClipPath;
import nz.co.ctg.foxglove.clip.SvgMask;
import nz.co.ctg.foxglove.description.SvgDescription;
import nz.co.ctg.foxglove.description.SvgMetadata;
import nz.co.ctg.foxglove.description.SvgTitle;
import nz.co.ctg.foxglove.element.SvgAnchor;
import nz.co.ctg.foxglove.element.SvgCursor;
import nz.co.ctg.foxglove.element.SvgDefinitions;
import nz.co.ctg.foxglove.element.SvgForeignObject;
import nz.co.ctg.foxglove.element.SvgGroup;
import nz.co.ctg.foxglove.element.SvgImage;
import nz.co.ctg.foxglove.element.SvgMarker;
import nz.co.ctg.foxglove.element.SvgScript;
import nz.co.ctg.foxglove.element.SvgSwitch;
import nz.co.ctg.foxglove.element.SvgSymbol;
import nz.co.ctg.foxglove.element.SvgUse;
import nz.co.ctg.foxglove.element.SvgView;
import nz.co.ctg.foxglove.filter.SvgFilter;
import nz.co.ctg.foxglove.paint.SvgColorProfile;
import nz.co.ctg.foxglove.paint.SvgLinearGradient;
import nz.co.ctg.foxglove.paint.SvgPattern;
import nz.co.ctg.foxglove.paint.SvgRadialGradient;
import nz.co.ctg.foxglove.shape.SvgCircle;
import nz.co.ctg.foxglove.shape.SvgEllipse;
import nz.co.ctg.foxglove.shape.SvgLine;
import nz.co.ctg.foxglove.shape.SvgPath;
import nz.co.ctg.foxglove.shape.SvgPolygon;
import nz.co.ctg.foxglove.shape.SvgPolyline;
import nz.co.ctg.foxglove.shape.SvgRectangle;
import nz.co.ctg.foxglove.style.SvgStyle;

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
    "presentation", "graphics", "text", "content"
})
@XmlRootElement(name = "glyph")
public class SvgGlyph extends AbstractSvgElement implements ISvgStylable {

    @XmlAttribute(name = "unicode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String unicode;

    @XmlAttribute(name = "glyph-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String glyphName;

    @XmlAttribute(name = "d")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String d;

    @XmlAttribute(name = "orientation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String orientation;

    @XmlAttribute(name = "arabic-form")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String arabicForm;

    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String lang;

    @XmlAttribute(name = "horiz-adv-x")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String horizAdvX;

    @XmlAttribute(name = "vert-origin-x")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String vertOriginX;

    @XmlAttribute(name = "vert-origin-y")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String vertOriginY;

    @XmlAttribute(name = "vert-adv-y")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    private String vertAdvY;

    @XmlElements({
        @XmlElement(name = "desc", type = SvgDescription.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "title", type = SvgTitle.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "metadata", type = SvgMetadata.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animate", type = SvgAnimateAttribute.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "set", type = SvgSetAttribute.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animateMotion", type = SvgAnimateMotion.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animateColor", type = SvgAnimateColor.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "animateTransform", type = SvgAnimateTransform.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "svg", type = SvgGraphic.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "g", type = SvgGroup.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "defs", type = SvgDefinitions.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "symbol", type = SvgSymbol.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "use", type = SvgUse.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "switch", type = SvgSwitch.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "image", type = SvgImage.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "style", type = SvgStyle.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "path", type = SvgPath.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "rect", type = SvgRectangle.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "circle", type = SvgCircle.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "line", type = SvgLine.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "ellipse", type = SvgEllipse.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "polyline", type = SvgPolyline.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "polygon", type = SvgPolygon.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "text", type = SvgText.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "altGlyphDef", type = SvgAltGlyphDef.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "marker", type = SvgMarker.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "color-profile", type = SvgColorProfile.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "linearGradient", type = SvgLinearGradient.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "radialGradient", type = SvgRadialGradient.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "pattern", type = SvgPattern.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "clipPath", type = SvgClipPath.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "mask", type = SvgMask.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "filter", type = SvgFilter.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "cursor", type = SvgCursor.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "a", type = SvgAnchor.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "view", type = SvgView.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "script", type = SvgScript.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "font", type = SvgFont.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "font-face", type = SvgFontFace.class, namespace = "http://www.w3.org/2000/svg"),
        @XmlElement(name = "foreignObject", type = SvgForeignObject.class, namespace = "http://www.w3.org/2000/svg")
    })
    private List<ISvgElement> content;

    @XmlTransformation
    @XmlReadTransformer(transformerClass = SvgPresentationStyleAttributes.class)
    @XmlWriteTransformers({
        @XmlWriteTransformer(xmlPath = "@flood-color", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@flood-opacity", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@lighting-color", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@enable-background", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@clip", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@overflow", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@marker-start", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@marker-mid", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@marker-end", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@clip-path", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@clip-rule", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@mask", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@filter", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@color-interpolation-filters", transformerClass = SvgPresentationStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@cursor", transformerClass = SvgPresentationStyleAttributes.class)
    })
    protected final SvgPresentationStyleAttributes presentation = new SvgPresentationStyleAttributes();

    @XmlTransformation
    @XmlReadTransformer(transformerClass = SvgGraphicsStyleAttributes.class)
    @XmlWriteTransformers({
        @XmlWriteTransformer(xmlPath = "@fill", transformerClass = SvgGraphicsStyleAttributes.class), @XmlWriteTransformer(xmlPath = "@fill-rule", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@stroke", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@stroke-dasharray", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@stroke-dashoffset", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@stroke-linecap", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@stroke-linejoin", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@stroke-miterlimit", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@stroke-width", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@color", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@color-interpolation", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@color-rendering", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@opacity", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@fill-opacity", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@stroke-opacity", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@display", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@image-rendering", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@pointer-events", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@shape-rendering", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@text-rendering", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@visibility", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@color-profile", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@stop-color", transformerClass = SvgGraphicsStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@stop-opacity", transformerClass = SvgGraphicsStyleAttributes.class)
    })
    protected final SvgGraphicsStyleAttributes graphics = new SvgGraphicsStyleAttributes();

    @XmlTransformation
    @XmlReadTransformer(transformerClass = SvgTextStyleAttributes.class)
    @XmlWriteTransformers({
        @XmlWriteTransformer(xmlPath = "@font-family", transformerClass = SvgTextStyleAttributes.class), @XmlWriteTransformer(xmlPath = "@font-size", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@font-size-adjust", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@font-stretch", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@font-style", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@font-variant", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@font-weight", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@alignment-baseline", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@baseline-shift", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@direction", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@dominant-baseline", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@glyph-orientation-horizontal", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@glyph-orientation-vertical", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@kerning", transformerClass = SvgTextStyleAttributes.class), @XmlWriteTransformer(xmlPath = "@letter-spacing", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@text-anchor", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@text-decoration", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@unicode-bidi", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@word-spacing", transformerClass = SvgTextStyleAttributes.class),
        @XmlWriteTransformer(xmlPath = "@writing-mode", transformerClass = SvgTextStyleAttributes.class)
    })
    protected final SvgTextStyleAttributes text = new SvgTextStyleAttributes();

    @XmlAttribute(name = "style")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String style;

    @XmlAttribute(name = "class")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String className;

    public String getUnicode() {
        return unicode;
    }

    public void setUnicode(String value) {
        this.unicode = value;
    }

    public String getGlyphName() {
        return glyphName;
    }

    public void setGlyphName(String value) {
        this.glyphName = value;
    }

    public String getD() {
        return d;
    }

    public void setD(String value) {
        this.d = value;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String value) {
        this.orientation = value;
    }

    public String getArabicForm() {
        return arabicForm;
    }

    public void setArabicForm(String value) {
        this.arabicForm = value;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        this.lang = value;
    }

    public String getHorizAdvX() {
        return horizAdvX;
    }

    public void setHorizAdvX(String value) {
        this.horizAdvX = value;
    }

    public String getVertOriginX() {
        return vertOriginX;
    }

    public void setVertOriginX(String value) {
        this.vertOriginX = value;
    }

    public String getVertOriginY() {
        return vertOriginY;
    }

    public void setVertOriginY(String value) {
        this.vertOriginY = value;
    }

    public String getVertAdvY() {
        return vertAdvY;
    }

    public void setVertAdvY(String value) {
        this.vertAdvY = value;
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

    @Override
    public SvgPresentationStyleAttributes getPresentationAttributes() {
        return presentation;
    }

    @Override
    public SvgGraphicsStyleAttributes getGraphicsAttributes() {
        return graphics;
    }

    @Override
    public SvgTextStyleAttributes getTextAttributes() {
        return text;
    }

    public List<ISvgElement> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

    @Override
    protected void toStringDetail(ToStringHelper builder) {
        builder.add("name", unicode);
        builder.add("name", glyphName);
        builder.add("name", orientation);
        builder.add("name", arabicForm);
        builder.add("name", lang);
        builder.add("name", horizAdvX);
        builder.add("name", vertOriginX);
        builder.add("name", vertOriginY);
        builder.add("name", vertAdvY);
        super.toStringDetail(builder);
        builder.add("style", style);
        builder.add("className", className);
        presentation.toStringDetail(builder);
        graphics.toStringDetail(builder);
        text.toStringDetail(builder);
        builder.add("name", d);
    }

}
