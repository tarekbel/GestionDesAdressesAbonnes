package com.canalplus.gestionabonnescanal;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;
import com.canalplus.model.Abonne;
import com.canalplus.model.Contrat;
import com.canalplus.service.AbonneService;
import com.canalplus.service.AbonneServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@ContextConfiguration
@SpringBootTest
public class GestionabonnescanalApplicationTests {
	 @InjectMocks
	  private AbonneServiceImpl abbService = new AbonneServiceImpl() ;
	 @Mock
	    private RestTemplate restTemplate;
	 @Test
	    public void testingGettingAbonneById() {
		 
		 Contrat c = new Contrat(145582, 1,"particulier", "Paris", "tarek");
		 ArrayList<Contrat> listContrats = new ArrayList<Contrat>();
		 listContrats.add(c);
	        Abonne abbObjectTest = new Abonne(1L, "tarek", "12354", "Paris", listContrats);
	        Mockito
	          .when(restTemplate.getForEntity("http://localhost:8080/getabonne/1", Abonne.class))
	          .thenReturn(new ResponseEntity(abbObjectTest, HttpStatus.OK));
	        Abonne abonneFromService = abbService.getAbonneById(1L);
	        Assert.assertEquals(abbObjectTest.getId(), abonneFromService.getId());
	    }
	
 	 @Test
	    public void testingModifyAdress() {
		 Contrat c = new Contrat(145582,1, "particulier", "Paris", "Maher");
		 ArrayList<Contrat> listContrats = new ArrayList<Contrat>();
		 listContrats.add(c);
		 Abonne abonneModifieTest = new Abonne(1L, "tarek", "12354", "newAdresse", listContrats);
		 
		 Mockito
         .when(restTemplate.postForEntity("http://localhost:8080/abonne/1",abonneModifieTest, Abonne.class))
         .thenReturn(new ResponseEntity(abonneModifieTest, HttpStatus.OK));
		 
		 Abonne abonneUpdatedByService = abbService.updateAbonneAdress(abonneModifieTest, "newAdresse");
		 
		 Assert.assertEquals(abonneModifieTest.getAdresse(), abonneUpdatedByService.getAdresse());
		 
	 }
	 
	 @Test
	 public void gettingAllAbonnes() {
		 ArrayList<Abonne> listAbonnesTest = new ArrayList<Abonne>();
	      Contrat ctr1 = new Contrat(145220, 1, "particulier", "Paris", "Mr Tarek");
	      List<Contrat> listContratTarek = new ArrayList<Contrat>();
	      Contrat ctr2 = new Contrat(145220, 1, "professionelle", "Paris", "Mr Tarek");
	      listContratTarek.add(ctr2);
	      listContratTarek.add(ctr1);
	      Abonne abonne1 = new Abonne(1L,"tarek", "12354", "Lamarsa", listContratTarek);
	      
	      Contrat ctr3 = new Contrat(145820, 2, "particulier", "Paris", "Mr Christian");
	      List<Contrat> listContratChristian = new ArrayList<Contrat>();
	      Contrat ctr4 = new Contrat(145620, 2, "professionelle", "Paris", "Mr Christian");
	      listContratChristian.add(ctr3);
	      listContratChristian.add(ctr4);
	      Abonne abonne2 = new Abonne(2L,"Christian", "12354", "Lamarsa", listContratChristian);
	      listAbonnesTest.add(abonne1);
	      listAbonnesTest.add(abonne2);
		
		 Mockito
         .when(restTemplate.getForEntity("http://localhost:8080/abonnes", Abonne.class))
         .thenReturn(new ResponseEntity(listAbonnesTest, HttpStatus.OK));
		 ArrayList<Abonne> abonneListByService = abbService.gettingAbonnes();
		 Assert.assertEquals(listAbonnesTest.size(), abonneListByService.size());
	 }
}
