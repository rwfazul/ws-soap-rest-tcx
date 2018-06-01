/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author isabella
 */
@XmlAccessorType(XmlAccessType.FIELD)
class Version {
    
    @XmlAttribute(name = "VersionMajor")
    Integer versionMajor;
    
    @XmlAttribute(name = "VersionMinor")
    Integer versionMinor;
    
    @XmlAttribute(name = "BuildMajor")
    Integer buildMajor;
    
    @XmlAttribute(name = "BuildMinor")
    Integer buildMinor;
    
}
