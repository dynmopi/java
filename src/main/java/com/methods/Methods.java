package com.methods;
// 1

// classe aqui
public class Methods {

    public static void main(String[] args){
        // método, é um bloco de código que só irá funcionar, se CASO for chamado.
        // é possível passar parâmetros nesses métodos.

        // são conhecidos como funções.

        // para declarar um método, é preciso implementar dentro de uma classe

        // o java possui seus métodos próprios, o grande exemplo é o
        System.out.println("método que serve para imprimir algo na tela");

        // chamando no main, pode ser por múltiplas vezes:
        qualquerMetodo();
        qualquerMetodo();
        qualquerMetodo();
        qualquerMetodo();
    }
    // repare que ele está fora de main!!!
    static void qualquerMetodo(){
        System.out.println("funcionou!");
    }
    // qualquerMetodo(): é o nome do método
    // static: ressalta que o método pertence à classe main e não um objeto que pertence a classe main
    // void: menciona que o método não tem um valor de retorno.

    // para executar o método, é preciso chamar dentro de main
}
