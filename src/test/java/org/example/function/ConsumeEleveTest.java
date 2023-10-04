package org.example.function;

import org.example.Eleve;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;

import static org.junit.jupiter.api.Assertions.*;

class ConsumeEleveTest {

@Test
public void canLog(){
    //création des To do pour Instancier la classe
    ConsumeEleve cE = new ConsumeEleve();

    //Donner une valeur à la propriété  log en créant un logger qui vient de org.Slf4j
    Logger mockLogger = Mockito.mock(Logger.class);
    cE.log=mockLogger;

    //Instancier un Eleve
    Eleve el = new Eleve("Noumen Frech Warren", 17.0);

    //Tester la méthode accept()
cE.accept(el);

    //Vérifier que log.info("{}", e) est bien appeler
    Mockito.verify(mockLogger, Mockito.times(1)).info("{}",el);
}

}
