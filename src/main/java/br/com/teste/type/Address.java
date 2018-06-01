/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste.type;

/**
 *
 * @author rhau
 */
public class Address extends ContactInfo {
 
    private String street;

    public Address() {
    }

    public Address(String street) {
        this.street = street;
    }
    
    public String getStreet() {
        return street;
    }
 
    public void setStreet(String street) {
        this.street = street;
    }
 
}