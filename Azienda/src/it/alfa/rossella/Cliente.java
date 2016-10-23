package it.alfa.rossella;

public class Cliente extends Utente {
	
	private String ragioneSociale;
	private String partitaIva;
	
	
	
	public Cliente() {
		super();
		this.ragioneSociale="";
		this.partitaIva="";
	}



	public Cliente(String ragioneSociale, String partitaIva) {
		super();
		this.ragioneSociale = ragioneSociale;
		this.partitaIva = partitaIva;
	}



	public String getRagioneSociale() {
		return ragioneSociale;
	}



	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}



	public String getPartitaIva() {
		return partitaIva;
	}



	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}
	
	
	

}
