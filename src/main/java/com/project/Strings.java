package com.project;
// 4
public class Strings {
    public static void main(String[] args){
        // strings, são textos armazenados.
        // elas precisam ser cercadas através de aspas duplas
        String apresentacao = "Olá mundo";
        System.out.println(apresentacao);
        // as strings em java, são objetos. Para saber o comprimento de um string
        // digite length()
        System.out.println(apresentacao.length()); // imprime a quantidade de letras
        // que tem nessa string.

        System.out.println(apresentacao.toUpperCase()); // imprime em letras maiúsculas
        System.out.println(apresentacao.toLowerCase()); // em minúsculas.

        String txt = "Eu gosto de programar em java";
        System.out.println(txt.indexOf("java")); // imprime 25
        // o indexOf, localiza o índice da primeira letra de uma dada palavra digitada.

        // concatenação
        System.out.println(apresentacao + txt);
        // caso queira separar as duas strings, utilize o " "
        // é possível através por método
        System.out.println(apresentacao.concat(txt));

        // numeros são adicionados e strings são concatenados.

        String x = "10";
        int y = 45;
        System.out.println(x + y);


        // special characters.
        // o princípio, é da utilização da barra invertida \
        System.out.println("Olá\nmundo");
        System.out.println("Olá\t mundo");
        System.out.println("Olá \"mundo\"");

    }
}
