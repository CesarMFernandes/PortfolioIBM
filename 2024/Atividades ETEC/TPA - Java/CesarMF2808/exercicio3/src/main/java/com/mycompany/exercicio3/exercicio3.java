package com.mycompany.exercicio3;
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número referente a sua escolha\n 1. BigMac\n 2. Quarteirão\n 3. MacChicken\n 4. Cheddar\n 5. Cheese burger");
        int e = sc.nextInt();
        int n1=0,n2=0,n3=0,n4=0,n5=0;
        switch(e){
            case 1:
                n1=n1+1;
                System.out.println(n1+" ordem(s) de BigMac");
                break;
            case 2:
                n2=n2+1;
                System.out.println(n2+" ordem(s) de Quarteirão");
                break;
            case 3:
                n3=n3+1;
                System.out.println(n3+" ordem(s) de MacChiken");
                break;
            case 4:
                n4=n4+1;
                System.out.println(n4+" ordem(s) de Cheddar");
                break;
            case 5:
                n5=n5+1;
                System.out.println(n5+" ordem(s) de Cheese Burger");
                break;
            default:
                System.out.println("Erro: ordem inválida");
        }
        System.out.println("Gostaria de pedir mais alguma coisa?\n 1. Sim\n 2. Não");
        int r = sc.nextInt();
        while(r==1){
            System.out.println("Digite o número referente a sua escolha");
            e = sc.nextInt();
            switch(e){
            case 1:
                n1=n1+1;
                System.out.println(n1+" ordem de BigMac");
                break;
            case 2:
                n2=n2+1;
                System.out.println(n2+" ordem de Quarteirão");
                break;
            case 3:
                n3=n3+1;
                System.out.println(n3+" ordem de MacChiken");
                break;
            case 4:
                n4=n4+1;
                System.out.println(n4+" ordem de Cheddar");
                break;
            case 5:
                n5=n5+1;
                System.out.println(n5+" ordem de Cheese Burger");
                break;
            default:
                System.out.println("Erro: ordem inválida");
        }
        System.out.println("Gostaria de pedir mais alguma coisa?\n 1. Sim\n 2. Não");
        r = sc.nextInt();
        }
        if(r==2){
            System.out.println(n1+" ordem(s) de BigMac\n"+n2+" ordem(s) de Quarteirão\n"+n3+" ordem(s) de MacChiken\n"+n4+" ordem(s) de Cheddar\n"+n5+" ordem(s) de Cheese Burger\n Aproveite!");
        }
    }
}