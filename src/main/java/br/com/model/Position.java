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
public class Position {
    
    @XmlElement(name = "LatitudeDegrees")
    private Double latitudeDegrees;
    
    @XmlElement(name = "LongitudeDegrees")
    private Double longitudeDegrees;

    public Position() {
    }

    public Double getLatitudeDegrees() {
        return latitudeDegrees;
    }

    public void setLatitudeDegrees(Double latitudeDegrees) {
        this.latitudeDegrees = latitudeDegrees;
    }

    public Double getLongitudeDegrees() {
        return longitudeDegrees;
    }

    public void setLongitudeDegrees(Double longitudeDegrees) {
        this.longitudeDegrees = longitudeDegrees;
    }

    @Override
    public String toString() {
        return "Position{" + "latitudeDegrees=" + latitudeDegrees + ", longitudeDegrees=" + longitudeDegrees + '}';
    }

}