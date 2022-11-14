package edu.lucas.aulasjava.operadores;

public class Operadores2 {

    public static void main(String[] args) {

        // Unários
        int numero = 5;

        numero = -numero;
        System.out.println(numero); // "numero = -5

        numero = +numero;
        System.out.println(numero); // "numero = -5 // o + é um operador aritmético para somar.

        numero = numero * -1; // forma de converter o número para positivo. Necessário realizar uma
                              // multiplicação.
        System.out.println(numero); // numero = 5

        // Incremento

        numero = 5;

        numero = numero + 2; // numero = numero + 2; = 7
        System.out.println(numero);

        numero++; // numero = numero + 1; = 8

        System.out.println(++numero); // numero = numero + 1; = 9

        // Decremento

        numero = 5;

        numero--; // numero = numero - 1; = 4

        System.out.println(--numero); // numero = numero - 1; = 3

    }
}