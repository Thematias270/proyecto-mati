/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author spide
 */
public class ArrayListEjemplo {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese nombres (escrina 'salir' para terminar))");
        
        while(true){
            nombre = entrada.nextLine();
            if (nombre.equalsIgnoreCase("Salir")) {
                break;
            }
            nombres.add(nombre);
        }
        System.out.println("Nombres ingresados");
        for (String nombre1 : nombres) {
            System.out.println(nombre1);
        }
    }
}
