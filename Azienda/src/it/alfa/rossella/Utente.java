package it.alfa.rossella;

public class Utente {
	
	protected String idUtente;
	protected String nome;
	protected String cognome;
	protected String username;
	protected String password;
	protected char ruolo;

	
	



	public Utente() {
	this.idUtente="";
	this.nome="";
	this.cognome="";
	this.username="";
	this.password="";
	this.ruolo=' ';
	}
	
	public Utente(String idUtente, String nome, String cognome,
			String username, String password, char ruolo) {
		super();
		this.idUtente = idUtente;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
	}

	public String getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(String idUtente) {
		this.idUtente = idUtente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getRuolo() {
		return ruolo;
	}

	public void setRuolo(char ruolo) {
		this.ruolo = ruolo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
