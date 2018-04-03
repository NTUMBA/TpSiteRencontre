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
@Table(name = "multimedia") // On peut modifier le nom de la table
public class Multimedia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	@NotNull
	private String type;

	@Column(length = 50)
	@NotNull
	private String genre;

	@Column(length = 50)
	@NotNull
	private String titre;

	@Column(length = 50)
	@NotNull
	private String artiste;

	// On indique les relations

	// Relation avec centre d interet
	@ManyToMany
	private List<Centre_interet> centre_interet;

	// CONSTRUCTEURS
	public Multimedia(Long id, @NotNull String type, @NotNull String genre, @NotNull String titre,
			@NotNull String artiste) {
		super();
		this.id = id;
		this.type = type;
		this.genre = genre;
		this.titre = titre;
		this.artiste = artiste;
	}

	// METHODE
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + " + type=" + type + " + genre=" + genre + " + titre=" + titre + " + artiste="
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getArtiste() {
		return artiste;
	}

	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

	

}
