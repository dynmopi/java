package com.project;
// 8
public class breakContinue {
    public static void main(String[] args){
        // break, utilizado nos switches, também pode ser aderido em outros contextos.
        // ele serve para que o algoritmo quebre a instrução atual, com o objetivo
        // de fazer outras

        for (int c = 0; c < 10; c++){
            System.out.println(c);
            if(c == 5){
                System.out.println("Quebramos quando o c for igual a 5. \n" +
                        "mas o princípio, era até menor que 10");
                break;
            }

        }
        // continue, é o inverso do break, ao invés de quebrar o princípio do código
        // pelo próprio nome já diz, ele irá continuar

        // exemplo sutil sobre o continue, repare que o 5 não é imprimido.
        // através do for, o continue é desnecessário caso imprima primeiro

//        for (int a = 0; a < 10; a++){
//            if (a == 5){
//                continue;
//            }
//            System.out.println(a);
//        }

        // por alguma razão, se imprimires primeiro, o continue será redudante.
        int a = 0;
        while (a < 10){
            if(a == 5){
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }

    }
}
