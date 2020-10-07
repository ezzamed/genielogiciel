package com.iscae.projetgenielogiciel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculatrice {
    @Test
    public void testSomme() {
        Calculatrice cal = new Calculatrice();
        int a = 665;
        int b = 35;
        int actual = cal.addition(a, b);

        int expected = 709;

        assertEquals(expected, actual);
    }
    @Test
    public void testSubtract() {
        Calculatrice cal = new Calculatrice();
        int a = 1000;
        int b = 500;
        int actual = cal.soustraction(a, b);

        int expected = 500;

        assertEquals(expected, actual);
    }
}
