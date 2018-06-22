/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author isabella
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Activity {
    
    @XmlAttribute(name = "Sport")
    private String sport;
    
    @XmlElement(name = "Id")
    private Calendar id; // XMLGregorianCalendar
    
    @XmlElement(name = "Lap")
    private List<Lap> laps = new ArrayList<>();
    
    @XmlElement(name = "Training")
    private Training training;
    
    @XmlElement(name = "Creator")
    private Creator creator;
    
    public Activity() {
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Calendar getId() {
        return id;
    }

    public void setId(Calendar id) {
        this.id = id;
    }

    public List<Lap> getLaps() {
        return laps;
    }

    public void setLaps(List<Lap> laps) {
        this.laps = laps;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Activity{" + "sport=" + sport + ", id=" + id + ", laps=" + laps + ", training=" + training + ", creator=" + creator + '}';
    }

}