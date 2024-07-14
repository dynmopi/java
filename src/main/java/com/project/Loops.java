package com.project;

public class Loops {
    public static void main(String[] args){
        System.out.println("Loops");
        // loops são blocos de código que são executadas, até quando uma
        // condição especificada seja alcançada.
        // eles são úteis para deixar o código mais limpo, sem repetições
        // while percorre até quando a condição for verdadeira.

//        while (condition){
//            // block to executed
//        }
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++; // incremento. Caso não incremente, o loop irá funcionar infinitamente.
        }
        // do while, faz o bloco enquanto a condição for verdadeira.

        /*
        do {
            // block to executed.
        } while (condition);

         */
        System.out.println("outra forma");
        // pegando o mesmo exemplo anterior

        int c = 0;
        do {
            System.out.println(c);
            c++;
        } while (c < 10);

    }
}
