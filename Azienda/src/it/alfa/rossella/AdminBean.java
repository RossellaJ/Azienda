package it.alfa.rossella;

public class AdminBean extends UtenteBean{
	
	/**
	 * 
	 */
private static final long serialVersionUID = 1L;
	
	private String livelloAccesso;
	
	

	public AdminBean() {
		super();
		this.livelloAccesso="";
	}
	
	
	public AdminBean(String nome, String cognome,
			String username, String password, char ruolo, String livelloAccesso) {
		super(nome,cognome,username,password,ruolo);
		this.livelloAccesso = livelloAccesso;
}
	
	public AdminBean(String livelloAccesso) {
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
