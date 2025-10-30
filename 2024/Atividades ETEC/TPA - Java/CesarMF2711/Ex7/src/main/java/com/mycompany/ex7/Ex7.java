package com.mycompany.ex7;
import javax.swing.JOptionPane;
public class Ex7 {
    public static void main(String[] args) {
        double [][] matriz = {{4.5,5.2},{4.2,1}};
        int x,y;
        JOptionPane.showMessageDialog(null, "****** Imprimindo a matriz ******");
        for(x=0; x<2; x++){
            for(y=0; y<2; y++){
                System.out.println("matriz["+x+"]["+y+"] = "+matriz[x][y]+" ");
            }
        }     
    }
}