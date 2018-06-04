package br.com.ws;

import br.com.model.Lap;
import br.com.model.TrackPoint;
import br.com.model.TrainingCenterDatabase;
import br.com.parser.ParserTCX;
import br.com.util.DateUtils;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "br.com.ws.RotaWS")
public class RotaWSImpl implements RotaWS {

    private static TrainingCenterDatabase tcd;
    
    public RotaWSImpl() {
       tcd = ParserTCX.unmarshal();
    }
    
    @Override
    public String getHoraInicio() {
        Date date = tcd.getActivities().getActivity().getId().getTime();
        return DateUtils.toString(date, "HH:mm:ss");
    }

    @Override
    public String getDuracao() {
        // obtem tempo de inicio da activity 
        Date start = tcd.getActivities().getActivity().getId().getTime();
        
        // obtem tempo do ultimo trackpoint do ultimo lap
        List<Lap> laps = tcd.getActivities().getActivity().getLaps();
        Lap lastLap = laps.get(laps.size() - 1);
        List<TrackPoint> trackpoints = lastLap.getTrack().getTrackPoints();
        TrackPoint lastTrackPoint = trackpoints.get(trackpoints.size() - 1);
        Date end = lastTrackPoint.getTime().getTime();

        return DateUtils.diffTime(start, end);             
    }


    @Override
    public Double getDistancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaLaps getLaps() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getQuantidadeLaps() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaDouble getDistanciaPorLap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListaDate getDuracaoPorLap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTracksPorLap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}