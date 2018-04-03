package com.JpaProjectHiberne.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.JpaProjectHiberne.Entities.Utilisateur;
import com.JpaProjectHiberne.Services.PhotoService;
import com.JpaProjectHiberne.Services.UtilisateurService;



@Controller
public class UtilisateurController {

	private final UtilisateurService utilisateurService;

	private final PhotoService photoService;

	// On fait appel au service
	@Autowired
	public UtilisateurController(UtilisateurService utilisateurService, PhotoService photoService) {
		
		this.utilisateurService = utilisateurService;

		this.photoService = photoService;
	}



	@GetMapping("/ajoutnom")
	public ModelAndView addTest() {
		ModelAndView mavue = new ModelAndView("pages/formulaire");
		mavue.addObject("utilisateur", new Utilisateur());
		return mavue;
	}
	


	@GetMapping("/util/bdd")
	public ModelAndView getAll() {
		ModelAndView myview = new ModelAndView("pages/utilisateur");

		myview.addObject("listeUtilisateur", utilisateurService.getAllUtilisateur());

		return myview;
	}

	// UPDATE
	@PostMapping(value = "/AjoutUtilisateurs")
	public ModelAndView updateAll(@Validated Utilisateur utilisateur, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return new ModelAndView("pages/formulaire").addObject("utilisateur", utilisateur);
		}

		utilisateurService.create(utilisateur);

		return new ModelAndView("redirect:/util/bdd");
	}

	// DELETE

	@RequestMapping(method = RequestMethod.DELETE, value = "/utilisateur/delete/{id}")
	public ModelAndView updateAll(@PathVariable long id) {

		utilisateurService.deleteUtilisateur(utilisateurService.findById(id).get());

		return new ModelAndView("redirect:/utilisateur/");
	}

}
