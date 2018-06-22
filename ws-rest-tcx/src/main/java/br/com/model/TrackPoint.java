/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author isabella
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TrackPoint {
    
    @XmlElement(name = "Time")
    private Calendar time;
    
    @XmlElement(name = "Position")
    private Position position;
        
    @XmlElement(name = "AltitudeMeters")
    private Double altitudeMeters;
    
    @XmlElement(name = "DistanceMeters")
    private Double distanceMeters;
    
    @XmlElement(name = "Cadence")
    private Integer cadence;
    
    @XmlElement(name = "SensorState")
    private String sensorState;

    public TrackPoint() {
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Double getAltitudeMeters() {
        return altitudeMeters;
    }

    public void setAltitudeMeters(Double altitudeMeters) {
        this.altitudeMeters = altitudeMeters;
    }

    public Double getDistanceMeters() {
        return distanceMeters;
    }

    public void setDistanceMeters(Double distanceMeters) {
        this.distanceMeters = distanceMeters;
    }

    public Integer getCadence() {
        return cadence;
    }

    public void setCadence(Integer cadence) {
        this.cadence = cadence;
    }

    public String getSensorState() {
        return sensorState;
    }

    public void setSensorState(String sensorState) {
        this.sensorState = sensorState;
    }

    @Override
    public String toString() {
        return "TrackPoint{" + "time=" + time + ", position=" + position + ", altitudeMeters=" + altitudeMeters + ", distanceMeters=" + distanceMeters + ", cadence=" + cadence + ", sensorState=" + sensorState + '}';
    }
    
}