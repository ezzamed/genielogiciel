package com.iscae.projetgenielogiciel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EtudiantTest {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Test
    @Rollback(false)
    public  void TesterAjoutEtudiant() {
        Etudiant etudiant1 = new Etudiant("Ezza", 20);
        Etudiant etudiant2 = new Etudiant("Mouna", 20);
        Etudiant saveEtudiant1 = etudiantRepository.save(etudiant1);
        Etudiant saveEtudiant2 = etudiantRepository.save(etudiant2);
        assertNotNull(saveEtudiant1);
        assertNotNull(saveEtudiant2);
    }

    /*@Test
    public void TesterListerEtudiants(){

        List <Etudiant> etudiants=(List <Etudiant>)etudiantRepository.findAll();
        assertNotEquals(etudiants.size(),0);
    }
     */
    @Test
    @Rollback(false)
    public  void TesterSupprimerEtudiant(){
       Integer id=2;
       Boolean present = etudiantRepository.findById(id).isPresent();
       etudiantRepository.deleteById(id);
       assertFalse(present);
    }

}
