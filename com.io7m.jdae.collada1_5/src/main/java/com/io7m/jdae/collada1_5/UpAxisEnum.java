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
 * <p>Java class for up_axis_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="up_axis_enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="X_UP"/&gt;
 *     &lt;enumeration value="Y_UP"/&gt;
 *     &lt;enumeration value="Z_UP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "up_axis_enum")
@XmlEnum
public enum UpAxisEnum {

    X_UP,
    Y_UP,
    Z_UP;

    public String value() {
        return name();
    }

    public static UpAxisEnum fromValue(String v) {
        return valueOf(v);
    }

}
