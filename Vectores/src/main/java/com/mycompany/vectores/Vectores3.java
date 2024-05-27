package com.mycompany.vectores;


import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author spide
 */
public class Vectores3 {
    public static void main(String[] args) {
    //realizar un vector de 15 numeros random,contar cuantas veces se repitio el numero 3
    // y cuantos numeros pares e impares hay
    int vector [] = new int [10];
    Random rand = new Random();
    
        for (int i = 0; i < vector.length; i++) {
            vector[i]= rand.nextInt(20);
            System.out.println(vector[i]);
        }
        int par=0;
        int impares=0;
        int contador=0;
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                par++;
            }else{
                impares++;
            }
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 3) {
                contador++;
            }
        }
        System.out.println("---------------");
        System.out.println("la cantidad de numeros par es: "+par);
        System.out.println("la cantidad de numeros impares es: "+impares);
        System.out.println("la cantidad de veces que se repitio el 3 es: "+contador);
    }
}
