/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste.type;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rhau
 */
@XmlRootElement
public class Customer {
 
    private ContactInfo contactInfo;

    public Customer() {
    }

    public Customer(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
 
    public ContactInfo getContactInfo() {
        return contactInfo;
    }
 
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
 
}