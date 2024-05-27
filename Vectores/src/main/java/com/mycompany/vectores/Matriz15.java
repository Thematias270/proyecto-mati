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
public class Matriz15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombres [] = new String [4];
        
        System.out.println("Ingrese los nombres(maximo 4 letras)");
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = entrada.nextLine();
            if (nombres[i].length() >= 5) {
                System.out.println("la cadena tiene mas de 5 letras");
                i--;
            }
            
        }
        System.out.println("Los nombres ingresados son");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
        boolean hayRepetidos = false;
        String nombreRepetido = "";
        
        for (int i = 0; i < nombres.length -1; i++) {
            for (int j = i + 1; j < nombres.length; j++) {
                if (nombres[i].compareTo(nombres[j]) == 0 ) {
                    hayRepetidos = true;
                    nombreRepetido = nombres[i];
                }
            }
        }
        System.out.println("");
        
        if (hayRepetidos) {
            System.out.println("el nombre repetido es " + nombreRepetido);
        }else{
            System.out.println("NO hay nombres repetidos");
        }
    }
}
