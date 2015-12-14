//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.14 at 09:36:22 PM UTC 
//


package com.io7m.jdae.collada1_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for image_format_hint_range_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="image_format_hint_range_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SNORM"/>
 *     &lt;enumeration value="UNORM"/>
 *     &lt;enumeration value="SINT"/>
 *     &lt;enumeration value="UINT"/>
 *     &lt;enumeration value="FLOAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "image_format_hint_range_enum")
@XmlEnum
public enum ImageFormatHintRangeEnum {


    /**
     * Format is representing a decimal value that remains within the -1 to 1 range. Implimentation could be integer-fixedpoint or floats.
     * 
     */
    SNORM,

    /**
     * Format is representing a decimal value that remains within the 0 to 1 range. Implimentation could be integer-fixedpoint or floats.
     * 
     */
    UNORM,

    /**
     * Format is representing signed integer numbers.  (ex. 8bits = -128 to 127)
     * 
     */
    SINT,

    /**
     * Format is representing unsigned integer numbers.  (ex. 8bits = 0 to 255)
     * 
     */
    UINT,

    /**
     * Format should support full floating point ranges.  High precision is expected to be 32bit. Mid precision may be 16 to 32 bit.  Low precision is expected to be 16 bit.
     * 
     */
    FLOAT;

    public String value() {
        return name();
    }

    public static ImageFormatHintRangeEnum fromValue(String v) {
        return valueOf(v);
    }

}
