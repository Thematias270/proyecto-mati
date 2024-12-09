/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author spide
 */
public class IntercambiarElementos {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Amarillo");
        
        System.out.println("Antes del intercambio: " + colores);
        
        Collections.swap(colores,1,3);
        
        System.out.println("Despues del intercambio: " + colores);
    }
}
