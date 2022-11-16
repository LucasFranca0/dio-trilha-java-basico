package edu.lucas.aulasjava.metodos.sobrecarga;


// Sobrecarga é manter o mesmo nome do método, mas alterando a lista de parametros
// Não só alterar o nome do parametro, mas também o tipo do seu dado.
/*
/ Poque usar?
/ Se temos uma compra e queremos calcular o total da compa podemos ter vários
/ cenários, como calcular total com desconto, calcular total com desconto parcelado, etc.
/ Podemos ter o mesmo padrão de nome do método e passar os parametros de acordo da nossa necessidade.
/ Assim, mantemos a abstração alvo que é calcular o total da compra.
/ No exemplo abaixo utilizamos a sobrecarga para calcular áreas de quadrilateros diferentes.
 */
public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trápezio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {     // Se, em vez de float fosse double, iria dar erro. Pois é necessário alterar também os tipos dos parametros
        System.out.println("Área do losango: " + (diagonal1 * diagonal2) / 2);
    }
}
