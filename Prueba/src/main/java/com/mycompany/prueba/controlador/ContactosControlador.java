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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private final String SQL_VERIFICAR_DNI = "SELECT COUNT(*) AS total FROM contactos WHERE dni = ?";
    private final String SQL_VERIFICAR_CORREO = "SELECT COUNT(*) AS total FROM contactos WHERE correo = ?";
    private final String SQL_BORRAR = "DELETE FROM contactos WHERE dni = ?";
    private final String SQL_MOSTRAR = "SELECT * FROM contactos";
    private final String SQL_EDITAR = "UPDATE contactos SET dni = ?,nombre = ?,apellido = ?, correo = ?,direccion = ?,cp = ? WHERE dni = ?";
    private final String SQL_EDITAR_SIN_DNI = "UPDATE contactos SET nombre = ?, apellido = ?, correo = ?, direccion = ?, cp = ? WHERE dni = ?";

    public void crearConctacto(String dni, String nombre, String apellido, String correo, String direccion, String cp) {
        if (dni.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || direccion.isEmpty() || cp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si algún campo está vacío
        }
        try {
            if (dniExistente(dni)) {
                JOptionPane.showMessageDialog(null, "Error: El Dni ya está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (correoExistente(correo)) {
                JOptionPane.showMessageDialog(null, "Error: El Correo ya está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContactosControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (PreparedStatement instruccion = conn.prepareStatement(SQL_CREAR)) {

            // Establecer los valores
            instruccion.setString(1, dni);
            instruccion.setString(2, nombre);
            instruccion.setString(3, apellido);
            instruccion.setString(4, correo);
            instruccion.setString(5, direccion);
            instruccion.setString(6, cp);

            // Ejecutar la sentencia
            int filasInsertadas = instruccion.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contacto Insertado: "
                    + "Dni: " + dni + " \n "
                    + "Nombre: " + nombre + "\n"
                    + "Apellido: " + apellido + "\n"
                    + "Correo: " + correo + "\n"
                    + "Direccion: " + direccion + "\n"
                    + "Codigo Postal: " + cp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean dniExistente(String dni) throws SQLException {
        try (PreparedStatement stmtVerificar = conn.prepareStatement(SQL_VERIFICAR_DNI)) {
            stmtVerificar.setString(1, dni);
            ResultSet rs = stmtVerificar.executeQuery();

            if (rs.next()) {
                int total = rs.getInt("total");
                return total > 0;
            }
        }
        return false;
    }

    private boolean correoExistente(String correo) throws SQLException {
        try (PreparedStatement stmtVerificar = conn.prepareStatement(SQL_VERIFICAR_CORREO)) {
            stmtVerificar.setString(1, correo);
            ResultSet rs = stmtVerificar.executeQuery();

            if (rs.next()) {
                int total = rs.getInt("total");
                return total > 0;
            }
        }
        return false;
    }

    public void eliminarContacto(String dni) {

        try (PreparedStatement instruccion = conn.prepareStatement(SQL_BORRAR)) {
            instruccion.setString(1, dni);
            instruccion.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se a borrado el usuario con el dni " + dni);
        } catch (SQLException e) {

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

    public void editarContacto(String dni, String nombre, String apellido, String correo, String direccion, String cp, String dniUpdate) {
        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || direccion.isEmpty() || cp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si algún campo está vacío
        }
        try {
            // Verificar que el correo no esté registrado para otro contacto (excluyendo el actual)
            if (correoExistenteEnEdicion(correo, dniUpdate)) {
                JOptionPane.showMessageDialog(null, "Error: El Correo ya está registrado para otro contacto.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContactosControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (PreparedStatement instruccion = conn.prepareStatement(SQL_EDITAR_SIN_DNI)) {
            instruccion.setString(1, nombre);
            instruccion.setString(2, apellido);
            instruccion.setString(3, correo);
            instruccion.setString(4, direccion);
            instruccion.setString(5, cp);
            instruccion.setString(6, dniUpdate);

            int filaUpdate = instruccion.executeUpdate();
            JOptionPane.showMessageDialog(null, " Contacto Actualizado " + filaUpdate);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean correoExistenteEnEdicion(String correo, String dniUpdate) throws SQLException {
        try (PreparedStatement stmtVerificar = conn.prepareStatement(SQL_VERIFICAR_CORREO + " AND dni <> ?")) {
            stmtVerificar.setString(1, correo);
            stmtVerificar.setString(2, dniUpdate);
            ResultSet rs = stmtVerificar.executeQuery();

            if (rs.next()) {
                int total = rs.getInt("total");
                return total > 0;
            }
        }
        return false;
    }
}
