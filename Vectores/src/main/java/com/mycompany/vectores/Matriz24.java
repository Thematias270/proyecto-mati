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
public class Matriz24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
           int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la posicion de la fila: " + i + " Columna: " + j);
                matriz[i][j] = teclado.nextInt();
                //System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
            
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("El valor de la posicion fila: " + i + "Columna: " + j);
                System.out.println("la matriz tiene un tamaño de: " + matriz[i][j]);
                System.out.println("-----------");
            }
        }
    }
}
