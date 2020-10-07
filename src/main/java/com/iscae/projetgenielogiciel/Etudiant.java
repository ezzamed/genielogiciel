package com.iscae.projetgenielogiciel;

import javax.persistence.*;

@Entity
@Table(name="Etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer note;

    public Etudiant() {
    }



    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public Integer getNote() {
        return note;
    }

    public Etudiant(String name, Integer note) {
        this.name = name;
        this.note = note;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNom(String name) {
        this.name = name;
    }

    public void setNote(Integer note) {
        this.note = note;
    }
}
