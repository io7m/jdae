//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.14 at 09:32:10 PM UTC 
//


package com.io7m.jdae.collada1_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gles_texcombiner_operatorRGB_enums.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="gles_texcombiner_operatorRGB_enums"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="REPLACE"/&gt;
 *     &lt;enumeration value="MODULATE"/&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="ADD_SIGNED"/&gt;
 *     &lt;enumeration value="INTERPOLATE"/&gt;
 *     &lt;enumeration value="SUBTRACT"/&gt;
 *     &lt;enumeration value="DOT3_RGB"/&gt;
 *     &lt;enumeration value="DOT3_RGBA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "gles_texcombiner_operatorRGB_enums")
@XmlEnum
public enum GlesTexcombinerOperatorRGBEnums {

    REPLACE("REPLACE"),
    MODULATE("MODULATE"),
    ADD("ADD"),
    ADD_SIGNED("ADD_SIGNED"),
    INTERPOLATE("INTERPOLATE"),
    SUBTRACT("SUBTRACT"),
    @XmlEnumValue("DOT3_RGB")
    DOT_3_RGB("DOT3_RGB"),
    @XmlEnumValue("DOT3_RGBA")
    DOT_3_RGBA("DOT3_RGBA");
    private final String value;

    GlesTexcombinerOperatorRGBEnums(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlesTexcombinerOperatorRGBEnums fromValue(String v) {
        for (GlesTexcombinerOperatorRGBEnums c: GlesTexcombinerOperatorRGBEnums.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
