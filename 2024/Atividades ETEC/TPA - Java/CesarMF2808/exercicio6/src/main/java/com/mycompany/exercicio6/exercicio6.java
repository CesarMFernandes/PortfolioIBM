package com.mycompany.exercicio6;
import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a idade do/da nadador(a)");
        int i = sc.nextInt();
        if(i<5){
            System.out.println("Erro: muito jovem para participar");
        }
        else{
            System.out.println("Classificação:");
            if(i<=7){
            System.out.println("Infantil A");
            }
            else if(i<=10){
                System.out.println("Infantil B");
            }
            else if(i<=13){
                System.out.println("Juvenil A");
            }
            else if(i<=17){
                System.out.println("Juvenil B");
            }
            else{
                System.out.println("Senior");
            }
        }
    }
}
