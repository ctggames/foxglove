package nz.co.ctg.foxglove.text;

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

import nz.co.ctg.foxglove.SvgGraphic;
import nz.co.ctg.foxglove.animate.SvgAnimate;
import nz.co.ctg.foxglove.animate.SvgAnimateColor;
import nz.co.ctg.foxglove.animate.SvgAnimateMotion;
import nz.co.ctg.foxglove.animate.SvgAnimateTransform;
import nz.co.ctg.foxglove.animate.SvgSet;
import nz.co.ctg.foxglove.clip.SvgClipPath;
import nz.co.ctg.foxglove.clip.SvgMask;
import nz.co.ctg.foxglove.description.SvgDescription;
import nz.co.ctg.foxglove.description.SvgMetadata;
import nz.co.ctg.foxglove.description.SvgTitle;
import nz.co.ctg.foxglove.element.SvgAnchor;
import nz.co.ctg.foxglove.element.SvgCursor;
import nz.co.ctg.foxglove.element.SvgDefs;
import nz.co.ctg.foxglove.element.SvgForeignObject;
import nz.co.ctg.foxglove.element.SvgGroup;
import nz.co.ctg.foxglove.element.SvgImage;
import nz.co.ctg.foxglove.element.SvgMarker;
import nz.co.ctg.foxglove.element.SvgScript;
import nz.co.ctg.foxglove.element.SvgSwitch;
import nz.co.ctg.foxglove.element.SvgSymbol;
import nz.co.ctg.foxglove.element.SvgUse;
import nz.co.ctg.foxglove.element.SvgView;
import nz.co.ctg.foxglove.filter.Filter;
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


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "descOrTitleOrMetadataOrAnimateOrSetOrAnimateMotionOrAnimateColorOrAnimateTransformOrSvgOrGOrDefsOrSymbolOrUseOrSwitchOrImageOrStyleOrPathOrRectOrCircleOrLineOrEllipseOrPolylineOrPolygonOrTextOrAltGlyphDefOrMarkerOrColorProfileOrLinearGradientOrRadialGradientOrPatternOrClipPathOrMaskOrFilterOrCursorOrAOrViewOrScriptOrFontOrFontFaceOrForeignObject"
})
@XmlRootElement(name = "glyph")
public class Glyph {

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
    @XmlAttribute(name = "style")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String style;
    @XmlAttribute(name = "class")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String clazz;
    @XmlAttribute(name = "enable-background")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String enableBackground;
    @XmlAttribute(name = "clip")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String clip;
    @XmlAttribute(name = "overflow")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String overflow;
    @XmlAttribute(name = "writing-mode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String writingMode;
    @XmlAttribute(name = "alignment-baseline")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String alignmentBaseline;
    @XmlAttribute(name = "baseline-shift")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baselineShift;
    @XmlAttribute(name = "direction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String direction;
    @XmlAttribute(name = "dominant-baseline")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dominantBaseline;
    @XmlAttribute(name = "glyph-orientation-horizontal")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String glyphOrientationHorizontal;
    @XmlAttribute(name = "glyph-orientation-vertical")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String glyphOrientationVertical;
    @XmlAttribute(name = "kerning")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String kerning;
    @XmlAttribute(name = "letter-spacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String letterSpacing;
    @XmlAttribute(name = "text-anchor")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textAnchor;
    @XmlAttribute(name = "text-decoration")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String textDecoration;
    @XmlAttribute(name = "unicode-bidi")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unicodeBidi;
    @XmlAttribute(name = "word-spacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String wordSpacing;
    @XmlAttribute(name = "font-family")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fontFamily;
    @XmlAttribute(name = "font-size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fontSize;
    @XmlAttribute(name = "font-size-adjust")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fontSizeAdjust;
    @XmlAttribute(name = "font-stretch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontStretch;
    @XmlAttribute(name = "font-style")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontStyle;
    @XmlAttribute(name = "font-variant")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontVariant;
    @XmlAttribute(name = "font-weight")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontWeight;
    @XmlAttribute(name = "fill")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fill;
    @XmlAttribute(name = "fill-rule")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fillRule;
    @XmlAttribute(name = "stroke")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stroke;
    @XmlAttribute(name = "stroke-dasharray")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String strokeDasharray;
    @XmlAttribute(name = "stroke-dashoffset")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String strokeDashoffset;
    @XmlAttribute(name = "stroke-linecap")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String strokeLinecap;
    @XmlAttribute(name = "stroke-linejoin")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String strokeLinejoin;
    @XmlAttribute(name = "stroke-miterlimit")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String strokeMiterlimit;
    @XmlAttribute(name = "stroke-width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String strokeWidth;
    @XmlAttribute(name = "color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String color;
    @XmlAttribute(name = "color-interpolation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colorInterpolation;
    @XmlAttribute(name = "color-rendering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colorRendering;
    @XmlAttribute(name = "opacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String opacity;
    @XmlAttribute(name = "fill-opacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fillOpacity;
    @XmlAttribute(name = "stroke-opacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String strokeOpacity;
    @XmlAttribute(name = "display")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String display;
    @XmlAttribute(name = "image-rendering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imageRendering;
    @XmlAttribute(name = "pointer-events")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pointerEvents;
    @XmlAttribute(name = "shape-rendering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shapeRendering;
    @XmlAttribute(name = "text-rendering")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textRendering;
    @XmlAttribute(name = "visibility")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(name = "marker-start")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String markerStart;
    @XmlAttribute(name = "marker-mid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String markerMid;
    @XmlAttribute(name = "marker-end")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String markerEnd;
    @XmlAttribute(name = "color-profile")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String colorProfile;
    @XmlAttribute(name = "stop-color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stopColor;
    @XmlAttribute(name = "stop-opacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stopOpacity;
    @XmlAttribute(name = "clip-path")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String clipPath;
    @XmlAttribute(name = "clip-rule")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String clipRule;
    @XmlAttribute(name = "mask")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mask;
    @XmlAttribute(name = "filter")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String filter;
    @XmlAttribute(name = "color-interpolation-filters")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colorInterpolationFilters;
    @XmlAttribute(name = "cursor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cursor;
    @XmlAttribute(name = "flood-color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String floodColor;
    @XmlAttribute(name = "flood-opacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String floodOpacity;
    @XmlAttribute(name = "lighting-color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lightingColor;
    @XmlAttribute(name = "unicode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String unicode;
    @XmlAttribute(name = "glyph-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String glyphName;
    @XmlAttribute(name = "d")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String d;
    @XmlAttribute(name = "orientation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orientation;
    @XmlAttribute(name = "arabic-form")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String arabicForm;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;
    @XmlAttribute(name = "horiz-adv-x")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String horizAdvX;
    @XmlAttribute(name = "vert-origin-x")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vertOriginX;
    @XmlAttribute(name = "vert-origin-y")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vertOriginY;
    @XmlAttribute(name = "vert-adv-y")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String vertAdvY;
    @XmlElements({
        @XmlElement(name = "desc", type = SvgDescription.class),
        @XmlElement(name = "title", type = SvgTitle.class),
        @XmlElement(name = "metadata", type = SvgMetadata.class),
        @XmlElement(name = "animate", type = SvgAnimate.class),
        @XmlElement(name = "set", type = SvgSet.class),
        @XmlElement(name = "animateMotion", type = SvgAnimateMotion.class),
        @XmlElement(name = "animateColor", type = SvgAnimateColor.class),
        @XmlElement(name = "animateTransform", type = SvgAnimateTransform.class),
        @XmlElement(name = "svg", type = SvgGraphic.class),
        @XmlElement(name = "g", type = SvgGroup.class),
        @XmlElement(name = "defs", type = SvgDefs.class),
        @XmlElement(name = "symbol", type = SvgSymbol.class),
        @XmlElement(name = "use", type = SvgUse.class),
        @XmlElement(name = "switch", type = SvgSwitch.class),
        @XmlElement(name = "image", type = SvgImage.class),
        @XmlElement(name = "style", type = SvgStyle.class),
        @XmlElement(name = "path", type = SvgPath.class),
        @XmlElement(name = "rect", type = SvgRectangle.class),
        @XmlElement(name = "circle", type = SvgCircle.class),
        @XmlElement(name = "line", type = SvgLine.class),
        @XmlElement(name = "ellipse", type = SvgEllipse.class),
        @XmlElement(name = "polyline", type = SvgPolyline.class),
        @XmlElement(name = "polygon", type = SvgPolygon.class),
        @XmlElement(name = "text", type = SvgText.class),
        @XmlElement(name = "altGlyphDef", type = AltGlyphDef.class),
        @XmlElement(name = "marker", type = SvgMarker.class),
        @XmlElement(name = "color-profile", type = SvgColorProfile.class),
        @XmlElement(name = "linearGradient", type = SvgLinearGradient.class),
        @XmlElement(name = "radialGradient", type = SvgRadialGradient.class),
        @XmlElement(name = "pattern", type = SvgPattern.class),
        @XmlElement(name = "clipPath", type = SvgClipPath.class),
        @XmlElement(name = "mask", type = SvgMask.class),
        @XmlElement(name = "filter", type = Filter.class),
        @XmlElement(name = "cursor", type = SvgCursor.class),
        @XmlElement(name = "a", type = SvgAnchor.class),
        @XmlElement(name = "view", type = SvgView.class),
        @XmlElement(name = "script", type = SvgScript.class),
        @XmlElement(name = "font", type = Font.class),
        @XmlElement(name = "font-face", type = FontFace.class),
        @XmlElement(name = "foreignObject", type = SvgForeignObject.class)
    })
    protected List<Object> descOrTitleOrMetadataOrAnimateOrSetOrAnimateMotionOrAnimateColorOrAnimateTransformOrSvgOrGOrDefsOrSymbolOrUseOrSwitchOrImageOrStyleOrPathOrRectOrCircleOrLineOrEllipseOrPolylineOrPolygonOrTextOrAltGlyphDefOrMarkerOrColorProfileOrLinearGradientOrRadialGradientOrPatternOrClipPathOrMaskOrFilterOrCursorOrAOrViewOrScriptOrFontOrFontFaceOrForeignObject;

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
     * Gets the value of the style property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the clazz property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the enableBackground property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEnableBackground() {
        return enableBackground;
    }

    /**
     * Sets the value of the enableBackground property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEnableBackground(String value) {
        this.enableBackground = value;
    }

    /**
     * Gets the value of the clip property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClip() {
        return clip;
    }

    /**
     * Sets the value of the clip property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClip(String value) {
        this.clip = value;
    }

    /**
     * Gets the value of the overflow property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOverflow() {
        return overflow;
    }

    /**
     * Sets the value of the overflow property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOverflow(String value) {
        this.overflow = value;
    }

    /**
     * Gets the value of the writingMode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWritingMode() {
        return writingMode;
    }

    /**
     * Sets the value of the writingMode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWritingMode(String value) {
        this.writingMode = value;
    }

    /**
     * Gets the value of the alignmentBaseline property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAlignmentBaseline() {
        return alignmentBaseline;
    }

    /**
     * Sets the value of the alignmentBaseline property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAlignmentBaseline(String value) {
        this.alignmentBaseline = value;
    }

    /**
     * Gets the value of the baselineShift property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBaselineShift() {
        return baselineShift;
    }

    /**
     * Sets the value of the baselineShift property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBaselineShift(String value) {
        this.baselineShift = value;
    }

    /**
     * Gets the value of the direction property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the dominantBaseline property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDominantBaseline() {
        return dominantBaseline;
    }

    /**
     * Sets the value of the dominantBaseline property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDominantBaseline(String value) {
        this.dominantBaseline = value;
    }

    /**
     * Gets the value of the glyphOrientationHorizontal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGlyphOrientationHorizontal() {
        return glyphOrientationHorizontal;
    }

    /**
     * Sets the value of the glyphOrientationHorizontal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGlyphOrientationHorizontal(String value) {
        this.glyphOrientationHorizontal = value;
    }

    /**
     * Gets the value of the glyphOrientationVertical property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGlyphOrientationVertical() {
        return glyphOrientationVertical;
    }

    /**
     * Sets the value of the glyphOrientationVertical property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGlyphOrientationVertical(String value) {
        this.glyphOrientationVertical = value;
    }

    /**
     * Gets the value of the kerning property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKerning() {
        return kerning;
    }

    /**
     * Sets the value of the kerning property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKerning(String value) {
        this.kerning = value;
    }

    /**
     * Gets the value of the letterSpacing property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLetterSpacing() {
        return letterSpacing;
    }

    /**
     * Sets the value of the letterSpacing property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLetterSpacing(String value) {
        this.letterSpacing = value;
    }

    /**
     * Gets the value of the textAnchor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextAnchor() {
        return textAnchor;
    }

    /**
     * Sets the value of the textAnchor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextAnchor(String value) {
        this.textAnchor = value;
    }

    /**
     * Gets the value of the textDecoration property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextDecoration() {
        return textDecoration;
    }

    /**
     * Sets the value of the textDecoration property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextDecoration(String value) {
        this.textDecoration = value;
    }

    /**
     * Gets the value of the unicodeBidi property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnicodeBidi() {
        return unicodeBidi;
    }

    /**
     * Sets the value of the unicodeBidi property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnicodeBidi(String value) {
        this.unicodeBidi = value;
    }

    /**
     * Gets the value of the wordSpacing property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWordSpacing() {
        return wordSpacing;
    }

    /**
     * Sets the value of the wordSpacing property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWordSpacing(String value) {
        this.wordSpacing = value;
    }

    /**
     * Gets the value of the fontFamily property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontSize property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontSizeAdjust property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFontSizeAdjust() {
        return fontSizeAdjust;
    }

    /**
     * Sets the value of the fontSizeAdjust property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFontSizeAdjust(String value) {
        this.fontSizeAdjust = value;
    }

    /**
     * Gets the value of the fontStretch property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFontStretch() {
        return fontStretch;
    }

    /**
     * Sets the value of the fontStretch property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFontStretch(String value) {
        this.fontStretch = value;
    }

    /**
     * Gets the value of the fontStyle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFontStyle() {
        return fontStyle;
    }

    /**
     * Sets the value of the fontStyle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFontStyle(String value) {
        this.fontStyle = value;
    }

    /**
     * Gets the value of the fontVariant property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFontVariant() {
        return fontVariant;
    }

    /**
     * Sets the value of the fontVariant property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFontVariant(String value) {
        this.fontVariant = value;
    }

    /**
     * Gets the value of the fontWeight property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFontWeight() {
        return fontWeight;
    }

    /**
     * Sets the value of the fontWeight property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFontWeight(String value) {
        this.fontWeight = value;
    }

    /**
     * Gets the value of the fill property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFill(String value) {
        this.fill = value;
    }

    /**
     * Gets the value of the fillRule property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFillRule() {
        return fillRule;
    }

    /**
     * Sets the value of the fillRule property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFillRule(String value) {
        this.fillRule = value;
    }

    /**
     * Gets the value of the stroke property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStroke() {
        return stroke;
    }

    /**
     * Sets the value of the stroke property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStroke(String value) {
        this.stroke = value;
    }

    /**
     * Gets the value of the strokeDasharray property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrokeDasharray() {
        return strokeDasharray;
    }

    /**
     * Sets the value of the strokeDasharray property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrokeDasharray(String value) {
        this.strokeDasharray = value;
    }

    /**
     * Gets the value of the strokeDashoffset property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrokeDashoffset() {
        return strokeDashoffset;
    }

    /**
     * Sets the value of the strokeDashoffset property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrokeDashoffset(String value) {
        this.strokeDashoffset = value;
    }

    /**
     * Gets the value of the strokeLinecap property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrokeLinecap() {
        return strokeLinecap;
    }

    /**
     * Sets the value of the strokeLinecap property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrokeLinecap(String value) {
        this.strokeLinecap = value;
    }

    /**
     * Gets the value of the strokeLinejoin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrokeLinejoin() {
        return strokeLinejoin;
    }

    /**
     * Sets the value of the strokeLinejoin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrokeLinejoin(String value) {
        this.strokeLinejoin = value;
    }

    /**
     * Gets the value of the strokeMiterlimit property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrokeMiterlimit() {
        return strokeMiterlimit;
    }

    /**
     * Sets the value of the strokeMiterlimit property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrokeMiterlimit(String value) {
        this.strokeMiterlimit = value;
    }

    /**
     * Gets the value of the strokeWidth property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrokeWidth() {
        return strokeWidth;
    }

    /**
     * Sets the value of the strokeWidth property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrokeWidth(String value) {
        this.strokeWidth = value;
    }

    /**
     * Gets the value of the color property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the colorInterpolation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColorInterpolation() {
        return colorInterpolation;
    }

    /**
     * Sets the value of the colorInterpolation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColorInterpolation(String value) {
        this.colorInterpolation = value;
    }

    /**
     * Gets the value of the colorRendering property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColorRendering() {
        return colorRendering;
    }

    /**
     * Sets the value of the colorRendering property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColorRendering(String value) {
        this.colorRendering = value;
    }

    /**
     * Gets the value of the opacity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOpacity() {
        return opacity;
    }

    /**
     * Sets the value of the opacity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOpacity(String value) {
        this.opacity = value;
    }

    /**
     * Gets the value of the fillOpacity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFillOpacity() {
        return fillOpacity;
    }

    /**
     * Sets the value of the fillOpacity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFillOpacity(String value) {
        this.fillOpacity = value;
    }

    /**
     * Gets the value of the strokeOpacity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrokeOpacity() {
        return strokeOpacity;
    }

    /**
     * Sets the value of the strokeOpacity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrokeOpacity(String value) {
        this.strokeOpacity = value;
    }

    /**
     * Gets the value of the display property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisplay(String value) {
        this.display = value;
    }

    /**
     * Gets the value of the imageRendering property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImageRendering() {
        return imageRendering;
    }

    /**
     * Sets the value of the imageRendering property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImageRendering(String value) {
        this.imageRendering = value;
    }

    /**
     * Gets the value of the pointerEvents property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPointerEvents() {
        return pointerEvents;
    }

    /**
     * Sets the value of the pointerEvents property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPointerEvents(String value) {
        this.pointerEvents = value;
    }

    /**
     * Gets the value of the shapeRendering property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShapeRendering() {
        return shapeRendering;
    }

    /**
     * Sets the value of the shapeRendering property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShapeRendering(String value) {
        this.shapeRendering = value;
    }

    /**
     * Gets the value of the textRendering property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextRendering() {
        return textRendering;
    }

    /**
     * Sets the value of the textRendering property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextRendering(String value) {
        this.textRendering = value;
    }

    /**
     * Gets the value of the visibility property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the markerStart property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarkerStart() {
        return markerStart;
    }

    /**
     * Sets the value of the markerStart property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarkerStart(String value) {
        this.markerStart = value;
    }

    /**
     * Gets the value of the markerMid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarkerMid() {
        return markerMid;
    }

    /**
     * Sets the value of the markerMid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarkerMid(String value) {
        this.markerMid = value;
    }

    /**
     * Gets the value of the markerEnd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarkerEnd() {
        return markerEnd;
    }

    /**
     * Sets the value of the markerEnd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarkerEnd(String value) {
        this.markerEnd = value;
    }

    /**
     * Gets the value of the colorProfile property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColorProfile() {
        return colorProfile;
    }

    /**
     * Sets the value of the colorProfile property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColorProfile(String value) {
        this.colorProfile = value;
    }

    /**
     * Gets the value of the stopColor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStopColor() {
        return stopColor;
    }

    /**
     * Sets the value of the stopColor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStopColor(String value) {
        this.stopColor = value;
    }

    /**
     * Gets the value of the stopOpacity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStopOpacity() {
        return stopOpacity;
    }

    /**
     * Sets the value of the stopOpacity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStopOpacity(String value) {
        this.stopOpacity = value;
    }

    /**
     * Gets the value of the clipPath property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClipPath() {
        return clipPath;
    }

    /**
     * Sets the value of the clipPath property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClipPath(String value) {
        this.clipPath = value;
    }

    /**
     * Gets the value of the clipRule property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClipRule() {
        return clipRule;
    }

    /**
     * Sets the value of the clipRule property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClipRule(String value) {
        this.clipRule = value;
    }

    /**
     * Gets the value of the mask property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Gets the value of the filter property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    /**
     * Gets the value of the colorInterpolationFilters property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getColorInterpolationFilters() {
        return colorInterpolationFilters;
    }

    /**
     * Sets the value of the colorInterpolationFilters property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setColorInterpolationFilters(String value) {
        this.colorInterpolationFilters = value;
    }

    /**
     * Gets the value of the cursor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * Sets the value of the cursor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCursor(String value) {
        this.cursor = value;
    }

    /**
     * Gets the value of the floodColor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFloodColor() {
        return floodColor;
    }

    /**
     * Sets the value of the floodColor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFloodColor(String value) {
        this.floodColor = value;
    }

    /**
     * Gets the value of the floodOpacity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFloodOpacity() {
        return floodOpacity;
    }

    /**
     * Sets the value of the floodOpacity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFloodOpacity(String value) {
        this.floodOpacity = value;
    }

    /**
     * Gets the value of the lightingColor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLightingColor() {
        return lightingColor;
    }

    /**
     * Sets the value of the lightingColor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLightingColor(String value) {
        this.lightingColor = value;
    }

    /**
     * Gets the value of the unicode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnicode() {
        return unicode;
    }

    /**
     * Sets the value of the unicode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnicode(String value) {
        this.unicode = value;
    }

    /**
     * Gets the value of the glyphName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGlyphName() {
        return glyphName;
    }

    /**
     * Sets the value of the glyphName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGlyphName(String value) {
        this.glyphName = value;
    }

    /**
     * Gets the value of the d property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setD(String value) {
        this.d = value;
    }

    /**
     * Gets the value of the orientation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the arabicForm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArabicForm() {
        return arabicForm;
    }

    /**
     * Sets the value of the arabicForm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArabicForm(String value) {
        this.arabicForm = value;
    }

    /**
     * Gets the value of the lang property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the horizAdvX property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHorizAdvX() {
        return horizAdvX;
    }

    /**
     * Sets the value of the horizAdvX property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHorizAdvX(String value) {
        this.horizAdvX = value;
    }

    /**
     * Gets the value of the vertOriginX property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVertOriginX() {
        return vertOriginX;
    }

    /**
     * Sets the value of the vertOriginX property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVertOriginX(String value) {
        this.vertOriginX = value;
    }

    /**
     * Gets the value of the vertOriginY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVertOriginY() {
        return vertOriginY;
    }

    /**
     * Sets the value of the vertOriginY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVertOriginY(String value) {
        this.vertOriginY = value;
    }

    /**
     * Gets the value of the vertAdvY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVertAdvY() {
        return vertAdvY;
    }

    /**
     * Sets the value of the vertAdvY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVertAdvY(String value) {
        this.vertAdvY = value;
    }

    /**
     * Gets the value of the descOrTitleOrMetadataOrAnimateOrSetOrAnimateMotionOrAnimateColorOrAnimateTransformOrSvgOrGOrDefsOrSymbolOrUseOrSwitchOrImageOrStyleOrPathOrRectOrCircleOrLineOrEllipseOrPolylineOrPolygonOrTextOrAltGlyphDefOrMarkerOrColorProfileOrLinearGradientOrRadialGradientOrPatternOrClipPathOrMaskOrFilterOrCursorOrAOrViewOrScriptOrFontOrFontFaceOrForeignObject property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descOrTitleOrMetadataOrAnimateOrSetOrAnimateMotionOrAnimateColorOrAnimateTransformOrSvgOrGOrDefsOrSymbolOrUseOrSwitchOrImageOrStyleOrPathOrRectOrCircleOrLineOrEllipseOrPolylineOrPolygonOrTextOrAltGlyphDefOrMarkerOrColorProfileOrLinearGradientOrRadialGradientOrPatternOrClipPathOrMaskOrFilterOrCursorOrAOrViewOrScriptOrFontOrFontFaceOrForeignObject property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescOrTitleOrMetadataOrAnimateOrSetOrAnimateMotionOrAnimateColorOrAnimateTransformOrSvgOrGOrDefsOrSymbolOrUseOrSwitchOrImageOrStyleOrPathOrRectOrCircleOrLineOrEllipseOrPolylineOrPolygonOrTextOrAltGlyphDefOrMarkerOrColorProfileOrLinearGradientOrRadialGradientOrPatternOrClipPathOrMaskOrFilterOrCursorOrAOrViewOrScriptOrFontOrFontFaceOrForeignObject().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvgDescription }
     * {@link SvgTitle }
     * {@link SvgMetadata }
     * {@link SvgAnimate }
     * {@link SvgSet }
     * {@link SvgAnimateMotion }
     * {@link SvgAnimateColor }
     * {@link SvgAnimateTransform }
     * {@link SvgGraphic }
     * {@link SvgGroup }
     * {@link SvgDefs }
     * {@link SvgSymbol }
     * {@link SvgUse }
     * {@link SvgSwitch }
     * {@link SvgImage }
     * {@link SvgStyle }
     * {@link SvgPath }
     * {@link SvgRectangle }
     * {@link SvgCircle }
     * {@link SvgLine }
     * {@link SvgEllipse }
     * {@link SvgPolyline }
     * {@link SvgPolygon }
     * {@link SvgText }
     * {@link AltGlyphDef }
     * {@link SvgMarker }
     * {@link SvgColorProfile }
     * {@link SvgLinearGradient }
     * {@link SvgRadialGradient }
     * {@link SvgPattern }
     * {@link SvgClipPath }
     * {@link SvgMask }
     * {@link Filter }
     * {@link SvgCursor }
     * {@link SvgAnchor }
     * {@link SvgView }
     * {@link SvgScript }
     * {@link Font }
     * {@link FontFace }
     * {@link SvgForeignObject }
     *
     *
     */
    public List<Object> getDescOrTitleOrMetadatanchorOrAnimateOrSetOrAnimateMotionOrAnimateColorOrAnimateTransformOrSvsvgRootElementGroupOrGOrDefsOrSymbolOrUseOrSwitchOrImageOrStyleOrSvgPathOrSvgRectangleOrSvgCircleOrSvgLineOrSvgEllipseOrSvgPolylineOrSvgPolygonOrSvgTextOrAltGlyphDefOrMarkerOrColorProfileOrLinearGradientOrRadialGradientOrPatternOrClipPathOrMaskOrFilterOrCursorOrAOrViewOrScriptOrFontOrFontFaceOrForeignObject() {
        if (descOrTitleOrMetadataOrAnimateOrSetOrAnimateMotionOrAnimateColorOrAnimateTransformOrSvgOrGOrDefsOrSymbolOrUseOrSwitchOrImageOrStyleOrPathOrRectOrCircleOrLineOrEllipseOrPolylineOrPolygonOrTextOrAltGlyphDefOrMarkerOrColorProfileOrLinearGradientOrRadialGradientOrPatternOrClipPathOrMaskOrFilterOrCursorOrAOrViewOrScriptOrFontOrFontFaceOrForeignObject == null) {
            descOrTitleOrMetadataOrAnimateOrSetOrAnimateMotionOrAnimateColorOrAnimateTransformOrSvgOrGOrDefsOrSymbolOrUseOrSwitchOrImageOrStyleOrPathOrRectOrCircleOrLineOrEllipseOrPolylineOrPolygonOrTextOrAltGlyphDefOrMarkerOrColorProfileOrLinearGradientOrRadialGradientOrPatternOrClipPathOrMaskOrFilterOrCursorOrAOrViewOrScriptOrFontOrFontFaceOrForeignObject = new ArrayList<Object>();
        }
        return this.descOrTitleOrMetadataOrAnimateOrSetOrAnimateMotionOrAnimateColorOrAnimateTransformOrSvgOrGOrDefsOrSymbolOrUseOrSwitchOrImageOrStyleOrPathOrRectOrCircleOrLineOrEllipseOrPolylineOrPolygonOrTextOrAltGlyphDefOrMarkerOrColorProfileOrLinearGradientOrRadialGradientOrPatternOrClipPathOrMaskOrFilterOrCursorOrAOrViewOrScriptOrFontOrFontFaceOrForeignObject;
    }

}
