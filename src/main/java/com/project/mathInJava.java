package com.project;
// 5
public class mathInJava {
    public static void main(String[] args){

        System.out.println(Math.max(5, 10)); // método que encontra o maior valor entre os digitados.

        System.out.println(Math.min(5, 10));// é o inverso de cima.

        System.out.println(Math.sqrt(81)); // retorna raíz quadrada

        System.out.println(Math.abs(-50)); // retorna valores positivos.

        System.out.println(Math.random()); // retorna um numero aleatorio, entre 0 e 1

        // para se ter mais controle, você pode utilizar de uma fórmula
        int random_number = (int)(Math.random() * 101);
        System.out.println(random_number);
    }
}
