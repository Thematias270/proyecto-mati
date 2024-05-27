
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JOptionPane;

public class FrameGame extends javax.swing.JFrame {
    private int numeroAdivinar;
    private int intentosJugador1;
    private int intentosJugador2;

    public FrameGame() {
        initComponents();
        iniciarJuego();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int intento1Jugador1 = Integer.parseInt(j1intento1.getText());
        int intento2Jugador1 = Integer.parseInt(j1intento2.getText());
        int intento3Jugador1 = Integer.parseInt(j1intento3.getText());

        int intento1Jugador2 = Integer.parseInt(j2intento1.getText());
        int intento2Jugador2 = Integer.parseInt(j2intento2.getText());
        int intento3Jugador2 = Integer.parseInt(j2intento3.getText());

        jugar(intento1Jugador1);
        jugar(intento2Jugador1);
        jugar(intento3Jugador1);

        jugar(intento1Jugador2);
        jugar(intento2Jugador2);
        jugar(intento3Jugador2);

        mostrarResultados();
    }                                        

    private void iniciarJuego() {
        numeroAdivinar = (int) (Math.random() * 101);
        intentosJugador1 = 0;
        intentosJugador2 = 0;
    }

    private void jugar(int intento) {
        if (!juegoTerminado()) {
            if (numeroAdivinar == intento) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has adivinado el número.");
                iniciarJuego();
            } else {
                if (intentosJugador1 < 3) {
                    evaluarIntento(intento, "Jugador 1");
                    intentosJugador1++;
                } else if (intentosJugador2 < 3) {
                    evaluarIntento(intento, "Jugador 2");
                    intentosJugador2++;
                }
                if (juegoTerminado()) {
                    JOptionPane.showMessageDialog(null, "Se han agotado los intentos. El número era: " + numeroAdivinar);
                    iniciarJuego();
                }
            }
        }
    }

    private void evaluarIntento(int intento, String jugador) {
        if (numeroAdivinar > intento) {
            JOptionPane.showMessageDialog(null, jugador + ": El número a adivinar es mayor.");
        } else {
            JOptionPane.showMessageDialog(null, jugador + ": El número a adivinar es menor.");
        }
    }

    private boolean juegoTerminado() {
        return intentosJugador1 == 3 && intentosJugador2 == 3;
    }

    private void mostrarResultados() {
        // Actualizar elementos del GUI con los resultados (Ejemplo: cambia textos de etiquetas)
        jLabel1.setText("Juego terminado");
        jLabel2.setText("Resultados:");
        // Puedes continuar actualizando tus elementos GUI con los resultados aquí
    }

    private void evaluarIntento(int intento, String jugador) {
        if (numeroAdivinar > intento) {
            JOptionPane.showMessageDialog(null, jugador + ": El número a adivinar es mayor.");
        } else {
            JOptionPane.showMessageDialog(null, jugador + ": El número a adivinar es menor.");
        }
    }

    private boolean juegoTerminado() {
        return intentosJugador1 == 3 && intentosJugador2 == 3;
    }

    private void mostrarResultados() {
        // Actualizar elementos del GUI con los resultados (podrías usar JLabels, JTextAreas, etc.)
        // Ejemplo (reemplazar con tus elementos del GUI):
        jugador1.setText("Juego terminado");
        jugador1.setText("Resultados:");
        // Puedes continuar actualizando tus elementos GUI con los resultados aquí
    }

    // Resto del código de la GUI sigue igual...
}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        textArea1 = new java.awt.TextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        j1intento1 = new javax.swing.JTextField();
        j2intento1 = new javax.swing.JTextField();
        j2intento2 = new javax.swing.JTextField();
        j1intento2 = new javax.swing.JTextField();
        j2intento3 = new javax.swing.JTextField();
        j1intento3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("El numero es");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ADIVINA EL NUMERO");

        jugador1.setText("Jugador 1");

        jugador2.setText("Jugador 2");

        j1intento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1intento1ActionPerformed(evt);
            }
        });

        j2intento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2intento1ActionPerformed(evt);
            }
        });

        jButton1.setText("ADIVINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(j1intento2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jugador1)
                    .addComponent(j1intento1)
                    .addComponent(j1intento3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j2intento3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jugador2)
                        .addComponent(j2intento1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addComponent(j2intento2)))
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador1)
                    .addComponent(jugador2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j1intento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j2intento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j2intento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j1intento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j1intento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j2intento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void j1intento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1intento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j1intento1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void j2intento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2intento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j2intento1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(framegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framegame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framegame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField j1intento1;
    private javax.swing.JTextField j1intento2;
    private javax.swing.JTextField j1intento3;
    private javax.swing.JTextField j2intento1;
    private javax.swing.JTextField j2intento2;
    private javax.swing.JTextField j2intento3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
