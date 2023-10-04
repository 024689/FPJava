package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
@ToString
@Getter
@AllArgsConstructor
public class Eleve {

    private String nom;
    @Setter
    private double note;
}




