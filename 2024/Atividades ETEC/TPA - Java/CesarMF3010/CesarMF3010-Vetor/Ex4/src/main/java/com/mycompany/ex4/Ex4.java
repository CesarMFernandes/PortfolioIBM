package com.mycompany.ex4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class Ex4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] num = new Integer[50];
        System.out.println("Digite 50 numeros:\n");
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num, Collections.reverseOrder()); 
        int x = 0;
        System.out.println("\nMostrando os numeros em ordem decrescente:\n");
        for(Integer i : num){
            x = x+1;
            System.out.println("Numero "+(x)+": "+i);
        }
    }
}