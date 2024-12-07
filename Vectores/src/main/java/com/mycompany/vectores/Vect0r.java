/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;
import java.util.Vector;

/**
 *
 * @author spide
 */
public class Vect0r {
    public static void main(String[] args) {
        //crear el vector
        Vector <Integer> numeros = new Vector<>();
        
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        
        System.out.println("Primer numero: " + numeros.get(0));
        
        //modificar elemento
        numeros.set(1,25);
        
        //eliminar elemento
        numeros.remove(2);
        
        for (int i : numeros) {
            System.out.println(i);
        }
    }
}
