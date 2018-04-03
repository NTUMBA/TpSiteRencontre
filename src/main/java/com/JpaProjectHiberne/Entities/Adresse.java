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
@Table(name="adresse")//On peut modifier le nom de la table
public class Adresse {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 6)
	private Integer numero;
	
	@Column(length = 50)
	@NotNull
	private Integer typeDeRue;
	
	@Column(length = 50)
	@NotNull
	private String nomDeRue;
	
	@Column(length = 50)
	@NotNull
	private Integer codePostal;
	
	@Column(length = 50)
	@NotNull
	private String ville;
	
	@Column(length = 50)
	private String complement;
	
	@Column(length = 50)
	private String prefixe;
	
  // Relation entre Adresse et utilisateur
	@ManyToMany
	private List<Utilisateur> utilisateur;
	


	// CONSTRUCTEURS

	public Adresse(Long id, Integer numero, @NotNull Integer typeDeRue, @NotNull String nomDeRue,
			@NotNull Integer codePostal, @NotNull String ville, String complement, String prefixe) {
		super();
		this.id = id;
		this.numero = numero;
		this.typeDeRue = typeDeRue;
		this.nomDeRue = nomDeRue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.complement = complement;
		this.prefixe = prefixe;
	}
	
	public Adresse() {

	}
	//METHODE
		@Override
		public String toString() {
			return "Adress [id=" + id + " + numero=" + numero + " + typeDeRue=" + typeDeRue + " + nomDeRue=" + nomDeRue +  
					" + codePostal= " + codePostal +" + ville=" + ville + " + complement=" + complement + " + prefixe=" + prefixe
					+  "]";
		}
		
		

	// LES ACCESSEURS

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Integer getNumero() {
			return numero;
		}
		public void setNumero(Integer numero) {
			this.numero = numero;
		}
		public Integer getTypeDeRue() {
			return typeDeRue;
		}
		public void setTypeDeRue(Integer typeDeRue) {
			this.typeDeRue = typeDeRue;
		}
		public String getNomDeRue() {
			return nomDeRue;
		}
		public void setNomDeRue(String nomDeRue) {
			this.nomDeRue = nomDeRue;
		}
		public Integer getCodePostal() {
			return codePostal;
		}
		public void setCodePostal(Integer codePostal) {
			this.codePostal = codePostal;
		}
		public String getVille() {
			return ville;
		}
		public void setVille(String ville) {
			this.ville = ville;
		}
		public String getComplement() {
			return complement;
		}
		public void setComplement(String complement) {
			this.complement = complement;
		}
		public String getPrefixe() {
			return prefixe;
		}
		public void setPrefixe(String prefixe) {
			this.prefixe = prefixe;
		}
		public List<Utilisateur> getUtilisateur() {
			return utilisateur;
		}
		public void setUtilisateur(List<Utilisateur> utilisateur) {
			this.utilisateur = utilisateur;
		}
	

	
}
