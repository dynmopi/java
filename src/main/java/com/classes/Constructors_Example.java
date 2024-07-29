package com.classes;
// 5

class Constructors_Example {
    // tipando as variáveis que serão mostradas
    int anoModelo;
    String nomeModelo;

// usando o construtor
public Constructors_Example(int ano, String nome) {
    anoModelo = ano;
    nomeModelo = nome;
}
    public static void main(String[] args) {
    // criando o objeto do construtor para a impressão na tela
    Constructors_Example carro = new Constructors_Example(1995, "Chevrolet");
    // mostrando na tela
    System.out.println("O modelo é do ano de: " + carro.anoModelo +
            "\nO nome dele é: " + carro.nomeModelo);
    }
}
