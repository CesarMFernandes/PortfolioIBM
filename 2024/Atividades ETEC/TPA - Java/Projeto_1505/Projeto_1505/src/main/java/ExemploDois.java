/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExemploDois {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("O primeiro valor é: ");
        double a=ler.nextInt();
        System.out.println("O segundo valor é: ");
        double b=ler.nextInt();
        double d=a-b;
        double p=a*b;
        double q=a/b;
        System.out.println("O resultado da subtração é: "+d);
        System.out.println("O resultado da multiplicação é:"+p);
        System.out.println("O resutado da divisão é: "+q);
    }  
}
