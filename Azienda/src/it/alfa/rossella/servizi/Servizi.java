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
import it.alfa.rossella.model.Rubrica;
import it.alfa.rossella.model.Voce;
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
	//trovare Utente per nome e cognome
	public boolean trovaUtenteNomeCognome(String nome, String cognome){
		return uDao.readUtenteNomeCognome(nome, cognome);
	}
	
		//metodo per avere la lista dei clienti
		public List<ClienteBean> getClienti(){
			return cDao.readTuttiClienti();
		}
		
		
		//metodo per avere la lista dei dipendenti
		
		public List<DipendenteBean> getDipendenti(){
			return dDao.readTuttiDipendente();
	}
	
	//METODI PER GESTIRE RUBRICHE E VOCI
	
		//creare rubrica
		
		public boolean CreareRubricaUtente(String username){
			boolean res=false;
			Rubrica r = new Rubrica(username);
			res = rubDao.creaRubrica(r);
			return res;
		}
		
		//aggiungere voce a rubrica
		
		public boolean AggiungiVoceaRubrica(String username, String nome, String cognome, String telefono){
			boolean res=false;
			Rubrica r = new Rubrica(username);
			Voce v = new Voce(nome,cognome,telefono);
			
			vocDao.creaVoce(v);
			r.addVoce(v);
			rubDao.aggiornaRubrica(r);
			
			if(vocDao.leggiVoceConNome(nome).equals(v)){
				res = true;
			}
				
			return res;
			
		}
	    //eliminare voce da rubrica
		public boolean eliminaVocedaRubrica(Rubrica r, String nome){
			boolean res=false;
			
			Voce v = vocDao.leggiVoceConNome(nome);
			vocDao.eliminaVoce(v);
			res = rubDao.aggiornaRubrica(r);
			
			return res;
		}
		
		//metodo per prendere tutte le voci di rubrica
		
		public List<Voce> getVoci(long idRubrica) {
			List<Voce> lista = vocDao.getTutteleVoci(idRubrica);

			return lista;
	}
}
