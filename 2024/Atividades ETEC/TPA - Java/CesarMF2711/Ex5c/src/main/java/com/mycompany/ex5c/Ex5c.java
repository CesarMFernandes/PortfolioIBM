package com.mycompany.ex5c;
public class Ex5c {
    public static void main(String[] args) {
        String [][] mat = {
                {"*  ","   ","   ","   "},
                {"*  ","*  ","   ","   "},
                {"*  ","*  ","*  ","   "},
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