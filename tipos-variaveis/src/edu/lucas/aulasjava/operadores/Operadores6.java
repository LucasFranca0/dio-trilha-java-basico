package edu.lucas.aulasjava.operadores;

public class Operadores6 {

    // Operadores lógicos

    public static void main(String[] args) {

        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && (7 > 4)) {                      // se as duas condições forem verdadeiras
            System.out.println("As duas condições são verdadeiras"); // então leia esta linha.
        }

        if (condicao1 || condicao2) {                    // se uma das condições forem verdadeiras
            System.out.println("Uma das condições são verdadeiras"); // então leia esta linha.

        }

        System.out.println("Fim");      // Marcando o fim do algoritmo
    }
}