/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resources;

import br.com.model.TrainingCenterDatabase;
import br.com.model.wrappers.Rota;
import br.com.parser.ParserTCX;
import br.com.util.DateUtils;
import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author rhau
 */
@Path("/horainicio")
public class HoraInicio {
    
    private static TrainingCenterDatabase tcd;

    public HoraInicio() {
        tcd = ParserTCX.unmarshal();
    } 
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Rota getHoraInicio() {
        Date date = tcd.getActivities().getActivity().getId().getTime();
        Rota rota = new Rota();
        rota.setHoraDeInicio( DateUtils.toString(date, "HH:mm:ss") );
        return rota;
    }
    
}