/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author rhau
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
    
    @XmlElement
    String city;
    @XmlElement
    String street;

    @Override
    public String toString() {
        return "Address{" + "city=" + city + ", street=" + street + '}';
    }

}