package com.mycompany.ex1c;
public class Ex1c {
    public static void main(String[] args) {
        //Formação da matriz
        double [][] matriz = {
            {1.9,2.5,10.0},
            {1.0,7.8,2.5},
            {3.5,2.2,4.7},
        };
        int l,c;
        for(l=0; l<matriz.length; l++){
            for(c=0; c<matriz[l].length; c++){
                System.out.print(matriz[l][c]+" "); //Exibe a matriz
            }
            System.out.print("\n"); //Organiza em linhas diferentes
        }
    }
}