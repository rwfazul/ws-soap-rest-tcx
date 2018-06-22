/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resources;

import br.com.model.TrainingCenterDatabase;
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
@Path("/quantidadelaps")
public class QuantidadeLaps {
    
    private static TrainingCenterDatabase tcd;

    public QuantidadeLaps() {
        tcd = ParserTCX.unmarshal();
    } 
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Rota getQuantidadeLaps() {
        Rota rota = new Rota();
        Integer QtdLaps = tcd.getActivities().getActivity().getLaps().size();
        rota.setQuantidadeDeLaps(QtdLaps);
        return rota;
    }
    
}