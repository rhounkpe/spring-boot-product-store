package be.bt.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Produits")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produit {
	@Id
	private String code;
	
	private String titre;
	private BigDecimal prixUnitaire;
}
