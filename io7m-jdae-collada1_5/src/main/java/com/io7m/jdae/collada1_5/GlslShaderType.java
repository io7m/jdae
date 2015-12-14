//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.14 at 09:36:22 PM UTC 
//


package com.io7m.jdae.collada1_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identify code fragments and bind their parameters to effect parameters to identify how their values will be filled in
 * 
 * <p>Java class for glsl_shader_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="glsl_shader_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sources" type="{http://www.collada.org/2008/03/COLLADASchema}fx_sources_type"/>
 *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="stage" use="required" type="{http://www.collada.org/2008/03/COLLADASchema}fx_pipeline_stage_enum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "glsl_shader_type", propOrder = {
    "sources",
    "extra"
})
public class GlslShaderType {

    @XmlElement(required = true)
    protected FxSourcesType sources;
    protected List<ExtraType> extra;
    @XmlAttribute(name = "stage", required = true)
    protected FxPipelineStageEnum stage;

    /**
     * Gets the value of the sources property.
     * 
     * @return
     *     possible object is
     *     {@link FxSourcesType }
     *     
     */
    public FxSourcesType getSources() {
        return sources;
    }

    /**
     * Sets the value of the sources property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxSourcesType }
     *     
     */
    public void setSources(FxSourcesType value) {
        this.sources = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraType }
     * 
     * 
     */
    public List<ExtraType> getExtra() {
        if (extra == null) {
            extra = new ArrayList<ExtraType>();
        }
        return this.extra;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link FxPipelineStageEnum }
     *     
     */
    public FxPipelineStageEnum getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxPipelineStageEnum }
     *     
     */
    public void setStage(FxPipelineStageEnum value) {
        this.stage = value;
    }

}
