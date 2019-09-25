package com.canalplus.model;

public class Mouvement {
	
	private String ancienneAdr;
	
	private String nouvelleAdr;
	
	private String nomAbonne;
	
	private String idAbonne;
	
	
	public Mouvement(String ancienneAdr, String nouvelleAdr, String nomAbonne, String idAbonne) {
		super();
		this.ancienneAdr = ancienneAdr;
		this.nouvelleAdr = nouvelleAdr;
		this.nomAbonne = nomAbonne;
		this.idAbonne = idAbonne;
	}

	public String getAncienneAdr() {
		return ancienneAdr;
	}

	public void setAncienneAdr(String ancienneAdr) {
		this.ancienneAdr = ancienneAdr;
	}

	public String getNouvelleAdr() {
		return nouvelleAdr;
	}

	public void setNouvelleAdr(String nouvelleAdr) {
		this.nouvelleAdr = nouvelleAdr;
	}

	public String getNomAbonne() {
		return nomAbonne;
	}

	public void setNomAbonne(String nomAbonne) {
		this.nomAbonne = nomAbonne;
	}

	public String getIdAbonne() {
		return idAbonne;
	}

	public void setIdAbonne(String idAbonne) {
		this.idAbonne = idAbonne;
	}
	
	
	
	

}
