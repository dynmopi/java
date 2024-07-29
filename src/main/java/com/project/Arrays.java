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
        // array são matrizes
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        // usando o forEach, é um for que já implementa o .length
        String[] cores = {"vermelho", "azul", "amarelo"};
        for (String contador : cores) {
            System.out.println(contador);
        }

//         exemplo prático. Cálculo de média

        int[] idades = {20, 22, 18, 35, 48, 26, 87, 70};

        float resultado, soma = 0;

        int comprimento = idades.length;
        int menorIdade = idades[0]; // o index zero é para a padronização

    // forEach
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

        // é útil quando queremos armazenar valores em linhas e colunas. Portanto, possui
        // forma de tabela.

        float[][] multiArrays = {{1.1f, 2.1f, 3.1f}, {2.1f, 2.2f, 2.3f}};
        System.out.println(multiArrays[1][0]);// é necessário especificar em 2 indexes
        // primeiro index = array
        // segundo index = elemento

        // [1] segundo array [1] segundo elemento
        // em java, o index 0 é dito como o primeiro.

        // alterando um elemento do multiArrays
        multiArrays[1][0] = 7;
        System.out.println(multiArrays[1][0]);

        System.out.println(multiArrays.length);
        // especifica a quantidade de arrays dentro do próprio array
        //
        System.out.println(multiArrays[0].length); // com a possibilidade de especificar
        // o index, nesse caso é imprimido os elementos do array filho.

        // reatribuindo o segundo array do primeiro elemento.
        multiArrays[1][0] = 2.1f; // não se esqueça de tipar o número!

        // usando o for através de multiArrays para imprimir todos os elementos
        for (int i = 0; i < multiArrays.length; i++){ // adere o comprimento do array pai (conjunto)
            for (int j = 0; j < multiArrays[i].length; j++){ // adere o comprimento do array filho (elementos)
                System.out.println(multiArrays[i][j]);
            }
        }
        System.out.println("usando o forEach");
        // usando o forEach

        for (float[] elementoDoArray : multiArrays){
            for (float elementoDoArrayFilho: elementoDoArray){
                System.out.println(elementoDoArrayFilho); // e assim imprime todos
                // os elementos dos dois arrays pai.
            }
        }

    }

}


