package org.example.function;

import org.example.Eleve;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EleveGeneratorTest {
    //Methode de test
    @Test
    public void canCreateEleve (){
        //on Instancier la classe EleveGenerator
        EleveGenerator eg = new EleveGenerator();
        Eleve result = eg.get();// création de la variable result qui va faire le test
        assertEquals("Warren",result.getNom());
        //assert pour vérifier l'égalité entre 2 variables
        // expected qui veut dire ce qui est attendu et actuel pour dire ce que l'on a

        assertTrue(result.getNote()>=0.0 && result.getNote()<=20.0);
    //assertTrue va varifier la condition
    }
}