package com.mycompany.cesarmetodos1;
import javax.swing.JOptionPane;
public class Exercicio5 {
    public static void main(String[] args) {
        double hipo;
        JOptionPane.showMessageDialog(null, "Calculador de hipotenusa");
        hipo = hipotenusa();
        JOptionPane.showMessageDialog(null, "O comprimento da hipotenusa é: "+hipo);
    }
    static double hipotenusa(){
        double hi;
        double b;
        double h;
        do{
            b = Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento da base do triângulo"));
            if(b==0){
                JOptionPane.showMessageDialog(null, "ERRO: base não pode ser igual a 0", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }while(b==0);
        do{
            h = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do triângulo"));
            if(h==0){
                JOptionPane.showMessageDialog(null, "ERRO: altura não pode ser igual a 0", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }while(h==0);
        hi = Math.sqrt(Math.pow(b, 2)+Math.pow(h, 2));
        return hi;
    }
}
