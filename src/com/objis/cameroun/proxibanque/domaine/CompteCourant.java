package com.objis.cameroun.proxibanque.domaine;

public class CompteCourant extends CompteBancaire {

	private long autorisation_de_decouvert;

	public long getAutorisation_de_decouvert() {
		return autorisation_de_decouvert;
	}
	
	

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CompteCourant(int idCompte, String dateOuverture, String numCompte,
			float solde) {
		super(idCompte, dateOuverture, numCompte, solde);
		// TODO Auto-generated constructor stub
	}



	public CompteCourant(String dateOuverture, String numCompte, float solde) {
		super(dateOuverture, numCompte, solde);
		// TODO Auto-generated constructor stub
	}



	public void setAutorisation_de_decouvert(long autorisation_de_decouvert) {
		this.autorisation_de_decouvert = autorisation_de_decouvert;
	}
	
	
}
