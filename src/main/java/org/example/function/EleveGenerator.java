package org.example.function;

import org.example.Eleve;

import java.util.Random;
import java.util.function.Supplier;

public class EleveGenerator implements Supplier<Eleve> {

    @Override
    public Eleve get() {
        // utilisation de la classe random
        Random r = new Random();
        return new Eleve("Warren", r.nextDouble(-1.0, 20.0));
    }
}
