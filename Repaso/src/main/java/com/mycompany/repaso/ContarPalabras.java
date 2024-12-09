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
public class ContarPalabras {
    public static void main(String[] args) {
        ArrayList <String> palabras = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa palabras");
        for (int i = 0; i < 5; i++) {
            System.out.println("Palabra " + (i + 1) + ": ");
            palabras.add(entrada.nextLine());
        }
        
        int contador = 0;
        System.out.println("Que palabra buscas? ");
        String buscar = entrada.nextLine();
        
        for(String palabra : palabras){
            if (palabra.equals(buscar)) {
                contador++;
            }
        }
        System.out.println("La palabra " + buscar + " aparece " + contador + " veces");
        
        System.out.println("Ingresa la letra que deseas buscar: ");
        
        char letraBuscar = entrada.next().charAt(0);
        int contador2 = 0;
        
        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letraBuscar) {
                    contador2++;
                }
            }
        }
        System.out.println("La letra " + letraBuscar + " Aparece " + contador2 + " veces");
    }
    
}
