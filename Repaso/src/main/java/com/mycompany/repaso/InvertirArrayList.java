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
public class InvertirArrayList {
    public static void main(String[] args) {
        ArrayList <String> palabras = new ArrayList<>();
        
        palabras.add("Hola");
        palabras.add("Mundo");
        palabras.add("Java");
        palabras.add("ArrayList");
        
        System.out.println("original: " + palabras);
        
        Collections.reverse(palabras);
        
        System.out.println("Invertido: " + palabras);
    }
}
