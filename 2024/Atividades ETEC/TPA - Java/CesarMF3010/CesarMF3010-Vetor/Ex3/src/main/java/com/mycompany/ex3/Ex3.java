package com.mycompany.ex3;
import java.util.Arrays;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[50];
        System.out.println("Digite 50 numeros:\n");
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num); 
        int x = 0;
        System.out.println("\nMostrando os numeros em ordem crescente:\n");
        for(int i : num){
            x = x+1;
            System.out.println("Numero "+(x)+": "+i);
        }
    }
}