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
public class LX {
    
    @XmlElement(name = "AvgSpeed")
    private Double AvgSpeed;

    public LX() {
    }

    public Double getAvgSpeed() {
        return AvgSpeed;
    }

    public void setAvgSpeed(Double AvgSpeed) {
        this.AvgSpeed = AvgSpeed;
    }

    @Override
    public String toString() {
        return "LX{" + "AvgSpeed=" + AvgSpeed + '}';
    }
    
}