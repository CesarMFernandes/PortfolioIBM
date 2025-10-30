package com.mycompany.ex6;
import javax.swing.JOptionPane;
public class Ex6 {
    public static void main(String[] args) {
        final int N_Lin = 3, N_Col = 3;
        int [][] mat = new int [N_Lin][N_Col];
        int l,c;
        JOptionPane.showMessageDialog(null, "****** Cadastrando dados na matriz ******\nEntre com o valor em cada posição da matriz");
        for(l=0; l<N_Lin; l++){
            for(c=0; c<N_Col; c++){
                mat[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Linha "+(l+1)+"\nColuna "+(c+1)));
            }
        }
        for(l=0; l<N_Lin; l++){
            for(c=0; c<N_Col; c++){
                System.out.print(mat[l][c]+" ");
            }
            System.out.print("\n");
        }     
    }
}
