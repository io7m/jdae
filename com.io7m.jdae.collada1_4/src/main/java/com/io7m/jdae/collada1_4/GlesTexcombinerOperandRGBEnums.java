//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.14 at 09:32:10 PM UTC 
//


package com.io7m.jdae.collada1_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gles_texcombiner_operandRGB_enums.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="gles_texcombiner_operandRGB_enums"&gt;
 *   &lt;restriction base="{http://www.collada.org/2005/11/COLLADASchema}gl_blend_type"&gt;
 *     &lt;enumeration value="SRC_COLOR"/&gt;
 *     &lt;enumeration value="ONE_MINUS_SRC_COLOR"/&gt;
 *     &lt;enumeration value="SRC_ALPHA"/&gt;
 *     &lt;enumeration value="ONE_MINUS_SRC_ALPHA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "gles_texcombiner_operandRGB_enums")
@XmlEnum(GlBlendType.class)
public enum GlesTexcombinerOperandRGBEnums {

    SRC_COLOR,
    ONE_MINUS_SRC_COLOR,
    SRC_ALPHA,
    ONE_MINUS_SRC_ALPHA;

    public String value() {
        return name();
    }

    public static GlesTexcombinerOperandRGBEnums fromValue(String v) {
        return valueOf(v);
    }

}
