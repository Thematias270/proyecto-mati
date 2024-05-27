/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Matriz16 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nombres[] = new String [4];
    
        System.out.println("Ingrese 4 nombres");
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = entrada.nextLine();
        }
        System.out.println("los nombres ingresados son");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]+ " ");
        }
        System.out.println("");
        
        Arrays.sort(nombres);
        
        System.out.println("Los nombres ordenados alfabeticamente serian asi");
        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
        System.out.println("");
        
        boolean hayRepetido = false;
        String nombreRepetido = "";
        
        for (int i = 0; i < nombres.length + 1; i++) {
            for (int j = i + 1; j < nombres.length; j++) {
                if (nombres[i].compareTo(nombres[j]) == 0) {
                    hayRepetido = true;
                    nombreRepetido = nombres[i];
                }
            }
        }
        if (hayRepetido) {
            System.out.println("El nombre repetido es " +nombreRepetido);
        } else{
            System.out.println("NO hay nombres repetidos");
        }
        boolean hayLetraRepetida = false;
        String letraRepetida = "";
        
        for(String nombre : nombres){
        for (int i = 0; i < nombre.length() -1; i++) {
            char letra = nombre.charAt(i);
            for (int j = i + 1 ; j < nombre.length(); j++) {
                if (letra == nombre.charAt(j)) {
                    hayLetraRepetida = true;
                    letraRepetida = String.valueOf(letra);
                    }
                }
            }
        }
        if (hayLetraRepetida) {
            System.out.println("La letra repetida es: " +letraRepetida);
        }else{
            System.out.println("NO hay letras repetidas");
        }
    }
}
