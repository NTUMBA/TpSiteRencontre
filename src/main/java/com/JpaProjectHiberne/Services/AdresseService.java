package com.JpaProjectHiberne.Services;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JpaProjectHiberne.Entities.Adresse;
import com.JpaProjectHiberne.Repositories.AdresseRepository;


@Service
public class AdresseService {
	
	@Autowired
	AdresseRepository adresseRepository;
	
	
// LES METHODES: CRUD
	
	//READ
	public List<Adresse> getAllAdresse(){
		return adresseRepository.findAll();// Trouve une liste d utilisateur se trouvant dans la BDD
	}
	
	public  Optional<Adresse> findById(Long id){
		 return adresseRepository.findById(id);
	}
	
	public void save(Adresse adresse) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	public void setAllAdresses(List<Adresse> listeAdresses) {
		
		adresseRepository.saveAll(listeAdresses);
	} 
	
	
	// Verifier si la BDD etait vide
	public  Long count(){
		 return adresseRepository.count();
	}
	
	//UPDATE
	public void create(Adresse adresses){
		adresseRepository.save(adresses);// Trouve une liste d utilisateurs se trouvant dans la BDD
		}
	
	//DELETE
		public void deleteUtilisateur(Adresse adresse){
			adresseRepository.delete(adresse);
			}
		

}
 	

