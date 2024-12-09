/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Vectorees {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cuantos numeros deseas ingresar? ");
        int tamaño = entrada.nextInt();
        
        int [] numeros = new int [tamaño];
        int pares = 0,impares = 0;
        int suma = 0;

        
        System.out.println("ingresa los numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
            
            suma+= numeros[i];
            
            if (numeros[i] % 2 ==0) {
                pares++;
            }else{
                impares++;
            }
        }        
        double promedio = (double) suma / tamaño;
        System.out.println("Cantidad de pares " + pares);
        System.out.println("Cantidad de impares " + impares);
        System.out.println("Promedio: " + promedio);
    }
}
