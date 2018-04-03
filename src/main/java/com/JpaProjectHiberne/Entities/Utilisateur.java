package com.JpaProjectHiberne.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;



@Entity // On indique a Spring que cette classe est une Entite
@Table(name = "utilisateur") // On peut modifier le nom de la table
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	@NotNull
	private String nom;

	@Column(length = 50)
	@NotNull
	private String prenom;

	@DateTimeFormat
	@Column(columnDefinition = "date", name = "birthday")
	private String dateDeNaissance;

	@Column(length = 50)
	@NotNull
	private String sexe;

	@Column(length = 50)
	@NotNull
	private String password;

	@Column(length = 15)
	@NotNull
	private String description;

	@Column(length = 450)
	@NotNull
	private String pseudo;

	@Column(length = 50)
	@NotNull
	private String type;

	// On indique les relations
	
	// Relation avec favori
	  @ManyToMany
	  @JoinTable(name="favori",
	  joinColumns=@JoinColumn(name="user_id"),
	  inverseJoinColumns=@JoinColumn(name="USER_ID_LIE")
	  ) 
	  private List<Utilisateur> favoris;
	

	// Relation avec centre d interet
	@ManyToMany(mappedBy = "utilisateur")
	private List<Centre_interet> centre_interet;
	
	public List<Centre_interet> getCentre_interet() {
		return centre_interet;
	}

	// Entre adresse et utilisateur
	@ManyToMany
	private List<Adresse> adresse;

	
	// Entre utilisateur et photo
	
	@OneToMany
	@JoinColumn(name = "utilisateur_id")
	private List<Photo> photo;
	
	

	// Entre apparence et utilisateur
	@ManyToOne
	private Apparence apparence;
	
	public Apparence getApparence() {
		return apparence;
	}
	
	// Entreutilisateur et situation
	@ManyToOne
	private Situation situation;
	
	public Situation getSituation() {
		return situation;
	}
	

	public void setSituation(Situation situation) {
		this.situation = situation;
	}
	
	

	// CONSTRUCTEURS
	public Utilisateur(Long id, @NotNull String nom, @NotNull String prenom, String dateDeNaissance,
			@NotNull String sexe, @NotNull String password, @NotNull String description, @NotNull String pseudo,
			@NotNull String type, List<Photo> photo) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.sexe = sexe;
		this.password = password;
		this.description = description;
		this.pseudo = pseudo;
		this.type = type;
		this.photo = photo;
	}

	public Utilisateur() {

	}

	// METHODE
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + " + nom=" + nom + " + prenom=" + prenom + " + dateDeNaissance="
				+ dateDeNaissance + " + sexe=" + sexe + " + password=" + password + " + description=" + description
				+ " + pseudo=" + pseudo + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

}
