package faculdade.io;

import javax.swing.*;

public class Alg4 {
    public static void main(String[] args){
        // 4) Escreva um programa que calcule a área de um circulo e exiba o resultado na tela.
        //{Formula: A = pi * raio ^ 2}
        String valor_txt = JOptionPane.showInputDialog("Insira o valor do raio para" +
                " calcular a área de um círculo");

        // valor = numero do raio.
        final double pi = 3.14d;
        double valor = Integer.parseInt(valor_txt);
        double area = pi * (valor*valor);

        JOptionPane.showMessageDialog(null, "O valor da área " +
                "é de: " + area);
    }
}
