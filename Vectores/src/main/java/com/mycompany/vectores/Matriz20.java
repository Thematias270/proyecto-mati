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
public class Matriz20 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        Random rand = new Random();

        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("la suma de cada fila es");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + " : " + sumaFila);
        }
        System.out.println("la suma de cada columna es");
        for (int j = 0; j < matriz.length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + j + " : " + sumaColumna);
        }
        for (int i = 0; i < matriz.length; i++) {
            int maximoFila = matriz[i][0];
            int columnaMaximoFila = 0;
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > maximoFila) {
                    maximoFila = matriz[i][j];
                    columnaMaximoFila = j;
                }
            }
            System.out.println("Fila " + i + " : " + maximoFila + " (columna " + columnaMaximoFila + ")");
        }
        for (int j = 0; j < matriz.length; j++) {
            int maximoColumna = matriz[0][j];
            int filaMaximoColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] > maximoColumna) {
                    maximoColumna = matriz[i][j];
                    filaMaximoColumna = i;
                }
            }
            System.out.println("Columna " + j + " : " + maximoColumna + " (fila " + filaMaximoColumna + ")");
        }
        System.out.println("la cantidad de numeros pares e impares en cad fila es");
        for (int i = 0; i < matriz.length; i++) {
            int contador = 0;
            int contadorIm = 0;
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contador++;
                } else {
                    contadorIm++;
                }
            }
            System.out.println("fila " + i + ": pares: " + contador + ", Impares: " + contadorIm);
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz.length; l++) {
                        if (matriz[i][j] < matriz[k][l]) {
                            int temp = matriz[i][j];
                            matriz[i][j] = matriz[k][l];
                            matriz[k][l] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("La matriz ordenada: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        int numeroCuatro = 4;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    matriz[i][j] = numeroCuatro;
                }
            }
        }
        System.out.println("la matriz con numeros pares a 4 quedo asi");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
