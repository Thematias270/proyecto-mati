/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.controlador;

import com.mycompany.prueba.gui.Ventana;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author spide
 */
public class Conexion {
    private final String url = "jdbc:mysql://localhost:3306/tienda";
    private final String user = "root";
    private final String password = "";

    // Constructor de la clase
    public Conexion() {
    }

    // Método para obtener una conexión
    public Connection Consultas() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime el error en la consola
        }
        return conn;
    }
}
    

