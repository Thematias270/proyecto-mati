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
public class Matriz14 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nombres [] = new String [5];
    
        System.out.println("ingrese los nombres");
        for (int i = 0; i < nombres.length; i++) {
            nombres [i] = entrada.nextLine();
        }
        System.out.println("Los nombres ingresados son");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]+ " ");
        }
        System.out.println("");
        
        Arrays.sort(nombres);
        
        System.out.println("Los nombres ordenados serian asi");
        for (String nombre : nombres ) {
            System.out.print(nombre + " ");
        }
    }
}
