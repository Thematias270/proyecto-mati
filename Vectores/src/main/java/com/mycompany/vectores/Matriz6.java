/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author spide
 */
public class Matriz6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int matriz[][],nFilas,nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));
        matriz = new int [nFilas][nCol];
        
        System.out.println("Digite la matriz");
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz [i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("La matriz es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j <nCol; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < nFilas; i++) {
            int sumaFilas = 0;
            for (int j = 0; j < nCol; j++) {
                sumaFilas += matriz [i][j];
            }
            System.out.println("La suma de la fila ["+i+"] es: "+sumaFilas);
        }
        System.out.println("");
        
        for (int j = 0; j < nCol; j++) {
            int sumaCol = 0;
            for (int i = 0; i < nFilas; i++) {
                sumaCol += matriz [i][j];
            }
            System.out.println("La suma de la columna ["+j+"] es: " +sumaCol);
        }
    }
}
