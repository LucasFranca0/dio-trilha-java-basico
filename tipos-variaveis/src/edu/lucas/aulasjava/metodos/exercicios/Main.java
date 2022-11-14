package edu.lucas.aulasjava.metodos.exercicios;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        Calculadora.somar();
        // metodo com parametro
        Calculadora.multiplicar(10,5);
        Calculadora.subtrair(200, 100);
        Calculadora.dividir(40,20);
        // método com outro método como parametro
        //Calculadora.subtrair(Calculadora.scan.nextDouble(), Calculadora.scan.nextDouble());

        // Emprestimo
        // metodo para imprimir a palavra Emprestimo
        Emprestimo.emprestimo();

        // metodos com parametro
        Emprestimo.calcular(1032, 2);
        Emprestimo.calcular(1552, 3);
        Emprestimo.calcular(5032, 5);

        // método como parametro
        Emprestimo.calcular(1032, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1032, Emprestimo.getDuasParcelas());
        System.out.println("\n");

        // Mensagem
        System.out.println("Mensagem");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(19);
        Mensagem.obterMensagem(40);
    }
}
