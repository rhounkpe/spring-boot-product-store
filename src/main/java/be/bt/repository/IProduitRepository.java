package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.bt.domain.Produit;

public interface IProduitRepository extends JpaRepository<Produit, String> {

}
