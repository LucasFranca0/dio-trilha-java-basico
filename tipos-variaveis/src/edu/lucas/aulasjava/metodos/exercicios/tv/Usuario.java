package edu.lucas.aulasjava.metodos.exercicios.tv;

public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTV = new SmartTv(); // essa é a forma de criar uma classe para ilustrar a interação dos métodos e
                                         // atributos e assim sucessivamente

        smartTV.diminuirVolume(); // diminuirVolume
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume(); // aumentarVolume

        System.out.println("Canal Atual:" + smartTV.canal); // canal atual = 1 (valor definido em SmartTv)

        smartTV.mudarCanal(13); // chama o método e insere um valor para mudar o canal
                                            // canal atual = 13

        System.out.println("TV Ligada? " + smartTV.ligada);     
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();        // chama o método e altera o status da tv para ligada (true).
        System.out.println("Novo Status -> TV Ligada? " + smartTV.ligada);

        smartTV.desligar();     // chama o método e altera o status da tv para desligada (false).
        System.out.println("Novo Status -> TV Ligada? " + smartTV.ligada);
    }
}