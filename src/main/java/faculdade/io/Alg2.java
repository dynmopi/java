package faculdade.io;

import javax.swing.*;

import static java.lang.Math.round;

public class Alg2 {
    public static void main(String[] args){
        // 2) Escreva um programa que receba uma temperatura em Fahrenheit e a converta
        // para Celsius. {Formula: C = (F - 32) / 1.8}
        String valor_txt = JOptionPane.showInputDialog("De Fahrenheit para Celsius: ");
        double fahrenheit = Integer.parseInt(valor_txt);

        double celsius = (fahrenheit - 32)/1.8;
        JOptionPane.showMessageDialog(null, "O valor convertido é de" +
                " " + String.format("%.1f", celsius) + " Cº");
    }
}
