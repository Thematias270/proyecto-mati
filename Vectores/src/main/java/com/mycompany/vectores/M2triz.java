/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;

/**
 *
 * @author spide
 */
public class M2triz {
    public static void main(String[] args) {
        int[][] matriz = {
            {1,2,3},
            {1,2,3},
            {1,2,3}
        };
        System.out.println("Elemento en (1,1): " + matriz[1][1]);
        
        //modificar un elemento
        matriz[0][0] = 10;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
