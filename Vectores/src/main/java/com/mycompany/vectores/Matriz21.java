/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author spide
 */
public class Matriz21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<String> nombres = new ArrayList<>();
        
        System.out.println("Ingresa nombres (escribe 'fin' para terminar)");
        String nombre;
        while(!(nombre = entrada.nextLine()).equals("fin")){
                nombres.add(nombre);
        }
        
        System.out.println("los nombres ingresados son");
        for(String name : nombres){
            System.out.println(name);
        }
        System.out.println("");
        
        Collections.sort(nombres);
        
        System.out.println("los nombres ordenados serian");
        for(String name : nombres){
            System.out.println(name);
        }
    }
}
