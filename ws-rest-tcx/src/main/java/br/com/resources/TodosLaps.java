/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resources;

import br.com.model.TrainingCenterDatabase;
import br.com.model.wrappers.ListaLaps;
import br.com.model.wrappers.Rota;
import br.com.parser.ParserTCX;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author rhau
 */
@Path("/laps")
public class TodosLaps {
    
    private static TrainingCenterDatabase tcd;

    public TodosLaps() {
        tcd = ParserTCX.unmarshal();
    } 
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Rota getLaps() {
        ListaLaps laps = new ListaLaps(tcd.getActivities().getActivity().getLaps());
        Rota rota = new Rota();
        rota.setLaps(laps);
        return rota;
    }
    
}