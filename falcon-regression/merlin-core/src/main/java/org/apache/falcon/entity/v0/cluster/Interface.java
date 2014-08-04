//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.28 at 10:55:57 AM PDT 
//


package org.apache.falcon.entity.v0.cluster;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 An interface specifies the interface type, Falcon uses it to schedule
 *                 entities in workflow engine, to save and read data from hadoop and to
 *                 publish messages to messaging engine.
 *                 endpoint: is the url for each interface; examples: for write it is the
 *                 url of hdfs (fs.default.name) and
 *                 for workflow it is url of workflow engine like oozie.
 *                 version: The current runtime version of each interface.
 *             
 * 
 * <p>Java class for interface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="interface">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{uri:falcon:cluster:0.1}interfacetype" />
 *       &lt;attribute name="endpoint" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interface")
public class Interface {

    @XmlAttribute(name = "type", required = true)
    protected Interfacetype type;
    @XmlAttribute(name = "endpoint", required = true)
    protected String endpoint;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Interfacetype }
     *     
     */
    public Interfacetype getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interfacetype }
     *     
     */
    public void setType(Interfacetype value) {
        this.type = value;
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpoint(String value) {
        this.endpoint = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}