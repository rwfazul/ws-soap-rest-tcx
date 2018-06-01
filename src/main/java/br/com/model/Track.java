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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author isabella
 */
@XmlAccessorType(XmlAccessType.FIELD)
class Track {
    
    @XmlElementWrapper(name = "TrackPoints")
    @XmlElement(name = "TrackPoint")
    List<TrackPoint> trackPoints = new ArrayList<>();
    
}
