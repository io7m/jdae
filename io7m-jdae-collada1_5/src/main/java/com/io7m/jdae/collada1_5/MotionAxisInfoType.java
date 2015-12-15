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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for motion_axis_info_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="motion_axis_info_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bind" type="{http://www.collada.org/2008/03/COLLADASchema}kinematics_bind_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="newparam" type="{http://www.collada.org/2008/03/COLLADASchema}kinematics_newparam_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="setparam" type="{http://www.collada.org/2008/03/COLLADASchema}kinematics_setparam_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="speed" type="{http://www.collada.org/2008/03/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *         &lt;element name="acceleration" type="{http://www.collada.org/2008/03/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *         &lt;element name="deceleration" type="{http://www.collada.org/2008/03/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *         &lt;element name="jerk" type="{http://www.collada.org/2008/03/COLLADASchema}common_float_or_param_type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sid" type="{http://www.collada.org/2008/03/COLLADASchema}sid_type" />
 *       &lt;attribute name="axis" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motion_axis_info_type", propOrder = {
    "bind",
    "newparam",
    "setparam",
    "speed",
    "acceleration",
    "deceleration",
    "jerk"
})
public class MotionAxisInfoType {

    protected List<KinematicsBindType> bind;
    protected List<KinematicsNewparamType> newparam;
    protected List<KinematicsSetparamType> setparam;
    protected CommonFloatOrParamType speed;
    protected CommonFloatOrParamType acceleration;
    protected CommonFloatOrParamType deceleration;
    protected CommonFloatOrParamType jerk;
    @XmlAttribute(name = "sid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sid;
    @XmlAttribute(name = "axis", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String axis;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Gets the value of the bind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KinematicsBindType }
     * 
     * 
     */
    public List<KinematicsBindType> getBind() {
        if (bind == null) {
            bind = new ArrayList<KinematicsBindType>();
        }
        return this.bind;
    }

    /**
     * Gets the value of the newparam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newparam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewparam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KinematicsNewparamType }
     * 
     * 
     */
    public List<KinematicsNewparamType> getNewparam() {
        if (newparam == null) {
            newparam = new ArrayList<KinematicsNewparamType>();
        }
        return this.newparam;
    }

    /**
     * Gets the value of the setparam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setparam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetparam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KinematicsSetparamType }
     * 
     * 
     */
    public List<KinematicsSetparamType> getSetparam() {
        if (setparam == null) {
            setparam = new ArrayList<KinematicsSetparamType>();
        }
        return this.setparam;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link CommonFloatOrParamType }
     *     
     */
    public CommonFloatOrParamType getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonFloatOrParamType }
     *     
     */
    public void setSpeed(CommonFloatOrParamType value) {
        this.speed = value;
    }

    /**
     * Gets the value of the acceleration property.
     * 
     * @return
     *     possible object is
     *     {@link CommonFloatOrParamType }
     *     
     */
    public CommonFloatOrParamType getAcceleration() {
        return acceleration;
    }

    /**
     * Sets the value of the acceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonFloatOrParamType }
     *     
     */
    public void setAcceleration(CommonFloatOrParamType value) {
        this.acceleration = value;
    }

    /**
     * Gets the value of the deceleration property.
     * 
     * @return
     *     possible object is
     *     {@link CommonFloatOrParamType }
     *     
     */
    public CommonFloatOrParamType getDeceleration() {
        return deceleration;
    }

    /**
     * Sets the value of the deceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonFloatOrParamType }
     *     
     */
    public void setDeceleration(CommonFloatOrParamType value) {
        this.deceleration = value;
    }

    /**
     * Gets the value of the jerk property.
     * 
     * @return
     *     possible object is
     *     {@link CommonFloatOrParamType }
     *     
     */
    public CommonFloatOrParamType getJerk() {
        return jerk;
    }

    /**
     * Sets the value of the jerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonFloatOrParamType }
     *     
     */
    public void setJerk(CommonFloatOrParamType value) {
        this.jerk = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSid(String value) {
        this.sid = value;
    }

    /**
     * Gets the value of the axis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxis() {
        return axis;
    }

    /**
     * Sets the value of the axis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxis(String value) {
        this.axis = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}