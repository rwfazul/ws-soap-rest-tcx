/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author isabella
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Activity {
    
    @XmlElement(name = "Id")
    Integer id;
    
    @XmlAttribute(name = "Sport")
    String sport;
    
    @XmlElementWrapper(name = "laps")
    @XmlElement(name = "Lap")
    List<Lap> laps = new ArrayList<>();
    
    @XmlElement(name = "Training")
    Training training;
}
