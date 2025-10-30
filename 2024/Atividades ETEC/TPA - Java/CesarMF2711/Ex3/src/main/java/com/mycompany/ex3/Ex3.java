package com.mycompany.ex3;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Ex3 {
    public static void main(String[] args) {
        int mat[][] = new int[3][5];
        int l, c;
        int vet[] = new int[16];
        int v;
        int numr = 0;
        int nump = 0;
        int numi = 0;
        JOptionPane.showMessageDialog(null, "Insira os números inteiros para aparecerem na matriz.");
        for(l=0; l<3; l++){
            for(c=0; c<5; c++){
                mat[l][c]=Integer.parseInt(JOptionPane.showInputDialog("Linha "+(l+1)+"\nColuna "+(c+1)));
                if(mat[l][c]%2==0){
                    nump = nump+1;
                } else{
                    numi = numi+1;
                }
            }
        }
        for(l=0; l<3; l++){
            for(c=0; c<5; c++){
                System.out.print(mat[l][c]+" ");
                v = (5*l + c);
                vet[v] = mat[l][c];
            }
            System.out.print("\n");
        }
        Arrays.sort(vet);
        for(v=0; v<15; v++){
            if(vet[v]==vet[(v+1)]){
                numr = 1;
            }
        }
        if(numr>=1){
            JOptionPane.showMessageDialog(null, "Existem elementos repetidos na matriz.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Não existem elementos repetidos na matriz.");
        }
        JOptionPane.showMessageDialog(null, "Quantidade de números pares: "+nump);
        JOptionPane.showMessageDialog(null, "Quantidade de números ímpares: "+numi);        
    }
}