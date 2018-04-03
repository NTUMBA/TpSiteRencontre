package com.JpaProjectHiberne.Services;





import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JpaProjectHiberne.Entities.Multimedia;
import com.JpaProjectHiberne.Repositories.MultimediaRepository;


@Service
public class MultimediaService {
	
	@Autowired
	MultimediaRepository multimediaRepository;// Equivaut a taper private MultimediaRepository multimediaRepository = new MultimediaRepository();
	
	
// LES METHODES: CRUD
	
	//READ
	public List<Multimedia> getAllMultimedia(){
		return multimediaRepository.findAll();// Trouve une liste de multimedia se trouvant dans la BDD
	}
	
	public  Optional<Multimedia> findById(Long id){// Optional permet d accepter(de retourner) un object null
		 return multimediaRepository.findById(id);
	}
	
	public void save(Multimedia multimedia) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	public void setAllMultimedias(List<Multimedia> listeMultimedias) {
		multimediaRepository.saveAll(listeMultimedias);
	} 
	
	
	// Verifier si la BDD etait vide
	public  Long count(){
		 return multimediaRepository.count();
	}
	
	//UPDATE
	public void create(Multimedia multimedias){
		multimediaRepository.save(multimedias);// Trouve une liste de multimedias se trouvant dans la BDD
		}
	
	//DELETE
		public void deleteUtilisateur(Multimedia multimedia){
			multimediaRepository.delete(multimedia);
			}
		

}
 	

