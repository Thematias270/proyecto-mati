/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.controlador;

import com.mycompany.prueba.modelo.UsuarioModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
