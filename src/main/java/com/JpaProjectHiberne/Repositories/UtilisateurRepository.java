package com.JpaProjectHiberne.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JpaProjectHiberne.Entities.Utilisateur;

@Repository // On indique a Spring qu il s agit d un repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}