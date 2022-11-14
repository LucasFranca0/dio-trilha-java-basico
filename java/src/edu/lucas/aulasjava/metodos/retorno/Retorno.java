package edu.lucas.aulasjava.metodos.retorno;

/* return é uma instrução de interrupção como o continue e break.
/
/ O método executa o seu retorno quando:
/ - Completa todas as suas intruções internas
/ - Chega a uma declaração explicita de retorno
/ - Lança uma exceção
 */

public class Retorno {

    public static String nome() {
        return "Lucas";
    }

    public static double getJuros() {
        return 2.34d;
    }

    public static float getParcelas() {
        return 1.54f;
    }

    public static void setIdade() {
        return;  // void ele pode ou não ter um return. Mas não pode ter um valor dentro do return, pois o retorno é vazio
    }


}
