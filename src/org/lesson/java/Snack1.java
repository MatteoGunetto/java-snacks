package org.lesson.java;

import java.util.Scanner;

public class Snack1 {
    /*Continua a chiedere all’utente di inserire un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
    Se il numero è negativo termina.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci un numero (inserisci un numero negativo per terminare): ");
            int numero = scan.nextInt();

            if (numero < 0) {
                System.out.println("Hai inserito un numero negativo. Il programma termina.");
                break;
            } else if (numero % 2 == 0) {
                System.out.println("Il numero " + numero + " è pari.");
            } else {
                int successivo = numero + 1;
                System.out.println( successivo + ".");
            }
        }
        scan.close();
    }
}