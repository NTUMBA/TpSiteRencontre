package com.JpaProjectHiberne.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JpaProjectHiberne.Entities.Apparence;
import com.JpaProjectHiberne.Repositories.ApparenceRepository;


@Service
public class ApparenceService {
	
	@Autowired
	ApparenceRepository apparenceRepository;
	
	
// LES METHODES: CRUD
	
	//READ
	public List<Apparence> getAllAdresse(){
		return apparenceRepository.findAll();// Trouve une liste d utilisateur se trouvant dans la BDD
	}
	
	public  Optional<Apparence> findById(Long id){
		 return apparenceRepository.findById(id);
	}
	
	public void save(Apparence apparence) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	public void setAllApparences(List<Apparence> listeApparences) {
		
		apparenceRepository.saveAll(listeApparences);
	} 
	
	
	// Verifier si la BDD etait vide
	public  Long count(){
		 return apparenceRepository.count();
	}
	
	//UPDATE
	public void create(Apparence apparences){
		apparenceRepository.save(apparences);// Trouve une liste d utilisateurs se trouvant dans la BDD
		}
	
	//DELETE
		public void deleteApparence(Apparence apparence){
			apparenceRepository.delete(apparence);
			}
		

}
 	

