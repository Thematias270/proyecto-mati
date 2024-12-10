/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Vecthor {
    public static void main(String[] args) {
        int vector [] = new int [5];
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("llena el vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector " + (i + 1 + ": "));
            vector[i] = entrada.nextInt();
        }
        int pares = 0,impares =0;
        
        int contador = 0;
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                contador++;
                numeros.add(vector[i]);
            }
            System.out.println("vector " + i + " valor: " + vector[i]);
        }
        System.out.println("La cantidad de numeros pares es: " + contador + " los numeros pares que ingresaste fueron: " + numeros);
    }
}
