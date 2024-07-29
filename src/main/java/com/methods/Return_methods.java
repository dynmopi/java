package com.methods;
// 3

// quando o void é mencionado, estamos dizendo que o método
// não irá retornar o valor true. Se caso o void não é iterado
// então teremos o return dentro do método e a tipagem do método
public class Return_methods {
    static int soma(int x){
        return x + 10;
    }

    public static void main(String[] args){
        System.out.println(soma(5));



        // repare que as variáveis são criadas dentro de uma classe
        // isso é denominado escopo.
        //  System.out.println(num1); não tem como utilizar aqui, só depois
        // de atribuido

        int num1 = somaMetodo(4, 5);
        double num2 = somaMetodoDouble(4.5, 4.2);
        double num3 = somaMetodo(10, 6);

        System.out.println("int: "+  num1 + "\ndouble:" + num2 + "\ndouble " +
                "repetido: " + num3);





    }
    // é possível usar os mesmos parâmetros em cada classe.
    // repare na utilização do x e y
    static int somaMetodo(int x, int y){
        return x + y;
    }
    static double somaMetodoDouble(double x, double y){
        return x + y;
    }
    // está com o int x e y literalmente repetidos!
    // os metodos podem ter os mesmos nomes, desde que o número ou tipos
    // de parâmetros sejam diferentes
    static double somaMetodo(double x, double y){
        return x + y;
    }

}
