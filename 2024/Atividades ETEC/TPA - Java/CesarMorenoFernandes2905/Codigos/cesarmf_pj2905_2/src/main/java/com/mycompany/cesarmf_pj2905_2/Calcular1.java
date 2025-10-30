/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cesarmf_pj2905_2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Calcular1 {
    
    //Função do calculo do dobro do número
    public static int Dobro(int numero) {
        return numero*2;
    }
    
    //Função principal
    public static void main(String[] args) {
        int numero = 25;
        var resultado = Dobro(numero);
        System.out.println("O dobro de "+numero+" é: "+resultado+".");
    }
}
