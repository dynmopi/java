package faculdade.io;

import javax.swing.*;

public class Alg1 {
    public static void main(String[] args){
    // 1) Escreva um programa que receba três notas e imprima a media aritmética delas.
        String nota1_txt = JOptionPane.showInputDialog("Insira o primeiro valor: ");
        String nota2_txt = JOptionPane.showInputDialog("Insira o segundo valor: ");
        String nota3_txt = JOptionPane.showInputDialog("Insira o terceiro valor: ");

        double nota1 = Integer.parseInt(nota1_txt);
        double nota2 = Integer.parseInt(nota2_txt);
        double nota3 = Integer.parseInt(nota3_txt);

        double num1[] = {nota1, nota2, nota3};

        int comprimento = num1.length;

        float total = 0;

        for (int i = 0; i < num1.length; i++){
            total += num1[i];
            System.out.println(num1[i]);
        }

        double media = total / comprimento;
        JOptionPane.showMessageDialog(null, "A média dos valores" +
                " é de " + media);

    }
}
