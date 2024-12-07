/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author spide
 */
public class VectorEjemplo {
    public static void main(String[] args) {
        Vector<Integer> numeros = new Vector<>();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa numeros (numero negativo para terminar)");
        while(true){
            int numero = entrada.nextInt();
            if (numero < 0) {
                break;
            }
            numeros.add(numero);
        }
        if (numeros.isEmpty()) {
            System.out.println("No se ingresaron numeros");
        }else{
            int max = numeros.get(0);
            for (Integer numero : numeros) {
                if (numero > max) {
                    max = numero;
                }
            }
            System.out.println("el numero mayor es: " + max);
        }
    }
}
