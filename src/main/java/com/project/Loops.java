package com.project;
// 7
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

// exemplo 1:
        int contagemRegressiva = 3;
//        while (contagemRegressiva > 0){
//            System.out.println(contagemRegressiva);
//            contagemRegressiva--;
//            if (contagemRegressiva == 0){
//                System.out.println("Feliz ano novo");
//            }
//
//        }

        do {
            System.out.println(contagemRegressiva);
            contagemRegressiva--;
            if(contagemRegressiva == 0){
                System.out.println("Feliz ano novo, só que diferente");
            }
        } while (contagemRegressiva > 0);
        //


        // for loops
        // for (statement 1; statement 2; statement 3) {
        //     code block
        // }

        for (int n = 5; n > 0; n--){
            System.out.println("Usando o for" + n);
        }
        // nested loops - loops aninhados

        for (int a = 1; a <= 5; a++){
            System.out.println("For pai" + a);
            for (int b = 1; b <= 5; b++){
                System.out.println("For filho" + b);
            }
        }
        // for-each - "uma para cada"

//        for (type variableName : arrayName) {
//            // code block to be executed
//        }
        String[] cores = {"azul", "preto", "roxo"};
        for(String m : cores){
            System.out.println(m);
        }
// exemplo prático usando o for
        int number = 5;
        for (int t = 0; t <= 10; t++){
            System.out.println(number + " x " + t + " = " + number*t);
        }
    }
}
