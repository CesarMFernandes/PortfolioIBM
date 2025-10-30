package com.mycompany.exercicio1;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora em que começa o seu turno");
        int h = sc.nextInt();
        if(h<0 || h>24){
            System.out.println("ERRO: Valor inserido é inválido");
        }
        else if(h>=5 && h<13){
            System.out.println("Você trabalha de manhã.");
        }
        else if(h>=13 && h<21){
            System.out.println("Você trabalha de tarde");
        }
        else{
            System.out.println("Você trabalha de noite");
        }
    }
}