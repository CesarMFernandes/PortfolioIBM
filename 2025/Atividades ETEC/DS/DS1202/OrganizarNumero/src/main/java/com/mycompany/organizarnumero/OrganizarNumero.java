package com.mycompany.organizarnumero;
import javax.swing.JOptionPane;
public class OrganizarNumero {
    public static void main(String[] args) {
        int[] mat = new int[3];
        int[] sort = new int[3];
        int maior = 0;
        int menor = 0;
        int med = 0;
        String[] mats = new String[3];
        JOptionPane.showMessageDialog(null, "Organizador de número\nDigite três números inteiros para serem organizados");
        for(int x=0; x<3; x++){//Entrada
            if(x==0){
                mat[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
            }
            if(x==1){
                mat[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
            }
            if(x==2){
                mat[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero:"));
            }
            System.out.printf("\n");
        }     
        if (mat[0] >= mat[1] && mat[0] >= mat[2]){
            maior = mat[0];
        }
        if (mat[1] > mat[0] && mat[1] >= mat[2]){
            maior = mat[1];
        }
        if (mat[2] > mat[0] && mat[2] > mat[1]){
            maior = mat[2];
        }
        if (mat[0] < mat[1] && mat[0] < mat[2]){
            menor = mat[0];
        }
        if (mat[1] <= mat[0] && mat[1] < mat[2]){
            menor = mat[1];
        }
        if (mat[2] <= mat[0] && mat[2] <= mat[1]){
            menor = mat[2];
        }
        if (mat[0] != maior && mat[0] != menor){
            med = mat[0];
        }
        if (mat[1] != maior && mat[1] != menor){
            med = mat[1];
        }
        if (mat[2] != maior && mat[2] != menor){
            med = mat[2];
        }
        if(med==0){
            if(mat[0]==mat[1]){
                med = mat[1];
            }
            if(mat[0]==mat[2]){
                med = mat[2];
            }
            if(mat[1]==mat[2]){
                med = mat[1];
            }
        }
        sort[0] = maior;
        sort[1] = med;
        sort[2] = menor;
        JOptionPane.showMessageDialog(null, "Mostrando os números em ordem decrescente.");
        for (int x=0; x<3; x++){
            mats[x]= "Numero "+(x+1)+": "+sort[x];
        }
        JOptionPane.showMessageDialog(null, mats[0]+"\n"+mats[1]+"\n"+mats[2]);//Saída
    }
}