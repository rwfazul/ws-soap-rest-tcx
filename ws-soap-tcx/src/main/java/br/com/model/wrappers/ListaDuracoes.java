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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rhau
 */
@XmlRootElement(name = "duracoesLaps")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaDuracoes {
 
    @XmlAttribute(name = "formato")
    private String formato;
    
    @XmlElement(name = "duracao")
    private List<String> duracoes = new ArrayList<>();

    public ListaDuracoes(String formato) {
        this.formato = formato;
    }
    
    public ListaDuracoes() {
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public List<String> getDuracoes() {
        return duracoes;
    }

    public void setDuracoes(List<String> duracoes) {
        this.duracoes = duracoes;
    }

    @Override
    public String toString() {
        return "ListaDuracoes{" + "formato=" + formato + ", duracoes=" + duracoes + '}';
    }
    
}