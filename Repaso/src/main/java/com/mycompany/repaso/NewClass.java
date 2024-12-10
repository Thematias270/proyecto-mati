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
public class NewClass {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     
        System.out.println("ingresa una palabra o oracion");
        String palabra = entrada.nextLine();
        
        int contador = palabra.length();
        
        System.out.println("la cantidad de palabras es: " + contador);
     
    }
}
