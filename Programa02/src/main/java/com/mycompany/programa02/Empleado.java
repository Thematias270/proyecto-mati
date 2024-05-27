/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa02;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author spide
 */
public class Empleado {
    private  String dni;
    private  String nombre;
    private  String apellido;
    private  String domicilio;
    private  LocalDate FechaNacimiento;
    private  double sueldoBruto;

    
    public Empleado(String dni,String nombre,String apellido,String domicilio,String FechaNacimiento, double sueldoBruto){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.FechaNacimiento = LocalDate.parse(FechaNacimiento);
        this.sueldoBruto = sueldoBruto;
    
    }
    
    public int calcularEdad(){
        LocalDate currentDate = LocalDate.now();
        Period periodo = Period.between(this.FechaNacimiento,currentDate);
        return periodo.getYears();
    }
    
    public void mostrarDatos(){
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Fecha de Nacimiento: " +FechaNacimiento);
        System.out.println("Sueldo Bruto: " +sueldoBruto);
        System.out.println("Edad: " + calcularEdad());
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("123456789", "Tony","Stark","calle 123","1990-05-15",912.18);
        Empleado empleado2 = new Empleado("42974899", "Bruce","Wayne","avenida 345","1986-02-23",159.58);
        Empleado empleado3 = new Empleado("21949667", "Peter","Parker","dorreo 678","1983-09-04",902.88);
        
        System.out.println("Informacion del empleado 1:");
        empleado1.mostrarDatos();
        
        System.out.println("\nInformacion del empleado 2:");
        empleado2.mostrarDatos();
        
        System.out.println("\nInformacion del empleado 3:");
        empleado3.mostrarDatos();
    }
}
