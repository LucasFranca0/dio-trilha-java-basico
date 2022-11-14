package edu.lucas.aulasjava.operadores;

public class Operadores4 {

    public static void main(String[] args) {
        // ternário

        int a, b;

        a = 1;
        b = 2;
        String resultado = a == b ? "verdadeiro" : "falso";   // if e else ternário

        // int resultado = a == b ? 1 : 0";  // no caso do tipo int é esperado números inteiros. 
        System.out.println(resultado);
        
        // em vez de escrever todo esse código abaixo
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

            System.out.println(resultado);
    }
}