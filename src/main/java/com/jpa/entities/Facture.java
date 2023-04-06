package com.jpa.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // génére une table dans la BD
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Facture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(unique = true)
	private String titre;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFacture;
	@Column(nullable = false)
	private String produit;
	@Column(nullable = false)
	private double prix;
	@Min(value = 1)
	private int quantite;
}
