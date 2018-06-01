/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author isabella
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Lap {
    
    @XmlAttribute(name = "StartTime")
    private Calendar startTime;
    
    @XmlElement(name = "TotalTimeSeconds")
    private Double totalTimeSeconds;
    
    @XmlElement(name = "DistanceMeters")
    private Double distanceMeters;
    
    @XmlElement(name = "MaximumSpeed")
    private Double maximumSpeed;
    
    @XmlElement(name = "Calories")
    private Integer calories;
    
    @XmlElement(name = "Intensity")
    private String intensity;
    
    @XmlElement(name = "Cadence")
    private Integer cadence;
    
    @XmlElement(name = "TriggerMethod")
    private String triggerMethod;
    
    @XmlElement(name = "Track")
    private Track track;
    
    @XmlElement(name = "Extensions")
    private Extensions extensions;

    public Lap() {
    }


    public Double getTotalTimeSeconds() {
        return totalTimeSeconds;
    }

    public void setTotalTimeSeconds(Double totalTimeSeconds) {
        this.totalTimeSeconds = totalTimeSeconds;
    }

    public Double getDistanceMeters() {
        return distanceMeters;
    }

    public void setDistanceMeters(Double distanceMeters) {
        this.distanceMeters = distanceMeters;
    }

    public Double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(Double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public Integer getCadence() {
        return cadence;
    }

    public void setCadence(Integer cadence) {
        this.cadence = cadence;
    }

    public String getTriggerMethod() {
        return triggerMethod;
    }

    public void setTriggerMethod(String triggerMethod) {
        this.triggerMethod = triggerMethod;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Extensions getExtensions() {
        return extensions;
    }

    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }

    @Override
    public String toString() {
        return "Lap{" + "startTime=" + startTime + ", totalTimeSeconds=" + totalTimeSeconds + ", distanceMeters=" + distanceMeters + ", maximumSpeed=" + maximumSpeed + ", calories=" + calories + ", intensity=" + intensity + ", cadence=" + cadence + ", triggerMethod=" + triggerMethod + ", track=" + track + ", extensions=" + extensions + '}';
    }
       
}