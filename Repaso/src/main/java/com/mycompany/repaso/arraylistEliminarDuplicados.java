/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author spide
 */
public class arraylistEliminarDuplicados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Ingresa numeros (fin para salir) ");
        
        while(true){
            System.out.print("Numero: ");
            String guardar = entrada.nextLine();
            
            if (guardar.equalsIgnoreCase("fin")) {
                break;
            }
            try{
                int numero = Integer.parseInt(guardar);
                if (!numeros.contains(numero)) {
                    numeros.add(numero);
                }else{
                    System.out.println("este numero ya fue ingresado");
                }
            }catch(NumberFormatException e){
                System.out.println("ERROR,Ingresa un numero valido");
            }
        }
        Collections.sort(numeros);
        
        System.out.println("Numeros ordenados sin duplicdos: " + numeros);
    }
}
