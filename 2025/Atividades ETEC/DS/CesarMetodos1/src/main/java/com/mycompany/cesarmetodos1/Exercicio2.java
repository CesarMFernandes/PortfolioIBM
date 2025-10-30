package com.mycompany.cesarmetodos1;
import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String[] args) {
        double num1, num2;
        JOptionPane.showMessageDialog(null, "Calculador de diferença");
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        diferenca(num1, num2);
    }
    static void diferenca(double n1, double n2){
        double d;
        if(n1>n2){
            d = n1-n2;
            JOptionPane.showMessageDialog(null, "A diferença entre os dois números é "+d);
        }
        else if(n2>n1){
            d = n2-n1;
            JOptionPane.showMessageDialog(null, "A diferença entre os dois números é "+d);
        }
        else{
            JOptionPane.showMessageDialog(null, "Os dois números inseridos são iguais");
        }
    }
}