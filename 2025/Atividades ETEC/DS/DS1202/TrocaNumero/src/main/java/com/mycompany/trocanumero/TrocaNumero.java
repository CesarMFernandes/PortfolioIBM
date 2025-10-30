package com.mycompany.trocanumero;
import javax.swing.JOptionPane;
public class TrocaNumero {
    public static void main(String[] args) {
        double troca;
        JOptionPane.showMessageDialog(null, "Trocador de Números\nDigite dois números para serem trocados");
        double NumA = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número A:"));
        double NumB = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número B:"));
        JOptionPane.showMessageDialog(null, "NumA: "+NumA+"\nNumB: "+NumB);
        JOptionPane.showMessageDialog(null, "trocando...");
        troca = NumA;
        NumA = NumB;
        NumB = troca;
        JOptionPane.showMessageDialog(null, "NumA: "+NumA+"\nNumB: "+NumB);
    }
}
