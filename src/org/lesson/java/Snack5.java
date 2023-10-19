package org.lesson.java;


public class Snack5 {
    /*Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
    *Possibile usare solo :
    *cicli
    *chartAt
    *if / switch
    *Es. “25" come stringa deve essere convertito in intero 25.*/
    public static void main(String[] args) {
        String numeroStringa = "120"; // La stringa da convertire
        int numeroIntero = 0;
        boolean Negativo = false;

        for (int i = 0; i < numeroStringa.length(); i++) {
            char carattere = numeroStringa.charAt(i);

            if (i == 0 && carattere == '-') {
                Negativo = true;
            } else if (carattere >= '0' && carattere <= '9') {
                int cifra = carattere - '0';
                numeroIntero = numeroIntero * 10 + cifra;
            } else {
                System.out.println("Errore: La stringa contiene caratteri non validi.");
                return;
            }
        }

        if (Negativo) {
            numeroIntero = -numeroIntero;
        }

        System.out.println("Numero intero: " + numeroIntero);
    }
}