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
public class Matriz23 {
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int intentosMaximos = 3;
        int intentosJugador1 = 0;
        int intentosJugador2 = 0;
        int numeroAdivinar;
        int numeroAdivinado = 0;
        
        System.out.println("Ingrese sus números");

        // Generando un número aleatorio para adivinar
        numeroAdivinar = (int) (Math.random() * 100) + 1;

        // Bucle para los intentos de ambos jugadores
        while (intentosJugador1 < intentosMaximos && intentosJugador2 < intentosMaximos && numeroAdivinado == 0) {
            // Jugador 1
            System.out.print("Jugador 1: ");
            int numeroJugador1 = entrada.nextInt();
            intentosJugador1++;

            // Comprobando si el jugador 1 adivinó el número
            if (numeroJugador1 == numeroAdivinar) {
                System.out.println("¡Felicidades jugador 1! Has adivinado el número.");
                numeroAdivinado = 1;
                break;
            } else {
                int intentosRestantesJugador1 = intentosMaximos - intentosJugador1;
                if (numeroAdivinar > numeroJugador1) {
                    System.out.println("El número ingresado es mayor. Jugador 1, te quedan " + intentosRestantesJugador1 + " intentos.");
                } else {
                    System.out.println("El número ingresado es menor. Jugador 1, te quedan " + intentosRestantesJugador1 + " intentos.");
                }
            }

            // Jugador 2
            System.out.print("Jugador 2: ");
            int numeroJugador2 = entrada.nextInt();
            intentosJugador2++;

            // Comprobando si el jugador 2 adivinó el número
            if (numeroJugador2 == numeroAdivinar) {
                System.out.println("¡Felicidades jugador 2! Has adivinado el número.");
                numeroAdivinado = 2;
                break;
            } else {
                int intentosRestantesJugador2 = intentosMaximos - intentosJugador2;
                if (numeroAdivinar > numeroJugador2) {
                    System.out.println("El número ingresado es mayor. Jugador 2, te quedan " + intentosRestantesJugador2 + " intentos.");
                } else {
                    System.out.println("El número ingresado es menor. Jugador 2, te quedan " + intentosRestantesJugador2 + " intentos.");
                }
            }
        }

        // Si ningún jugador adivina el número
        if (numeroAdivinado == 0) {
            System.out.println("Se acabaron los intentos. El número a adivinar era: " + numeroAdivinar);
        }
    }
}

