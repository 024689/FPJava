package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.beans.Personne;
import org.example.function.ConsumeEleve;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Stream;

@Slf4j
public class Main {
    public static void main(String[] args) {
        //System.out.println(consumeEleve);

        //ConsumeEleve consumeEleve = new ConsumeEleve();
//        Eleve e = new Eleve("Noumen Frech", 16);
        //      log.info("premier programme");
        //    log.info("{} est le premier élève crée", e);
//Function<Integer, String> DonneAge = (Integer age) -> "j'ai" + age + "ans";
        //      System.out.println(DonneAge.apply(2));

        //    Consumer<Integer> donneAge2 = (Integer nmbre) -> {
        //      System.out.println("j'ai " + nmbre + "ans");
        //};
        //donneAge2.accept(22);
//
        //      Supplier<LocalDate> Date = LocalDate::now;
//System.out.println(Date.get());





        // Exercice du 4/10/2023

        Path file = Paths.get("src/main/resources/personnes.csv");
        try {
            //création de la variable du comparateur pour l'age
            Comparator<Personne> compareAge = Comparator.comparing(Personne::getAge);//on fait la référence en faisant ::nom de la méthode

            //création de la variable du comparateur pour le nom
            Comparator<Personne> compareNom = Comparator.comparing(Personne::getPrenom);

            Stream<String> lines = Files.lines(file).skip(1);
            List<Personne> personnes = lines.map(l -> {
                        String[] splitLine = l.split(",");
                        String prenom = splitLine[0];
                        Integer age = Integer.valueOf(splitLine[1].trim());//trim pour éliminer les espaces
                        return new Personne(prenom, age);
                    })
                    //.sorted((Personne p1, Personne p2) -> p1.getAge() < p2.getAge() ? 1 : p1.getAge() == p2.getAge() ? 0 : -1)
                    //.sorted(compareAge)
                    //.sorted(compareAge.reversed())
                    .sorted(compareAge.thenComparing(compareAge.reversed()))// pour faire l'inverse
                    .sorted(compareNom)
                    .toList();
            //Tolist pour afficher en tableaux
            //on vient de classer par ordre décroissant des ages de la liste

            System.out.println(personnes);
        } catch (IOException e) {
        }


    }


}

