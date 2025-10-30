package com.mycompany.media;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Media {
    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat("0.00");
        double b1, b2, b3, b4, m;
        String nome = "";
        while("".equals(nome)){
            nome = JOptionPane.showInputDialog(null, "Coloque seu nome completo para continuarmos");
            if("".equals(nome)){
                JOptionPane.showMessageDialog(null, "Nome não foi inserido. Por favor, insira um nome válido e tente novamente.");
            }
        }
        JOptionPane.showMessageDialog(null, "Olá, "+nome+". Você irá inserir as suas notas da matéria de matemática.");
        do{
            b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeira Nota:"));
            if(b1<0 || b1>10){
                JOptionPane.showMessageDialog(null, "Nota não pode ser menor que 0 ou maior que 10. Por favor, insira uma nota válida e tente novamente.");
            }
        }while(b1<0 || b1>10);
        do{
            b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segunda Nota:"));
            if(b2<0 || b2>10){
                JOptionPane.showMessageDialog(null, "Nota não pode ser menor que 0 ou maior que 10. Por favor, insira uma nota válida e tente novamente.");
            }
        }while(b2<0 || b2>10);
        do{
            b3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Terceira Nota:"));
            if(b3<0 || b3>10){
                JOptionPane.showMessageDialog(null, "Nota não pode ser menor que 0 ou maior que 10. Por favor, insira uma nota válida e tente novamente.");
            }
        }while(b3<0 || b3>10);
        do{
            b4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quarta Nota:"));
            if(b4<0 || b4>10){
                JOptionPane.showMessageDialog(null, "Nota não pode ser menor que 0 ou maior que 10. Por favor, insira uma nota válida e tente novamente.");
            }
        }while(b4<0 || b4>10);
        m = (b1+b2+b3+b4)/4;
        JOptionPane.showMessageDialog(null, "Sua média final é: "+deci.format(m));
    }
}
