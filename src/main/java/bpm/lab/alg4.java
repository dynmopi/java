package bpm.lab;

import javax.swing.*;

public class alg4 {
    public static void main(String[] args){
//        1.4 Área do Triângulo
//        A partir dos valores da base e altura de um triângulo, calcular e exibir
//        sua área.

        JOptionPane.showMessageDialog(null, "Calculador da área do triângulo");
        double base = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da base: "));
        double altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da altura"));

        double area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "O valor da área desse triângulo, é de: " + area);

    }
}
