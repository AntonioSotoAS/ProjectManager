/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.codertech.projectmanager.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author anton
 */
public class SliderLogin extends javax.swing.JPanel {

    private Timer timer;
    private String nombreImagen;

    public SliderLogin() {
        initComponents();
        cambiarImagenSlider();
    }

    public void cambiarImagenSlider() {

        nombreImagen = "src/main/java/com/codertech/projectmanager/img/1.jpg";
        jLSlider.setIcon(new ImageIcon(nombreImagen));

        // Crea el Timer
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (nombreImagen) {
                    case "src/main/java/com/codertech/projectmanager/img/1.jpg":
                        nombreImagen = "src/main/java/com/codertech/projectmanager/img/2.jpg";
                        break;
                    case "src/main/java/com/codertech/projectmanager/img/2.jpg":
                        nombreImagen = "src/main/java/com/codertech/projectmanager/img/3.jpg";
                        break;
                    case "src/main/java/com/codertech/projectmanager/img/3.jpg":
                        nombreImagen = "src/main/java/com/codertech/projectmanager/img/1.jpg";
                        break;
                }
                jLSlider.setIcon(new ImageIcon(nombreImagen));
            }
        });
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLSlider = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLSlider;
    // End of variables declaration//GEN-END:variables
}