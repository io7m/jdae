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
 * 
 * 			Defines the RGB portion of a texture_pipeline command. This is a combiner-mode texturing operation.
 * 			
 * 
 * <p>Java class for gles_texcombiner_command_rgb_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gles_texcombiner_command_rgb_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="argument" type="{http://www.collada.org/2008/03/COLLADASchema}gles_texcombiner_argument_rgb_type" maxOccurs="3"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" type="{http://www.collada.org/2008/03/COLLADASchema}gles_texcombiner_operator_rgb_enum" />
 *       &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gles_texcombiner_command_rgb_type", propOrder = {
    "argument"
})
public class GlesTexcombinerCommandRgbType {

    @XmlElement(required = true)
    protected List<GlesTexcombinerArgumentRgbType> argument;
    @XmlAttribute(name = "operator")
    protected GlesTexcombinerOperatorRgbEnum operator;
    @XmlAttribute(name = "scale")
    protected Float scale;

    /**
     * Gets the value of the argument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the argument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlesTexcombinerArgumentRgbType }
     * 
     * 
     */
    public List<GlesTexcombinerArgumentRgbType> getArgument() {
        if (argument == null) {
            argument = new ArrayList<GlesTexcombinerArgumentRgbType>();
        }
        return this.argument;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link GlesTexcombinerOperatorRgbEnum }
     *     
     */
    public GlesTexcombinerOperatorRgbEnum getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlesTexcombinerOperatorRgbEnum }
     *     
     */
    public void setOperator(GlesTexcombinerOperatorRgbEnum value) {
        this.operator = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setScale(Float value) {
        this.scale = value;
    }

}
