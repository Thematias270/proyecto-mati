/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vectores;

import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Vectores {

    public static void main(String[] args) {
        int vector [] = new int [4];
        
        //asignacion manual
        /*vector[0]=2;
        vector[1]=35;
        vector[2]=48;
        vector[3]=157;
        */
        //el usuario ingresa el valor del vector
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el tamaño del indice");
            vector[i] = entrada.nextInt();
        }
        
        
        //for para recorrer
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice: "+i);
            System.out.println("tengo guardado un "+vector[i]);
            System.out.println("---------------------");
        }
    }
}
