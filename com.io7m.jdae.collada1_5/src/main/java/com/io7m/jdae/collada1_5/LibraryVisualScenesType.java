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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			The library_visual_scenes element declares a module of visual_scene elements.
 * 			
 * 
 * <p>Java class for library_visual_scenes_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="library_visual_scenes_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asset" type="{http://www.collada.org/2008/03/COLLADASchema}asset_type" minOccurs="0"/&gt;
 *         &lt;element name="visual_scene" type="{http://www.collada.org/2008/03/COLLADASchema}visual_scene_type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "library_visual_scenes_type", propOrder = {
    "asset",
    "visualScene",
    "extra"
})
public class LibraryVisualScenesType {

    protected AssetType asset;
    @XmlElement(name = "visual_scene", required = true)
    protected List<VisualSceneType> visualScene;
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
     * Gets the value of the visualScene property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a {@code set} method for the visualScene property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisualScene().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisualSceneType }
     * 
     * 
     */
    public List<VisualSceneType> getVisualScene() {
        if (visualScene == null) {
            visualScene = new ArrayList<VisualSceneType>();
        }
        return this.visualScene;
    }

    /**
     * Gets the value of the extra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a {@code set} method for the extra property.
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

}
