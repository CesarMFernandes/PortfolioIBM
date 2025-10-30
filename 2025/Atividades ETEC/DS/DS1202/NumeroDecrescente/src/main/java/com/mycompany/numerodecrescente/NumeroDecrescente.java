package com.mycompany.numerodecrescente;
import javax.swing.JOptionPane;
public class NumeroDecrescente {
    public static void main(String[] args) {
        int n;
        String[] op = {"JOptionPane","System.out.print"};
        JOptionPane.showMessageDialog(null, "Você irá inserir um número inteiro, depois será mostrado todos os números desde o número inserido até zero");
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Insira o número:"));
            if(n<=0){
                JOptionPane.showMessageDialog(null, "Número não pode ser menor ou igual a 0. Por favor, tente novamente.");
            }
        }while(n<=0);
        System.out.println(n);
        var escolha = JOptionPane.showOptionDialog(null, "Você quer imprimir a sequência de qual forma (System.out.Print é recomendavel para números maiores)?", "Escolha o método de impressão", 0, 1, null, op, op[0]);
        if(escolha == 0){
            for(int x=n; x>=0; x--){
                JOptionPane.showMessageDialog(null, x);
            }
        }
        if(escolha == 1){
            System.out.println("\n");
            for(int x=n; x>=0; x--){
                System.out.println(x);
            }
        }
    }
}