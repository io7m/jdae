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
import com.io7m.jdae.collada1_5.mathml.MathType;


/**
 * <p>Java class for formula_technique_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formula_technique_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formula_technique_type", propOrder = {
    "math"
})
public class FormulaTechniqueType {

    @XmlElement(namespace = "http://www.w3.org/1998/Math/MathML", required = true)
    protected MathType math;

    /**
     * Gets the value of the math property.
     * 
     * @return
     *     possible object is
     *     {@link MathType }
     *     
     */
    public MathType getMath() {
        return math;
    }

    /**
     * Sets the value of the math property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathType }
     *     
     */
    public void setMath(MathType value) {
        this.math = value;
    }

}
