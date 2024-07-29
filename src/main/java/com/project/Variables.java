package com.project;
// 2
public class Variables {
    public static void main(String[] args){
    // String - armazena texto
    // int - armazena inteiros
    // float - armazena aqueles números decimais
    // char - armazena letra, tal como 'a' or 'B'. É preciso das aspas simples!
    // boolean - armazena valores lógicos: true ou false

        String name = "Danrley";
        System.out.println(name);

        int number = 7;
        System.out.println(number);

        // para atribuir uma constante, utilize a palavra-chave: final.
        final float numeroConstante = 3.14f; // adicione o f no final de cada float!
        System.out.println(numeroConstante);

        System.out.println("Hello " + name);

        // é possível declarar um monte de variável em uma linha, desde que separe
        // entre vírgulas.
        // o java não se importa com os espaços. Uma boa prática é deixar
        // o código legível!

        int x = 4, y = 3, z = 5;
        System.out.println(z*z == x*x + y*y); // teorema de pitágoras, retorna true.

    }
}
