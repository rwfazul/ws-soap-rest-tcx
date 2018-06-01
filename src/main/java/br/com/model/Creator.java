/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author isabella
 */
@XmlAccessorType(XmlAccessType.FIELD)
class Creator {
    
    @XmlAttribute(name = "xsi:type")
    String xsitype;
    
    @XmlElement(name = "Name")
    String name;
    
    @XmlElement(name = "UnitId")
    Integer unitId;
    
    @XmlElement(name = "ProductId")
    Integer productId;
    
    @XmlElement(name = "Version")
    Version version;
}
