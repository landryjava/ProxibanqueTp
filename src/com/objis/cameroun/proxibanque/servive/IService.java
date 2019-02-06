package com.objis.cameroun.proxibanque.servive;

import com.objis.cameroun.proxibanque.domaine.Client;

public interface IService {

	
	// Service pour l'Administrateur
	
	public void attribuerRoleService();
	public void creerUtilisteurService();
	
	// Service pour le Conseiller
	public int creerClientService(Client cli);
	public int faireVirementCompteACompteService(long lg,String st,String str);
	public void gererPatrimoineService(long lg,long lgn, String st);
	public void lireInfoClientService(Client cli);
	public int modifierInfoClientService(Client cli);
	public void simulerCreditService(long lg, String st);
	
	
	
}
