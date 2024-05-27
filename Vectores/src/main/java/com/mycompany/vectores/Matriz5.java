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
public class Matriz5 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int matriz [][] = new int [3][3];
    int matriz2 [][] = new int [3][3];
    int suma[][] = new int[3][3];
    
        System.out.println("ingresa la primera matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("ahora ingresa la 2da matriz");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }
        System.out.println("la suma de las matrices es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(suma[i][j] + "[" + i + "][" + j + "]:");
            }
        }
    }
}
