/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;

import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Matriz18 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nombres[] = new String [4];
    
        System.out.println("ingrese los 4 nombres en mayuscula");
        for (int i = 0; i < nombres.length; i++) {
            String nombre = entrada.nextLine();
            if (!nombre.equals(nombre.toUpperCase())) {
                System.out.println("te equivocaste ingresa el nombre en mayuscula");
                i--;
            }else{
                nombres[i] = nombre;
            }
        }
        System.out.println("Los nombres ingresados son");
        for(String nombre : nombres){
            System.out.println(nombre + " ");
        }
        System.out.println("");
    }
}
