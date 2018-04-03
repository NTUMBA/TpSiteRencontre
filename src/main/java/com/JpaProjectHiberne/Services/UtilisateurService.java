package com.JpaProjectHiberne.Services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JpaProjectHiberne.Entities.Utilisateur;
import com.JpaProjectHiberne.Repositories.UtilisateurRepository;


@Service
public class UtilisateurService {
	
	@Autowired
	UtilisateurRepository utilisateurRepository;// Equivaut a taper private UtilisateurRepository utilisateurRepository = new UtilisateurRepository();
	
	
// LES METHODES: CRUD
	
	// CREATE
	
	
	//READ
	public List<Utilisateur> getAllUtilisateur(){
		return utilisateurRepository.findAll();// Trouve une liste d utilisateur se trouvant dans la BDD
	}
	
	public  Optional<Utilisateur> findById(Long id){// Optional permet d accepter(de retourner) un object null
		 return utilisateurRepository.findById(id);
	}
	
	public void save(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	public void setAllUtilisateurs(List<Utilisateur> listeUtilisateurs) {// Trouve une liste d utilisateur 
		
		utilisateurRepository.saveAll(listeUtilisateurs);
	} 
	
	
	// Verifier si la BDD etait vide
	public  Long count(){
		 return utilisateurRepository.count();
	}
	
	//UPDATE
	public void create(Utilisateur utilisateurs){
		utilisateurRepository.save(utilisateurs);// Trouve une liste d utilisateurs se trouvant dans la BDD
		}
	
	//DELETE
		public void deleteUtilisateur(Utilisateur utilisateur){
			utilisateurRepository.delete(utilisateur);// Trouve une liste d utilisateur se trouvant dans la BDD
			}
		

}
 	

