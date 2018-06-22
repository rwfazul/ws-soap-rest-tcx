/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resources;

import br.com.model.Lap;
import br.com.model.TrainingCenterDatabase;
import br.com.model.wrappers.Rota;
import br.com.parser.ParserTCX;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author isabella
 */
@Path("/distancia")
public class Distancia {
    
    private static TrainingCenterDatabase tcd;

    public Distancia() {
        tcd = ParserTCX.unmarshal();
    } 
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Rota getDistancia() {
        Double distanciaTotal = 0.0;
        List<Lap> laps = tcd.getActivities().getActivity().getLaps();
        for (Lap lap : laps)
            distanciaTotal += lap.getDistanceMeters();
        Rota rota = new Rota();
        rota.setDistanciaTotal(Math.floor(distanciaTotal * 100) / 100);
        return rota;
    }
    
}