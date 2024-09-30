/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.videoclub;

/**
 *
 * @author spide
 */

public class Serie {
    private String titulo;
    private int numeroDeTemporada;
    private boolean entregado;
    private String genero;
    private String creador;
    
    // Constructor with default values
    public Serie() {
        this.titulo = "Desconocido";  
        this.numeroDeTemporada = 3;   
        this.entregado = false;  
        this.genero = "Desconocido";   
        this.creador = "Desconocido";   
    }

    // Constructor with some fields
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporada = 3;
        this.entregado = false;
        this.genero = "Desconocido";   
        this.creador = creador;   
    } 

    // Constructor with all fields
    public Serie(String titulo, int numeroDeTemporada, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporada = numeroDeTemporada;
        this.entregado = false;
        this.genero = genero;
        this.creador = creador;
    }

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporada() {
        return numeroDeTemporada;
    }

    public void setNumeroDeTemporada(int numeroDeTemporada) {
        this.numeroDeTemporada = numeroDeTemporada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo='" + titulo + '\'' + ", numeroDeTemporada=" + numeroDeTemporada + ", entregado=" + entregado + ", genero='" + genero + '\'' + ", creador='" + creador + '\'' + '}';
    }
}


