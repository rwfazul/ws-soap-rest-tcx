/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.parser;

import br.com.model.TrainingCenterDatabase;
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
    
    private static final String fileName = "rota1.tcx"; // "rota2.tcx";
    private static final String outputPath = "/home/rhau/Desktop/";
    
    public static void main(String[] args) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(TrainingCenterDatabase.class);
        
        /* Unmarshall */
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        File xml = new File(fileName);
        TrainingCenterDatabase tcd = (TrainingCenterDatabase) unmarshaller.unmarshal(xml);
        // System.out.println(tcd);
        
        /* Marshall */
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        // marshaller.marshal(tcd, System.out); // .(c, new File("output.xml"));
        marshaller.marshal(tcd, new File(outputPath + "output-" + fileName)); 
    }
        
}