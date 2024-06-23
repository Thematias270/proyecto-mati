/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.controlador;

import com.mycompany.prueba.modelo.UsuarioModelo;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 *
 * @author spide
 */
public class UsuariosControlador {

    private Conexion conexion = new Conexion();
    private Connection conn = conexion.Consultas();

    private UsuarioModelo usuario = new UsuarioModelo();
    private final String SQL_CREAR = "INSERT INTO usuarios (correo, contraseñaEncriptada, salt) VALUES (?, ?, ?)";
    private final String SQL_MOSTRAR = "SELECT correo, contraseñaEncriptada, salt FROM usuarios WHERE correo = ?";
    private final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
    private final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public void CrearUsuario(String correo, String contraseña) throws SQLException {
        if (!validarFormatoCorreo(correo)) {
            JOptionPane.showMessageDialog(null, "Error: El formato del correo electrónico es inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (contraseña.length() < 12 || !validarFormatoContraseña(contraseña)) {
            JOptionPane.showMessageDialog(null, "Error: La contraseña debe tener 12 o más caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (correoExiste(correo)) {
            JOptionPane.showMessageDialog(null, "Error: El correo electrónico ya está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String salt = generarSalt();
        String contraseñaEncriptada = encriptarContraseña(contraseña, salt);

        // Verifica los valores
        System.out.println("Correo: " + correo);
        System.out.println("Salt: " + salt);
        System.out.println("Contraseña Encriptada: " + contraseñaEncriptada);

        try (PreparedStatement instruccion = conn.prepareStatement(SQL_CREAR)) {
            instruccion.setString(1, correo);
            instruccion.setString(2, contraseñaEncriptada);
            instruccion.setString(3, salt);

            int filaInsertada = instruccion.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Ingresado: "
                    + "Correo: " + correo + "\n"
                    + "Contraseña: " + contraseña + "\n"
                    + "Contraseña Encriptada: " + contraseñaEncriptada);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al registrar el usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean correoExiste(String correo) throws SQLException {
        String SQL_VERIFICAR_CORREO = "SELECT correo FROM usuarios WHERE correo = ?";
        try (PreparedStatement consulta = conn.prepareStatement(SQL_VERIFICAR_CORREO)) {
            consulta.setString(1, correo);
            try (ResultSet rs = consulta.executeQuery()) {
                return rs.next();
            }
        }
    }

    private boolean validarFormatoCorreo(String correo) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }

    public boolean IngresarUsuario(String correo, String contraseña) {
        PreparedStatement consulta = null;
        ResultSet rs = null;

        try {
            consulta = conn.prepareStatement(SQL_MOSTRAR);
            consulta.setString(1, correo);

            rs = consulta.executeQuery();

            if (rs.next()) {
                String contraseñaEncriptadaBD = rs.getString("contraseñaEncriptada");
                String salt = rs.getString("salt");

                String contraseñaIngresadaEncriptada = encriptarContraseña(contraseña, salt);

                // Mensajes de depuración
                System.out.println("Correo ingresado: " + correo);
                System.out.println("Contraseña ingresada: " + contraseña);
                System.out.println("Salt utilizado para el usuario: " + salt);
                System.out.println("Contraseña encriptada ingresada: " + contraseñaIngresadaEncriptada);
                System.out.println("Contraseña encriptada almacenada en BD: " + contraseñaEncriptadaBD);

                // Comparación de contraseñas encriptadas
                boolean contraseñasCoinciden = contraseñaEncriptadaBD.equals(contraseñaIngresadaEncriptada);
                System.out.println("Las contraseñas coinciden: " + contraseñasCoinciden);

                return contraseñasCoinciden;
            }

            return false;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
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

    private boolean validarFormatoContraseña(String contraseña) {
        Matcher matcher = pattern.matcher(contraseña);
        return matcher.matches();
    }

    public String generarSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }

    public String encriptarContraseña(String contraseña, String salt) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(Base64.getDecoder().decode(salt));
            byte[] hashedPassword = md.digest(contraseña.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hashedPassword);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public void cerrarSesion() {
        usuario = null;

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(null, " Sesión cerrada correctamente.");
    }
}
