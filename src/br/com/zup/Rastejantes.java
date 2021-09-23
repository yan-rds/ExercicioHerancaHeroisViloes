package br.com.zup;

public class Rastejantes extends Vilao {
    double danoEspinhos;

    public Rastejantes(){

    }
    public double getDanoEspinhos() {
        return danoEspinhos;
    }

    public void setDanoEspinhos(double danoEspinhos) {
        this.danoEspinhos = danoEspinhos;
    }

    public double aplicaDano(){
        return danoEspinhos;
    }

}
