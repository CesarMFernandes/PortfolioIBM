package com.mycompany.exercicio8;
import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o comprimento do lado A, em cm");
        float A = sc.nextFloat();
        System.out.println("Insira o comprimento do lado B, em cm");
        float B = sc.nextFloat();
        System.out.println("Insira o comprimento do lado C, em cm");
        float C = sc.nextFloat();
        if(A>=B+C || B>=A+C || C>=B+C){
            System.out.println("Não é um triângulo");
        }
        else if(A==B && B==C){
            System.out.println("É um triângulo equilátero");
        }
        else if((A==B && A!=C) || (A==C && A!=B) || (B==C && B!=A)){
            System.out.println("É um triângulo isósceles");
        }
        else{
            System.out.println("É um triângulo escaleno");
        }
    }
}