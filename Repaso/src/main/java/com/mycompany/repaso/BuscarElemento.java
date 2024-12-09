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
public class BuscarElemento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Ingresa 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros.add(entrada.nextInt());
        }
        
        System.out.print("que numero deseas buscar?? ");
        int buscar = entrada.nextInt();
        
        if (numeros.contains(buscar)) {
            System.out.println("el numero " + buscar + " Esta en la lista!! :) ");
            
        }else{
            System.out.println("El numero " + buscar + " NO esta en la lista ");
        }
    }
}
