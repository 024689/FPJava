package org.example.beans;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Personne {
    private String prenom;
    private int age;
}