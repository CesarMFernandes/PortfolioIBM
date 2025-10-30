package com.mycompany.exercicio4;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor inicial");
        int i = sc.nextInt();
        int ii = i;
        System.out.println("Digite o valor final");
        int f = sc.nextInt();
        int n = 0;
        System.out.println("\n");
        if(i>=f){
            System.out.println("ERRO: valor inicial nao pode ser menor ou igual ao valor final");
        }
        else{
            for(i = i+1; i<f; i++){
                if(i%2!=0){
                    n = n+i;
                }
            }
            System.out.println("O resultado da soma dos numeros impares entre "+ii+" e "+f+" e "+n);
        }
    }
}