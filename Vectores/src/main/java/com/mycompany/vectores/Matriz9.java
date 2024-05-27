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
public class Matriz9 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nombre[] = new String [5];
        
        
        System.out.println("Ingrese los nombres");
        for (int i = 0; i < nombre.length; i++) {
            nombre[i] = entrada.nextLine();
        }
        System.out.println("los nombres ingresados son");
        for (int i = 0; i < nombre.length; i++) {
            System.out.print(nombre[i] + " ");
        }
        System.out.println("");
        
        Arrays.sort(nombre);
        
        System.out.println("los nombres ordenados son");
        for (String nombres : nombre) {  
            System.out.print(nombres + " ");
        }
        System.out.println("");
        
        String palabraEspecifica = "remplazo";
        
        for (int i = 0; i < nombre.length; i++) {
            if (nombre[i].length() % 2 == 0) {
                nombre[i] = palabraEspecifica;
            }
        }
        System.out.println("Los nombres pares que fueron cambiados");
        
        for (String nombres : nombre) {
            System.out.print(nombres + " ");
        }
    }
}
