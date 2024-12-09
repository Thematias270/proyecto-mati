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
public class Vectores {
    public static void main(String[] args) {
        int vector [] = new int [15];
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese valor en el vector: ");
            vector[i] = teclado.nextInt();
        }
        int contador = 0;
        int pares = 0, impares = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 ==0) {
                pares++;
            }else{
                impares++;
            }
            if (vector[i] == 3) {
                contador++;
            }
            System.out.println(vector[i]);
        }
        System.out.println("se ingreso el numero 3 esta cantidad de veces: " + contador);
        System.out.println("Cantiada de pares: " + pares);
        System.out.println("Cantiada de impares: " + impares);
    }
}
