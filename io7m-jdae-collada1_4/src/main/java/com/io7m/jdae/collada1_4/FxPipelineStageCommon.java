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
 * <p>Java class for fx_pipeline_stage_common.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fx_pipeline_stage_common">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VERTEXPROGRAM"/>
 *     &lt;enumeration value="FRAGMENTPROGRAM"/>
 *     &lt;enumeration value="VERTEXSHADER"/>
 *     &lt;enumeration value="PIXELSHADER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fx_pipeline_stage_common")
@XmlEnum
public enum FxPipelineStageCommon {

    VERTEXPROGRAM,
    FRAGMENTPROGRAM,
    VERTEXSHADER,
    PIXELSHADER;

    public String value() {
        return name();
    }

    public static FxPipelineStageCommon fromValue(String v) {
        return valueOf(v);
    }

}
