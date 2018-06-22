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
public class Plan {
    
    @XmlAttribute(name = "Type")
    private String type;
    
    @XmlAttribute(name = "IntervalWorkout")
    private Boolean intervalWorkout;
    
    @XmlElement(name = "Name")
    private String name;
    
    @XmlElement(name = "Extensions")
    private Extensions extensions;

    public Plan() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getIntervalWorkout() {
        return intervalWorkout;
    }

    public void setIntervalWorkout(Boolean intervalWorkout) {
        this.intervalWorkout = intervalWorkout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Extensions getExtensions() {
        return extensions;
    }

    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }

    @Override
    public String toString() {
        return "Plan{" + "type=" + type + ", intervalWorkout=" + intervalWorkout + ", name=" + name + ", extensions=" + extensions + '}';
    }
    
}