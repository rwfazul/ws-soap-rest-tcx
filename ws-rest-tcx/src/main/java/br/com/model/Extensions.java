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
public class Extensions {
    
    @XmlElement(name = "LX")
    private LX lx;

    public Extensions() {
    }

    public LX getLx() {
        return lx;
    }

    public void setLx(LX lx) {
        this.lx = lx;
    }

    @Override
    public String toString() {
        return "Extensions{" + "lx=" + lx + '}';
    }
   
}