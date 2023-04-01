 package ws;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService (serviceName="BanqueWS")

public class BanqueService {
	@WebMethod (operationName = "Convert")

	 public double conversion(@WebParam(name = "montant") double mt ) {
		 return mt*10.54 ;
	 }
	
	@WebMethod
	 public Compte getcompte(@WebParam(name = "code") int code) {
		 return new Compte(code,Math.random()*9888 , new Date());
		 
	 }
	
	@WebMethod
    public List<Compte> listCompte(){
        return Arrays.asList(
                new Compte(1, Math.random()*9888,new Date()),
                new Compte(2, Math.random()*9888,new Date()),
                new Compte(3, Math.random()*9888,new Date()));
    }
	  
				 
				 
	 }


