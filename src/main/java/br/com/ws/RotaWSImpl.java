package br.csi.ws;

import javax.jws.WebService;

@WebService(endpointInterface="br.csi.ws.PrimeiroWS")
public class PrimeiroWSImpl implements PrimeiroWS {

        @Override
	public String getMsgAsString() {
		// TODO Auto-generated method stub
		return "Web service com tomcat e maven!";
	}

}
