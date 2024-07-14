package com.project;

import java.util.Calendar;

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
        // ao invés de escrever muitos if e elses, podemos usar o switch

        // diferentemente do if else, o switch seleciona de imediato qual condição
        // o valor se encaixa, fazendo com que o tempo das condicionais seja
        // otimizada.
        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // se o default for impresso no final do switch, não será necessário um break.
                System.out.println("What day this?");
        }
        // o break, serve para o algoritmo sair dos switches
    }
}
