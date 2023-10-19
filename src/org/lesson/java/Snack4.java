package org.lesson.java;

import java.util.Scanner;

public class Snack4 {
    /*Data in input una stringa verificare se è palindroma*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String inputString = input.nextLine();

        // rimuovo spazi e formatto il testo
        String stringaInserita = inputString.replaceAll("\\s", "").toLowerCase();

        // Inverto la stringa
        String stringaInvertita = new StringBuilder(stringaInserita).reverse().toString();

        // Confronta la stringa iniziale e quella invertita
        if (stringaInserita.equals(stringaInvertita)) {
            System.out.println("La stringa è palindroma.");
        } else {
            System.out.println("La stringa non è palindroma.");
        }

        input.close();
    }
}
