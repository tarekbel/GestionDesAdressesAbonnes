package com.canalplus.service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.canalplus.model.Abonne;
import com.canalplus.model.ListDesAbonnes;
import com.canalplus.model.ListDesMouvements;
import com.canalplus.model.Mouvement;


@Service
public class AbonneServiceImpl implements AbonneService{

	@Override
	public Abonne updateAbonneAdress(Abonne abonne , String newAdresse) {
		
		List<Abonne> listAbonnes = ListDesAbonnes.getInstance().getArray();
		List<Abonne> ListAbonnesfiltred = listAbonnes.stream().filter(a->a.getId().equals(abonne.getId())).collect(Collectors.toList());
		
		String oldAdress =  ListAbonnesfiltred.get(0).getAdresse();
		ListAbonnesfiltred.get(0).setAdresse(newAdresse);
		
		for (Abonne ab : ListDesAbonnes.getInstance().getArray()) {
			if (ab.getId()==ListAbonnesfiltred.get(0).getId()) {
				ab.setAdresse(ListAbonnesfiltred.get(0).getAdresse());
				ab.getListContrats().forEach(c->c.setAdresse(ListAbonnesfiltred.get(0).getAdresse()));
			}
		}
		
		Mouvement mvmt = new Mouvement(oldAdress, newAdresse, abonne.getName(), abonne.getIdentifiant());
		ListDesMouvements.getInstance().addToArray(mvmt);
		
		return ListAbonnesfiltred.get(0);
	}

	@Override
	public void createMouvement(String oldAdresse, String newAdresse, String nomAbonne, String idAbonne) {
           
	      
	}

	@Override
	public Abonne getAbonneById(Long IdAbonne) {
		List<Abonne> ListAbonnesfiltred = ListDesAbonnes.getInstance().getArray().stream().filter(a->a.getId().equals(IdAbonne)).collect(Collectors.toList());
		System.out.println("Abonne Found "+ListAbonnesfiltred.get(0));
		Abonne abonneFound = ListAbonnesfiltred.get(0);
		return abonneFound;
	}

	@Override
	public ArrayList<Abonne> gettingAbonnes() {
		return ListDesAbonnes.getInstance().getArray();
		
	}

	@Override
	public ArrayList<Mouvement> gettingListMouvement() {
		return ListDesMouvements.getInstance().getArray();
	}

	
	
}
