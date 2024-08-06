package com.classes.Encapsulation;

public class Main {
    public static void main(String[] args){
        Pessoa myObj = new Pessoa();
        myObj.setName("Danrley");
        System.out.println(myObj.getName());

        // encapsulation é tido como uma técnica para ocultar aqueles dados importantes dos usuários.

        // para isso é necessário declarar a classe, variaveis, e atributos como private
        // para acessar o modifier private, era necessário por meio dentro da classe declarada,
        // do outro lado, é possível acessar usando métodos como get ou set

        // get: retorna o valor da variavel
        // set: declara o valor.

        // isso ajudo muito na manuntenção do código, e na segurança da aplicação


    }
}
