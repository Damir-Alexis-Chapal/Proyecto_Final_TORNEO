/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1.Ventanas;

import com.mycompany.mavenproject1.*;

/**
 *
 * @author Alexis Chapal
 */
public class VerTorneoBasket extends javax.swing.JFrame {

    /**
     * Creates new form VerTorneoFutbol
     */
    public VerTorneoBasket() {
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

        jPanel2 = new javax.swing.JPanel();
        VerDatosTorneo1 = new javax.swing.JButton();
        NombreTorneo1 = new javax.swing.JTextField();
        NombreTorneo3 = new javax.swing.JTextField();
        VerDatosTorneo3 = new javax.swing.JButton();
        NombreTorneo2 = new javax.swing.JTextField();
        VerDatosTorneo2 = new javax.swing.JButton();
        NombreTorneo4 = new javax.swing.JTextField();
        VerDatosTorneo4 = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        VerDatosTorneo1.setText("Datos");
        VerDatosTorneo1.setEnabled(false);
        VerDatosTorneo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerDatosTorneo1ActionPerformed(evt);
            }
        });

        NombreTorneo1.setEditable(false);
        NombreTorneo1.setText("AQUÍ APERECE EL NOMBRE");
        NombreTorneo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTorneo1ActionPerformed(evt);
            }
        });

        NombreTorneo3.setEditable(false);
        NombreTorneo3.setText("AQUÍ APERECE EL NOMBRE");

        VerDatosTorneo3.setText("Datos");
        VerDatosTorneo3.setEnabled(false);
        VerDatosTorneo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerDatosTorneo3ActionPerformed(evt);
            }
        });

        NombreTorneo2.setEditable(false);
        NombreTorneo2.setText("AQUÍ APERECE EL NOMBRE");

        VerDatosTorneo2.setText("Datos");
        VerDatosTorneo2.setEnabled(false);
        VerDatosTorneo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerDatosTorneo2ActionPerformed(evt);
            }
        });

        NombreTorneo4.setEditable(false);
        NombreTorneo4.setText("AQUÍ APERECE EL NOMBRE");
        NombreTorneo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTorneo4ActionPerformed(evt);
            }
        });

        VerDatosTorneo4.setText("Datos");
        VerDatosTorneo4.setEnabled(false);
        VerDatosTorneo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerDatosTorneo4ActionPerformed(evt);
            }
        });

        BotonAtras.setText("ATRAS");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        BotonSalir.setText("SALIR");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(VerDatosTorneo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VerDatosTorneo4)
                .addGap(102, 102, 102))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreTorneo1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTorneo3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(VerDatosTorneo1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(NombreTorneo2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(VerDatosTorneo2)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreTorneo4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTorneo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTorneo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerDatosTorneo2)
                    .addComponent(VerDatosTorneo1))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTorneo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreTorneo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerDatosTorneo4)
                    .addComponent(VerDatosTorneo3))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonSalir))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerDatosTorneo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerDatosTorneo1ActionPerformed
        
        
        VerDatos.ver_datos(Datos.obtenerInstancia().listado_torneos_basket.get(0),0);//mandamos como parámetro el torneo que queremos consultar
    }//GEN-LAST:event_VerDatosTorneo1ActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void NombreTorneo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTorneo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTorneo4ActionPerformed

    private void NombreTorneo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTorneo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTorneo1ActionPerformed

    private void VerDatosTorneo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerDatosTorneo2ActionPerformed
        VerDatos.ver_datos(Datos.obtenerInstancia().listado_torneos_basket.get(1),1);//mandamos como parámetro el torneo que queremos consultar
    }//GEN-LAST:event_VerDatosTorneo2ActionPerformed

    private void VerDatosTorneo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerDatosTorneo3ActionPerformed
        VerDatos.ver_datos(Datos.obtenerInstancia().listado_torneos_basket.get(2),2);//mandamos como parámetro el torneo que queremos consultar
    }//GEN-LAST:event_VerDatosTorneo3ActionPerformed

    private void VerDatosTorneo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerDatosTorneo4ActionPerformed
        VerDatos.ver_datos(Datos.obtenerInstancia().listado_torneos_basket.get(3),3);//mandamos como parámetro el torneo que queremos consultar
    }//GEN-LAST:event_VerDatosTorneo4ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonSalir;
    public static javax.swing.JTextField NombreTorneo1;
    public static javax.swing.JTextField NombreTorneo2;
    public static javax.swing.JTextField NombreTorneo3;
    public static javax.swing.JTextField NombreTorneo4;
    public static javax.swing.JButton VerDatosTorneo1;
    public static javax.swing.JButton VerDatosTorneo2;
    public static javax.swing.JButton VerDatosTorneo3;
    public static javax.swing.JButton VerDatosTorneo4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
