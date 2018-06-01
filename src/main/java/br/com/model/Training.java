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
public class Training {
    
    @XmlAttribute(name = "VirtualPartner")
    private Boolean virtualPartner;
    
    @XmlElement(name = "Plan")
    private Plan plan;

    public Training() {
    }

    public Boolean getVirtualPartner() {
        return virtualPartner;
    }

    public void setVirtualPartner(Boolean virtualPartner) {
        this.virtualPartner = virtualPartner;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Training{" + "virtualPartner=" + virtualPartner + ", plan=" + plan + '}';
    }

}