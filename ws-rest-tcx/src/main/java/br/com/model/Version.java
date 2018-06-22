/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author isabella
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Version {
    
    @XmlElement(name = "VersionMajor")
    private Integer versionMajor;
    
    @XmlElement(name = "VersionMinor")
    private Integer versionMinor;
    
    @XmlElement(name = "BuildMajor")
    private Integer buildMajor;
    
    @XmlElement(name = "BuildMinor")
    private Integer buildMinor;

    public Version() {
    }

    public Integer getVersionMajor() {
        return versionMajor;
    }

    public void setVersionMajor(Integer versionMajor) {
        this.versionMajor = versionMajor;
    }

    public Integer getVersionMinor() {
        return versionMinor;
    }

    public void setVersionMinor(Integer versionMinor) {
        this.versionMinor = versionMinor;
    }

    public Integer getBuildMajor() {
        return buildMajor;
    }

    public void setBuildMajor(Integer buildMajor) {
        this.buildMajor = buildMajor;
    }

    public Integer getBuildMinor() {
        return buildMinor;
    }

    public void setBuildMinor(Integer buildMinor) {
        this.buildMinor = buildMinor;
    }

    @Override
    public String toString() {
        return "Version{" + "versionMajor=" + versionMajor + ", versionMinor=" + versionMinor + ", buildMajor=" + buildMajor + ", buildMinor=" + buildMinor + '}';
    }
    
}