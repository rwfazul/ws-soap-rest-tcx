/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rhau
 */
@XmlRootElement(name = "listCostumers")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListCostumers {
    
    @XmlElement(name = "customer")
    List<Customer> customers = new ArrayList<>();

    @Override
    public String toString() {
        return "ListCostumers{" + "customers=" + customers + '}';
    }
    
}