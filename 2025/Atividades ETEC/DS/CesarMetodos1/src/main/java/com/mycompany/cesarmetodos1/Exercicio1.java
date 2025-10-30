package com.mycompany.cesarmetodos1;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Exercicio1 {
    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat("0.00");
        double nota1=0, nota2=0, media;
        JOptionPane.showMessageDialog(null, "Calculador de média");
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Primeira nota:");
        nota1=lerNota();
        JOptionPane.showMessageDialog(null, "Segunda nota:");
        nota2=lerNota();
        media=calcularMedia(nota1, nota2);
        JOptionPane.showMessageDialog(null, nome+", sua média é "+deci.format(media));
        if(media<7){
            JOptionPane.showMessageDialog(null, "Você foi reprovado(a)");
        }
        else{
            JOptionPane.showMessageDialog(null, "Você foi aprovado(a)!");
        }
    }
    static double lerNota(){
        double n1;
        do{
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
            if(n1<0 || n1>10){
                JOptionPane.showMessageDialog(null, "Nota deve estar entre 0 e 10, insira uma nota válida.");
            }
        }while(n1<0 || n1>10);
        return n1;
    }
    static double calcularMedia(double n1, double n2){
        double m = (n1 + n2)/2;
        return m;
    }
}