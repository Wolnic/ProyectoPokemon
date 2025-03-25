/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoeddpokemon;

/**
 *
 * @author gjche
 */

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FondoPanel extends JPanel {
     private Image imagen;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen == null) {
            imagen = new ImageIcon(getClass().getClassLoader().getResource("imagenes/Pantalla inicio.jpg")).getImage();
        }
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
}
