package edu.lucas.aulasjava.operadores;

public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";        //resultado = 31
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;           //resultado = 1111  /A partir do momento que detecta um caracter é feito a concatenação.
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";         //resultado = 1111
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);  //resultado = 13 /Realizou primeiro a soma das evidências (1+1+1) e depois concatenou
        System.out.println(concatenacao);
}
}