package br.com.zup;

public class Heroi {
    private String nome;
    private double vida;

    public Heroi(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void trocarNome (String nome){
        setNome(nome);
    }

    public void receberDano (Double dano){
        setVida(getVida() - dano);
    }

    public double exibirVida(){
        return getVida();
    }
}
