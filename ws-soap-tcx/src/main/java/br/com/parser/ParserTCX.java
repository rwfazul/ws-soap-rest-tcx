/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.parser;

import br.com.model.TrainingCenterDatabase;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author rhau
 */
public class ParserTCX {
    
    private static final String ABSOLUTEPATH = "/home/USER/NetBeansProjects/ws-soap-tcx";
    private static final String FILENAME = "rota1.tcx"; // rota2.tcx
    
    public static TrainingCenterDatabase unmarshal() {
        try {
            /* Unmarshall */    
            JAXBContext jc = JAXBContext.newInstance(TrainingCenterDatabase.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            File xml = new File(ABSOLUTEPATH + "/" + FILENAME);
            System.out.println(xml.getAbsolutePath());
            return (TrainingCenterDatabase) unmarshaller.unmarshal(xml);
        } catch (JAXBException ex) {
            Logger.getLogger(ParserTCX.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void marshal() {
        try {
            TrainingCenterDatabase tcd = unmarshal();
            /* Marshall */
            JAXBContext jc = JAXBContext.newInstance(TrainingCenterDatabase.class);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(tcd, System.out);
        } catch (JAXBException ex) {
            Logger.getLogger(ParserTCX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void marshal(String outputPath) {
        try {
            TrainingCenterDatabase tcd = unmarshal();
            /* Marshall */
            JAXBContext jc = JAXBContext.newInstance(TrainingCenterDatabase.class);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(tcd, new File(outputPath + "output-" + FILENAME)); 
        } catch (JAXBException ex) {
            Logger.getLogger(ParserTCX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}