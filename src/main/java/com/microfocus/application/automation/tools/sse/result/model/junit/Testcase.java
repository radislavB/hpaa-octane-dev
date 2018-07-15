/*
 * © Copyright 2013 EntIT Software LLC
 *  Certain versions of software and/or documents (“Material”) accessible here may contain branding from
 *  Hewlett-Packard Company (now HP Inc.) and Hewlett Packard Enterprise Company.  As of September 1, 2017,
 *  the Material is now offered by Micro Focus, a separately owned and operated company.  Any reference to the HP
 *  and Hewlett Packard Enterprise/HPE marks is historical in nature, and the HP and Hewlett Packard Enterprise/HPE
 *  marks are the property of their respective owners.
 * __________________________________________________________________
 * MIT License
 *
 * © Copyright 2012-2018 Micro Focus or one of its affiliates.
 *
 * The only warranties for products and services of Micro Focus and its affiliates
 * and licensors (“Micro Focus”) are set forth in the express warranty statements
 * accompanying such products and services. Nothing herein should be construed as
 * constituting an additional warranty. Micro Focus shall not be liable for technical
 * or editorial errors or omissions contained herein.
 * The information contained herein is subject to change without notice.
 * ___________________________________________________________________
 *
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.09 at 04:58:42 PM IST 
//

package com.microfocus.application.automation.tools.sse.result.model.junit;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}skipped" minOccurs="0"/>
 *         &lt;element ref="{}error" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}failure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}system-out" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}system-err" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assertions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="classname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="report" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "skipped", "error", "failure", "systemOut", "systemErr" })
@XmlRootElement(name = "testcase")
public class Testcase {
    
    protected String skipped;
    protected List<Error> error;
    protected List<Failure> failure;
    @XmlElement(name = "system-out")
    protected List<String> systemOut;
    @XmlElement(name = "system-err")
    protected List<String> systemErr;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String assertions;
    @XmlAttribute
    protected String time;
    @XmlAttribute
    protected String classname;
    @XmlAttribute
    protected String status;
    @XmlAttribute
    protected String type;
    @XmlAttribute
    protected String report;
    
    /**
     * Gets the value of the skipped property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSkipped() {
        return skipped;
    }
    
    /**
     * Sets the value of the skipped property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSkipped(String value) {
        this.skipped = value;
    }
    
    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Error }
     * 
     * 
     */
    public List<Error> getError() {
        if (error == null) {
            error = new ArrayList<Error>();
        }
        return this.error;
    }
    
    /**
     * Gets the value of the failure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the failure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getFailure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Failure }
     * 
     * 
     */
    public List<Failure> getFailure() {
        if (failure == null) {
            failure = new ArrayList<Failure>();
        }
        return this.failure;
    }
    
    /**
     * Gets the value of the systemOut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the systemOut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSystemOut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getSystemOut() {
        if (systemOut == null) {
            systemOut = new ArrayList<String>();
        }
        return this.systemOut;
    }
    
    /**
     * Gets the value of the systemErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the systemErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSystemErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getSystemErr() {
        if (systemErr == null) {
            systemErr = new ArrayList<String>();
        }
        return this.systemErr;
    }
    
    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }
    
    /**
     * Gets the value of the assertions property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAssertions() {
        return assertions;
    }
    
    /**
     * Sets the value of the assertions property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAssertions(String value) {
        this.assertions = value;
    }
    
    /**
     * Gets the value of the time property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTime() {
        return time;
    }
    
    /**
     * Sets the value of the time property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTime(String value) {
        this.time = value;
    }
    
    /**
     * Gets the value of the classname property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getClassname() {
        return classname;
    }
    
    /**
     * Sets the value of the classname property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setClassname(String value) {
        this.classname = value;
    }
    
    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Sets the value of the status property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setStatus(String value) {
        this.status = value;
    }
    
    /**
     * Gets the value of the type property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getType() {
        return type;
    }
    
    /**
     * Sets the value of the type property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setType(String value) {
        this.type = value;
    }
    
    /**
     * Gets the value of the report property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReport() {
        return report;
    }
    
    /**
     * Sets the value of the report property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setReport(String value) {
        this.report = value;
    }
    
}
