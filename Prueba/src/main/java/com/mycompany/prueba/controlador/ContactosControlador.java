/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.controlador;

import com.mycompany.prueba.modelo.ContactoModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author spide
 */
public class ContactosControlador {
    private Conexion conexion = new Conexion();
    private Connection conn = conexion.Consultas();
    
    private ContactoModelo contacto = new ContactoModelo();
    private final String SQL_CREAR = "INSERT INTO contactos ( dni, nombre, apellido, correo, direccion , cp) VALUES (?,?, ?, ?,?,?)";
    private final String SQL_BORRAR = "DELETE FROM contactos WHERE dni = ?";
    private final String SQL_MOSTRAR = "SELECT * FROM contactos";
    
    public void crearConctacto(String dni,String nombre,String apellido,String correo,String direccion ,String cp){
            
           try (PreparedStatement instruccion = conn.prepareStatement(SQL_CREAR)) {

            // Establecer los valores
            instruccion.setString(1,dni );
            instruccion.setString(2,nombre );
            instruccion.setString(3,apellido );
            instruccion.setString(4,correo );
            instruccion.setString(5,direccion );
            instruccion.setString(6,cp );
            
            // Ejecutar la sentencia
            int filasInsertadas = instruccion.executeUpdate();
            System.out.println("Contactos insertadas: " + filasInsertadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void eliminarContacto(String dni){
        
        try(PreparedStatement instruccion = conn.prepareStatement(SQL_BORRAR)){
            instruccion.setString(1, dni);
            instruccion.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se a borrado el usuario con el dni " + dni);
        }catch(SQLException e){
            
        }
    }

   
    public List<ContactoModelo> mostrarContacto() {
        List<ContactoModelo> contactos = new ArrayList<>();

        try (PreparedStatement instruccion = conn.prepareStatement(SQL_MOSTRAR)) {
            ResultSet resultado = instruccion.executeQuery();
            while (resultado.next()) {
                ContactoModelo contacto = new ContactoModelo(); // Crear una nueva instancia en cada iteración
                contacto.setDni(resultado.getString("dni"));
                contacto.setNombre(resultado.getString("nombre"));
                contacto.setApellido(resultado.getString("apellido"));
                contacto.setCorreo(resultado.getString("correo"));
                contacto.setDireccion(resultado.getString("direccion"));
                contacto.setCp(resultado.getString("cp"));
                contactos.add(contacto);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo básico de excepciones, puedes mejorar según tus necesidades
        } 
        

        return contactos;
    }
    
}
