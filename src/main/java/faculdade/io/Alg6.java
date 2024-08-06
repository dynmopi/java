package faculdade.io;

import javax.swing.*;
public class Alg6 {
    public static void main(String[] args){
//        6) Escreva um programa que peça ao usurário para inserir a largura e o comprimento
//        de uma sala. Uma vez que os valores tenham sido lidos, seu programa deve calcular e
//        exibir a área da sala.

        String comprimento_txt = JOptionPane.showInputDialog("Comprimento da sala: ");
        String largura_txt = JOptionPane.showInputDialog("Largura da sala: ");

        double comprimento = Integer.parseInt(comprimento_txt);
        double largura = Integer.parseInt(largura_txt);

        double area = comprimento * largura;

        JOptionPane.showMessageDialog(null, "A área da sala é: " + area);
    }
}
