/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.wrappers;

import br.com.model.Track;
import br.com.model.TrainingCenterDatabase;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rhau
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Rota {
    
    private String horaDeInicio;
    private String duracaoTotal;
    private Double distanciaTotal;
    private ListaLaps laps;
    private Integer quantidadeDeLaps;
    private ListaDistancias distanciasLaps;
    private ListaDuracoes duracoesLaps;
    private Track tracks;
    private TrainingCenterDatabase TrainingCenterDatabase;

    public Rota() {
    }

    public String getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(String horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public String getDuracaoTotal() {
        return duracaoTotal;
    }

    public void setDuracaoTotal(String duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }

    public Double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(Double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public ListaLaps getLaps() {
        return laps;
    }

    public void setLaps(ListaLaps laps) {
        this.laps = laps;
    }

    public Integer getQuantidadeDeLaps() {
        return quantidadeDeLaps;
    }

    public void setQuantidadeDeLaps(Integer quantidadeDeLaps) {
        this.quantidadeDeLaps = quantidadeDeLaps;
    }

    public ListaDistancias getDistanciasLaps() {
        return distanciasLaps;
    }

    public void setDistanciasLaps(ListaDistancias distanciasLaps) {
        this.distanciasLaps = distanciasLaps;
    }

    public ListaDuracoes getDuracoesLaps() {
        return duracoesLaps;
    }

    public void setDuracoesLaps(ListaDuracoes duracoesLaps) {
        this.duracoesLaps = duracoesLaps;
    }

    public Track getTracks() {
        return tracks;
    }

    public void setTracks(Track tracks) {
        this.tracks = tracks;
    }

    public TrainingCenterDatabase getTrainingCenterDatabase() {
        return TrainingCenterDatabase;
    }

    public void setTrainingCenterDatabase(TrainingCenterDatabase TrainingCenterDatabase) {
        this.TrainingCenterDatabase = TrainingCenterDatabase;
    }

    @Override
    public String toString() {
        return "Rota{" + "horaDeInicio=" + horaDeInicio + ", duracaoTotal=" + duracaoTotal + ", distanciaTotal=" + distanciaTotal + ", laps=" + laps + ", quantidadeDeLaps=" + quantidadeDeLaps + ", distanciasLaps=" + distanciasLaps + ", duracoesLaps=" + duracoesLaps + ", tracks=" + tracks + ", TrainingCenterDatabase=" + TrainingCenterDatabase + '}';
    }
       
}