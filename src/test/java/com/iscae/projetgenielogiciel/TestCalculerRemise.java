package com.iscae.projetgenielogiciel;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculerRemise {
@Test
    public void testcalculremise1000(){
    CalculRemise calcul=new CalculRemise();
    Double res=calcul.Calculer_Remise(1000.0);
    System.out.println("Pas de remise:"+res);
    assertEquals(0,res);


    }
    @Test
    public void testcalculremise3000(){
        CalculRemise calcul=new CalculRemise();
        Double res=calcul.Calculer_Remise(3000.0);
        System.out.println("Remise de 10%,le montant de remise est de:"+res);
        assertEquals(300,res);

    }
    @Test
    public void testcalculremise7000(){
        CalculRemise calcul=new CalculRemise();
        Double res=calcul.Calculer_Remise(7000.0);
        System.out.println("Remise de 20%,le montant de remise est de:"+res);
        assertEquals(1400,res);

    }
}
