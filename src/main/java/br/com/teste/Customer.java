/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author rhau
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
 
    @XmlAttribute(name = "id")
    Integer id;
    @XmlAttribute(name = "status")
    String status;
    @XmlElement(name = "name")
    String name;
    @XmlElement(name = "phone-number")
    String phoneNumber;
    @XmlElement(name = "address")
    Address address;

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", status=" + status + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + '}';
    }
   
}