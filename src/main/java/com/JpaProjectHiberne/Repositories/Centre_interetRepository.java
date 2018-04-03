package com.JpaProjectHiberne.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JpaProjectHiberne.Entities.Centre_interet;

@Repository // On indique a Spring qu il s agit d un repository
public interface Centre_interetRepository extends JpaRepository<Centre_interet, Long> {

}