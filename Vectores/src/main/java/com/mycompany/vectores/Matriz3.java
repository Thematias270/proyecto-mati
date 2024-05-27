package com.mycompany.vectores;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author spide
 */
public class Matriz3 {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      double matriz [][] = new double [4][4];
      double suma = 0.0;
      
      for (int a = 0; a < 4; a++) {
          for (int n = 0; n < 3; n++) {
              System.out.println("Ingrese la nota del alumno n° " + a);
              matriz [a][n] = teclado.nextDouble();
              suma = suma + matriz [a][n];
          }
          matriz [a][3] = suma / 3;
          suma = 0.0;
      }
      for (int a = 0; a < 4; a++) {
          System.out.println("Las notas del alumno n° " + a + " son: ");
          for (int n = 0; n < 3; n++) {
              System.out.println("Nota n° " + (n + 1) + ": " + matriz[a][n]);
          }
          System.out.println("El promedio es: " + matriz [a][3]);
      }
  
  }  
}
