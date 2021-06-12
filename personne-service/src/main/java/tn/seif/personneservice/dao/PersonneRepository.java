package tn.seif.personneservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tn.seif.personneservice.entities.Personne;

@RepositoryRestResource
public interface PersonneRepository extends JpaRepository<Personne,Long>  {
}
