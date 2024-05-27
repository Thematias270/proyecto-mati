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
public class Matriz22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int intentosJugador1 = 0;
        int intentosJugador2 = 0;
        int numero1 = 0;
        int numero2 = 0;
        int numeroAdivinar;
        int intentosRestantesJugador1 = 3 -intentosJugador1;
        int intentosRestantesJugador2 = 3 -intentosJugador2;
        
        System.out.println("ingrese sus numeros jugaodor 1");
        for (int i = 0; i < 3; i++) {
            numero1 = entrada.nextInt();
            intentosJugador1++;
        }
        System.out.println("ingrese sus numeros jugador 2");
        for (int i = 0; i < 3; i++) {
            numero2 = entrada.nextInt();
            intentosJugador2++;
        }
        
        numeroAdivinar = (int) (Math.random() * 100)+1;
        
        if (intentosJugador1 > 3 && intentosJugador2 > 3) {
            if (numero1 == numeroAdivinar) {
                System.out.println("felicidades jugador 1 has adivinado el numero");
            }else if (numero2 == numeroAdivinar) {
                System.out.println("felicidades jugador 2 has adivinado el numero");
            }else{
                if (numeroAdivinar > numero1) {
                    System.out.println("el numero ingresado es mayor, te quedan " + intentosRestantesJugador1 + " intentos");
                } else{
                    System.out.println("el numero ingresado es menor, te qudan " + intentosRestantesJugador1 + " intentos");
                }
                //intentosJugador1++;
                if (numeroAdivinar > numero2) {
                    System.out.println("el numero ingresado es mayor te quedan " + intentosRestantesJugador2 + " intentos");
                } else{
                    System.out.println("el numero ingresado es menor te quedan" + intentosRestantesJugador2 + " intentos ");
                }
                //intentosJugador2++;
            }
        }else{
            System.out.println("se acabaron los intentos el numero a adivinar era" +numeroAdivinar);
        }
    }
}
