/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import java.util.Date;
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
    Date startTime;
    
    @XmlElement(name = "TotalTimeSeconds")
    Double totalTimeSeconds;
    
    @XmlElement(name = "DistanceMeters")
    Double distanceMeters;
    
    @XmlElement(name = "MaximumSpeed")
    Double maximumSpeed;
    
    @XmlElement(name = "Calories")
    Integer calories;
    
    @XmlElement(name = "Intensity")
    String intensity;
    
    @XmlElement(name = "Cadence")
    Integer cadence;
    
    @XmlElement(name = "TriggerMethod")
    String triggerMethod;
    
    @XmlElement(name = "Track")
    Track track;
    
    @XmlElement(name = "Extensions")
    Extensions extensions;
    
}
