//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.14 at 09:36:22 PM UTC 
//


package com.io7m.jdae.collada1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for image_mips_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="image_mips_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="levels" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="auto_generate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "image_mips_type")
public class ImageMipsType {

    @XmlAttribute(name = "levels", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long levels;
    @XmlAttribute(name = "auto_generate", required = true)
    protected boolean autoGenerate;

    /**
     * Gets the value of the levels property.
     * 
     */
    public long getLevels() {
        return levels;
    }

    /**
     * Sets the value of the levels property.
     * 
     */
    public void setLevels(long value) {
        this.levels = value;
    }

    /**
     * Gets the value of the autoGenerate property.
     * 
     */
    public boolean isAutoGenerate() {
        return autoGenerate;
    }

    /**
     * Sets the value of the autoGenerate property.
     * 
     */
    public void setAutoGenerate(boolean value) {
        this.autoGenerate = value;
    }

}
