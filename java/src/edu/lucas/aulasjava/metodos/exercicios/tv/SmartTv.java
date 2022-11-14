package edu.lucas.aulasjava.metodos.exercicios.tv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void aumentarVolume(){
        volume++;  //volume = volume + 1;
        System.out.println("Aumentando o volume para: " + volume);  
    }

    public void diminuirVolume(){
        volume--;   //volume = volume - 1;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }


}
