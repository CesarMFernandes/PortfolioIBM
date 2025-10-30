package com.mycompany.ex5b;
public class Ex5b {
    public static void main(String[] args) {
        String [][] mat = {
                {"*  ","*  ","*  ","*  "},
                {"*  ","   ","   ","*  "},
                {"*  ","   ","   ","*  "},
                {"*  ","*  ","*  ","*  "}                
        };//Criação da matriz
        int l,c;
        for(l=0; l<4; l++){
            for(c=0; c<4; c++){
                System.out.print(mat[l][c]);
            }
            System.out.print("\n");
        }
    }
}