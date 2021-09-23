package br.com.zup;

public class Magos extends Heroi {
    private double poderMagico;

    public Magos (){

    }

    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    public double aplicarMagia (){
        return poderMagico;
    }
}
