package com.mycompany.exercicio7;
import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro dia");
        int dia1 = sc.nextInt();
        System.out.println("Insira o primeiro mês");
        int mes1 = sc.nextInt();
        System.out.println("Insira o primeiro ano");
        int ano1 = sc.nextInt();
        System.out.println("Insira o segundo dia");
        int dia2 = sc.nextInt();
        System.out.println("Insira o segundo mês");
        int mes2 = sc.nextInt();
        System.out.println("Insira o segundo ano");
        int ano2 = sc.nextInt();
        if(dia1<1 || mes1<1 || mes1>12 || dia2<1 || mes2<1 || mes2>12){
            System.out.println("Erro: um dos valores inserido é invalido");
        }
        else if((mes1==1 || mes1==3 || mes1==5 || mes1==7 || mes1==8 || mes1==10 || mes1==12) && dia1>31 || (mes2==1 || mes2==3 || mes2==5 || mes2==7 || mes2==8 || mes2==10 || mes2==12) && dia2>31){
            System.out.println("Erro: um dos valores inserido é invalido");
        }
        else if((mes1==4 || mes1==6 || mes1==9 || mes1==11) && dia1>30 || (mes2==4 || mes2==6 || mes2==9 || mes2==11) && dia2>30){
            System.out.println("Erro: um dos valores inserido é invalido");
        }
        else if(mes1==2 && (ano1%4==0 && ano1%100!=0 || ano1%400==0) && dia1>29 || mes2==2 && (ano2%4==0 && ano2%100!=0 || ano2%400==0) && dia2>29){
            System.out.println("Erro: um dos valores inserido é invalido");
        }
        else if(mes1==2 && (ano1%4!=0 || ano1%100==0 && ano1%400!=0) && dia1>28 || mes2==2 && (ano2%4!=0 || ano2%100==0 && ano2%400!=0) && dia2>28){
            System.out.println("Erro: um dos valores inserido é invalido");
        }
        else if(ano1==ano2 && mes1==mes2 && dia1==dia2){
            System.out.println("As duas datas que você colocou são as mesmas ("+dia1+"/"+mes1+"/"+ano1+")");
        }
        else if(ano1>ano2 || (ano1==ano2 && mes1>mes2) || (ano1==ano2 && mes1==2 && dia1>dia2)){
            System.out.println("A segunda data acontece antes da primeira data. Aqui estão as datas em ordem crescente:\n"+dia2+"/"+mes2+"/"+ano2+"\n"+dia1+"/"+mes1+"/"+ano1);
        }
        else{
            System.out.println("A primeira data acontece antes da segunda data. Aqui estão as datas em ordem crescente:\n"+dia1+"/"+mes1+"/"+ano1+"\n"+dia2+"/"+mes2+"/"+ano2);
        }
    }
}