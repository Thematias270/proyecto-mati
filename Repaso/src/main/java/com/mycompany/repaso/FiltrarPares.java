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
public class FiltrarPares {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": "); 
            numeros.add(entrada.nextInt());
        }
        
        for (int num : numeros){
            if (num % 2 == 0) {
                pares.add(num);
            }
        }
        System.out.println("Numeros ingresados: " + numeros);
        System.out.println("Numeros pares: " + pares);
    }
}
