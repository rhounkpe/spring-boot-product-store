package be.bt;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import be.bt.domain.Produit;
import be.bt.repository.IProduitRepository;

@SpringBootApplication
public class ProduitRestApiApplication {
	@Autowired
	private IProduitRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(ProduitRestApiApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runIt() {
		return args -> {
			repo.save(new Produit("A100", "Disque USB3 1TO", new BigDecimal("200.5")));
			repo.save(new Produit("A200", "Souris Optique", new BigDecimal("10.0")));
			repo.save(new Produit("A300", "Ecran plasma 21pouces", new BigDecimal("400.15")));
		};
	}
}
