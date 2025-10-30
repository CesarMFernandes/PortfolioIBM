package com.mycompany.ex6;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Digite 100 numeros:\n");
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        int x = 0;
        System.out.println("\nMostrando os numeros impares:\n");
        for(int i : num){
            x = x+1;
            if(i%2!=0){
                System.out.println("Numero "+(x)+": "+i);
            }
        }
    }
}