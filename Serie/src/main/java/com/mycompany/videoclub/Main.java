/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videoclub;

/**
 *
 * @author spide
 */
public class Main {
    public static void main(String[]args){
        Serie serie = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
        Videojuego videojuego = new Videojuego("The Witcher 3", 50, "RPG", "CD Projekt Red");
        
        System.out.println(serie);
        System.out.println(videojuego);
    
    }
}
