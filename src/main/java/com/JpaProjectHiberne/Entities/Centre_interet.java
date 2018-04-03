package com.JpaProjectHiberne.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity // On indique a Spring que cette classe est une Entite
@Table(name = "Centre_interet") // On peut modifier le nom de la table
public class Centre_interet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50)
	@NotNull
	private String sport;

	@Column(length = 50)
	@NotNull
	private String loisir;

	
	
	// Relation avec utilisateur
	@ManyToMany
	private List<Utilisateur> utilisateur;
	
	//// Relation avec multimedia
	@ManyToMany
	private List<Multimedia> multimedia;

	// CONSTRUCTEURS
	public Centre_interet(Long id, @NotNull String sport,@NotNull String loisir) {
		super();
		this.id = id;
		this.sport = sport;
		this.loisir = loisir;
	}

	public Centre_interet() {

	}

	// METHODE
	@Override
	public String toString() {
		return "Adress [id=" + id + " + sport=" + sport + " + loisir=" + loisir + "]";
	}

	// LES ACCESSEURS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getLoisir() {
		return loisir;
	}

	public void setLoisir(String loisir) {
		this.loisir = loisir;
	}

	

}
