/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;

import java.util.Random;
//import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Matriz10 {
    public static void main(String[] args) {
        
        int matriz[][] = new int [4][4];
        Random rand = new Random();
        System.out.println("matriz original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rand.nextInt(20);
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        boolean hayCeros = false;
        for (int i = 0; i < matriz.length; i++) {
            boolean filaConCeros = false;
            boolean columnaConCeros = false;
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+ " ");
                if (matriz[i][j] == 0) {
                    hayCeros = true;
                    filaConCeros = true;
                }
                if (matriz[i][j] == 0) {
                    hayCeros = true;
                    columnaConCeros = true;
                }
            }
            System.out.println("");
            
            if (filaConCeros) {
                System.out.println("En la fila " + i + " hay ceros ");
            } else{
                System.out.println("En la fila " + i + " NO hay ceros");
            }
            if (columnaConCeros) {
                System.out.println("En la columna " + i + " hay ceros ");
            }else{
                System.out.println("En la columna " + i + " NO hay ceros");
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = 1;
        }
        System.out.println("matriz con diagonal principal reemplazada por unos:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        if (!hayCeros) {
            System.out.println("no hay ceros en la matriz");
        }
    }
}
