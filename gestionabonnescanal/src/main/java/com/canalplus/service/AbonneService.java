package com.canalplus.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.canalplus.model.Abonne;
import com.canalplus.model.Mouvement;

@Service
public interface AbonneService {
	
	
	public abstract Abonne getAbonneById(Long IdAbonne);
	public abstract Abonne updateAbonneAdress(Abonne abonne , String newAdresse);
	public abstract void createMouvement(String oldAdresse , String newAdresse, String nomAbonne, String idAbonne);
	public abstract ArrayList<Abonne> gettingAbonnes();
	public abstract ArrayList<Mouvement> gettingListMouvement();
	
    
}
