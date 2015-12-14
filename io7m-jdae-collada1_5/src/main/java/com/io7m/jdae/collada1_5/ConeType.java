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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cone_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cone_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="radius" type="{http://www.collada.org/2008/03/COLLADASchema}float_type"/>
 *         &lt;element name="angle" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cone_type", propOrder = {
    "radius",
    "angle",
    "extra"
})
public class ConeType {

    protected double radius;
    protected float angle;
    protected List<ExtraType> extra;

    /**
     * Gets the value of the radius property.
     * 
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     */
    public void setRadius(double value) {
        this.radius = value;
    }

    /**
     * Gets the value of the angle property.
     * 
     */
    public float getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     * 
     */
    public void setAngle(float value) {
        this.angle = value;
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

}
