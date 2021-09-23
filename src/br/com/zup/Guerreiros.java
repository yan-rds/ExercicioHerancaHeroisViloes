package br.com.zup;

public class Guerreiros extends Heroi{
    double poderAtaque;

    public Guerreiros(){

    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public double aplicarDano(){
        return poderAtaque;
    }
}

