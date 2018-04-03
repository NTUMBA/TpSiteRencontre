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
public class Situation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 25)
	@NotNull
	private String statutPro;

	@Column(length = 25)
	@NotNull
	private String statutPerso;

	@Column(length = 25)
	@NotNull
	private Integer nberEnf;

	@Column(length = 25)
	@NotNull
	private String orientation;

	@Column(length = 25)
	@NotNull
	private String fumeur;

	@Column(length = 25)
	@NotNull
	private String alcool;

	// On indique les relations

	@OneToMany
	@JoinColumn(name = "situation_id")
	private List<Utilisateur> utilisateur;

	// CONSTRUCTEURS

	public Situation(Long id, @NotNull String statutPro, @NotNull String statutPerso, @NotNull Integer nberEnf,
			@NotNull String orientation, @NotNull String fumeur, @NotNull String alcool) {
		super();
		this.id = id;
		this.statutPro = statutPro;
		this.statutPerso = statutPerso;
		this.nberEnf = nberEnf;
		this.orientation = orientation;
		this.fumeur = fumeur;
		this.alcool = alcool;
	}

	public Situation() {

	}

	// METHODE
	@Override
	public String toString() {
		return "Apparence [id=" + id + " + statutPro=" + statutPro + " + statutPerso=" + statutPerso + " + nberEnf ="
				+ nberEnf + " + orientation=" + orientation + " + fumeur=" + fumeur + " + alcool=" + alcool + "]";
	}

	// GETTERS ET SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatutPro() {
		return statutPro;
	}

	public void setStatutPro(String statutPro) {
		this.statutPro = statutPro;
	}

	public String getStatutPerso() {
		return statutPerso;
	}

	public void setStatutPerso(String statutPerso) {
		this.statutPerso = statutPerso;
	}

	public Integer getNberEnf() {
		return nberEnf;
	}

	public void setNberEnf(Integer nberEnf) {
		this.nberEnf = nberEnf;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getFumeur() {
		return fumeur;
	}

	public void setFumeur(String fumeur) {
		this.fumeur = fumeur;
	}

	public String getAlcool() {
		return alcool;
	}

	public void setAlcool(String alcool) {
		this.alcool = alcool;
	}

	public List<Utilisateur> getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(List<Utilisateur> utilisateur) {
		this.utilisateur = utilisateur;
	}

}
