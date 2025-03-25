package com.mycompany.proyectoeddpokemon;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author gjche
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    
    private FondoPanel fondo = new FondoPanel();
    
    public inicio() {
        this.setContentPane(fondo);
        initComponents();
        customLayout();
        
        this.setMinimumSize(new Dimension(1920, 1080));
        
        lblNombre.setFont(new Font("Arial", Font.BOLD, 36));  // Fuente más grande
        txfNombre.setFont(new Font("Arial", Font.PLAIN, 30)); // Fuente más grande
        btnJugar.setFont(new Font("Arial", Font.BOLD, 30));  // Fuente más grande
        btnJugar.setPreferredSize(new Dimension(300, 60));  // Botón grande
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        btnJugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("NOMBRE ENTRENADOR");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 140, -1));

        txfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, -1));

        btnJugar.setBackground(new java.awt.Color(254, 242, 0));
        btnJugar.setForeground(new java.awt.Color(0, 0, 0));
        btnJugar.setText("JUGAR TORNEO");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void customLayout() {
       getContentPane().setLayout(new java.awt.GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new java.awt.Insets(10, 10, 10, 10);
        
        // Configuración para el JLabel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        getContentPane().add(lblNombre, gbc);

        // Configuración para el JTextField
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        getContentPane().add(txfNombre, gbc);

        // Configuración para el JButton
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        getContentPane().add(btnJugar, gbc);
    }

    private void txfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txfNombre;
    // End of variables declaration//GEN-END:variables
    
     class FondoPanel extends JPanel {
        private Image imagen;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (imagen == null) {
                imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/inicio.jpg")).getImage();
            }
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }
    
}
