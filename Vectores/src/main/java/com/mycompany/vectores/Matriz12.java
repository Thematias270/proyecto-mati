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
public class Matriz12 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Ingrese el tamaño de la matriz");
        int dimension = entrada.nextInt();
        
        int matriz[][] = new int [dimension][dimension];
        
        System.out.println("Ingrese los elementos de la matriz");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.println("matriz ["+ i +"]["+ j +"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("la matriz ingresada es:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        boolean esIdentidad = true;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i == j) {
                    if (matriz[i][j] != 1) {
                        esIdentidad = false;
                    }
                } else{
                    if (matriz[i][j] != 0) {
                        esIdentidad = false;
                    }
                }
            }
            if (!esIdentidad) {
            }
        }
        if (esIdentidad) {
            System.out.println("La matriz ingresada es una matriz de identidad");
        } else{
            System.out.println("La matriz ingresada NO es una matriz de identidad");
        }
    }
}
