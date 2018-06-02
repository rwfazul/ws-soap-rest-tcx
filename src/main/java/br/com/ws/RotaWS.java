package br.com.ws;

import java.util.Date;
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
    @WebMethod(operationName = "horaInicio")
    @WebResult(name = "horaInicio")
    public Date getHoraInicio(); 
 
    /**
     *
     * @return duracao (hora:min:seg) da Activity
     */
    @WebMethod(operationName = "duracaoTotal")
    @WebResult(name = "duracaoTotal")
    public Date getDuracao();

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
    @WebResult(name = "quantidadeLaps")
    public Integer getQuantidadeLaps();
    
    /**
     *
     * @return distancia percorrida (em metros) em cada Lap
     */
    @WebMethod(operationName = "distanciaPorLap")
    @WebResult(name = "distanciasLaps")
    public ListaDouble getDistanciaPorLap(); 
    
    /**
     *
     * @return duracao (hora:min:seg) de cada Lap
     */
    @WebMethod(operationName = "duracaoPorLap")
    @WebResult(name = "duracoesLaps")
    public ListaDate getDuracaoPorLap();
    
    /**
     *
     * @return todos os Tracks de cada Lap (?) ou de um Lap em especifico (?)
     */
    @WebMethod(operationName = "todosOsTracks")
    @WebResult(name = "tracks")
    public String getTracksPorLap();
    
}