package com.objis.cameroun.proxibanque.dao;

import com.objis.cameroun.proxibanque.domaine.Client;

public interface IDao {
	
	// Methode pour l'Administrateur
	
	public void attribuerRoleDao();
	public void creerUtilisteurDao();
	
	// Methode pour le Conseiller
	public int creerClientDao(Client cli);
	public int faireVirementCompteACompteDao(long lg,String st,String str);
	public void gererPatrimoineDao(long lg,long lgn, String st);
	public void lireInfoClientDao(Client cli);
	public int modifierInfoClientDao(Client cli);
	public void simulerCreditDao(long lg, String st);
	
	

}
