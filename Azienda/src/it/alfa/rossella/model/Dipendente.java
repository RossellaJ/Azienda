package it.alfa.rossella.model;

public class Dipendente extends Utente{
	
	private String stipendio;
	private String posizione;
	
	
	public Dipendente() {
		super();
		this.stipendio="";
		this.posizione="";
	}


	public Dipendente(String stipendio, String posizione) {
		super();
		this.stipendio = stipendio;
		this.posizione = posizione;
	}


	public String getStipendio() {
		return stipendio;
	}


	public void setStipendio(String stipendio) {
		this.stipendio = stipendio;
	}


	public String getPosizione() {
		return posizione;
	}


	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}
	
	

}
