//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.14 at 09:36:22 PM UTC 
//


package com.io7m.jdae.collada1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gles_texcombiner_command_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gles_texcombiner_command_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constant" type="{http://www.collada.org/2008/03/COLLADASchema}gles_texture_constant_type" minOccurs="0"/>
 *         &lt;element name="RGB" type="{http://www.collada.org/2008/03/COLLADASchema}gles_texcombiner_command_rgb_type" minOccurs="0"/>
 *         &lt;element name="alpha" type="{http://www.collada.org/2008/03/COLLADASchema}gles_texcombiner_command_alpha_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gles_texcombiner_command_type", propOrder = {
    "constant",
    "rgb",
    "alpha"
})
public class GlesTexcombinerCommandType {

    protected GlesTextureConstantType constant;
    @XmlElement(name = "RGB")
    protected GlesTexcombinerCommandRgbType rgb;
    protected GlesTexcombinerCommandAlphaType alpha;

    /**
     * Gets the value of the constant property.
     * 
     * @return
     *     possible object is
     *     {@link GlesTextureConstantType }
     *     
     */
    public GlesTextureConstantType getConstant() {
        return constant;
    }

    /**
     * Sets the value of the constant property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlesTextureConstantType }
     *     
     */
    public void setConstant(GlesTextureConstantType value) {
        this.constant = value;
    }

    /**
     * Gets the value of the rgb property.
     * 
     * @return
     *     possible object is
     *     {@link GlesTexcombinerCommandRgbType }
     *     
     */
    public GlesTexcombinerCommandRgbType getRGB() {
        return rgb;
    }

    /**
     * Sets the value of the rgb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlesTexcombinerCommandRgbType }
     *     
     */
    public void setRGB(GlesTexcombinerCommandRgbType value) {
        this.rgb = value;
    }

    /**
     * Gets the value of the alpha property.
     * 
     * @return
     *     possible object is
     *     {@link GlesTexcombinerCommandAlphaType }
     *     
     */
    public GlesTexcombinerCommandAlphaType getAlpha() {
        return alpha;
    }

    /**
     * Sets the value of the alpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlesTexcombinerCommandAlphaType }
     *     
     */
    public void setAlpha(GlesTexcombinerCommandAlphaType value) {
        this.alpha = value;
    }

}
