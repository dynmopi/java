package faculdade.io;

import javax.swing.*;

public class Alg3 {
    public static void main(String[] args){
//  3) Escreva um programa que receba dois valores para as variareis x e y. Depois,
//  troque os valores destas variareis e exiba-os na tela. {x = valor1; y = valor2 → x =
//  valor2; y = valor1}

        String x_txt = JOptionPane.showInputDialog("Insira o valor de x: ");
        String y_txt = JOptionPane.showInputDialog("Insira o valor de y: ");

        double x = Integer.parseInt(x_txt);
        double y = Integer.parseInt(y_txt);

        // criação da terceira variável
        double z = 0;

        z = x;
        x = y;



        System.out.println("Valores trocados" +
                ":O valor de Y é "+ x +  " " + "e o valor de X é " + z);
    }
}
