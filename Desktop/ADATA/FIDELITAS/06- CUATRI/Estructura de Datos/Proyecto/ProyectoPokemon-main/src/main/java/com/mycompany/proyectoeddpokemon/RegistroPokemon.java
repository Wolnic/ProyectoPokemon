package com.mycompany.proyectoeddpokemon;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author * Ocampo Pantoja José Mario * Sánchez Venegas Manuel Antonio *
 * Delgado Jiménez Alexander * Cordoba Hernandez Giovanny Josue * Pérez
 * Rodríguez Carlos Roberto *
 */
public class RegistroPokemon extends javax.swing.JFrame {

    private FondoPanel fondo = new FondoPanel();

    public RegistroPokemon() {
        initComponents();
        setTitle("Registro Pokémon");
        setSize(500, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setContentPane(fondo);
        setLayout(null);
        setVisible(true);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Agua", "Fuego", "Normal"}));
        jComboBox1.setFont(new Font("Arial", Font.BOLD, 10));
        jComboBox1.setPreferredSize(new Dimension(27, 27));
        jComboBox1.setOpaque(true);
        jComboBox1.setBounds(150, 360, 200, 30);

        setTitle("Registro Pokémon");
        setSize(500, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setContentPane(fondo);
        setLayout(null);

        // Configuración de JLabel Nombre
        lblNombre.setText("Nombre del Pokémon");
        lblNombre.setFont(new Font("Arial", Font.BOLD, 14));
        lblNombre.setBounds(150, 265, 200, 30);
        getContentPane().add(lblNombre);

        // Configuración de JTextField Nombre
        txtNombre.setFont(new Font("Arial", Font.PLAIN, 12));
        txtNombre.setBounds(150, 295, 200, 30);
        getContentPane().add(txtNombre);

        // Configuración de JLabel Tipo
        lblTipo.setText("Tipo del Pokémon");
        lblTipo.setFont(new Font("Arial", Font.BOLD, 14));
        lblTipo.setBounds(150, 330, 200, 30);
        getContentPane().add(lblTipo);

        // Configuración de JLabel Vida
        lblVida.setText("Vida");
        lblVida.setFont(new Font("Arial", Font.BOLD, 14));
        lblVida.setBounds(150, 405, 200, 30);
        getContentPane().add(lblVida);

// Configuración de JTextField Vida
        txtVida.setFont(new Font("Arial", Font.PLAIN, 12));
        txtVida.setBounds(275, 405, 100, 30);
        getContentPane().add(txtVida);

// Configuración de JLabel Ataque
        lblAtaque.setText("Ataque");
        lblAtaque.setFont(new Font("Arial", Font.BOLD, 14));
        lblAtaque.setBounds(150, 455, 200, 30);
        getContentPane().add(lblAtaque);

// Configuración de JTextField Ataque
        txtAtaque.setFont(new Font("Arial", Font.PLAIN, 12));
        txtAtaque.setBounds(275, 455, 100, 30);
        getContentPane().add(txtAtaque);

// Configuración de JLabel Defensa
        lblDefensa.setText("Defensa");
        lblDefensa.setFont(new Font("Arial", Font.BOLD, 14));
        lblDefensa.setBounds(150, 505, 200, 30);
        getContentPane().add(lblDefensa);

// Configuración de JTextField Defensa
        txtDefensa.setFont(new Font("Arial", Font.PLAIN, 12));
        txtDefensa.setBounds(275, 505, 100, 30);
        getContentPane().add(txtDefensa);

// Configuración de JLabel Ataque Especial
        lblAtaqueE.setText("Ataque Especial");
        lblAtaqueE.setFont(new Font("Arial", Font.BOLD, 14));
        lblAtaqueE.setBounds(150, 555, 200, 30);
        getContentPane().add(lblAtaqueE);

// Configuración de JTextField Ataque Especial
        txtAtaqueE.setFont(new Font("Arial", Font.PLAIN, 12));
        txtAtaqueE.setBounds(275, 555, 100, 30);
        getContentPane().add(txtAtaqueE);

        // Configuración del botón "Listo"
        btnListo = new javax.swing.JButton();
        btnListo.setText("Listo");
        btnListo.setFont(new Font("Arial", Font.BOLD, 14));
        btnListo.setBounds(100, 650, 280, 50);
        btnListo.setBackground(new Color(218, 10, 46)); // Verde oscuro
        btnListo.setForeground(Color.WHITE); // Texto en blanco
        btnListo.setFocusPainted(false);
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });
        getContentPane().add(btnListo);

        lblMensaje = new javax.swing.JLabel();
        lblMensaje.setFont(new Font("Arial", Font.BOLD, 20));
        lblMensaje.setBounds(-10, 700, 500, 30);
        lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
        lblMensaje.setForeground(new Color(255, 255, 255)); // Azul oscuro
        getContentPane().add(lblMensaje);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        getContentPane().add(jComboBox1);
    }

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // Obtener la opción seleccionada
        String seleccion = (String) jComboBox1.getSelectedItem();
        JOptionPane.showMessageDialog(this, "Has seleccionado: " + seleccion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblVida = new javax.swing.JLabel();
        txtVida = new javax.swing.JTextField();
        txtAtaque = new javax.swing.JTextField();
        txtDefensa = new javax.swing.JTextField();
        txtAtaqueE = new javax.swing.JTextField();
        lblAtaque = new javax.swing.JLabel();
        lblDefensa = new javax.swing.JLabel();
        lblAtaqueE = new javax.swing.JLabel();
        btnListo = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 800));
        setSize(new java.awt.Dimension(500, 800));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agua", "Fuego", "Normal" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo del Pokémon");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre del Pokémon");

        lblVida.setText("Vida");

        txtVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVidaActionPerformed(evt);
            }
        });

        txtAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtaqueActionPerformed(evt);
            }
        });

        txtDefensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDefensaActionPerformed(evt);
            }
        });

        txtAtaqueE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtaqueEActionPerformed(evt);
            }
        });

        lblAtaque.setText("Ataque");

        lblDefensa.setText("Defensa");

        lblAtaqueE.setText("Ataque Especial");

        btnListo.setText("Listo");
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(504, 504, 504)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 122, Short.MAX_VALUE)
                            .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVida, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAtaqueE, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAtaqueE, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(3930, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(704, 704, 704)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVida)
                    .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAtaque))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDefensa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAtaqueE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAtaqueE))
                .addGap(39, 39, 39)
                .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1726, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVidaActionPerformed

    private void txtAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtaqueActionPerformed

    private void txtDefensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDefensaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDefensaActionPerformed

    private void txtAtaqueEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtaqueEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtaqueEActionPerformed

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        lblMensaje.setText("Pokémon registrado con éxito!");
        SeleccionPokemones Seleccion = new SeleccionPokemones();
        Seleccion.setVisible(true);
    }//GEN-LAST:event_btnListoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblAtaque;
    private javax.swing.JLabel lblAtaqueE;
    private javax.swing.JLabel lblDefensa;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblVida;
    private javax.swing.JTextField txtAtaque;
    private javax.swing.JTextField txtAtaqueE;
    private javax.swing.JTextField txtDefensa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVida;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (imagen == null) {
                imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/pokedex.jpg")).getImage();
            }
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
