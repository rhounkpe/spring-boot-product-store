package be.bt.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/{id}")
	public ResponseEntity<Produit> getProduitById(@PathVariable String id) {
		Optional<Produit> result = repo.findById(id);
		
		return (result.isPresent())? new ResponseEntity<>(result.get(), HttpStatus.OK)
				:
					new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
