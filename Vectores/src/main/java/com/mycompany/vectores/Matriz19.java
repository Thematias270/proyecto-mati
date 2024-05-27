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
public class Matriz19 {
    public static void main(String[] args) {
        int matriz [][] = new int [4][4];
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }
        boolean cerosEnFila[] = new boolean [4];
        boolean cerosEnColumna[] = new boolean [4];
        
        System.out.println("Matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] == 0) {
                    cerosEnFila[i] = true;
                    cerosEnColumna[j] = true;
                }
            }
            System.out.println("");
        }
        //System.out.println("filas con ceros");
        for (int i = 0; i < 4; i++) {
            if (cerosEnFila[i]) {
                System.out.println("en la fila " + i + " hay ceros");
            } else {
                System.out.println("en la fila " + i + " NO hay ceros");
            }
        }
        System.out.println("");
        
        //System.out.println("columna con ceros");
        for (int i = 0; i < 4; i++) {
            if (cerosEnColumna[i]) {
                System.out.println("en la columna " + i + " hay ceros ");
            } else {
                System.out.println("en la columna " + i + " NO hay ceros");
            }
        }
    }
}
