package com.JpaProjectHiberne.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;




@Entity // On indique a Spring que cette classe est une Entite
@Table(name = "utilisateur") // On peut modifier le nom de la table
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)// On cree un varchar car l enu n est pas un int
	@Column(length = 8 )// Un vachar de taille 8
	@NotNull(message="Veuillez cochez l' une des deux cases ") // le champ ne doit pas etre vide sinon on affiche le message en dur
	private Sexe sexe ;

	@Column(length = 50)
	@Pattern(regexp ="^(?i)[a-z]{2,50}$",message="{com.JpaProjectHiberne.contraint.Nom.message}") // le ?, i est un tag pour ignore la case (Maj min)
	private String nom;

	@Column(length = 50)
	@Pattern(regexp ="^(?i)[a-z]{2,50}$",message="{com.JpaProjectHiberne.contraint.Prenom.message}") // le ?, i est un tag pour ignore la case (Maj min)
	private String prenom;

	@DateTimeFormat
	@Column(columnDefinition = "date", name = "birthday")
	private String dateDeNaissance;


	@Column(length = 10)
	@Pattern(regexp ="^(?i)[a-z]{2,10}$",message="{com.JpaProjectHiberne.contraint.Password.message}") // le ?, i est un tag pour ignore la case (Maj min)
	private String password;

	@Column(length = 450 )
	@Pattern(regexp ="^(?i)[a-z]{2,450}$",message="{com.JpaProjectHiberne.contraint.Description.message}") // le ?, i est un tag pour ignore la case (Maj min)
	private String description;

	@Column(length = 50)
	@Pattern(regexp ="^(?i)[a-z]{2,50}$",message="{com.JpaProjectHiberne.contraint.Pseudo.message}") // le ?, i est un tag pour ignore la case (Maj min)
	private String pseudo;

	@Column(length = 50)
	@Pattern(regexp ="^(?i)[a-z]{2,50}$",message="{com.JpaProjectHiberne.contraint.Type.message}") // le ?, i est un tag pour ignore la case (Maj min)
	private String type;

	// On indique les relations
	
	// Relation avec favori
	  @ManyToMany
	  @JoinTable(name="favori",
	  joinColumns=@JoinColumn(name="user_id"),
	  inverseJoinColumns=@JoinColumn(name="user_id_link")
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
	public Utilisateur(Long id,  String nom,  String prenom, String dateDeNaissance,
			Sexe sexe,  String password,  String description,  String pseudo,
			 String type, List<Photo> photo) {
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
	

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
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
