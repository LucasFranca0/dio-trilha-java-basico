package edu.lucas.aulasjava.tiposvariaveis;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        //tipos primitivos 
        
        double salarioMinimo = 2500;   //comporta valores númericos com casas decimais
        String nome = "Lucas";  // String comporta texto
        short numeroCurto = 1;  // números com valores baixos 
        int numeroNormal = numeroCurto; // cuidado ao utilizar um número maior como int e inserir em uma variável short.
        short numeroCurto2 = (short) numeroNormal; // casting. Não é recomenando utilizar este tipo de conversão
                                                   // melhor usar int em todos.

        final double VALOR_DE_PI = 3.14; // constante, declarada sempre em Maiuscula.
        System.out.println(VALOR_DE_PI);
    }
}
