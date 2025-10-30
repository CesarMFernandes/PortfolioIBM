package com.mycompany.exercicio2;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu peso, em quilos");
        float p = sc.nextFloat();
        System.out.println("Digite sua altura, em centímetros");
        float a = sc.nextFloat();
        float am = a/100;
        float imc = p/(am*am);
        if(p<=0 || a<=0){
            System.out.println("ERRO: um ou ambos os valores são inválidos");
        }
        else{
            System.out.printf("Seu IMC é ");
            System.out.printf("%.1f\n", imc);     
            if(imc<18){
                System.out.println("Magreza");
            }
            else if(imc>=18 && imc<25){
                System.out.println("Saudável");
            }
            else if(imc>=25 && imc<30){
                System.out.println("Sobrepeso");
            }
            else if(imc>=30){
                System.out.println("Obesidade");
            }
        }
    }
}