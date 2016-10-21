package it.alfa.rossella.model;

public class Admin extends Utente{
	
	private String livelloAccesso;

	public Admin() {
		super();
		this.livelloAccesso="";
	}

	public Admin(String livelloAccesso) {
		super();
		this.livelloAccesso = livelloAccesso;
	}

	public String getLivelloAccesso() {
		return livelloAccesso;
	}

	public void setLivelloAccesso(String livelloAccesso) {
		this.livelloAccesso = livelloAccesso;
	}
	
	
	
	
	

}
