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
 * <p>Java class for gles_sampler_wrap.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="gles_sampler_wrap"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="REPEAT"/&gt;
 *     &lt;enumeration value="CLAMP"/&gt;
 *     &lt;enumeration value="CLAMP_TO_EDGE"/&gt;
 *     &lt;enumeration value="MIRRORED_REPEAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "gles_sampler_wrap")
@XmlEnum
public enum GlesSamplerWrap {

    REPEAT,
    CLAMP,
    CLAMP_TO_EDGE,

    /**
     * 
     * 					supported by GLES 1.1 only
     * 					
     * 
     */
    MIRRORED_REPEAT;

    public String value() {
        return name();
    }

    public static GlesSamplerWrap fromValue(String v) {
        return valueOf(v);
    }

}
