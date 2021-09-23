package br.com.zup;

public class Voadores extends Vilao {
    double danoTiro;

    public Voadores (){

    }

    public double getDanoTiro() {
        return danoTiro;
    }

    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }

    public double aplicarDano(){
        return danoTiro;
    }

}
