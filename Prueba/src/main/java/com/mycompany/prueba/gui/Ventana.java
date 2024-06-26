/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba.gui;
import com.mycompany.prueba.controlador.Conexion;
import com.mycompany.prueba.controlador.ContactosControlador;
import com.mycompany.prueba.controlador.UsuariosControlador;
import com.mycompany.prueba.modelo.ContactoModelo;
import java.awt.Component;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;

/**
 *
 * @author spide
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }
        private void limpiarCampos() {
        dnitxt.setText("");
        nametxt.setText("");
        apetxt.setText("");
        correotxt.setText("");
        diretxt.setText("");
        cptxt.setText("");
    }

    public class ContactListRenderer extends JTextArea implements ListCellRenderer<String> {

        public ContactListRenderer() {
            setLineWrap(true);
            setWrapStyleWord(true);
        }

        public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
            setText(value);
            setBackground(isSelected ? list.getSelectionBackground() : list.getBackground());
            setForeground(isSelected ? list.getSelectionForeground() : list.getForeground());
            setFont(list.getFont());
            return this;
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        correotxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        diretxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cptxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dnitxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apetxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        Guardar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        CerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));

        jPanel1.setBackground(new java.awt.Color(112, 145, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGENDA");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo:");

        correotxt.setBackground(new java.awt.Color(112, 145, 255));
        correotxt.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        correotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correotxt.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Direccion:");

        diretxt.setBackground(new java.awt.Color(112, 145, 255));
        diretxt.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        diretxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        diretxt.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Codigo Postal:");

        cptxt.setBackground(new java.awt.Color(112, 145, 255));
        cptxt.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        cptxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cptxt.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI:");

        dnitxt.setBackground(new java.awt.Color(112, 145, 255));
        dnitxt.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        dnitxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dnitxt.setBorder(null);
        dnitxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnitxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        nametxt.setBackground(new java.awt.Color(112, 145, 255));
        nametxt.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        nametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nametxt.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido:");

        apetxt.setBackground(new java.awt.Color(112, 145, 255));
        apetxt.setFont(new java.awt.Font("Malgun Gothic", 1, 20)); // NOI18N
        apetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apetxt.setBorder(null);

        Lista.setBackground(new java.awt.Color(255, 255, 255));
        Lista.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMouseClicked(evt);
            }
        });
        Lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Lista);

        Guardar.setBackground(new java.awt.Color(60, 78, 234));
        Guardar.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Mostrar.setBackground(new java.awt.Color(60, 78, 234));
        Mostrar.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(255, 255, 255));
        Mostrar.setText("Consultar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        Modificar.setBackground(new java.awt.Color(60, 78, 234));
        Modificar.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(60, 78, 234));
        eliminar.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        CerrarSesion.setBackground(new java.awt.Color(60, 78, 234));
        CerrarSesion.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Guardar)
                        .addGap(60, 60, 60)
                        .addComponent(Mostrar)
                        .addGap(60, 60, 60)
                        .addComponent(Modificar)
                        .addGap(60, 60, 60)
                        .addComponent(eliminar)))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(379, 379, 379)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(nametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addGap(16, 16, 16))))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jLabel2)
                            .addGap(90, 90, 90)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dnitxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addComponent(apetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diretxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(correotxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cptxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CerrarSesion)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(CerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(correotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dnitxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(diretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(apetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 172, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Guardar)
                            .addComponent(Mostrar)
                            .addComponent(Modificar)
                            .addComponent(eliminar))
                        .addGap(73, 73, 73))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dnitxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnitxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnitxtActionPerformed

    
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        ContactosControlador guardar = new ContactosControlador();
        
        String dni = dnitxt.getText();
        String nombre = nametxt.getText();
        String apellido = apetxt.getText();
        String correo = correotxt.getText();
        String direccion = diretxt.getText();
        String codigo = cptxt.getText();
        
        
        guardar.crearConctacto(dni,nombre,apellido,correo,direccion,codigo);
        
        actualizarListaContactos();
        
        limpiarCampos();
    }//GEN-LAST:event_GuardarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        ContactosControlador eliminar = new ContactosControlador();
        
        String dni = dnitxt.getText();
        
        eliminar.eliminarContacto(dni);
        
        actualizarListaContactos();
    }//GEN-LAST:event_eliminarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        // TODO add your handling code here:
        ContactosControlador mostrar = new ContactosControlador();
        List<ContactoModelo> contactos = new ArrayList<>();
        contactos = mostrar.mostrarContacto();
        DefaultListModel<String> model = new DefaultListModel<>();
        for (ContactoModelo contacto : contactos) {
            String item = "DNI: " + contacto.getDni() + "\n" +
                          "Nombre: " + contacto.getNombre() + "\n" +
                          "Apellido: " + contacto.getApellido() + "\n"  +
                          "Correo: " + contacto.getCorreo() + "\n" +
                          "Dirección: " + contacto.getDireccion() + "\n" +
                          "CP: " + contacto.getCp() + "\n" +
                          "--------------------------------";
                          
            model.addElement(item);
           // lista.append("DNI: " + contacto.getDni() + "\n");
           // lista.append("Nombre: " + contacto.getNombre() + "\n");
           // lista.append("Apellido: " + contacto.getApellido() + "\n");
            //lista.append("Correo: " + contacto.getCorreo() + "\n");
           // lista.append("Dirección: " + contacto.getDireccion() + "\n");
           // lista.append("CP: " + contacto.getCp() + "\n");
           // lista.append("---------------------------------------\n");
        }
        Lista.setModel(model);
        Lista.setCellRenderer(new ContactListRenderer());
        limpiarCampos();
        
    }//GEN-LAST:event_MostrarActionPerformed

    private void ListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaValueChanged

    private void ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseClicked
        // TODO add your handling code here:
        ContactosControlador mostrar = new ContactosControlador();
        List<ContactoModelo> contactos = new ArrayList<>();
        contactos = mostrar.mostrarContacto();
        
        int index = Lista.getSelectedIndex();
        if (index != -1) {
            // Obtener el objeto ContactoModelo correspondiente al índice seleccionado
            ContactoModelo contactoSeleccionado = contactos.get(index);

            // Asignar los valores del objeto ContactoModelo a los campos de texto
            dnitxt.setText(contactoSeleccionado.getDni());
            dnitxt.setEditable(false);
            nametxt.setText(contactoSeleccionado.getNombre());
            apetxt.setText(contactoSeleccionado.getApellido());
            correotxt.setText(contactoSeleccionado.getCorreo());
            diretxt.setText(contactoSeleccionado.getDireccion());
            cptxt.setText(contactoSeleccionado.getCp());
        }
        
        
    }//GEN-LAST:event_ListaMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        ContactosControlador editar = new ContactosControlador();
        
        String dni = dnitxt.getText();
        String nombre = nametxt.getText();
        String apellido = apetxt.getText();
        String correo = correotxt.getText();
        String direccion = diretxt.getText();
        String codigo = cptxt.getText();
        
        editar.editarContacto(dni, nombre, apellido, correo, direccion, codigo, dni);
        dnitxt.setEditable(true);
        actualizarListaContactos();
        limpiarCampos();
    }//GEN-LAST:event_ModificarActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // TODO add your handling code here:
        UsuariosControlador cerrar = new UsuariosControlador();
        
        String[] options = {"Sí", "No"};
        int response = JOptionPane.showOptionDialog(null, "¿Estás seguro de que deseas cerrar sesión?", "Confirmar Cierre de Sesión",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (response == JOptionPane.YES_OPTION) {
            cerrar.cerrarSesion();

            this.dispose();
            Login login = new Login();
            login.setVisible(true);
        }


    }//GEN-LAST:event_CerrarSesionActionPerformed
private void actualizarListaContactos() {
    // Llamar al método para mostrar los contactos actualizados
    MostrarActionPerformed(null); // Pasa null como ActionEvent porque no se necesita información adicional
}   
    /**
     * @param args the command line arguments
     */
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton Guardar;
    private javax.swing.JList<String> Lista;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JTextField apetxt;
    private javax.swing.JTextField correotxt;
    private javax.swing.JTextField cptxt;
    private javax.swing.JTextField diretxt;
    private javax.swing.JTextField dnitxt;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField nametxt;
    // End of variables declaration//GEN-END:variables
}
