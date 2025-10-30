package com.mycompany.ex1;
import java.util.Arrays;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nom = new String[10];
        System.out.println("Digite 10 nomes:\n");
        for(int i=0; i<nom.length; i++){
            nom[i] = sc.nextLine();
        }
        Arrays.sort(nom);
        int x = 0;
        System.out.println("\nMostrando os nomes em ordem alfabetica:\n");
        for(String i : nom){
            x = x+1;
            System.out.println("Nome "+(x)+": "+i);
        }
    }
}