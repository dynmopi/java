package bpm.lab;

import javax.swing.*;

public class alg3 {
    public static void main(String[] args){
//        1.3 Área do Quadrado - v2
//        Calcular e exibir a área de um quadrado a partir do valor de sua
//        diagonal que será digitado.

        // diagonal == l * sqrt(2)
        // l == diagonal / sqrt(2)
        // l^2 == diagonal^2 / 2
        // area == l^2

        JOptionPane.showMessageDialog(null, "Insira o valor da diagonal para o cálculo da área de um quadrado");
        double diagonal = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor da diagonal"));
        double area = Math.pow(diagonal, 2) / 2;

        JOptionPane.showMessageDialog(null, "O resultado da área é de: " + area);





    }
}
