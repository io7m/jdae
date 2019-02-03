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
 * <p>Java class for fx_sampler_wrap_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="fx_sampler_wrap_enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="WRAP"/&gt;
 *     &lt;enumeration value="CLAMP"/&gt;
 *     &lt;enumeration value="BORDER"/&gt;
 *     &lt;enumeration value="MIRROR"/&gt;
 *     &lt;enumeration value="MIRROR_ONCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "fx_sampler_wrap_enum")
@XmlEnum
public enum FxSamplerWrapEnum {


    /**
     * Tile the texture at every integer junction. For example, for u values between 0 and 3, the texture is repeated three times; no mirroring is performed
     * 
     */
    WRAP,

    /**
     * Same as CLAMP_TO_EDGE.  Texture coordinates reaching or exceeding the range [0.0, 1.0] are set just within 0.0 or 1.0 so that the boarder is not sampled
     * 
     */
    CLAMP,

    /**
     * Much like clamp except texture coordinates outside the range [0.0, 1.0] are set to the border color
     * 
     */
    BORDER,

    /**
     * texture is flipped at every integer junction. For u values between 0 and 1, for example, the texture is addressed normally; between 1 and 2, the texture is flipped (mirrored); between 2 and 3, the texture is normal again; and so on. 
     * 
     * 
     */
    MIRROR,

    /**
     * Takes the absolute value of the texture coordinate (thus, mirroring around 0), and then clamps to the maximum value
     * 
     */
    MIRROR_ONCE;

    public String value() {
        return name();
    }

    public static FxSamplerWrapEnum fromValue(String v) {
        return valueOf(v);
    }

}
