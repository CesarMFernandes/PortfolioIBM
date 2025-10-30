package com.mycompany.ex2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nom = new String[20];
        System.out.println("Digite 20 nomes:\n");
        for(int i=0; i<nom.length; i++){
            nom[i] = sc.nextLine();
        }
        Arrays.sort(nom, Collections.reverseOrder()); 
        int x = 0;
        System.out.println("\nMostrando os nomes em ordem alfabetica reversa:\n");
        for(String i : nom){
            x = x+1;
            System.out.println("Nome "+(x)+": "+i);
        }
    }
}