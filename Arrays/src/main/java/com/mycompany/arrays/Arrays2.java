/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nombres = new String [3];
        String [] apellidos = new String [3];
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese los nombres");
            nombres [i] = sc.nextLine();
        }
        System.out.println("los nombres son");
        for (int i = 0; i < 3; i++) {
            System.out.println(nombres[i]);
        }
        
        for (int i = 0; i < apellidos.length; i++) {
            System.out.println("Ingrese los apellidos");
            apellidos [i] = sc.nextLine();
        }
        System.out.println("los apellidos son");
        for (int i = 0; i < 3; i++) {
            System.out.println(apellidos[i]);
        }
    }
}
