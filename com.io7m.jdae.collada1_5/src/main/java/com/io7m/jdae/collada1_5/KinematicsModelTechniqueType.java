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
 * <p>Java class for kinematics_model_technique_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kinematics_model_technique_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newparam" type="{http://www.collada.org/2008/03/COLLADASchema}kinematics_newparam_type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="instance_joint" type="{http://www.collada.org/2008/03/COLLADASchema}instance_joint_type"/&gt;
 *           &lt;element name="joint" type="{http://www.collada.org/2008/03/COLLADASchema}joint_type"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="link" type="{http://www.collada.org/2008/03/COLLADASchema}link_type" maxOccurs="unbounded"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="formula" type="{http://www.collada.org/2008/03/COLLADASchema}formula_type"/&gt;
 *           &lt;element name="instance_formula" type="{http://www.collada.org/2008/03/COLLADASchema}instance_formula_type"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kinematics_model_technique_type", propOrder = {
    "newparam",
    "instanceJointOrJoint",
    "link",
    "formulaOrInstanceFormula"
})
public class KinematicsModelTechniqueType {

    protected List<KinematicsNewparamType> newparam;
    @XmlElements({
        @XmlElement(name = "instance_joint", type = InstanceJointType.class),
        @XmlElement(name = "joint", type = JointType.class)
    })
    protected List<Object> instanceJointOrJoint;
    @XmlElement(required = true)
    protected List<LinkType> link;
    @XmlElements({
        @XmlElement(name = "formula", type = FormulaType.class),
        @XmlElement(name = "instance_formula", type = InstanceFormulaType.class)
    })
    protected List<Object> formulaOrInstanceFormula;

    /**
     * Gets the value of the newparam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a {@code set} method for the newparam property.
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
     * Gets the value of the instanceJointOrJoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a {@code set} method for the instanceJointOrJoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstanceJointOrJoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstanceJointType }
     * {@link JointType }
     * 
     * 
     */
    public List<Object> getInstanceJointOrJoint() {
        if (instanceJointOrJoint == null) {
            instanceJointOrJoint = new ArrayList<Object>();
        }
        return this.instanceJointOrJoint;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a {@code set} method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkType }
     * 
     * 
     */
    public List<LinkType> getLink() {
        if (link == null) {
            link = new ArrayList<LinkType>();
        }
        return this.link;
    }

    /**
     * Gets the value of the formulaOrInstanceFormula property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a {@code set} method for the formulaOrInstanceFormula property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormulaOrInstanceFormula().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormulaType }
     * {@link InstanceFormulaType }
     * 
     * 
     */
    public List<Object> getFormulaOrInstanceFormula() {
        if (formulaOrInstanceFormula == null) {
            formulaOrInstanceFormula = new ArrayList<Object>();
        }
        return this.formulaOrInstanceFormula;
    }

}
