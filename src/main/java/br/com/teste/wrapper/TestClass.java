/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste.wrapper;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author rhau
 */
public class TestClass {
    
    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(ListCostumers.class);
        
        // Unmarshall
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        File xml = new File("src/input.xml");
        
        ListCostumers c = (ListCostumers) unmarshaller.unmarshal(xml);
        System.out.println(c);
        
        // Marshall
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(c, System.out); // .(c, new File("output.xml"));
    }
    
}