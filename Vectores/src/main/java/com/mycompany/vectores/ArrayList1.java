/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vectores;
import java.util.ArrayList;
/**
 *
 * @author spide
 */
public class ArrayList1 {
    public static void main(String[] args) {
        //Crear Arraylist
        ArrayList<String> Nombres = new ArrayList<>();
        
        //agregar elementos
        Nombres.add("Juan");
        Nombres.add("Maria");
        Nombres.add("Luis");
        
        // acceder a un elemento
        System.out.println("Primer nombre: "+ Nombres.get(0));
        
        // modificar elemento
        Nombres.set(1,"Ana");
        
        //eliminar elemento
        Nombres.remove(2);
        
        //Recorrer el arraylist
        for (String Nombre : Nombres) {
            System.out.println(Nombre);
        }
    }
}
