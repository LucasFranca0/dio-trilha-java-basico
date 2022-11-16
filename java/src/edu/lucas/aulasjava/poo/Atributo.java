package edu.lucas.aulasjava.poo;

// Atributo são as caracteristicas da classe
public class Atributo {
    // Atributo serve para representar um conceito do mundo real.
    String cor;
    int roda = 4;
    String modelo;

    public void acelerar(){
        int acelerar = 0; // Variável serve para executar uma operação.

        System.out.println("Acelerando o carro.");
        acelerar = 40;
        System.out.println("Velocidade atual: " + acelerar);
    }
}
