package br.com.ws;

import br.com.model.wrappers.ListaDuracoes;
import br.com.model.wrappers.ListaLaps;
import br.com.model.wrappers.ListaDistancias;
import br.com.model.Lap;
import br.com.model.Track;
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
        Double distanciaTotal = 0.0;
        List<Lap> laps = tcd.getActivities().getActivity().getLaps();
        for (Lap lap : laps)
            distanciaTotal += lap.getDistanceMeters();
        return Math.floor(distanciaTotal * 100) / 100; // round 2 casas decimais
    }

    @Override
    public ListaLaps getLaps() {
        return new ListaLaps(tcd.getActivities().getActivity().getLaps());
    }

    @Override
    public Integer getQuantidadeLaps() {
        return tcd.getActivities().getActivity().getLaps().size();
    }

    @Override
    public ListaDistancias getDistanciaPorLap() {
        ListaDistancias ld = new ListaDistancias();
        for (Lap lap : tcd.getActivities().getActivity().getLaps())
            ld.getDistancias().add(Math.floor(lap.getDistanceMeters() * 100) / 100); // round 2 casas decimais
        return ld;
    }

    @Override
    public ListaDuracoes getDuracaoPorLap() {
        ListaDuracoes ld = new ListaDuracoes("HH:mm:ss");
        for (Lap lap : tcd.getActivities().getActivity().getLaps()) 
            ld.getDuracoes().add( DateUtils.getHourForSecond( lap.getTotalTimeSeconds().intValue()) );
        return ld;    
    }

    @Override
    public Track getTracksPorLap() {
        for (Lap lap : tcd.getActivities().getActivity().getLaps())
            return lap.getTrack();
        return null;
    }

}