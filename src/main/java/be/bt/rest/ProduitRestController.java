package be.bt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.bt.domain.Produit;
import be.bt.repository.IProduitRepository;

@RestController
@RequestMapping("/produits")
@CrossOrigin(origins="*")
public class ProduitRestController {
	@Autowired
	private IProduitRepository repo;
	
	@GetMapping("")
	public List<Produit> getAll() {
		return repo.findAll();
	}
}
