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
 * <p>Java class for gl_func_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="gl_func_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEVER"/&gt;
 *     &lt;enumeration value="LESS"/&gt;
 *     &lt;enumeration value="LEQUAL"/&gt;
 *     &lt;enumeration value="EQUAL"/&gt;
 *     &lt;enumeration value="GREATER"/&gt;
 *     &lt;enumeration value="NOTEQUAL"/&gt;
 *     &lt;enumeration value="GEQUAL"/&gt;
 *     &lt;enumeration value="ALWAYS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "gl_func_type")
@XmlEnum
public enum GlFuncType {

    NEVER,
    LESS,
    LEQUAL,
    EQUAL,
    GREATER,
    NOTEQUAL,
    GEQUAL,
    ALWAYS;

    public String value() {
        return name();
    }

    public static GlFuncType fromValue(String v) {
        return valueOf(v);
    }

}
