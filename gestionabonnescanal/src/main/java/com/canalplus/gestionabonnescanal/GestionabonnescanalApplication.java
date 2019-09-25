package com.canalplus.gestionabonnescanal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.canalplus.service.AbonneService;
import com.canalplus.service.AbonneServiceImpl;


@Configuration
@SpringBootApplication
@ComponentScan({"com.canalplus.controller"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class GestionabonnescanalApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionabonnescanalApplication.class, args);
	}

	
	@Bean
	public AbonneService transactionService() {
	    return new AbonneServiceImpl();
	}
}
