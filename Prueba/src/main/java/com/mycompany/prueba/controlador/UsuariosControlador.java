/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.controlador;

import com.mycompany.prueba.modelo.UsuarioModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author spide
 */
public class UsuariosControlador {
    private Conexion conexion = new Conexion();
    private Connection conn = conexion.Consultas();
    
    private UsuarioModelo usuario = new UsuarioModelo();
    private final String SQL_CREAR = "INSERT INTO usuarios (correo, contraseña) VALUES (?,?)";
    private final String SQL_MOSTRAR = "SELECT * FROM usuarios WHERE correo = ? AND contraseña = ?";
    
    public void CrearUsuario(String correo, String contraseña) throws SQLException{
    
        try (PreparedStatement instruccion = conn.prepareStatement(SQL_CREAR)){
            instruccion.setString(1, correo);
            instruccion.setString(2, contraseña);
            
            int filaInsertada = instruccion.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Ingresado: " +
                    "Correo: " + correo + "\n" +
                    "Contraseña " + contraseña );
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al registrar el usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public boolean IngresarUsuario(String correo, String contraseña) {
        PreparedStatement consulta = null;
        ResultSet rs = null;
        
        try {
            // Preparar la consulta SQL
            consulta = conn.prepareStatement(SQL_MOSTRAR);
            consulta.setString(1, correo);
            consulta.setString(2, contraseña);
            
            // Ejecutar la consulta
            rs = consulta.executeQuery();
            
            // Verificar si se encontraron resultados
            return rs.next(); // Devolverá true si se encontraron resultados
            
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar la excepción adecuadamente (puede lanzarla o mostrar un mensaje de error)
            return false; // En caso de excepción, asumimos que el ingreso no es válido
        } finally {
            // Cerrar recursos
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (consulta != null) {
                try {
                    consulta.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
