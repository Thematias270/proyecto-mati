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
public class Matriz8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1 [][] ;
        int matriz2 [][] ;
        int nFilas,nCol ;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));
                
        matriz1 = new int [nFilas][nCol];
        matriz2 = new int [nFilas][nCol];
        
        System.out.println("Ingrese la matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        System.out.println("La matriz es");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nFilas; j++) {
                matriz2[i][j] = matriz1[j][i];
            }
        }
        System.out.println("La matriz traspuesta es");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println("");
        }
        int suma[][] = new int [nFilas][nCol];
                
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                suma [i][j] = matriz1 [i][j] + matriz2[i][j];
            }
        }
        System.out.println("la suma de las matrices es:");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(suma[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
