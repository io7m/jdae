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
 * <p>Java class for gl_stencil_op_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="gl_stencil_op_enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="KEEP"/&gt;
 *     &lt;enumeration value="ZERO"/&gt;
 *     &lt;enumeration value="REPLACE"/&gt;
 *     &lt;enumeration value="INCR"/&gt;
 *     &lt;enumeration value="DECR"/&gt;
 *     &lt;enumeration value="INVERT"/&gt;
 *     &lt;enumeration value="INCR_WRAP"/&gt;
 *     &lt;enumeration value="DECR_WRAP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "gl_stencil_op_enum")
@XmlEnum
public enum GlStencilOpEnum {

    KEEP,
    ZERO,
    REPLACE,
    INCR,
    DECR,
    INVERT,
    INCR_WRAP,
    DECR_WRAP;

    public String value() {
        return name();
    }

    public static GlStencilOpEnum fromValue(String v) {
        return valueOf(v);
    }

}
