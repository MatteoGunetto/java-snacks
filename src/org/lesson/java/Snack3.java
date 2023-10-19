package org.lesson.java;

public class Snack3 {
    /*Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari*/
    public static void main(String[] args) {
        int[] numeri = {20, 17, 9, 6, 2, 12, 21, 98, 17, 4}; // Esempio di un array di numeri

        int sommaElementiDispari = 0;

        for (int i = 1; i < numeri.length; i += 2) {
            sommaElementiDispari += numeri[i];
        }

        System.out.println("Array: " + java.util.Arrays.toString(numeri));
        System.out.println("Somma degli elementi in posizione dispari: " + sommaElementiDispari);
    }
}
