package com.mycompany.cesarmetodos1;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Exercicio3 {
    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat("0.000");
        double a = 0, peso;
        String sexo = "";
        JOptionPane.showMessageDialog(null, "Calculador de peso ideal");
        do{
            peso = calcularPesoIdeal();
            if(peso==0){
                JOptionPane.showMessageDialog(null, "ERRO: altura e/ou sexo foram inseridos incorretamente. Tente novamente.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Seu peso ideal é: "+deci.format(peso)+"kg");
            }
        }while(peso==0);
    }
    static double calcularPesoIdeal(){
        double p = 0;
        double h;
        String s;
        h = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura, em metros."));
        s = JOptionPane.showInputDialog("Insira seu sexo (m-Masculino / f-Feminino)");
        if(h>0){
            if("m".equals(s)){
                p = (72.7*h)-58;
                return p;
            }
            else if("f".equals(s)){
                p = (62.1*h)-44.7;
                return p;
            }
        }
        return p;
    }
}