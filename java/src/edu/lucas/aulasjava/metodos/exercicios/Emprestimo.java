package edu.lucas.aulasjava.metodos.exercicios;

/*
 * O uso do modificador STATIC em um atributo de classe, torna esse atributo
 *  possível de ser inicializado em qualquer parte da classe, mas quando recebe um valor, ele
 *  é compartilhado com todos os objetos da classe. Isso significa que os atributos estáticos
 *  de uma classe são compartilhados por todas as instâncias dessa classe.
 */

public class Emprestimo {

    // Retorno de um método: Tipo de dado (inteiro, long, string, etc) ou "void"
    // Nome: nome que é fornecido ao método. Mesmo padrão de definição de variáveis
    // Parâmetros: parâmetros que o método pode receber. Fica dentro do -> ()
    // Corpo: código que possui ou vazio
    public static int getDuasParcelas() {
        return 2;
    }


    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void  emprestimo(){
        System.out.println("Emprestimo");
    }
    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);

        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);

        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
}
