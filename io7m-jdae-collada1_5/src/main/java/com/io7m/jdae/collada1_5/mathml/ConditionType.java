//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.14 at 09:36:22 PM UTC 
//


package com.io7m.jdae.collada1_5.mathml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for condition.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="condition.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.w3.org/1998/Math/MathML}condition.content" maxOccurs="unbounded"/>
 *       &lt;attGroup ref="{http://www.w3.org/1998/Math/MathML}condition.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "condition.type", propOrder = {
    "conditionContent"
})
public class ConditionType {

    @XmlElementRefs({
        @XmlElementRef(name = "maligngroup", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "malignmark", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "forall", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "semantics", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arccoth", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "conjugate", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "selector", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mphantom", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "emptyset", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "or", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "plus", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "diff", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mode", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "apply", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tendsto", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sinh", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "prsubset", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gt", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arccot", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "csch", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "momentabout", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "leq", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "divergence", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "floor", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "set", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arccsc", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bvar", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sdev", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "munderover", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arccos", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ci", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reals", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "curl", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arcsec", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "merror", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gcd", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "eulergamma", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "partialdiff", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "power", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "primes", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "neq", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "min", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "logbase", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mfenced", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "intersect", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "munder", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "compose", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notsubset", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equivalent", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lambda", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "naturalnumbers", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mmultiscripts", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cartesianproduct", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mo", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mtable", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "integers", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "domain", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inverse", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mrow", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "infinity", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "degree", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maction", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "msqrt", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exponentiale", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "grad", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mover", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "root", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "image", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cn", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mspace", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "abs", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "complexes", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notanumber", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "xor", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arctan", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "moment", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "interval", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mi", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sec", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outerproduct", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lowlimit", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exp", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "msub", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sum", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "scalarproduct", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sin", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ceiling", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "union", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vectorproduct", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lt", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "imaginaryi", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "declare", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "determinant", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lcm", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "max", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "uplimit", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rationals", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "variance", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notin", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mtext", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ln", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subset", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arcsech", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "menclose", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "log", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exists", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mstyle", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cos", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cot", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "real", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arctanh", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "divide", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sech", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "imaginary", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "minus", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transpose", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "codomain", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arccosh", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mroot", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "product", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notprsubset", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mpadded", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setdiff", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "msup", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "msubsup", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "false", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "in", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "factorial", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arcsin", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "median", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arg", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pi", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tanh", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "eq", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "factorof", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "not", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "implies", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cosh", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arcsinh", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "coth", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vector", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "true", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "limit", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "domainofapplication", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "geq", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "matrix", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "condition", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mn", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "list", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "laplacian", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "card", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ident", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "csc", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "quotient", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ms", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "approx", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mean", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "csymbol", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "piecewise", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tan", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "and", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "times", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "int", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mfrac", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "arccsch", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rem", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> conditionContent;
    @XmlAttribute(name = "encoding")
    protected String encoding;
    @XmlAttribute(name = "definitionURL")
    @XmlSchemaType(name = "anyURI")
    protected String definitionURL;

    /**
     * Gets the value of the conditionContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MaligngroupType }{@code >}
     * {@link JAXBElement }{@code <}{@link MalignmarkType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicType }{@code >}
     * {@link JAXBElement }{@code <}{@link SemanticsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link SelectorType }{@code >}
     * {@link JAXBElement }{@code <}{@link MphantomType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiffType }{@code >}
     * {@link JAXBElement }{@code <}{@link ModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ApplyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TendstoType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrsubsetType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link MomentaboutType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link DivergenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link SetType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link BvarType }{@code >}
     * {@link JAXBElement }{@code <}{@link SdevType }{@code >}
     * {@link JAXBElement }{@code <}{@link MunderoverType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link CiType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link CurlType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link MerrorType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartialdiffType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogbaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link MfencedType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntersectType }{@code >}
     * {@link JAXBElement }{@code <}{@link MunderType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link NotsubsetType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link LambdaType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link MmultiscriptsType }{@code >}
     * {@link JAXBElement }{@code <}{@link CartesianproductType }{@code >}
     * {@link JAXBElement }{@code <}{@link MoType }{@code >}
     * {@link JAXBElement }{@code <}{@link MtableType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link InverseType }{@code >}
     * {@link JAXBElement }{@code <}{@link MrowType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link DegreeType }{@code >}
     * {@link JAXBElement }{@code <}{@link MactionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MsqrtType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link GradType }{@code >}
     * {@link JAXBElement }{@code <}{@link MoverType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link CnType }{@code >}
     * {@link JAXBElement }{@code <}{@link MspaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link MomentType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntervalType }{@code >}
     * {@link JAXBElement }{@code <}{@link MiType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link OuterproductType }{@code >}
     * {@link JAXBElement }{@code <}{@link LowlimitType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link MsubType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link ScalarproductType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnionType }{@code >}
     * {@link JAXBElement }{@code <}{@link VectorproductType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeclareType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeterminantType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link UplimitType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link VarianceType }{@code >}
     * {@link JAXBElement }{@code <}{@link NotinType }{@code >}
     * {@link JAXBElement }{@code <}{@link MtextType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link SubsetType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link MencloseType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicType }{@code >}
     * {@link JAXBElement }{@code <}{@link MstyleType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransposeType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link MrootType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link NotprsubsetType }{@code >}
     * {@link JAXBElement }{@code <}{@link MpaddedType }{@code >}
     * {@link JAXBElement }{@code <}{@link SetdiffType }{@code >}
     * {@link JAXBElement }{@code <}{@link MsupType }{@code >}
     * {@link JAXBElement }{@code <}{@link MsubsupType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link InType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link MedianType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link VectorType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link LimitType }{@code >}
     * {@link JAXBElement }{@code <}{@link DomainofapplicationType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link MatrixType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConditionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MnType }{@code >}
     * {@link JAXBElement }{@code <}{@link ListType }{@code >}
     * {@link JAXBElement }{@code <}{@link LaplacianType }{@code >}
     * {@link JAXBElement }{@code <}{@link CardType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link MsType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelationsType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeanType }{@code >}
     * {@link JAXBElement }{@code <}{@link CsymbolType }{@code >}
     * {@link JAXBElement }{@code <}{@link PiecewiseType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntType }{@code >}
     * {@link JAXBElement }{@code <}{@link MfracType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElementaryFunctionsType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArithType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getConditionContent() {
        if (conditionContent == null) {
            conditionContent = new ArrayList<JAXBElement<?>>();
        }
        return this.conditionContent;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the definitionURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinitionURL() {
        return definitionURL;
    }

    /**
     * Sets the value of the definitionURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinitionURL(String value) {
        this.definitionURL = value;
    }

}
