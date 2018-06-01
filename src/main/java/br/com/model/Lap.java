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

/**
 *
 * @author isabella
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Lap {
    
    @XmlAttribute(name = "StartTime")
    Date startTime;
    
    @XmlAttribute(name = "TotalTimeSeconds")
    Double totalTimeSeconds;
    
    @XmlAttribute(name = "DistanceMeters")
    Double distanceMeters;
    
    @XmlAttribute(name = "MaximumSpeed")
    Double maximumSpeed;
    
    @XmlAttribute(name = "Calories")
    Integer calories;
    
    @XmlAttribute(name = "Intensity")
    String intensity;
    
    @XmlAttribute(name = "Cadence")
    Integer cadence;
    
    @XmlAttribute(name = "TriggerMethod")
    String triggerMethod;
    
    @XmlAttribute(name = "Track")
    Track track;
    
    @XmlAttribute(name = "Extensions")
    Extensions extensions;
    
}
