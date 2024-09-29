package one;

public class Desafio {
    public static void main(String[] args){
        //1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.

        float nota1 = 9;
        float nota2 = 7;
        double media = (double)(nota1 + nota2) / 2;
        System.out.println(media);

        //2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

        double varDouble = 3.14;
        int varInt = (int)(varDouble);
        System.out.println(varInt);

        //3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char letra = 'd';
        String palavra = "anrley";

        String mensagem = letra + palavra;
        System.out.println(mensagem);
    }
}
