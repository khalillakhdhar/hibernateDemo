package com.jpa.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vendeur extends Personne{
	
	private String boutique;
	private long patente;
	private String specialite;

}
