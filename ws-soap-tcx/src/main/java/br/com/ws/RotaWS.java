package br.com.ws;

import br.com.model.wrappers.ListaDuracoes;
import br.com.model.wrappers.ListaLaps;
import br.com.model.wrappers.ListaDistancias;
import br.com.model.Track;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface RotaWS {

    /**
     *
     * @return hora de inicio (hora:min:seg) da Activity
     */
    @WebMethod(operationName = "horaDeInicio")
    @WebResult(name = "horaDeInicio")
    public String getHoraInicio(); 
 
    /**
     *
     * @return duracao (hora:min:seg) da Activity
     */
    @WebMethod(operationName = "duracaoTotal")
    @WebResult(name = "duracaoTotal")
    public String getDuracao();

    /**
     *
     * @return total de distancia (em metros) percorrida na Activity
     */
    @WebMethod(operationName = "distanciaTotal")
    @WebResult(name = "distanciaTotal")
    public Double getDistancia(); 
   
    /**
     *
     * @return todos os Laps da Activity
     */
    @WebMethod(operationName = "todosOsLaps")
    @WebResult(name = "laps")
    public ListaLaps getLaps();  
     
    /**
     *
     * @return quantidade/total de Laps
     */
    @WebMethod(operationName = "quantidadeDeLaps")
    @WebResult(name = "quantidadeDeLaps")
    public Integer getQuantidadeLaps();
    
    /**
     *
     * @return distancia percorrida (em metros) em cada Lap
     */
    @WebMethod(operationName = "distanciaPorLap")
    @WebResult(name = "distanciasLaps")
    public ListaDistancias getDistanciaPorLap(); 
    
    /**
     *
     * @return duracao (hora:min:seg) de cada Lap
     */
    @WebMethod(operationName = "duracaoPorLap")
    @WebResult(name = "duracoesLaps")
    public ListaDuracoes getDuracaoPorLap();
    
    /**
     *
     * @return todos os TrackPoints de um Lap em especifico
     */
    @WebMethod(operationName = "todosOsTracksDeUmLap")
    @WebResult(name = "tracks")
    public Track getTracksPorLap();
    
}