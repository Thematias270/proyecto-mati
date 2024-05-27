/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaPrecios = 0;
        int promedio = 0;
        String [] apellidos = new String [5];
        
        apellidos[0] = "labrada";
        apellidos[3] = "guille";
        apellidos[2] = "mono";
        apellidos[1] = "araña";
        apellidos[4] = "batman";
        //for para recorrer todos los arrays
        for (int i = 0; i < 5; i++) {
            System.out.println(apellidos[i]);
        }
        int [] precios = new int [3];
        //for para guardar arrys
        for (int i = 0; i < 3; i++) {
            System.out.println("dame el numero: ");
            precios[i] = sc.nextInt();
        }
        //for para recorrer los arrays guardados
        for (int i = 0; i < 3; i++) {
            System.out.println(precios[i]);
        }
        for (int i = 0; i < 3; i++) {
            sumaPrecios = sumaPrecios + precios[i];
        }
        System.out.println("la suma de los precios es; "+sumaPrecios);
        
        for (int i = 0; i < 3; i++) {
            promedio = sumaPrecios / precios[i];
        }
        System.out.println("El promedio es: "+promedio);
        
    }
}
