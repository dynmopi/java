package bpm.lab;

import javax.swing.*;

public class alg1 {
    public static void main(String[] args){
//        1.1 Área do Retângulo
//        Entrar via teclado com a base e a altura de um retângulo, calcular e
//        exibir sua área

        JOptionPane.showMessageDialog(null, "Calculador de área de um retângulo");

        double base = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da base: "));
        double altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da Altura"));

        double area = base * altura;

        JOptionPane.showMessageDialog(null, "O valor da área é de: " + area);


        System.out.println("Fim da execução");
    }


}
