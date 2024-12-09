/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Matrices {
    public static void main(String[] args) {
        //declaracion
        int matriz[][] = new int [3][3];
        Scanner teclado = new Scanner(System.in);
        
        //asisgnacion manual
        /*
        matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz [0][2] = 96;
        matriz[1][0] = 35;
        matriz [1][1] = 33;
        matriz [1][2] = 71;
        matriz [2][0] =446;
        matriz [2][1] =33;
        matriz[2][2] = 24;
        */
        
        //asignacion por teclado
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("ingrese el valor de la posicion "+ i + " columna " + j + " :");
                matriz[i][j] = teclado.nextInt();
            }
        }
        
        //recorrido
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
