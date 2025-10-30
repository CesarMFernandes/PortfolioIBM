package com.mycompany.cesarmetodos1;
import javax.swing.JOptionPane;
public class Exercicio4 {
    public static void main(String[] args) {
        int escolha;
        double num1;
        JOptionPane.showMessageDialog(null, "Calculadora com menu de opções");
        do{
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu de opções:\n"
                            + "1 - Soma\n"
                            + "2 - Subtração\n"
                            + "3 - Divisão\n"
                            + "4 - Multiplicação\n"
                            + "5 - Resto da Divisão\n"
                            + "6 - Dobro\n"
                            + "7 - Quadrado\n"
                            + "8 - Cubo\n"
                            + "9 - Raiz Quadrada\n"
                            + "0 - Sair"
            ));
            if(escolha!=0){
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número"));
                calcular(escolha, num1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Saindo...");
            }
        }while(escolha!=0);
    }
    static void calcular(int e, double n1){
        double n2, r;
        switch(e){
            case 1: {
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número para somar"));
                r = n1 + n2;
                JOptionPane.showMessageDialog(null, r);
            }break;
            case 2: {
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número para subtrair"));
                r = n1 - n2;
                JOptionPane.showMessageDialog(null, r);
            }break;
            case 3: {
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número para dividir"));
                if(n2==0){
                    JOptionPane.showMessageDialog(null, "indefinido");
                }
                else{
                    r = n1 / n2;
                    JOptionPane.showMessageDialog(null, r);
                }
            }break;
            case 4: {
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número para multiplicar"));
                r = n1 * n2;
                JOptionPane.showMessageDialog(null, r);
            }break;
            case 5: {
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número para dividir"));
                if(n2==0){
                    JOptionPane.showMessageDialog(null, "indefinido");
                }
                else{
                    r = n1 % n2;
                    JOptionPane.showMessageDialog(null, r);
                }
            }break;
            case 6: {
                r = n1 * 2;
                JOptionPane.showMessageDialog(null, r);
            }break;
            case 7: {
                r = Math.pow(n1, 2);
                JOptionPane.showMessageDialog(null, r);
            }break;
            case 8: {
                r = Math.pow(n1, 3);
                JOptionPane.showMessageDialog(null, r);
            }break;
            case 9: {
                if(n1>=0){
                    r = Math.sqrt(n1);
                    JOptionPane.showMessageDialog(null, r);
                }
                else{
                    n1 = n1 * (-1);
                    r = Math.sqrt(n1);
                    JOptionPane.showMessageDialog(null, r+"i");
                }
            }break;
            default: {
                JOptionPane.showMessageDialog(null, "Houve um erro no menu de opções. Tente novamente", "ERRO", JOptionPane.ERROR_MESSAGE);
            }break;
        }        
    }
}