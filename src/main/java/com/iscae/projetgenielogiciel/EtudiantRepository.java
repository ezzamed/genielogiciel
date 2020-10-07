package com.iscae.projetgenielogiciel;

import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepository extends CrudRepository<Etudiant,Integer> {
    public Etudiant findByName(String name);
}


