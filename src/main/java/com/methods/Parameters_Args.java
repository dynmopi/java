package com.methods;
// 2
public class Parameters_Args {

    static void imprimir(String nome, int ano){
        System.out.println(nome + " maranhão");
        System.out.println("ele tem " + ano + " anos");

        if (ano >= 18){
            System.out.println("e pode tirar a carteira de motorista");
        } else {
            System.out.println("não podes tirar a carteira de motorista");
        }
    }


    public static void main(String[] args){
        // é possivel informar ao metodo os parametros que nela possuem
        // os parametros são usadas como variáveis dentro dos métodos.

        // eles são especificados entre parenteses depois do nome do método
        imprimir("danrley", 18); // danrley é um argumento e 18 também
    }
}
