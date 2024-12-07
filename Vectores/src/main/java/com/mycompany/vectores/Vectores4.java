/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;

import java.util.Random;

/**
 *
 * @author spide
 */
public class Vectores4 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int vector [] = new int [5];
        
        for (int i = 0; i < vector.length; i++) {
            vector [i] = rand.nextInt(5);
            System.out.println(vector[i]);
        }
        int contador = 0;
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 3) {
                contador++;
            }else{
            }
            
        }
        System.out.println("-------------");
        System.out.println("La cantidad de numero 3 repetida en el vector es " + contador);
    }
}
