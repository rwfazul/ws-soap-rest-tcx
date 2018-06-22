/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resources;

import br.com.model.Lap;
import br.com.model.TrainingCenterDatabase;
import br.com.model.wrappers.ListaDistancias;
import br.com.model.wrappers.Rota;
import br.com.parser.ParserTCX;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author isabella
 */
@Path("/distanciaporlap")
public class DistanciaPorLap {
    
    private static TrainingCenterDatabase tcd;

    public DistanciaPorLap() {
        tcd = ParserTCX.unmarshal();
    } 
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Rota getDistanciaPorLap() {
        ListaDistancias ld = new ListaDistancias();
        for (Lap lap : tcd.getActivities().getActivity().getLaps())
            ld.getDistancias().add(Math.floor(lap.getDistanceMeters() * 100) / 100); // round 2 casas decimais
        Rota rota = new Rota();
        rota.setDistanciasLaps(ld);
        return rota;
    }
    
}