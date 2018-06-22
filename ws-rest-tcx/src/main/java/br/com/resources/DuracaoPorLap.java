/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resources;

import br.com.model.Lap;
import br.com.model.TrainingCenterDatabase;
import br.com.model.wrappers.ListaDuracoes;
import br.com.model.wrappers.Rota;
import br.com.parser.ParserTCX;
import br.com.util.DateUtils;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author isabella
 */
@Path("/duracaoporlap")
public class DuracaoPorLap {
    
    private static TrainingCenterDatabase tcd;

    public DuracaoPorLap() {
        tcd = ParserTCX.unmarshal();
    } 
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Rota getDuracaoPorLap() {
        ListaDuracoes ld = new ListaDuracoes("HH:mm:ss");
        for (Lap lap : tcd.getActivities().getActivity().getLaps()) 
            ld.getDuracoes().add( DateUtils.getHourForSecond( lap.getTotalTimeSeconds().intValue()) );
        Rota rota = new Rota();
        rota.setDuracoesLaps(ld);
        return rota;
    }
    
}