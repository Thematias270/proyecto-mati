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
public class Matriz {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    //declaracion
    // []la primera es la fila osea de arriba para abajo
    //[] la segunda es la columna de izquierda a derecha
    int matriz [][] = new int [3][3];
    
    //asignacion manual
    /*matriz [0][0] = 5;
    matriz [0][1] = 13;
    matriz [0][2] = 96;
    matriz [1][0] = 35;
    matriz [1][1] = 33;
    matriz [1][2] = 71;
    matriz [2][0] = 446;
    matriz [2][1] = 228;
    matriz [2][2] = 24;
    */
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor de la posicion fila: " + f + " columna: " + c);
                matriz[f][c]=teclado.nextInt();
            }
        }
    
    
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posicion fila: " + f + " columna: " + c);
                System.out.println("es de: "+matriz[f][c]);
                System.out.println("-------------");
            }
        }
    
    
    
    
    
    }
}
