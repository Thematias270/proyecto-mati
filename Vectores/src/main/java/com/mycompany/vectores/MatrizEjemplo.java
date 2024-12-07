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
public class MatrizEjemplo {
    public static void main(String[] args) {
        int[][] matriz = new int [3][3];
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Ingresa los valores de la matriz");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = Entrada.nextInt();
            }
        }
        int suma = 0;
        System.out.println("Matriz Ingresada: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
                suma += matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("La suma de todos los numeros es: " + suma);
    }
}
