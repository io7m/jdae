//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.14 at 09:32:10 PM UTC 
//


package com.io7m.jdae.collada1_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}source" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}vertices"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}lines"/&gt;
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}linestrips"/&gt;
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}polygons"/&gt;
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}polylist"/&gt;
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}triangles"/&gt;
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}trifans"/&gt;
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}tristrips"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "source",
    "vertices",
    "linesOrLinestripsOrPolygons",
    "extra"
})
@XmlRootElement(name = "mesh")
public class Mesh {

    @XmlElement(required = true)
    protected List<Source> source;
    @XmlElement(required = true)
    protected Vertices vertices;
    @XmlElements({
        @XmlElement(name = "lines", type = Lines.class),
        @XmlElement(name = "linestrips", type = Linestrips.class),
        @XmlElement(name = "polygons", type = Polygons.class),
        @XmlElement(name = "polylist", type = Polylist.class),
        @XmlElement(name = "triangles", type = Triangles.class),
        @XmlElement(name = "trifans", type = Trifans.class),
        @XmlElement(name = "tristrips", type = Tristrips.class)
    })
    protected List<Object> linesOrLinestripsOrPolygons;
    protected List<Extra> extra;

    /**
     * 
     * 						The mesh element must contain one or more source elements.
     * 						Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a {@code set} method for the source property.
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
     * {@link Source }
     * 
     * 
     */
    public List<Source> getSource() {
        if (source == null) {
            source = new ArrayList<Source>();
        }
        return this.source;
    }

    /**
     * 
     * 						The mesh element must contain one vertices element.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link Vertices }
     *     
     */
    public Vertices getVertices() {
        return vertices;
    }

    /**
     * Sets the value of the vertices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vertices }
     *     
     */
    public void setVertices(Vertices value) {
        this.vertices = value;
    }

    /**
     * Gets the value of the linesOrLinestripsOrPolygons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a {@code set} method for the linesOrLinestripsOrPolygons property.
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
     * {@link Lines }
     * {@link Linestrips }
     * {@link Polygons }
     * {@link Polylist }
     * {@link Triangles }
     * {@link Trifans }
     * {@link Tristrips }
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
     * 
     * 						The extra element may appear any number of times.
     * 						Gets the value of the extra property.
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
     * {@link Extra }
     * 
     * 
     */
    public List<Extra> getExtra() {
        if (extra == null) {
            extra = new ArrayList<Extra>();
        }
        return this.extra;
    }

}
