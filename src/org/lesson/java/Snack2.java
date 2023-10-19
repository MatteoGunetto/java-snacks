package org.lesson.java;

import java.util.Random;

public class Snack2 {
    /*Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
    e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.*/
    public static void main(String[] args) {
        String[] nomi = {"Charles", "Luis", "Max", "Michael ", "Alex", "George", "Nick", "Henry"};
        String[] cognomi = {"Hamilton", "Jordan", "Albon", "Verstappen", "Cavill", "Russell", "Leclerc","de Vries"};

        Random random = new Random();

        System.out.println("Falsa lista di invitati:");

        for (int i = 0; i < 8; i++) {
            int nomeCasualeIndex = random.nextInt(nomi.length);
            int cognomeCasualeIndex = random.nextInt(cognomi.length);

            String nomeCasuale = nomi[nomeCasualeIndex];
            String cognomeCasuale = cognomi[cognomeCasualeIndex];

            System.out.println(nomeCasuale + " " + cognomeCasuale);
        }
    }
}