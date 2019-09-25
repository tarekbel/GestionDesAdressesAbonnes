package com.canalplus.model;
import java.util.List;

public class Abonne {
	private Long id;
	private String name;
	private String Identifiant;
	private String Adresse;
	private List<Contrat> listContrats;
	
	
	
	public Abonne() {
		
	}
	
	public Abonne(Long id ,String name, String identifiant, String adresse,List<Contrat> listContrats) {
		super();
		this.name = name;
		Identifiant = identifiant;
		Adresse = adresse;
		this.listContrats = listContrats;
		this.id = id;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public List<Contrat> getListContrats() {
		return listContrats;
	}

	public void setListContrats(List<Contrat> listContrats) {
		this.listContrats = listContrats;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentifiant() {
		return Identifiant;
	}
	public void setIdentifiant(String identifiant) {
		Identifiant = identifiant;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
}
