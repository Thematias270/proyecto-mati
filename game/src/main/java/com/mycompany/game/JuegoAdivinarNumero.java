/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game;


import javax.swing.JOptionPane;

public class JuegoAdivinarNumero {
    private int numeroAdivinar;
    private int intentosJugador1;
    private int intentosJugador2;
    private String nombreJugador1;
    private String nombreJugador2;

    public JuegoAdivinarNumero() {
        iniciarJuego();
    }

    public void iniciarJuego() {
        nombreJugador1 = JOptionPane.showInputDialog("Ingrese el nombre del Jugador 1:");
        nombreJugador2 = JOptionPane.showInputDialog("Ingrese el nombre del Jugador 2:");
        reiniciarJuego();
    }

    public void jugar(int numero) {
        if (!juegoTerminado()) {
            if (numeroAdivinar == numero) {
                mostrarMensaje("¡Felicidades! Has adivinado el número.");
                reiniciarJuego();
            } else {
                if (intentosJugador1 < 3) {
                    evaluarIntento(numero, nombreJugador1);
                    intentosJugador1++;
                } else if (intentosJugador2 < 3) {
                    evaluarIntento(numero, nombreJugador2);
                    intentosJugador2++;
                }
                if (juegoTerminado()) {
                    mostrarMensaje("Se han agotado los intentos. El número era: " + numeroAdivinar);
                    reiniciarJuego();
                }
            }
        }
    }

    private void evaluarIntento(int numero, String nombreJugador) {
        if (numeroAdivinar > numero) {
            mostrarMensaje(nombreJugador + ": El número a adivinar es mayor.");
        } else {
            mostrarMensaje(nombreJugador + ": El número a adivinar es menor.");
        }
    }

    private boolean juegoTerminado() {
        return intentosJugador1 == 3 && intentosJugador2 == 3;
    }

    private void reiniciarJuego() {
        numeroAdivinar = (int) (Math.random() * 101);
        intentosJugador1 = 0;
        intentosJugador2 = 0;
    }

    private void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        JuegoAdivinarNumero juego = new JuegoAdivinarNumero();
        int intento1Jugador1 = Integer.parseInt(JOptionPane.showInputDialog(juego.nombreJugador1 + ", ingresa un número entre 0 y 100:"));
        int intento2Jugador1 = Integer.parseInt(JOptionPane.showInputDialog(juego.nombreJugador1 + ", ingresa un número entre 0 y 100:"));
        int intento3Jugador1 = Integer.parseInt(JOptionPane.showInputDialog(juego.nombreJugador1 + ", ingresa un número entre 0 y 100:"));

        int intento1Jugador2 = Integer.parseInt(JOptionPane.showInputDialog(juego.nombreJugador2 + ", ingresa un número entre 0 y 100:"));
        int intento2Jugador2 = Integer.parseInt(JOptionPane.showInputDialog(juego.nombreJugador2 + ", ingresa un número entre 0 y 100:"));
        int intento3Jugador2 = Integer.parseInt(JOptionPane.showInputDialog(juego.nombreJugador2 + ", ingresa un número entre 0 y 100:"));

        juego.jugar(intento1Jugador1);
        juego.jugar(intento2Jugador1);
        juego.jugar(intento3Jugador1);

        juego.jugar(intento1Jugador2);
        juego.jugar(intento2Jugador2);
        juego.jugar(intento3Jugador2);
    }
}
