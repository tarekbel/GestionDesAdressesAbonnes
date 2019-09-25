package com.canalplus.model;

public class Contrat {
	
	private String titulaire;
	private Integer IdAbonne;
	private Integer numContrat;
	private String type;
	private String adresse;
	
	
	public Contrat(Integer numContrat,Integer IdAbonne, String type, String adresse,String titulaire) {
		super();
		this.numContrat = numContrat;
		
		this.type = type;
		this.adresse = adresse;
		this.titulaire = titulaire;
		this.IdAbonne = IdAbonne;
	}
	public Integer getNumContrat() {
		return numContrat;
	}
	public void setNumContrat(Integer numContrat) {
		this.numContrat = numContrat;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAbonne() {
		return this.adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTitulaire() {
		return titulaire;
	}
	public void setTitulaire(String titulaire) {
		this.titulaire = titulaire;
	}
	public Integer getIdAbonne() {
		return IdAbonne;
	}
	public void setIdAbonne(Integer idAbonne) {
		IdAbonne = idAbonne;
	}
	public String getAdresse() {
		return adresse;
	}
	
	
	
	
	
	

}
