/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repaso;

import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Repaso {

    public static void main(String[] args) {
        //declaracion
        int vector [] = new int [4];
        
        //asignacion manual
        /*vector[0]=2;
        vector[1]=35;
        vector[2]=48;
        vector[3]=157;
        */
        
        //asignacion por teclado
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para el indice: " + i);
            vector[i] = entrada.nextInt();
        }
        System.out.println("----------------");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado un: " + vector[i]);
            System.out.println("-------------------------");
        }
    }
}
