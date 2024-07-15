package com.project;
// 9
public class Arrays {
    public static void main(String[] args) {
        // Arrays são usados para armazenar múltiplos valores em uma
        // variável isolada

        // é necessário utilizar os colchetes ao lado do data type para se
        // referir, que aquela variável é um array.
        int[] num = {10, 20, 30, 40, 50};
        System.out.println(num[0]);
        System.out.println(num.length); // mostra a quantidade de index que esse array tem

        // loop através de um array

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        // usando o forEach
        String[] cores = {"vermelho", "azul", "amarelo"};
        for (String contador : cores) {
            System.out.println(contador);
        }

//         exemplo prático

        int[] idades = {20, 22, 18, 35, 48, 26, 87, 70};

        float resultado, soma = 0;

        int comprimento = idades.length;
        int menorIdade = idades[0]; // o index zero é para a padronização


        for (int idade : idades) {
            soma += idade;
            if (menorIdade > idade){
                menorIdade = idade;
            }
        }

        resultado = soma / comprimento;
        System.out.println("A média das idades é "+ resultado + " e a menor idade é " + menorIdade);

        // multidimensional arrays
        // consiste num array de arrays

        // é útil quand o queremos armazenar valores em linhas e colunas. Portanto, possui
        // forma de tabela.

        float[][] multiArrays = {{1.1f, 2.1f, 3.1f}, {2.1f, 2.2f, 2.3f}};
        System.out.println(multiArrays[1][0]);// é necessário especificar em 2 indexes
        // primeiro index = array
        // segundo index = elemento

        // [1] segundo array [1] segundo elemento

        // alterando um elemento do multi
        multiArrays[1][0] = 7;
        System.out.println(multiArrays[1][0]);



    }

}


