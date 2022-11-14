package edu.lucas.aulasjava.metodos.retorno.exercicio;

public class Main {
    public static void main(String[] args) {

        double areaQuadrado = Quadrilatero.area(2);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo= Quadrilatero.area(7d, 4d);
        System.out.println("Área do retangular: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(6, 10, 3);
        System.out.println("Área do trapézio: " + areaTrapezio);

        double areaLosango = Quadrilatero.area(5f, 7f);
        System.out.println("Área do losango: " + areaLosango);
    }
}
