package edu.lucas.aulasjava.poo.exercicio;

public class Main {
    public static void main(String[] args) {

        // Criando um objeto com os atributos vazios
        Carro carro1 = new Carro();

        // Inserindo pelo método set valores ao atributo do objeto
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        // Pegando pelo método get valores do atributo do objeto
        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.30));

        // Criando um objeto e inserindo os valores dos atributos
        Carro carro2 = new Carro("Preto", "Camaro", 50);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.90));
    }
}
