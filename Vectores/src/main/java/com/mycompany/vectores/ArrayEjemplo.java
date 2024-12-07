/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;

import java.util.Scanner;

/**
 *
 * @author spide
 */
public class ArrayEjemplo {
    public static void main(String[] args) {
        int[] numeros = {10,20,30,40,50};
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un indice (0-4): ");
        int indice = entrada.nextInt();
        
        if (indice >=0 && indice < numeros.length) {
            System.out.println("Numero en el indice " + indice + ": " + numeros[indice]);
            
        }else{
            System.out.println("Indice invalido");
        }
      
    }
}
