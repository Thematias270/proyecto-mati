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
public class Matriz11 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Ingrese el numero de filas");
        int filas = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas = entrada.nextInt();
        
        int matriz[][] = new int [filas][columnas];
        
        System.out.println("ingrese los elementos de la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("matriz ["+ i +"]["+ j+ "]: ");
                matriz [i][j] = entrada.nextInt();
            }
        }
        System.out.println("la matriz ingresada es");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("Ingrese el numero con el que quiere multiplicar");
        int escalar = entrada.nextInt();
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz [i][j] *= escalar;
            }
        }
        System.out.println("la matriz resulta es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
