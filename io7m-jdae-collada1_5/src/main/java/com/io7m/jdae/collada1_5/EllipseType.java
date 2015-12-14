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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *      Describes an ellipse in 3D space. An ellipse is defined     by its major and minor radii and, as with any conic     curve, is positioned in space with a right-handed     coordinate system where: - the origin is the center of     the ellipse, - the "X Direction" defines the     major axis, and - the "Y Direction" defines     the minor axis. The origin, "X Direction" and     "Y Direction" of this coordinate system define     the plane of the ellipse. The coordinate system is the     local coordinate system of the ellipse. The "main     Direction" of this coordinate system is the vector     normal to the plane of the ellipse. The axis, of which     the origin and unit vector are respectively the origin     and "main Direction" of the local coordinate     system, is termed the "Axis" or "main     Axis" of the ellipse. The "main     Direction" of the local coordinate system gives an     explicit orientation to the ellipse (definition of the     trigonometric sense), determining the direction in which     the parameter increases along the ellipse. The     Geom_Ellipse ellipse is parameterized by an angle: P(U)     = O + MajorRad*Cos(U)*XDir + MinorRad*Sin(U)*YDir where:     - P is the point of parameter U, - O, XDir and YDir are     respectively the origin, "X <br>     Direction" and "Y Direction" of its local     coordinate system, - MajorRad and MinorRad are the major     and minor radii of the ellipse. The "X Axis"     of the local coordinate system therefore defines the     origin of the parameter of the ellipse. An ellipse is a     closed and periodic curve. The period is 2.*Pi and the     parameter range is [ 0, 2.*Pi [.    
 * 
 * <p>Java class for ellipse_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ellipse_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="radius" type="{http://www.collada.org/2008/03/COLLADASchema}float2_type"/>
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
@XmlType(name = "ellipse_type", propOrder = {
    "radius",
    "extra"
})
public class EllipseType {

    @XmlList
    @XmlElement(type = Double.class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<Double> radius;
    protected List<ExtraType> extra;

    /**
     * Gets the value of the radius property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radius property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadius().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getRadius() {
        if (radius == null) {
            radius = new ArrayList<Double>();
        }
        return this.radius;
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
