package com.JpaProjectHiberne.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity // On indique a Spring que cette classe est une Entite
@Table(name = "apparence") // On peut modifier le nom de la table
public class Apparence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 500)
	@NotNull
	private Integer taille;

	@Column(length = 25)
	@NotNull
	private String couleurYeux;

	@Column(length = 25)
	@NotNull
	private String origine;

	@Column(length = 25)
	@NotNull
	private String couleurCheveux;

	@Column(length = 25)
	@NotNull
	private String typeCheveux;

	@Column(length = 25)
	@NotNull
	private Float masse;

	// On indique les relations
	@OneToMany
	@JoinColumn(name = "apparence_id")
	private List<Utilisateur> utilisateur;
	

	// CONSTRUCTEURS
	public Apparence(Long id, @NotNull Integer taille, @NotNull String couleurYeux, @NotNull String origine,
			@NotNull String couleurCheveux, @NotNull String typeCheveux, @NotNull Float masse) {
		super();
		this.id = id;
		this.taille = taille;
		this.couleurYeux = couleurYeux;
		this.origine = origine;
		this.couleurCheveux = couleurCheveux;
		this.typeCheveux = typeCheveux;
		this.masse = masse;
	}

	public Apparence() {

	}

	// METHODE
	@Override
	public String toString() {
		return "Apparence [id=" + id + " + taille=" + taille + " + couleurYeux=" + couleurYeux + " + origine ="
				+ origine + " + couleurCheveux=" + couleurCheveux + " + typeCheveux=" + typeCheveux + " + masse="
				+ masse + "]";
	}

	// GETTERS ET SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTaille() {
		return taille;
	}

	public void setTaille(Integer taille) {
		this.taille = taille;
	}

	public String getCouleurYeux() {
		return couleurYeux;
	}

	public void setCouleurYeux(String couleurYeux) {
		this.couleurYeux = couleurYeux;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public String getCouleurCheveux() {
		return couleurCheveux;
	}

	public void setCouleurCheveux(String couleurCheveux) {
		this.couleurCheveux = couleurCheveux;
	}

	public String getTypeCheveux() {
		return typeCheveux;
	}

	public void setTypeCheveux(String typeCheveux) {
		this.typeCheveux = typeCheveux;
	}

	public Float getMasse() {
		return masse;
	}

	public void setMasse(Float masse) {
		this.masse = masse;
	}

	
	public List<Utilisateur> getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(List<Utilisateur> utilisateur) {
		this.utilisateur = utilisateur;
	}

}
