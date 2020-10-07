package com.iscae.projetgenielogiciel;

public class CalculRemise {
    public Double Calculer_Remise(Double montant) {
        Double resultat;
        if (montant >= 6000) {
            resultat = montant * 0.2;
            return resultat;
        } else if (montant >= 2000) {
            resultat = montant * 0.1;
            return resultat;
        } else {
            resultat =0.0;
            return resultat;


        }
    }
}