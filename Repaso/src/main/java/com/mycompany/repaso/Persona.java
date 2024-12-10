/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

/**
 *
 * @author spide
 */
public class Persona {
    // atributos
    private String nombre;
    private int edad;
    private String dni;
    private String apellido;
    
    //contructor vacio
    public Persona(){
    }
    //Contructor 
    public Persona(String nombre,int edad,String dni,String apellido){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.apellido = apellido;
    }
    
    //getters y setters  
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    //metodo para mostrar
    public void Mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Apellido: " + apellido);
    }
    public static void main(String[] args) {
        Persona mostrar = new Persona ("Matias",24,"42974899","Moran");
        System.out.println("Informacion de persona: ");
        mostrar.Mostrar();
    }
}
