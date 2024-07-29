package com.classes;

// 1
public class OOP {
    int x = 5;
    public static void main(String[] args){
        // criando um objeto chamado numeroA e numeroB
        // o nome da class, precisa coincidir na criação do objeto
        OOP numeroA = new OOP();
        // criando mais de um objeto
        OOP numeroB = new OOP();
        System.out.println(numeroA.x);
        System.out.println(numeroB.x);

        // OOP - Object Oriented Programming
        // trata-se de uma programação que utiliza da criação de objetos que
        // contém métodos e dados.

        // o java é uma linguagem oop.

        // as vantagens do OOP
        // - é rápido e fácil execução
        // - providencia uma estrutura limpa para o programa
        // - facilita a manuntenção e ainda evita repetições
        // - possibilita a reutilização de código.

        System.out.println("Esse método está sendo executado dentro de um objeto main");

    }


}
