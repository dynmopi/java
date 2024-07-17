package com.methods;
// 4
public class Recursion {
    public static void main(String[] args){
        // recursão é uma técnica em que o algoritmo chama por ela mesmo
        // é uma maneira de partir o problema em problemas menores.
        int resultado = soma(10);
        System.out.println(resultado);

        int resultado2 = soma(5, 10);
        System.out.println(resultado2);
    }

    public static int soma(int x){
        // é uma função acionada sendo chamada dentro de outra função. Recursão.
        if(x > 0){
            return x + soma(x - 1); // soma() está chamando novamente.

        } else {
            return 0;
        }
    }

    public static int soma(int inicio, int fim){
        if(fim > inicio){
            // é preciso somar o fim, pois ele é diminuido 1 vez a cada chamada
            return fim + soma(inicio, fim - 1);
        } else {
            return fim;
        }
    }
}
