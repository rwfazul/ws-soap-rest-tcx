/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.resources;
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
@Path("/unmarshal")
public class UnMarshal {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Rota doUnMarshal() {
        Rota rota = new Rota();
        rota.setTrainingCenterDatabase( ParserTCX.unmarshal() );
        return rota;
    }
    
}