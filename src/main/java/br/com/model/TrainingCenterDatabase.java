/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author isabella
 */
@XmlRootElement(name = "TrainingCenterDatabase")
@XmlAccessorType(XmlAccessType.FIELD)
public class TrainingCenterDatabase {
    
    @XmlElement(name = "Activities")
    private Activities activities;
    
    @XmlElement(name = "Author")
    private Author author;

    public TrainingCenterDatabase() {
    }

    public Activities getActivities() {
        return activities;
    }

    public void setActivities(Activities activities) {
        this.activities = activities;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "TrainingCenterDatabase{" + "activities=" + activities + ", author=" + author + '}';
    }
    
}