package edu.lucas.aulasjava.poo.exercicio;

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    // Construtor e sobrecarga de construtor
    Carro() {

    }
    // **this** é uma forma de diferenciar o que pertence ao objeto.
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    /* Criando um Objeto
       Carro carro = new Carro();
     */

    /* Get and set
    Set ele é usado para setar/colocar um valor em um atributo.
    A ideia é só guardar um valor no atributo e não retornar algo.

    Get ele retorna o valor do atributo. E o tipo de dados retornados
     é igual ao tipo de dado que o método retorna.
     */
    String getCor() {
        return cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }


    // método para calcular o valor total para encher o tanque do carro
    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

}
