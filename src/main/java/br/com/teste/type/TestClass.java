/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste.type;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author rhau
 */
public class TestClass {
    
    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Customer.class);
                
        Customer c = new Customer( new Address("Rua Exemplo") );
        
        // Marshall
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(c, System.out); 
    }
       
}