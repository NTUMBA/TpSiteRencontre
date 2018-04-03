package com.JpaProjectHiberne.Services;







import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JpaProjectHiberne.Entities.Situation;
import com.JpaProjectHiberne.Repositories.SituationRepository;


@Service
public class SituationService {
	
	@Autowired
	SituationRepository situationRepository;// Equivaut a taper private UtilisateurRepository utilisateurRepository = new UtilisateurRepository();
	
	
// LES METHODES: CRUD
	
	//READ
	public List<Situation> getAllSituation(){
		return situationRepository.findAll();// Trouve une liste de situations se trouvant dans la BDD
	}
	
	public  Optional<Situation> findById(Long id){// Optional permet d accepter(de retourner) un object null
		 return situationRepository.findById(id);
	}
	
	public void save(Situation situation) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	public void setAllSituations(List<Situation> listeSituations) {// Trouve une liste de situation 
		
		situationRepository.saveAll(listeSituations);
	} 
	
	
	// Verifier si la BDD etait vide
	public  Long count(){
		 return situationRepository.count();
	}
	
	//UPDATE
	public void create(Situation situations){
		situationRepository.save(situations);// Trouve une liste de situations se trouvant dans la BDD
		}
	
	//DELETE
		public void deleteSituation(Situation situation){
			situationRepository.delete(situation);// Trouve une liste de situation se trouvant dans la BDD
			}
		

}
 	

