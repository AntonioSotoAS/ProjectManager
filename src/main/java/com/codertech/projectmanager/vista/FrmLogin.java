/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.codertech.projectmanager.vista;



/**
 *
 * @author CoderTech
 */
public class FrmLogin extends javax.swing.JFrame {

    

    public FrmLogin() {
        initComponents();
    }

   /* public void cambiarPanel() {
        login.setSize(599, 740);
        Contenedor1.removeAll();
        Contenedor1.add(login, BorderLayout.CENTER);
        Contenedor1.revalidate();
        Contenedor1.repaint();

        sliderLogin.setSize(578, 740);
        Contenedor2.removeAll();
        Contenedor2.add(sliderLogin, BorderLayout.CENTER);
        Contenedor2.revalidate();
        Contenedor2.repaint();
    }*/

   /* public void crearCuenta() {
        crearCuenta.setSize(599, 740);
        Contenedor1.removeAll();
        Contenedor1.add(crearCuenta, BorderLayout.CENTER);
        Contenedor1.revalidate();
        Contenedor1.repaint();
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor1 = new javax.swing.JPanel();
        Contenedor2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Contenedor1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Contenedor1Layout = new javax.swing.GroupLayout(Contenedor1);
        Contenedor1.setLayout(Contenedor1Layout);
        Contenedor1Layout.setHorizontalGroup(
            Contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        Contenedor1Layout.setVerticalGroup(
            Contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        Contenedor2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Contenedor2Layout = new javax.swing.GroupLayout(Contenedor2);
        Contenedor2.setLayout(Contenedor2Layout);
        Contenedor2Layout.setHorizontalGroup(
            Contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        Contenedor2Layout.setVerticalGroup(
            Contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Contenedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Contenedor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Contenedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Contenedor1;
    public javax.swing.JPanel Contenedor2;
    // End of variables declaration//GEN-END:variables
}
