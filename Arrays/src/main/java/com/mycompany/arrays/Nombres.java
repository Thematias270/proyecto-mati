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
public class Nombres {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String [] apellido = new String [3];
    
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese los apellidos");
            apellido[i] = sc.nextLine();
        }
        
        System.out.println("los apellidos son ");
        
        for (int i = 0; i < 3; i++) {
            System.out.println(apellido[i]);
        } 
    }
}
