package com.objis.cameroun.proxibanque.domaine;

public class CompteEpargne extends CompteBancaire {

	private float tauxDeRenumeration;

	public CompteEpargne(float tauxDeRenumeration) {
		super();
		this.tauxDeRenumeration = tauxDeRenumeration;
	}

	public float getTauxDeRenumeration() {
		return tauxDeRenumeration;
	}

	public void setTauxDeRenumeration(float tauxDeRenumeration) {
		this.tauxDeRenumeration = tauxDeRenumeration;
	}
	
	
}
