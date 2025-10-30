package com.mycompany.ex1b;
public class Ex1b {
    public static void main(String[] args) {
        //Formação da matriz
        int [][] matriz = {
            {19,25,100,99},
            {10,7,25,14},
            {35,2,47,74},
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