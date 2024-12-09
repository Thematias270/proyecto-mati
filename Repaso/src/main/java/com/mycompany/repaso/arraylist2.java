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
public class arraylist2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> edades = new ArrayList<>();
        
        System.out.println("Ingrese las edades (-1 para salir) ");
        while(true){
            System.out.println("Edad: ");
            int edad = entrada.nextInt();
            
            if (edad == -1) {
                break;
            }
            if (edad < 0) {
                System.out.println("ingresa una edad valida");
                continue;
            }
            edades.add(edad);
        }
        if (edades.isEmpty()) {
            System.out.println("No ingresaste ninguna edad. ");
            return;
        }
        int suma = 0;
        for (Integer edad : edades) {
            suma +=edad;
        }
        double promedio = (double) suma / edades.size();
        
        int porencima=0,pordeabajo=0;
        for (Integer edad : edades) {
            if (edad > promedio) {
                porencima++;
            }else if(edad < promedio){
                pordeabajo++;
            }
        }
        System.out.println("edades ingresadas: " + edades);
        System.out.println("promedio de edades: " + promedio);
        System.out.println("edades por encima del promedio: " + porencima);
        System.out.println("edades por debajo del promedio: " + pordeabajo);
    }
}
