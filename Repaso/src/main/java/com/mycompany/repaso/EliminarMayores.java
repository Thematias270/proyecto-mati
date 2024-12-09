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
public class EliminarMayores {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros.add(entrada.nextInt());
        }
        
        System.out.println("Elimina numeros mayores a: ");
        int limite = entrada.nextInt();
        
        numeros.removeIf( n -> n > limite);
        
        System.out.println("Lista despues de eliminar: " + numeros);
    }
}
