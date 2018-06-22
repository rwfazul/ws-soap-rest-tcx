/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author isabella
 */
@XmlTransient
@XmlSeeAlso(value = {Device_t.class})
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Creator {
    
    @XmlElement(name = "Name")
    private String name;
    
    @XmlElement(name = "UnitId")
    private Integer unitId;
    
    @XmlElement(name = "ProductID")
    private Integer productId;
    
    @XmlElement(name = "Version")
    private Version version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Creator{" + ", name=" + name + ", unitId=" + unitId + ", productId=" + productId + ", version=" + version + '}';
    }

}