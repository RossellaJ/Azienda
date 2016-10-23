package it.alfa.rossella.servizi;

import java.util.List;

import it.alfa.rossella.ClienteBean;
import it.alfa.rossella.DipendenteBean;
import it.alfa.rossella.UtenteBean;
import it.alfa.rossella.dao.ClienteDao;
import it.alfa.rossella.dao.DipendenteDao;
import it.alfa.rossella.dao.RubricaDao;
import it.alfa.rossella.dao.UtenteDao;
import it.alfa.rossella.dao.VoceDao;
import utility.CodificationOfPassword;

public class Servizi {
	
	UtenteDao uDao = new UtenteDao();
	DipendenteDao dDao = new DipendenteDao();
	ClienteDao cDao = new ClienteDao();
	RubricaDao rubDao = new RubricaDao();
	VoceDao vocDao = new VoceDao();
	
	
	//registo un Utente
	
	public boolean registraUtente(UtenteBean u){
		boolean res=false;
		res=uDao.creaUtente(u);
		return res;
	}
	
	//admin aggiunge cliente
	
	public boolean registraCliente(ClienteBean c){
		return cDao.inserisciCliente(c);
	}
	
	
	//admin aggiunge dipendente
	public boolean registraDipendente(DipendenteBean d){
		return dDao.inserisciDipendente(d);
	}
	
	//metodo per codificare la password         
	public String convertiPass(String pass) {
		return CodificationOfPassword.codificatePass(pass);
	}
	
	//trovare un utente con suo username  //trovare un cliente e trovare un dipendente
	public UtenteBean getUtente(String username) {
		UtenteBean u =null;
		u = uDao.trovaUtenteConUsername(username);
		return u;
	}
	//trovare un utente con username(boolean)
	public boolean trovaUtenteUsername(String username) {
		boolean result =false;
		result = uDao.readUtenteUsername(username);
		return result;
	}
	
	
		//metodo per avere la lista dei clienti
		public List<ClienteBean> getClienti(){
			return cDao.readTuttiClienti();
		}
		
		
		//metodo per avere la lista dei dipendenti
		
		public List<DipendenteBean> getDipendenti(){
			return dDao.readTuttiDipendente();
	}
	
	
	

	
	

}
