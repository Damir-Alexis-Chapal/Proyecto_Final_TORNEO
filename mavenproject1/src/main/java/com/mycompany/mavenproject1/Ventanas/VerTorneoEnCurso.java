/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1.Ventanas;

import static com.mycompany.mavenproject1.Ventanas.VerTorneoFutbol.NombreTorneo1;
import com.mycompany.mavenproject1.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Alexis Chapal
 */
public class VerTorneoEnCurso extends javax.swing.JFrame {

    /**
     * Creates new form VerTorneoEnCurso
     */
    public VerTorneoEnCurso() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonTorneoVolley = new javax.swing.JButton();
        BotonTorneoBasket = new javax.swing.JButton();
        BotonTorneoFutbol = new javax.swing.JButton();
        BotonTorneoAjedrez = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("un logo bien criminal");

        jLabel2.setText("TORNEOS DISPONIBLES");

        BotonTorneoVolley.setText("VOLLEY");
        BotonTorneoVolley.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTorneoVolleyActionPerformed(evt);
            }
        });

        BotonTorneoBasket.setText("BASKET");
        BotonTorneoBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTorneoBasketActionPerformed(evt);
            }
        });

        BotonTorneoFutbol.setText("FUTBOL");
        BotonTorneoFutbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTorneoFutbolActionPerformed(evt);
            }
        });

        BotonTorneoAjedrez.setText("AJEDREZ");
        BotonTorneoAjedrez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTorneoAjedrezActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonTorneoAjedrez, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTorneoFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTorneoBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTorneoVolley, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(104, 104, 104)
                .addComponent(jLabel2)
                .addGap(90, 90, 90)
                .addComponent(BotonTorneoFutbol, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BotonTorneoVolley, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonTorneoBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BotonTorneoAjedrez, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("UNA IMAGEN MAS CRIMINAL TODAVIA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel4)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel4)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("UN BANNER BIEN CRIMINAL");

        BotonVolver.setText("X");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        BotonSalir.setText("<");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonVolver))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonVolver)
                    .addComponent(BotonSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonTorneoFutbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTorneoFutbolActionPerformed

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                if(Datos.listado_torneos_futbol.size()==0){
                    //si no hay torneos creados se le informa al usuario
                    JOptionPane.showMessageDialog(null, "No se han creado torneos");
                }else{
                    //Se muestra la ventana
                    new VerTorneoFutbol().setVisible(true);
                    //verificación para settear los nombres de los torneos y mostrarlos
                    if(Datos.listado_torneos_futbol.size()==1){
                    VerTorneoFutbol.NombreTorneo1.setText(Datos.listado_torneos_futbol.get(0).nombre);
                    VerTorneoFutbol.VerDatosTorneo1.setEnabled(true);
                    VerTorneoFutbol.NombreTorneo2.setText("NO EXISTE");
                    VerTorneoFutbol.NombreTorneo3.setText("NO EXISTE");
                    VerTorneoFutbol.NombreTorneo4.setText("NO EXISTE");
                }else if(Datos.listado_torneos_futbol.size()==2){
                    VerTorneoFutbol.NombreTorneo1.setText(Datos.listado_torneos_futbol.get(0).nombre);
                    VerTorneoFutbol.NombreTorneo2.setText(Datos.listado_torneos_futbol.get(1).nombre);
                    VerTorneoFutbol.VerDatosTorneo1.setEnabled(true);
                    VerTorneoFutbol.VerDatosTorneo2.setEnabled(true);
                    VerTorneoFutbol.NombreTorneo3.setText("NO EXISTE");
                    VerTorneoFutbol.NombreTorneo4.setText("NO EXISTE");
                }else if(Datos.listado_torneos_futbol.size()==3){
                    VerTorneoFutbol.NombreTorneo1.setText(Datos.listado_torneos_futbol.get(0).nombre);
                    VerTorneoFutbol.NombreTorneo2.setText(Datos.listado_torneos_futbol.get(1).nombre);
                    VerTorneoFutbol.NombreTorneo3.setText(Datos.listado_torneos_futbol.get(2).nombre);
                    VerTorneoFutbol.VerDatosTorneo1.setEnabled(true);
                    VerTorneoFutbol.VerDatosTorneo2.setEnabled(true);
                    VerTorneoFutbol.VerDatosTorneo3.setEnabled(true);
                    VerTorneoFutbol.NombreTorneo4.setText("NO EXISTE");
                }else if (Datos.listado_torneos_futbol.size()>=4){
                    VerTorneoFutbol.NombreTorneo1.setText(Datos.listado_torneos_futbol.get(0).nombre);
                    VerTorneoFutbol.NombreTorneo2.setText(Datos.listado_torneos_futbol.get(1).nombre);
                    VerTorneoFutbol.NombreTorneo3.setText(Datos.listado_torneos_futbol.get(2).nombre);
                    VerTorneoFutbol.NombreTorneo4.setText(Datos.listado_torneos_futbol.get(3).nombre);
                    VerTorneoFutbol.VerDatosTorneo1.setEnabled(true);
                    VerTorneoFutbol.VerDatosTorneo2.setEnabled(true);
                    VerTorneoFutbol.VerDatosTorneo3.setEnabled(true);
                    VerTorneoFutbol.VerDatosTorneo4.setEnabled(true);
                }
                }
            }
        });
        
        
    }//GEN-LAST:event_BotonTorneoFutbolActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonTorneoVolleyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTorneoVolleyActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                if(Datos.listado_torneos_volley.size()==0){
                    //si no hay torneos creados se le informa al usuario
                    JOptionPane.showMessageDialog(null, "No se han creado torneos");
                }else{
                    //Se muestra la ventana
                    new VerTorneoVolley().setVisible(true);
                    //verificación para settear los nombres de los torneos y mostrarlos
                    if(Datos.listado_torneos_volley.size()==1){
                    VerTorneoVolley.NombreTorneo1.setText(Datos.listado_torneos_volley.get(0).nombre);
                    VerTorneoVolley.VerDatosTorneo1.setEnabled(true);
                    VerTorneoVolley.NombreTorneo2.setText("NO EXISTE");
                    VerTorneoVolley.NombreTorneo3.setText("NO EXISTE");
                    VerTorneoVolley.NombreTorneo4.setText("NO EXISTE");
                }else if(Datos.listado_torneos_volley.size()==2){
                    VerTorneoVolley.NombreTorneo1.setText(Datos.listado_torneos_volley.get(0).nombre);
                    VerTorneoVolley.NombreTorneo2.setText(Datos.listado_torneos_volley.get(1).nombre);
                    VerTorneoVolley.VerDatosTorneo1.setEnabled(true);
                    VerTorneoVolley.VerDatosTorneo2.setEnabled(true);
                    VerTorneoVolley.NombreTorneo3.setText("NO EXISTE");
                    VerTorneoVolley.NombreTorneo4.setText("NO EXISTE");
                }else if(Datos.listado_torneos_volley.size()==3){
                    VerTorneoVolley.NombreTorneo1.setText(Datos.listado_torneos_volley.get(0).nombre);
                    VerTorneoVolley.NombreTorneo2.setText(Datos.listado_torneos_volley.get(1).nombre);
                    VerTorneoVolley.NombreTorneo3.setText(Datos.listado_torneos_volley.get(2).nombre);
                    VerTorneoVolley.VerDatosTorneo1.setEnabled(true);
                    VerTorneoVolley.VerDatosTorneo2.setEnabled(true);
                    VerTorneoVolley.VerDatosTorneo3.setEnabled(true);
                    VerTorneoVolley.NombreTorneo4.setText("NO EXISTE");
                }else if (Datos.listado_torneos_volley.size()>=4){
                    VerTorneoVolley.NombreTorneo1.setText(Datos.listado_torneos_volley.get(0).nombre);
                    VerTorneoVolley.NombreTorneo2.setText(Datos.listado_torneos_volley.get(1).nombre);
                    VerTorneoVolley.NombreTorneo3.setText(Datos.listado_torneos_volley.get(2).nombre);
                    VerTorneoVolley.NombreTorneo4.setText(Datos.listado_torneos_volley.get(3).nombre);
                    VerTorneoVolley.VerDatosTorneo1.setEnabled(true);
                    VerTorneoVolley.VerDatosTorneo2.setEnabled(true);
                    VerTorneoVolley.VerDatosTorneo3.setEnabled(true);
                    VerTorneoVolley.VerDatosTorneo4.setEnabled(true);
                }
                }
            }
        });
    }//GEN-LAST:event_BotonTorneoVolleyActionPerformed

    private void BotonTorneoAjedrezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTorneoAjedrezActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                if(Datos.listado_torneos_ajedrez.size()==0){
                    //si no hay torneos creados se le informa al usuario
                    JOptionPane.showMessageDialog(null, "No se han creado torneos");
                }else{
                    //Se muestra la ventana
                    new VerTorneoAjedrez().setVisible(true);
                    //verificación para settear los nombres de los torneos y mostrarlos
                    if(Datos.listado_torneos_ajedrez.size()==1){
                    VerTorneoAjedrez.NombreTorneo1.setText(Datos.listado_torneos_ajedrez.get(0).nombre);
                    VerTorneoAjedrez.VerDatosTorneo1.setEnabled(true);
                    VerTorneoAjedrez.NombreTorneo2.setText("NO EXISTE");
                    VerTorneoAjedrez.NombreTorneo3.setText("NO EXISTE");
                    VerTorneoAjedrez.NombreTorneo4.setText("NO EXISTE");
                }else if(Datos.listado_torneos_ajedrez.size()==2){
                    VerTorneoAjedrez.NombreTorneo1.setText(Datos.listado_torneos_ajedrez.get(0).nombre);
                    VerTorneoAjedrez.NombreTorneo2.setText(Datos.listado_torneos_ajedrez.get(1).nombre);
                    VerTorneoAjedrez.VerDatosTorneo1.setEnabled(true);
                    VerTorneoAjedrez.VerDatosTorneo2.setEnabled(true);
                    VerTorneoAjedrez.NombreTorneo3.setText("NO EXISTE");
                    VerTorneoAjedrez.NombreTorneo4.setText("NO EXISTE");
                }else if(Datos.listado_torneos_ajedrez.size()==3){
                    VerTorneoAjedrez.NombreTorneo1.setText(Datos.listado_torneos_ajedrez.get(0).nombre);
                    VerTorneoAjedrez.NombreTorneo2.setText(Datos.listado_torneos_ajedrez.get(1).nombre);
                    VerTorneoAjedrez.NombreTorneo3.setText(Datos.listado_torneos_ajedrez.get(2).nombre);
                    VerTorneoAjedrez.VerDatosTorneo1.setEnabled(true);
                    VerTorneoAjedrez.VerDatosTorneo2.setEnabled(true);
                    VerTorneoAjedrez.VerDatosTorneo3.setEnabled(true);
                    VerTorneoAjedrez.NombreTorneo4.setText("NO EXISTE");
                }else if (Datos.listado_torneos_ajedrez.size()>=4){
                    VerTorneoAjedrez.NombreTorneo1.setText(Datos.listado_torneos_ajedrez.get(0).nombre);
                    VerTorneoAjedrez.NombreTorneo2.setText(Datos.listado_torneos_ajedrez.get(1).nombre);
                    VerTorneoAjedrez.NombreTorneo3.setText(Datos.listado_torneos_ajedrez.get(2).nombre);
                    VerTorneoAjedrez.NombreTorneo4.setText(Datos.listado_torneos_ajedrez.get(3).nombre);
                    VerTorneoAjedrez.VerDatosTorneo1.setEnabled(true);
                    VerTorneoAjedrez.VerDatosTorneo2.setEnabled(true);
                    VerTorneoAjedrez.VerDatosTorneo3.setEnabled(true);
                    VerTorneoAjedrez.VerDatosTorneo4.setEnabled(true);
                }
                }
            }
        });
    }//GEN-LAST:event_BotonTorneoAjedrezActionPerformed

    private void BotonTorneoBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTorneoBasketActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                if(Datos.listado_torneos_basket.size()==0){
                    //si no hay torneos creados se le informa al usuario
                    JOptionPane.showMessageDialog(null, "No se han creado torneos");
                }else{
                    //Se muestra la ventana
                    new VerTorneoBasket().setVisible(true);
                    //verificación para settear los nombres de los torneos y mostrarlos
                    if(Datos.listado_torneos_basket.size()==1){
                    VerTorneoBasket.NombreTorneo1.setText(Datos.listado_torneos_basket.get(0).nombre);
                    VerTorneoBasket.VerDatosTorneo1.setEnabled(true);
                    VerTorneoBasket.NombreTorneo2.setText("NO EXISTE");
                    VerTorneoBasket.NombreTorneo3.setText("NO EXISTE");
                    VerTorneoBasket.NombreTorneo4.setText("NO EXISTE");
                }else if(Datos.listado_torneos_basket.size()==2){
                    VerTorneoBasket.NombreTorneo1.setText(Datos.listado_torneos_basket.get(0).nombre);
                    VerTorneoBasket.NombreTorneo2.setText(Datos.listado_torneos_basket.get(1).nombre);
                    VerTorneoBasket.VerDatosTorneo1.setEnabled(true);
                    VerTorneoBasket.VerDatosTorneo2.setEnabled(true);
                    VerTorneoBasket.NombreTorneo3.setText("NO EXISTE");
                    VerTorneoBasket.NombreTorneo4.setText("NO EXISTE");
                }else if(Datos.listado_torneos_basket.size()==3){
                    VerTorneoBasket.NombreTorneo1.setText(Datos.listado_torneos_basket.get(0).nombre);
                    VerTorneoBasket.NombreTorneo2.setText(Datos.listado_torneos_basket.get(1).nombre);
                    VerTorneoBasket.NombreTorneo3.setText(Datos.listado_torneos_basket.get(2).nombre);
                    VerTorneoBasket.VerDatosTorneo1.setEnabled(true);
                    VerTorneoBasket.VerDatosTorneo2.setEnabled(true);
                    VerTorneoBasket.VerDatosTorneo3.setEnabled(true);
                    VerTorneoBasket.NombreTorneo4.setText("NO EXISTE");
                }else if (Datos.listado_torneos_basket.size()>=4){
                    VerTorneoBasket.NombreTorneo1.setText(Datos.listado_torneos_basket.get(0).nombre);
                    VerTorneoBasket.NombreTorneo2.setText(Datos.listado_torneos_basket.get(1).nombre);
                    VerTorneoBasket.NombreTorneo3.setText(Datos.listado_torneos_basket.get(2).nombre);
                    VerTorneoBasket.NombreTorneo4.setText(Datos.listado_torneos_basket.get(3).nombre);
                    VerTorneoBasket.VerDatosTorneo1.setEnabled(true);
                    VerTorneoBasket.VerDatosTorneo2.setEnabled(true);
                    VerTorneoBasket.VerDatosTorneo3.setEnabled(true);
                    VerTorneoBasket.VerDatosTorneo4.setEnabled(true);
                }
                }
            }
        });
    }//GEN-LAST:event_BotonTorneoBasketActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonTorneoAjedrez;
    private javax.swing.JButton BotonTorneoBasket;
    private javax.swing.JButton BotonTorneoFutbol;
    private javax.swing.JButton BotonTorneoVolley;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
