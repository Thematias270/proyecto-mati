/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videoclub;

/**
 *
 * @author spide
 */

public class Videojuego {
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;
    
    // Constructor with default values
    public Videojuego() {
        this.titulo = "Desconocido";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "Desconocido";
        this.compañia = "Desconocido";   
    }

    // Constructor with some fields
    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = "Desconocido";
        this.compañia = "Desconocido";
        this.entregado = false;
    }

    // Constructor with all fields
    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
        this.entregado = false;
    }

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "titulo='" + titulo + '\'' + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado + ", genero='" + genero + '\'' + ", compañia='" + compañia + '\'' + '}';
    }
}
