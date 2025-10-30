package com.mycompany.exercicio5;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor inicial");
        int i = sc.nextInt();
        System.out.println("Digite o valor final");
        int f = sc.nextInt();
        System.out.println("\n");
        if(i>=f){
            System.out.println("ERRO: valor inicial nao pode ser menor ou igual ao valor final");
        }
        else{
            for(;i<=f; i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
    }
}