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
 * @author rhau
 */
@XmlTransient
@XmlSeeAlso(value = {Application_t.class}) 
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Author {

    @XmlElement(name = "Name")
    private String name;
    
    @XmlElement(name = "Build")
    private Build build;
        
    @XmlElement(name = "LangID")
    private String langID;
    
    @XmlElement(name = "PartNumber")
    private String partNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public String getLangID() {
        return langID;
    }

    public void setLangID(String langID) {
        this.langID = langID;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public String toString() {
        return "Author{" + ", name=" + name + ", build=" + build + ", langID=" + langID + ", partNumber=" + partNumber + '}';
    }
    
}