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
public class ContarAbededario {
    public static void main(String[] args) {
        
        ArrayList<String> letra = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingresa 5 palabras");
        for (int i = 0; i < 5; i++) {
            System.out.println("palabra " + (i + 1) + ": ");
            letra.add(entrada.nextLine());
        }
        
        int contador = 0;
        System.out.println("Palabras ingresadas fueron: ");
        for (String letras : letra) {
            
            letras = letras.toLowerCase();
            
            for (int i = 0; i < letras.length(); i++) {
                char caracter = letras.charAt(i);
                
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    contador++;
                }
            }
        }
        System.out.println("Las palabra ingresadas fueron: " + letra);
        System.out.println("La cantidad total de vocales fueron: " + contador);
    }
}
