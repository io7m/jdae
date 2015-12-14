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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			The mesh element contains vertex and primitive information sufficient to describe basic geometric meshes.
 * 			
 * 
 * <p>Java class for mesh_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mesh_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.collada.org/2008/03/COLLADASchema}source_type" maxOccurs="unbounded"/>
 *         &lt;element name="vertices" type="{http://www.collada.org/2008/03/COLLADASchema}vertices_type"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="lines" type="{http://www.collada.org/2008/03/COLLADASchema}lines_type"/>
 *           &lt;element name="linestrips" type="{http://www.collada.org/2008/03/COLLADASchema}linestrips_type"/>
 *           &lt;element name="polygons" type="{http://www.collada.org/2008/03/COLLADASchema}polygons_type"/>
 *           &lt;element name="polylist" type="{http://www.collada.org/2008/03/COLLADASchema}polylist_type"/>
 *           &lt;element name="triangles" type="{http://www.collada.org/2008/03/COLLADASchema}triangles_type"/>
 *           &lt;element name="trifans" type="{http://www.collada.org/2008/03/COLLADASchema}trifans_type"/>
 *           &lt;element name="tristrips" type="{http://www.collada.org/2008/03/COLLADASchema}tristrips_type"/>
 *         &lt;/choice>
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
@XmlType(name = "mesh_type", propOrder = {
    "source",
    "vertices",
    "linesOrLinestripsOrPolygons",
    "extra"
})
public class MeshType {

    @XmlElement(required = true)
    protected List<SourceType> source;
    @XmlElement(required = true)
    protected VerticesType vertices;
    @XmlElements({
        @XmlElement(name = "lines", type = LinesType.class),
        @XmlElement(name = "linestrips", type = LinestripsType.class),
        @XmlElement(name = "polygons", type = PolygonsType.class),
        @XmlElement(name = "polylist", type = PolylistType.class),
        @XmlElement(name = "triangles", type = TrianglesType.class),
        @XmlElement(name = "trifans", type = TrifansType.class),
        @XmlElement(name = "tristrips", type = TristripsType.class)
    })
    protected List<Object> linesOrLinestripsOrPolygons;
    protected List<ExtraType> extra;

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceType }
     * 
     * 
     */
    public List<SourceType> getSource() {
        if (source == null) {
            source = new ArrayList<SourceType>();
        }
        return this.source;
    }

    /**
     * Gets the value of the vertices property.
     * 
     * @return
     *     possible object is
     *     {@link VerticesType }
     *     
     */
    public VerticesType getVertices() {
        return vertices;
    }

    /**
     * Sets the value of the vertices property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticesType }
     *     
     */
    public void setVertices(VerticesType value) {
        this.vertices = value;
    }

    /**
     * Gets the value of the linesOrLinestripsOrPolygons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linesOrLinestripsOrPolygons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinesOrLinestripsOrPolygons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinesType }
     * {@link LinestripsType }
     * {@link PolygonsType }
     * {@link PolylistType }
     * {@link TrianglesType }
     * {@link TrifansType }
     * {@link TristripsType }
     * 
     * 
     */
    public List<Object> getLinesOrLinestripsOrPolygons() {
        if (linesOrLinestripsOrPolygons == null) {
            linesOrLinestripsOrPolygons = new ArrayList<Object>();
        }
        return this.linesOrLinestripsOrPolygons;
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
