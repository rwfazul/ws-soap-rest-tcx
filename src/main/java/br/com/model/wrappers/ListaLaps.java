/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.wrappers;

import br.com.model.Lap;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rhau
 */
@XmlRootElement(name = "laps")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaLaps {

    @XmlElement(name = "lap")
    private List<Lap> laps;
    
    public ListaLaps() {
    }
    
    public ListaLaps(List<Lap> laps) {
        this.laps = laps;
    }

    public List<Lap> getLaps() {
        return laps;
    }

    public void setLaps(List<Lap> laps) {
        this.laps = laps;
    }

    @Override
    public String toString() {
        return "ListaLaps{" + "laps=" + laps + '}';
    }
    
}