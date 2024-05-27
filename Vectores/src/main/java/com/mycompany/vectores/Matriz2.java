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
public class Matriz2 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    double matriz[][] = new double [4][4];
    double suma = 0.0;
    
    //ingresar notas
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el alumno n° " + f);
                matriz[f][c] = teclado.nextDouble();
                suma = suma + matriz[f][c];
            }
            matriz[f][3] = suma / 3;
            suma = 0.0;
        }
    //mostrar notas
        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas del alumno n° " + f + " son: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("Nota N° " + c + " " + matriz[f][c]);
            }
            System.out.println("El promedio de las notas es: " + matriz[f][3]);
        }
    }
}
