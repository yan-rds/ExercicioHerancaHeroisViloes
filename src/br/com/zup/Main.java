package br.com.zup;

public class Main {
    public static void main(String[] args) {
        Guerreiros guerreiro = new Guerreiros("guerreiro", 100, 30);
        Voadores voador = new Voadores("voador", 100, 25.5);

        System.out.println(guerreiro.getVida());
        guerreiro.receberDano(voador.aplicarDano());
        System.out.println(guerreiro.getVida());
    }
}
