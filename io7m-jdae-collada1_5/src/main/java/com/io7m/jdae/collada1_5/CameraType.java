//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.14 at 09:36:22 PM UTC 
//


package com.io7m.jdae.collada1_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			The camera element declares a view into the scene hierarchy or scene graph. The camera contains 
 * 			elements that describe the camera's optics and imager.
 * 			
 * 
 * <p>Java class for camera_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="camera_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asset" type="{http://www.collada.org/2008/03/COLLADASchema}asset_type" minOccurs="0"/>
 *         &lt;element name="optics">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="technique_common">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="orthographic">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;sequence>
 *                                           &lt;element name="xmag" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
 *                                           &lt;choice minOccurs="0">
 *                                             &lt;element name="ymag" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
 *                                             &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
 *                                           &lt;/choice>
 *                                         &lt;/sequence>
 *                                         &lt;sequence>
 *                                           &lt;element name="ymag" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
 *                                           &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                       &lt;/choice>
 *                                       &lt;element name="znear" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
 *                                       &lt;element name="zfar" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="perspective">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;sequence>
 *                                           &lt;element name="xfov" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
 *                                           &lt;choice minOccurs="0">
 *                                             &lt;element name="yfov" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
 *                                             &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
 *                                           &lt;/choice>
 *                                         &lt;/sequence>
 *                                         &lt;sequence>
 *                                           &lt;element name="yfov" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
 *                                           &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                       &lt;/choice>
 *                                       &lt;element name="znear" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
 *                                       &lt;element name="zfar" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="technique" type="{http://www.collada.org/2008/03/COLLADASchema}technique_type" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="imager" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="technique" type="{http://www.collada.org/2008/03/COLLADASchema}technique_type" maxOccurs="unbounded"/>
 *                   &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camera_type", propOrder = {
    "asset",
    "optics",
    "imager",
    "extra"
})
public class CameraType {

    protected AssetType asset;
    @XmlElement(required = true)
    protected CameraType.Optics optics;
    protected CameraType.Imager imager;
    protected List<ExtraType> extra;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link AssetType }
     *     
     */
    public AssetType getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetType }
     *     
     */
    public void setAsset(AssetType value) {
        this.asset = value;
    }

    /**
     * Gets the value of the optics property.
     * 
     * @return
     *     possible object is
     *     {@link CameraType.Optics }
     *     
     */
    public CameraType.Optics getOptics() {
        return optics;
    }

    /**
     * Sets the value of the optics property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraType.Optics }
     *     
     */
    public void setOptics(CameraType.Optics value) {
        this.optics = value;
    }

    /**
     * Gets the value of the imager property.
     * 
     * @return
     *     possible object is
     *     {@link CameraType.Imager }
     *     
     */
    public CameraType.Imager getImager() {
        return imager;
    }

    /**
     * Sets the value of the imager property.
     * 
     * @param value
     *     allowed object is
     *     {@link CameraType.Imager }
     *     
     */
    public void setImager(CameraType.Imager value) {
        this.imager = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="technique" type="{http://www.collada.org/2008/03/COLLADASchema}technique_type" maxOccurs="unbounded"/>
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
    @XmlType(name = "", propOrder = {
        "technique",
        "extra"
    })
    public static class Imager {

        @XmlElement(required = true)
        protected List<TechniqueType> technique;
        protected List<ExtraType> extra;

        /**
         * Gets the value of the technique property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the technique property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTechnique().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TechniqueType }
         * 
         * 
         */
        public List<TechniqueType> getTechnique() {
            if (technique == null) {
                technique = new ArrayList<TechniqueType>();
            }
            return this.technique;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="technique_common">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="orthographic">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;sequence>
     *                                 &lt;element name="xmag" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
     *                                 &lt;choice minOccurs="0">
     *                                   &lt;element name="ymag" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
     *                                   &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
     *                                 &lt;/choice>
     *                               &lt;/sequence>
     *                               &lt;sequence>
     *                                 &lt;element name="ymag" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
     *                                 &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
     *                               &lt;/sequence>
     *                             &lt;/choice>
     *                             &lt;element name="znear" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
     *                             &lt;element name="zfar" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="perspective">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;sequence>
     *                                 &lt;element name="xfov" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
     *                                 &lt;choice minOccurs="0">
     *                                   &lt;element name="yfov" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
     *                                   &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
     *                                 &lt;/choice>
     *                               &lt;/sequence>
     *                               &lt;sequence>
     *                                 &lt;element name="yfov" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
     *                                 &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
     *                               &lt;/sequence>
     *                             &lt;/choice>
     *                             &lt;element name="znear" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
     *                             &lt;element name="zfar" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="technique" type="{http://www.collada.org/2008/03/COLLADASchema}technique_type" maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "techniqueCommon",
        "technique",
        "extra"
    })
    public static class Optics {

        @XmlElement(name = "technique_common", required = true)
        protected CameraType.Optics.TechniqueCommon techniqueCommon;
        protected List<TechniqueType> technique;
        protected List<ExtraType> extra;

        /**
         * Gets the value of the techniqueCommon property.
         * 
         * @return
         *     possible object is
         *     {@link CameraType.Optics.TechniqueCommon }
         *     
         */
        public CameraType.Optics.TechniqueCommon getTechniqueCommon() {
            return techniqueCommon;
        }

        /**
         * Sets the value of the techniqueCommon property.
         * 
         * @param value
         *     allowed object is
         *     {@link CameraType.Optics.TechniqueCommon }
         *     
         */
        public void setTechniqueCommon(CameraType.Optics.TechniqueCommon value) {
            this.techniqueCommon = value;
        }

        /**
         * Gets the value of the technique property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the technique property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTechnique().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TechniqueType }
         * 
         * 
         */
        public List<TechniqueType> getTechnique() {
            if (technique == null) {
                technique = new ArrayList<TechniqueType>();
            }
            return this.technique;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="orthographic">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;sequence>
         *                       &lt;element name="xmag" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
         *                       &lt;choice minOccurs="0">
         *                         &lt;element name="ymag" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
         *                         &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
         *                       &lt;/choice>
         *                     &lt;/sequence>
         *                     &lt;sequence>
         *                       &lt;element name="ymag" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
         *                       &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
         *                     &lt;/sequence>
         *                   &lt;/choice>
         *                   &lt;element name="znear" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
         *                   &lt;element name="zfar" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="perspective">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;sequence>
         *                       &lt;element name="xfov" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
         *                       &lt;choice minOccurs="0">
         *                         &lt;element name="yfov" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
         *                         &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
         *                       &lt;/choice>
         *                     &lt;/sequence>
         *                     &lt;sequence>
         *                       &lt;element name="yfov" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
         *                       &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
         *                     &lt;/sequence>
         *                   &lt;/choice>
         *                   &lt;element name="znear" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
         *                   &lt;element name="zfar" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "orthographic",
            "perspective"
        })
        public static class TechniqueCommon {

            protected CameraType.Optics.TechniqueCommon.Orthographic orthographic;
            protected CameraType.Optics.TechniqueCommon.Perspective perspective;

            /**
             * Gets the value of the orthographic property.
             * 
             * @return
             *     possible object is
             *     {@link CameraType.Optics.TechniqueCommon.Orthographic }
             *     
             */
            public CameraType.Optics.TechniqueCommon.Orthographic getOrthographic() {
                return orthographic;
            }

            /**
             * Sets the value of the orthographic property.
             * 
             * @param value
             *     allowed object is
             *     {@link CameraType.Optics.TechniqueCommon.Orthographic }
             *     
             */
            public void setOrthographic(CameraType.Optics.TechniqueCommon.Orthographic value) {
                this.orthographic = value;
            }

            /**
             * Gets the value of the perspective property.
             * 
             * @return
             *     possible object is
             *     {@link CameraType.Optics.TechniqueCommon.Perspective }
             *     
             */
            public CameraType.Optics.TechniqueCommon.Perspective getPerspective() {
                return perspective;
            }

            /**
             * Sets the value of the perspective property.
             * 
             * @param value
             *     allowed object is
             *     {@link CameraType.Optics.TechniqueCommon.Perspective }
             *     
             */
            public void setPerspective(CameraType.Optics.TechniqueCommon.Perspective value) {
                this.perspective = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;choice>
             *           &lt;sequence>
             *             &lt;element name="xmag" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
             *             &lt;choice minOccurs="0">
             *               &lt;element name="ymag" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
             *               &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
             *             &lt;/choice>
             *           &lt;/sequence>
             *           &lt;sequence>
             *             &lt;element name="ymag" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
             *             &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
             *           &lt;/sequence>
             *         &lt;/choice>
             *         &lt;element name="znear" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
             *         &lt;element name="zfar" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "content"
            })
            public static class Orthographic {

                @XmlElementRefs({
                    @XmlElementRef(name = "xmag", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "zfar", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "znear", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "aspect_ratio", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "ymag", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false)
                })
                protected List<JAXBElement<TargetableFloatType>> content;

                /**
                 * Gets the rest of the content model. 
                 * 
                 * <p>
                 * You are getting this "catch-all" property because of the following reason: 
                 * The field name "Ymag" is used by two different parts of a schema. See: 
                 * line 2273 of https://www.khronos.org/files/collada_schema_1_5
                 * line 2253 of https://www.khronos.org/files/collada_schema_1_5
                 * <p>
                 * To get rid of this property, apply a property customization to one 
                 * of both of the following declarations to change their names: 
                 * Gets the value of the content property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the content property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link TargetableFloatType }{@code >}
                 * {@link JAXBElement }{@code <}{@link TargetableFloatType }{@code >}
                 * {@link JAXBElement }{@code <}{@link TargetableFloatType }{@code >}
                 * {@link JAXBElement }{@code <}{@link TargetableFloatType }{@code >}
                 * {@link JAXBElement }{@code <}{@link TargetableFloatType }{@code >}
                 * 
                 * 
                 */
                public List<JAXBElement<TargetableFloatType>> getContent() {
                    if (content == null) {
                        content = new ArrayList<JAXBElement<TargetableFloatType>>();
                    }
                    return this.content;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;choice>
             *           &lt;sequence>
             *             &lt;element name="xfov" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
             *             &lt;choice minOccurs="0">
             *               &lt;element name="yfov" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
             *               &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
             *             &lt;/choice>
             *           &lt;/sequence>
             *           &lt;sequence>
             *             &lt;element name="yfov" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
             *             &lt;element name="aspect_ratio" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type" minOccurs="0"/>
             *           &lt;/sequence>
             *         &lt;/choice>
             *         &lt;element name="znear" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
             *         &lt;element name="zfar" type="{http://www.collada.org/2008/03/COLLADASchema}targetable_float_type"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "content"
            })
            public static class Perspective {

                @XmlElementRefs({
                    @XmlElementRef(name = "xfov", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "zfar", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "yfov", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "znear", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "aspect_ratio", namespace = "http://www.collada.org/2008/03/COLLADASchema", type = JAXBElement.class, required = false)
                })
                protected List<JAXBElement<TargetableFloatType>> content;

                /**
                 * Gets the rest of the content model. 
                 * 
                 * <p>
                 * You are getting this "catch-all" property because of the following reason: 
                 * The field name "Yfov" is used by two different parts of a schema. See: 
                 * line 2333 of https://www.khronos.org/files/collada_schema_1_5
                 * line 2314 of https://www.khronos.org/files/collada_schema_1_5
                 * <p>
                 * To get rid of this property, apply a property customization to one 
                 * of both of the following declarations to change their names: 
                 * Gets the value of the content property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the content property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link TargetableFloatType }{@code >}
                 * {@link JAXBElement }{@code <}{@link TargetableFloatType }{@code >}
                 * {@link JAXBElement }{@code <}{@link TargetableFloatType }{@code >}
                 * {@link JAXBElement }{@code <}{@link TargetableFloatType }{@code >}
                 * {@link JAXBElement }{@code <}{@link TargetableFloatType }{@code >}
                 * 
                 * 
                 */
                public List<JAXBElement<TargetableFloatType>> getContent() {
                    if (content == null) {
                        content = new ArrayList<JAXBElement<TargetableFloatType>>();
                    }
                    return this.content;
                }

            }

        }

    }

}
