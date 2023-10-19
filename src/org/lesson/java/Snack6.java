package org.lesson.java;

import java.util.Scanner;

public class Snack6 {
    /*Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di secondi: ");
        int secondiTotali = input.nextInt();

        int ore = secondiTotali / 3600;  // 3600 secondi
        int minuti = (secondiTotali % 3600) / 60;
        int secondi = secondiTotali % 60;

        String risultato = String.format("%02d:%02d:%02d", ore, minuti, secondi);

        System.out.println("Sono ore: " + risultato);

        input.close();
    }
}