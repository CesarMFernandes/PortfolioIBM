package com.mycompany.ex1a;
public class Ex1a {
    public static void main(String[] args) {
        //Formação da matriz
        String [][] matriz = {
            {"a","b","c","d","e"},
            {"f","g","h","i","j"},
            {"l","m","n","o","p"},
            {"q","r","s","t","u"}
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