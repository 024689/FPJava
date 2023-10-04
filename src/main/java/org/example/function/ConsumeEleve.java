package org.example.function;

import lombok.extern.slf4j.Slf4j;
import org.example.Eleve;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;
//@Slf4j
public class ConsumeEleve implements Consumer<Eleve> {

    //création d'un logger public qui va me permettre de faire le test
    public Logger log = LoggerFactory.getLogger(ConsumeEleve.class);
    @Override
    public void accept(Eleve eleve) {
        log.info("{}", eleve);
    }
}
