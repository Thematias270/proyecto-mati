/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Vectores2 {
    public static void main(String[] args) {
    //realizar un vector de 15 numeros random,contar cuantas veces se repitio el numero 3
    Random rand = new Random();
    int vector[]= new int [15];
    
    
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(10);
            System.out.println(vector[i]);
        }
        
        int contador=0;
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 3 ) {
                contador++;
            } else {
            }
        }
        System.out.println("----------------");
        System.out.println("la cantidad de numeros 3 que hay en el vector es: "+ contador);
    }
}
