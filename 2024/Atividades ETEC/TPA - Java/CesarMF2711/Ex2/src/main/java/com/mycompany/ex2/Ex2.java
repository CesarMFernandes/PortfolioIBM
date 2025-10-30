package com.mycompany.ex2;
import javax.swing.JOptionPane;
public class Ex2 {
    public static void main(String[] args) {
        int mat[][] = new int[5][5];
        int l, c;
        int somi = 0;
        int soml[] = new int[5];
        int somc[] = new int[5];
        JOptionPane.showMessageDialog(null, "Insira os números inteiros para aparecerem na matriz.");
        for(l=0; l<5; l++){
            for(c=0; c<5; c++){
                mat[l][c]=Integer.parseInt(JOptionPane.showInputDialog("Linha "+(l+1)+"\nColuna "+(c+1)));
                if(mat[l][c]%2 != 0){
                    somi = somi + mat[l][c];
                }
                somc[c]=somc[c]+mat[l][c];
                soml[l]=soml[l]+mat[l][c];
            }
        }
        for(l=0; l<5; l++){
            for(c=0; c<5; c++){
                System.out.print(mat[l][c]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("\nSoma dos números impares: "+somi);
        System.out.println("\nSoma de cada coluna: ");
        for(c=0; c<5; c++){
            System.out.println("Coluna "+(c+1)+": "+somc[c]);
        }
        System.out.println("\nSoma de cana linha: ");
        for(l=0; l<5; l++){
            System.out.println("Linha "+(l+1)+": "+soml[l]);
        }
    }
}