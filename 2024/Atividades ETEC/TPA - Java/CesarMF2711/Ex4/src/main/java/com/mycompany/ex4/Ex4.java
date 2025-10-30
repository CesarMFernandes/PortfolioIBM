package com.mycompany.ex4;
import javax.swing.JOptionPane;
public class Ex4 {
    public static void main(String[] args) {
        double mat[][] = new double [4][4];
        int l,c;
        JOptionPane.showMessageDialog(null, "Insira os números decimais para aparecerem na matriz.");
        for(l=0; l<4; l++){
            for(c=0; c<4; c++){
                mat[l][c] = Double.parseDouble(JOptionPane.showInputDialog("Linha "+(l+1)+"\nColuna "+(c+1)));
            }
        }
        for(l=0; l<4; l++){
            for(c=0; c<4; c++){
                if(
                (l==0 && c==0) ||
                (l==1 && c==1) ||
                (l==2 && c==2) ||
                (l==3 && c==3) ||
                (l==0 && c==3) ||
                (l==1 && c==2) ||
                (l==2 && c==1) ||
                (l==3 && c==0)                        
                ){
                    System.out.printf("%.1f",mat[l][c]);
                    System.out.printf("   ");
                }
                else{
                    System.out.printf("      ");
                }
            }
            System.out.printf("\n\n");
        }
    }
}