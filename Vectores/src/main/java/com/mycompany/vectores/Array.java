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
public class Array {
    public static void main(String[] args) {
        //declarar y inicializar un array
        int [] numeros = {10,20,30,40};
        
        // acceder a un elemento
        System.out.println("Primer elemento: " + numeros[0]);
        
        //modificar un elemento
        numeros[2] = 50;
        System.out.println("Elemento modificado: "+ numeros[2]);
        
        //recorrer el array con foreach
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
