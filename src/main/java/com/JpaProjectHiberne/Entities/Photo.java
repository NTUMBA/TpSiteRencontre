package com.JpaProjectHiberne.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity // On indique a Spring que cette classe est une Entite
@Table(name = "photo") // On peut modifier le nom de la table
public class Photo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 450)
	@NotNull
	private String lien;

	@Column(length = 450)
	@NotNull
	private Integer note;

	@ManyToOne
	private Utilisateur utilisateur;
	

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	// CONSTRUCTEURS

	public Photo() {

	}

	// METHODE
	@Override
	public String toString() {
		return "Photo [id=" + id + " + lien=" + lien + " + note=" + note + "]";
	}
	// ACCESSEURS

	public Long getId() {
		return id;
	}

	public Photo(Long id, @NotNull String lien, @NotNull Integer note) {
		super();
		this.id = id;
		this.lien = lien;
		this.note = note;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public Integer getNote() {
		return note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}

}
