package com.mycompany.comparanumero;
import javax.swing.JOptionPane;
public class ComparaNumero {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Comparador de Números\nInsira dois números para serem comparados");
        double NumA = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número A:"));
        double NumB = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número B:"));
        if(NumA==NumB){
            JOptionPane.showMessageDialog(null, NumA+" é igual a "+NumB);
        }
        else if (NumA>NumB){
            JOptionPane.showMessageDialog(null, NumA+" é diferente de "+NumB);
        }
        else{
            JOptionPane.showMessageDialog(null, NumB+" é diferente de "+NumA);
        }
    }
}
