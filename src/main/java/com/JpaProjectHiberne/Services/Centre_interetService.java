package com.JpaProjectHiberne.Services;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JpaProjectHiberne.Entities.Centre_interet;
import com.JpaProjectHiberne.Repositories.Centre_interetRepository;


@Service
public class Centre_interetService{
	
	@Autowired
	Centre_interetRepository centre_interetRepository;
	
	
// LES METHODES: CRUD
	
	//READ
	public List<Centre_interet> getAllCentre_interet(){
		return centre_interetRepository.findAll();// Trouve une liste de centres d interet se trouvant dans la BDD
	}
	
	public  Optional<Centre_interet> findById(Long id){
		 return centre_interetRepository.findById(id);
	}
	
	public void save(Centre_interet centre_interet) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	public void setAllCentre_interets(List<Centre_interet> listeCentre_interets) {
		
		centre_interetRepository.saveAll(listeCentre_interets);
	} 
	
	
	// Verifier si la BDD etait vide
	public  Long count(){
		 return centre_interetRepository.count();
	}
	
	//UPDATE
	public void create(Centre_interet centre_interets){
		centre_interetRepository.save(centre_interets);
		}
	
	//DELETE
		public void deleteCentre_interet(Centre_interet centre_interet){
			centre_interetRepository.delete(centre_interet);
			}
		

}
 	

