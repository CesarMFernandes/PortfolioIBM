package com.mycompany.ex5a;
public class Ex5a {
    public static void main(String[] args) {
        String mat[][] = new String[4][4];
        int l,c;
        for(l=0; l<4; l++){
            for(c=0; c<4; c++){
                mat[l][c]="*  ";
            }
        }//Construção da matriz
        for(l=0; l<4; l++){
            for(c=0; c<4; c++){
                System.out.print(mat[l][c]);
            }
            System.out.print("\n");
        }//Exibição da matriz
    }
}
