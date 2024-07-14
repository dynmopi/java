package com.project;

public class IfElse {
    public static void main(String[] args){
        // o java possui instruções de condicionais
        /*
            if - caso for true
            else - caso for false
            else if - condição aninhada
            switch - para especificar muitos blocos alternativos
         */

        if (false){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        int tempo = 13;
        if (tempo > 0 && tempo < 12){
            System.out.println("Bom dia");
        } else if (tempo < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        // shorthand, operador ternário.
        // pegando o exemplo de cima

        /*
        if (false){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
         */
        boolean booleano = true;
        String result = booleano ? "Verdadeiro" : "Falso";
        System.out.println(result);

        // switch
    }
}
