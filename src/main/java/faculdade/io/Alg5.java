package faculdade.io;

import javax.swing.*;

public class Alg5 {
    public static void main(String[] args){
//        5) Escreva um programa que calcule a área de um quadrado , a área de um trapézio e
//        a área de um triângulo e informe qual tem maior área.
        String base_txt = JOptionPane.showInputDialog("Base maior: ");
        String altura_txt = JOptionPane.showInputDialog("Altura:");
        String baseMenor_txt = JOptionPane.showInputDialog("Base menor: ");

        double base_maior = Integer.parseInt(base_txt);
        double base_menor = Integer.parseInt(baseMenor_txt);
        double altura = Integer.parseInt(altura_txt);

        double area_quadrado = base_maior * altura;
        double area_triangulo = (base_maior * altura) / 2;
        double area_trapezio = ((base_maior + base_menor) * altura)/ 2;

        JOptionPane.showMessageDialog(null, "Área do Quadrado: " +
                " " + area_quadrado + "\n" +
                "Área do triângulo " + area_triangulo + "\n" +
                "Área do trapézio " + area_trapezio);
    }
}
