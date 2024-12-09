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
public class arraylist {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        
        System.out.println("ingresa nombres ('salir para terminar') ");
        
        while(true){
            System.out.println("Nombre: ");
            String nombre = entrada.nextLine();
            
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }
            nombres.add(nombre);
        }
        System.out.println("Nombres ingresados: " + nombres);
        
        System.out.println("Ingresa un nombre para buscar: ");
        String nombreAbuscar = entrada.nextLine();
        
        if (nombres.contains(nombreAbuscar)) {
            System.out.println("El nombre " + nombreAbuscar + " esta en la lista");
        }else{
            System.out.println("el nombre " + nombreAbuscar + " NO esta en la lista");
        }
    }
}
