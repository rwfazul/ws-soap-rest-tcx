/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author isabella
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Author {
    
    @XmlElement(name = "Name")
    String name;
    
    @XmlElement(name = "LangID")
    String langID;
    
    @XmlElement(name = "PartNumber")
    String partNumber;
    
    @XmlElement(name = "Build")
    Build build;
    
}
