package bpm.lab;

import javax.swing.*;

public class alg2 {
    public static void main(String[] args){
//        1.2 Área do Quadrado - v1
//        Calcular e exibir a área de um quadrado, a partir do valor de sua
//        aresta que será digitado.

    JOptionPane.showMessageDialog(null,"Digite o valor da aresta do quadrado");
    double aresta = Integer.parseInt((JOptionPane.showInputDialog(null, "Valor da aresta")));

    double area = aresta * aresta;

    JOptionPane.showMessageDialog(null, "O valor da área do quadrado é de: " + area);
    }
}
