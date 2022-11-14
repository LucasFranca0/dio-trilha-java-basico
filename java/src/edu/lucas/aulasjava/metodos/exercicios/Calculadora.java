package edu.lucas.aulasjava.metodos.exercicios;

import java.util.Scanner;

public class Calculadora {

    static Scanner scan = new Scanner(System.in);

    public static void somar(){
        System.out.println("Somar");
        System.out.println("Informe o primeiro número: ");
        double numero1 = scan.nextDouble();
        System.out.println("Informe o segundo número: ");
        double numero2 = scan.nextDouble();

        System.out.println(" A soma de " + numero1 + " mais " + numero2 + " é: " + (numero1 + numero2));
    }

    public static void subtrair(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println(" A subtração de " + numero1 + " menos " + numero2 + " é: " + resultado);
    }

    public static void multiplicar(int numero1, int numero2) {
        double resultado = numero1 * numero2;
        System.out.println(" A multiplicação de " + numero1 + " por " + numero2 + " é: " + resultado);
    }

    public static void dividir(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println(" A divisão de " + numero1 + " por " + numero2 + " é: " + resultado);
        System.out.println("\n");
    }

}
