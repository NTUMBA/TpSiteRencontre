package com.JpaProjectHiberne.Services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JpaProjectHiberne.Entities.Photo;
import com.JpaProjectHiberne.Repositories.PhotoRepository;


@Service
public class PhotoService {
	
	@Autowired
	PhotoRepository photoRepository;// Equivaut a taper private UtilisateurRepository utilisateurRepository = new UtilisateurRepository();
	
	
// LES METHODES: CRUD
	
	//READ
	public List<Photo> getAllPhoto(){
		return photoRepository.findAll();// Trouve une liste de photo se trouvant dans la BDD
	}
	
	public  Optional<Photo> findById(Long id){// Optional permet d accepter(de retourner) un object null
		 return photoRepository.findById(id);
	}
	
	public void save(Photo photo) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	public void setAllPhotos(List<Photo> listePhotos) {// Trouve une liste d photo 
		
		photoRepository.saveAll(listePhotos);
	} 
	
	
	// Verifier si la BDD etait vide
	public  Long count(){
		 return photoRepository.count();
	}
	
	//UPDATE
	public void create(Photo photos){
		photoRepository.save(photos);// Trouve une liste de photos se trouvant dans la BDD
		}
	
	//DELETE
		public void deletePhoto(Photo photo){
			photoRepository.delete(photo);// Trouve une liste de photo se trouvant dans la BDD
			}
		

}
 	

