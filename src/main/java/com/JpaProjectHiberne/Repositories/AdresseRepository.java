package com.JpaProjectHiberne.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JpaProjectHiberne.Entities.Adresse;

@Repository // On indique a Spring qu il s agit d un repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {

}