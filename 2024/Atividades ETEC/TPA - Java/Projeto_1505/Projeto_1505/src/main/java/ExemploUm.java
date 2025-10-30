/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExemploUm {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("O primeiro valor é: ");
        int a=ler.nextInt();
        System.out.println("O segundo valor é: ");
        int b=ler.nextInt();
        int s=a+b;
        System.out.println("O resultado da soma é: "+s);
    }
}
