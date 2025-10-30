package com.mycompany.exercicio5;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        float n1 = sc.nextInt();
        System.out.println("Digite a segunda nota");
        float n2 = sc.nextInt();
        System.out.println("Digite a terceira nota");
        float n3 = sc.nextInt();
        System.out.println("Digite a quarta nota");
        float n4 = sc.nextInt();
        float m = (n1+n2+n3+n4)/4;
        System.out.printf("Média: ");
        System.out.printf("%.1f\n",m);
        if(m>=9){
            System.out.println("A - maior igual à 9 = Aprovado");
        }
        else if(m>=7 && m<9){
            System.out.println("B – maior igual à 7 e menor que 9 = Aprovado;");
        }
        else if(m>=5 && m<7){
            System.out.println("C – maior igual à 5 e menor que 7 = Aprovado;");
        }
        else if(m>=2.5 && m<5){
            System.out.println("D – maior igual à 2,5 e menor que 5 = Reprovado");
        }
        else if(m<2.5){
            System.out.println("E – menor que 2,5 = Reprovado");
        }
    }
}