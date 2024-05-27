/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

public class juego {
    private final int numeroAdivinar;
    private final String [] mensajes;
    //private  int intentosJugador1;
    //private  int intentosJugador2;
    
    public juego() {
        this.numeroAdivinar = (int) (Math.random() * 100)+1;
        this.mensajes = new String [14];
        //int intentosJugador1 = 0;
        //int intentosJugador2 = 0;
    }
    public String[] comparacion(int intentosJugador1, int intentosJugador2, int numero1, int numero2, String name1, String name2) {
    int posicion1 = intentosJugador1 + 1;
    int posicion2 = intentosJugador2 + 4;
    int intentosRestantesJugador1 = 3 - intentosJugador1;
    int intentosRestantesJugador2 = 3 - intentosJugador2;

    if (intentosJugador1 < 3 && intentosJugador2 < 3) {
        if (numeroAdivinar == numero1) {
            mensajes[posicion1] = "¡Felicidades " + name1 + "! Has adivinado el número.";
        } else if (numeroAdivinar == numero2) {
            mensajes[posicion2] = "¡Felicidades " + name2 + "! Has adivinado el número.";
        } else {
            if (numeroAdivinar > numero1) {
                mensajes[posicion1] = name1 + ": El número a adivinar es mayor a: " +numero1+ " . Intentos restantes: " + intentosRestantesJugador1;
            } else {
                mensajes[posicion1] = name1 + ": El número a adivinar es menor a: " +numero1+ " . Intentos restantes: " + intentosRestantesJugador1;
            }
            intentosJugador1++;

            if (numeroAdivinar > numero2) {
                mensajes[posicion2] = name2 + ": El número a adivinar es mayor a: "+numero2+ " . Intentos restantes: " + intentosRestantesJugador2;
            } else {
                mensajes[posicion2] = name2 + ": El número a adivinar es menor a " +numero2+ " . Intentos restantes: " + intentosRestantesJugador1;
            }
            intentosJugador2++;
        }
    } else {
        mensajes[9] = "Se han agotado los intentos. El número era: " + numeroAdivinar;
        
        int diferencia1 = Math.abs(numeroAdivinar - numero1);
        int diferencia2 = Math.abs(numeroAdivinar - numero2);

        if (diferencia1 < diferencia2) {
            mensajes[10] = name1 + " estuvo más cerca del número correcto.";
        } else if (diferencia2 < diferencia1) {
            mensajes[10] = name2 + " estuvo más cerca del número correcto.";
        } else {
            mensajes[10] = "Ambos estuvieron a la misma distancia del número correcto.";
        }
    }

    return mensajes;
}
}
    