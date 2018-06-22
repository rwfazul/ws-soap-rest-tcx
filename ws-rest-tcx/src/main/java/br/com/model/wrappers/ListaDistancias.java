/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.wrappers;

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
@XmlRootElement(name = "distanciasLaps")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaDistancias {
    
    @XmlElement(name = "distancia")
    private List<Double> distancias = new ArrayList<>();
    
    public ListaDistancias() {
    }

    public List<Double> getDistancias() {
        return distancias;
    }

    public void setDistancias(List<Double> distancias) {
        this.distancias = distancias;
    }

    @Override
    public String toString() {
        return "ListaDouble{" + "distancias=" + distancias + '}';
    }
       
}