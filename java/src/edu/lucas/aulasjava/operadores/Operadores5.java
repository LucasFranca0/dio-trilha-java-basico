package edu.lucas.aulasjava.operadores;

public class Operadores5 {

    public static void main(String[] args) {
        // Relacionais

        int numero1 = 3;
        int numero2 = 2;

        boolean simNao = numero1 != numero2 ? true : false; // numero1 é != (diferente) de numero2? Verdadeiro

        simNao = numero1 >= numero2 ? true : false; // numero1 > ou = (maior ou igual que) numero2? Verdadeiro

        System.out.println("Numero 1 é maior que Numero 2? " + simNao);

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        } else {
            System.out.println("A nossa condição é falsa");
        }

        // Relacionais Comparação String

        String nomeUm = "Lucas";
        String nomeDois = new String("Lucas");

        if (nomeUm.equals(nomeDois)) {          // para comparar objetos é recomendado utilizar o equals
            System.out.println("A nossa condição é verdadeira");

        } else {
            System.out.println("A nossa condição é falsa");

        }
    }
}
