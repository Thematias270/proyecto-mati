/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author spide
 */
public class CombinarArrayList {
    public static void main(String[] args) {
        ArrayList <String> lista1 = new ArrayList<>();
        ArrayList <String> lista2 = new ArrayList<>();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrsa la primera lista");
        for (int i = 0; i < 2; i++) {
            System.out.println("Lista 1 " + (i + 1) + ": ");
            lista1.add(entrada.nextLine());
        }
        System.out.println("Ingresa la segunda lista");
        for (int i = 0; i < 2; i++) {
            System.out.println("Lista 1 " + (i + 1) + ": ");
            lista2.add(entrada.nextLine());
        }
        
        ArrayList<String> listaCombinada = new ArrayList<>(lista1);
        listaCombinada.addAll(lista2);
        
        System.out.println("Lista Combinada: " + listaCombinada);
    }
}
