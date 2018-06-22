/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resources;

import br.com.model.Lap;
import br.com.model.TrackPoint;
import br.com.model.TrainingCenterDatabase;
import br.com.model.wrappers.Rota;
import br.com.parser.ParserTCX;
import br.com.util.DateUtils;
import java.util.Date;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author isabella
 */
@Path("/duracao")
public class Duracao {
    
    private static TrainingCenterDatabase tcd;

    public Duracao() {
        tcd = ParserTCX.unmarshal();
    } 
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Rota getDuracao() {
        // obtem tempo de inicio da activity 
        Date start = tcd.getActivities().getActivity().getId().getTime();
        
        // obtem tempo do ultimo trackpoint do ultimo lap
        List<Lap> laps = tcd.getActivities().getActivity().getLaps();
        Lap lastLap = laps.get(laps.size() - 1);
        List<TrackPoint> trackpoints = lastLap.getTrack().getTrackPoints();
        TrackPoint lastTrackPoint = trackpoints.get(trackpoints.size() - 1);
        Date end = lastTrackPoint.getTime().getTime();
        Rota rota = new Rota();
        rota.setDuracaoTotal(DateUtils.diffTime(start, end));
        return rota;
    }
}
