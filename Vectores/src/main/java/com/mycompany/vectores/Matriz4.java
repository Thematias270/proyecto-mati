package com.mycompany.vectores;


import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author spide
 */
public class Matriz4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz[][], nFilas, nCol;
        boolean simetrica = true;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));

        matriz = new int[nFilas][nCol];

        System.out.println("digite una matriz: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        if (nFilas == nCol) {
            int i = 0, j;
            while (i < nFilas && simetrica) {
                j = 0;
                while (j < i && simetrica) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }

            if (simetrica == true) {
                JOptionPane.showMessageDialog(null, "La matriz es simetrica");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es cuadrada, por lo tanto no puede ser simétrica");
        }
    }
}
