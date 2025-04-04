package com.mycompany.proyectoeddpokemon;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author * Ocampo Pantoja José Mario * Sánchez Venegas Manuel Antonio *
 * Delgado Jiménez Alexander * Cordoba Hernandez Giovanny Josue * Pérez
 * Rodríguez Carlos Roberto *
 */
public class FrameTorneo extends javax.swing.JFrame {

    /**
     * Creates new form FrameTorneo
     */
    private FondoPanel fondo = new FondoPanel();

    public FrameTorneo() {
        initComponents();
        setTitle("LLaves Torneo");
        setSize(2064, 1162);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setContentPane(fondo);
        setLayout(null);
        setVisible(true);

        lblUsuario.setText("OLIVER ATOM");
        lblUsuario.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblUsuario.setBounds(180, 50, 400, 30);
        getContentPane().add(lblUsuario);

        lblRival1.setText("RIVAL 1");
        lblRival1.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblRival1.setBounds(180, 150, 400, 30);
        getContentPane().add(lblRival1);

        lblRival2.setText("RIVAL 2");
        lblRival2.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblRival2.setBounds(180, 250, 400, 30);
        getContentPane().add(lblRival2);

        lblRival3.setText("RIVAL 3");
        lblRival3.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblRival3.setBounds(180, 350, 400, 30);
        getContentPane().add(lblRival3);

        lblRival4.setText("RIVAL 4");
        lblRival4.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblRival4.setBounds(180, 450, 400, 30);
        getContentPane().add(lblRival4);

        lblRival5.setText("RIVAL 5");
        lblRival5.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblRival5.setBounds(180, 550, 400, 30);
        getContentPane().add(lblRival5);

        lblRival6.setText("RIVAL 6");
        lblRival6.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblRival6.setBounds(180, 650, 400, 30);
        getContentPane().add(lblRival6);

        lblRival7.setText("RIVAL 7");
        lblRival7.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblRival7.setBounds(180, 750, 400, 30);
        getContentPane().add(lblRival7);

        lblSemi1.setText("SEMIFINAL 1");
        lblSemi1.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblSemi1.setBounds(490, 100, 400, 30);
        getContentPane().add(lblSemi1);

        lblSemi2.setText("SEMIFINAL 2");
        lblSemi2.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblSemi2.setBounds(490, 300, 400, 30);
        getContentPane().add(lblSemi2);

        lblSemi3.setText("SEMIFINAL 3");
        lblSemi3.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblSemi3.setBounds(490, 500, 400, 30);
        getContentPane().add(lblSemi3);

        lblSemi4.setText("SEMIFINAL 4");
        lblSemi4.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblSemi4.setBounds(490, 700, 400, 30);
        getContentPane().add(lblSemi4);

        lblFinal1.setText("FINAL 1");
        lblFinal1.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblFinal1.setBounds(800, 200, 400, 30);
        getContentPane().add(lblFinal1);

        lblFInal2.setText("FINAL 2");
        lblFInal2.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblFInal2.setBounds(800, 600, 400, 30);
        getContentPane().add(lblFInal2);

        lblCampeon.setText("CAMPEON");
        lblCampeon.setFont(new Font("Rockwell", Font.BOLD, 20));
        lblCampeon.setBounds(1100, 400, 400, 30);
        getContentPane().add(lblCampeon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblRival1 = new javax.swing.JLabel();
        lblRival2 = new javax.swing.JLabel();
        lblRival3 = new javax.swing.JLabel();
        lblRival4 = new javax.swing.JLabel();
        lblRival5 = new javax.swing.JLabel();
        lblRival6 = new javax.swing.JLabel();
        lblRival7 = new javax.swing.JLabel();
        lblSemi1 = new javax.swing.JLabel();
        lblSemi2 = new javax.swing.JLabel();
        lblSemi3 = new javax.swing.JLabel();
        lblSemi4 = new javax.swing.JLabel();
        lblFinal1 = new javax.swing.JLabel();
        lblFInal2 = new javax.swing.JLabel();
        lblCampeon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2064, 1162));
        setSize(new java.awt.Dimension(2064, 1162));

        lblUsuario.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblUsuario.setText("USUARIO");

        lblRival1.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblRival1.setText("Rival1");

        lblRival2.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblRival2.setText("Rival2");

        lblRival3.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblRival3.setText("Rival3");

        lblRival4.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblRival4.setText("Rival4");

        lblRival5.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblRival5.setText("Rival5");

        lblRival6.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblRival6.setText("Rival6");

        lblRival7.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblRival7.setText("Rival7");

        lblSemi1.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblSemi1.setText("CUARTO1");

        lblSemi2.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblSemi2.setText("CUARTO2");

        lblSemi3.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblSemi3.setText("CUARTO4");

        lblSemi4.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblSemi4.setText("CUARTO3");

        lblFinal1.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblFinal1.setText("SEMIFINAL1");

        lblFInal2.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblFInal2.setText("SEMIFINAL2");

        lblCampeon.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 20)); // NOI18N
        lblCampeon.setText("CAMPEON");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSemi3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSemi2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblRival7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRival6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRival5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRival1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRival3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRival4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRival2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(393, 393, 393)
                            .addComponent(lblSemi1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFInal2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 845, Short.MAX_VALUE)
                .addComponent(lblCampeon, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(660, 660, 660))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(403, 403, 403)
                    .addComponent(lblSemi4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1102, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblUsuario)
                .addGap(15, 15, 15)
                .addComponent(lblSemi1)
                .addGap(8, 8, 8)
                .addComponent(lblRival1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFinal1)
                .addGap(11, 11, 11)
                .addComponent(lblRival2)
                .addGap(20, 20, 20)
                .addComponent(lblSemi2)
                .addGap(22, 22, 22)
                .addComponent(lblRival3)
                .addGap(18, 18, 18)
                .addComponent(lblCampeon)
                .addGap(40, 40, 40)
                .addComponent(lblRival4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblRival5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lblFInal2)))
                .addGap(44, 44, 44)
                .addComponent(lblRival6)
                .addGap(10, 10, 10)
                .addComponent(lblSemi3)
                .addGap(19, 19, 19)
                .addComponent(lblRival7)
                .addContainerGap(1025, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(494, 494, 494)
                    .addComponent(lblSemi4)
                    .addContainerGap(1246, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrameTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTorneo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTorneo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCampeon;
    private javax.swing.JLabel lblFInal2;
    private javax.swing.JLabel lblFinal1;
    private javax.swing.JLabel lblRival1;
    private javax.swing.JLabel lblRival2;
    private javax.swing.JLabel lblRival3;
    private javax.swing.JLabel lblRival4;
    private javax.swing.JLabel lblRival5;
    private javax.swing.JLabel lblRival6;
    private javax.swing.JLabel lblRival7;
    private javax.swing.JLabel lblSemi1;
    private javax.swing.JLabel lblSemi2;
    private javax.swing.JLabel lblSemi3;
    private javax.swing.JLabel lblSemi4;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (imagen == null) {
                imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/llaves.png")).getImage();
            }
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

}
