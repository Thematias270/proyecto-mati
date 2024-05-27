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
public class Matriz7 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int matriz1 [][] = new int [5][9];
    int matriz2 [][] = new int [9][5];
    
        System.out.println("\ningrese la matriz");
        //cargamos matriz original
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        //la mostramos
        System.out.println("\nla matriz original es: \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        //calcular traspuesta
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                matriz2[i][j] = matriz1 [j][i];
            }
        }
        //mostramos traspuesta
        System.out.println("\nMatriz traspuestada\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz2[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
