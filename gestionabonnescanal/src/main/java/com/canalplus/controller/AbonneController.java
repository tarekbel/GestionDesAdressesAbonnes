package com.canalplus.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.canalplus.model.Abonne;
import com.canalplus.model.ListDesAbonnes;
import com.canalplus.model.ListDesMouvements;
import com.canalplus.model.Mouvement;
import com.canalplus.service.AbonneService;



@Controller
public class AbonneController {
	@Autowired
	AbonneService abonneService;
	
	@RequestMapping(value = "/abonne/{id}", method = RequestMethod.PUT)
	  public ResponseEntity<Abonne> updateAbonne(@PathVariable("id") String id, @RequestBody Abonne abonne) {
		Abonne ab = abonneService.updateAbonneAdress(abonne, abonne.getAdresse());
	    return new ResponseEntity<Abonne>(ab, HttpStatus.OK);
	   }
	
	
	@RequestMapping(value = "/abonnes", method = RequestMethod.GET)
	  public ResponseEntity<List<Abonne>> getListAbonne() {
	   return new ResponseEntity<List<Abonne>>(abonneService.gettingAbonnes(), HttpStatus.OK);
	   }
	
	@RequestMapping(value = "/mouvements", method = RequestMethod.GET)
	  public ResponseEntity<List<Mouvement>> getListMouvement() {
	   return new ResponseEntity<List<Mouvement>>(abonneService.gettingListMouvement(), HttpStatus.OK);
	   }
	
	@RequestMapping(value = "/getabonne/{id}", method = RequestMethod.GET)
	  public ResponseEntity<Abonne> getAbonneById(@PathVariable("id") Long id) {
		Abonne ab = abonneService.getAbonneById(id);
	    return new ResponseEntity<Abonne>(ab, HttpStatus.OK);
	   }
}
