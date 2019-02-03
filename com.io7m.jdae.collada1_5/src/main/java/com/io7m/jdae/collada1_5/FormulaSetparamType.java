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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for formula_setparam_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formula_setparam_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="float" type="{http://www.collada.org/2008/03/COLLADASchema}float_type"/&gt;
 *         &lt;element name="int" type="{http://www.collada.org/2008/03/COLLADASchema}int_type"/&gt;
 *         &lt;element name="SIDREF" type="{http://www.collada.org/2008/03/COLLADASchema}sidref_type"/&gt;
 *         &lt;element name="bool" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="connect_param" type="{http://www.collada.org/2008/03/COLLADASchema}kinematics_connect_param_type"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formula_setparam_type", propOrder = {
    "_float",
    "_int",
    "sidref",
    "bool",
    "connectParam"
})
public class FormulaSetparamType {

    @XmlElement(name = "float")
    protected Double _float;
    @XmlElement(name = "int")
    protected Long _int;
    @XmlElement(name = "SIDREF")
    protected String sidref;
    protected Boolean bool;
    @XmlElement(name = "connect_param")
    protected KinematicsConnectParamType connectParam;
    @XmlAttribute(name = "ref", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ref;

    /**
     * Gets the value of the float property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFloat() {
        return _float;
    }

    /**
     * Sets the value of the float property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFloat(Double value) {
        this._float = value;
    }

    /**
     * Gets the value of the int property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInt() {
        return _int;
    }

    /**
     * Sets the value of the int property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInt(Long value) {
        this._int = value;
    }

    /**
     * Gets the value of the sidref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIDREF() {
        return sidref;
    }

    /**
     * Sets the value of the sidref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIDREF(String value) {
        this.sidref = value;
    }

    /**
     * Gets the value of the bool property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBool() {
        return bool;
    }

    /**
     * Sets the value of the bool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBool(Boolean value) {
        this.bool = value;
    }

    /**
     * Gets the value of the connectParam property.
     * 
     * @return
     *     possible object is
     *     {@link KinematicsConnectParamType }
     *     
     */
    public KinematicsConnectParamType getConnectParam() {
        return connectParam;
    }

    /**
     * Sets the value of the connectParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link KinematicsConnectParamType }
     *     
     */
    public void setConnectParam(KinematicsConnectParamType value) {
        this.connectParam = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

}
