/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1.Ventanas;

/**
 *
 * @author angel
 */
public class VerDatos extends javax.swing.JFrame {

    /**
     * Creates new form VerDatos
     */
    public VerDatos() {
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

        PanelDeFondo = new javax.swing.JPanel();
        textoUsuario = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CampoDato1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoDato2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoDato3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoDato4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoDato5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        BotonTablaDePosiciones = new javax.swing.JButton();
        BotonProximosEnfrentamientos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BotonCerrar = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelDeFondo.setPreferredSize(new java.awt.Dimension(1000, 600));

        textoUsuario.setText("SEÑOR USUARIO, SE ENCUENTRA EN NUESTRA SECCION DE USUARIOS");

        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setText("AQUI VA UN LOGO");

        jLabel1.setText("DATO 1");

        jLabel2.setText("DATO 2");

        CampoDato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDato2ActionPerformed(evt);
            }
        });

        jLabel3.setText("DATO 3");

        jLabel4.setText("DATO 4");

        jLabel5.setText("DATO 5");

        jLabel6.setText("DATO 6");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        BotonTablaDePosiciones.setText("TABLA DE POSICIONES");
        BotonTablaDePosiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTablaDePosicionesActionPerformed(evt);
            }
        });

        BotonProximosEnfrentamientos.setText("ENFRENTAMIENTOS");
        BotonProximosEnfrentamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProximosEnfrentamientosActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("OTRA IMAGEN BIEN SAPAPERRA");

        BotonCerrar.setText("X");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        BotonVolver.setText("<");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDeFondoLayout = new javax.swing.GroupLayout(PanelDeFondo);
        PanelDeFondo.setLayout(PanelDeFondoLayout);
        PanelDeFondoLayout.setHorizontalGroup(
            PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeFondoLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoDato1)
                            .addComponent(CampoDato3)
                            .addComponent(CampoDato5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BotonProximosEnfrentamientos)
                    .addComponent(BotonTablaDePosiciones))
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoDato2)
                            .addComponent(CampoDato4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeFondoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(PanelDeFondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(textoUsuario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        PanelDeFondoLayout.setVerticalGroup(
            PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(textoUsuario)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeFondoLayout.createSequentialGroup()
                        .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CampoDato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(CampoDato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoDato3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(CampoDato4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CampoDato5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(BotonTablaDePosiciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(BotonProximosEnfrentamientos)
                        .addGap(39, 39, 39))))
        );

        getContentPane().add(PanelDeFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDato2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDato2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void BotonProximosEnfrentamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProximosEnfrentamientosActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enfrentamientos().setVisible(true);
            }
        });
    }//GEN-LAST:event_BotonProximosEnfrentamientosActionPerformed

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonTablaDePosicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTablaDePosicionesActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaDePosiciones().setVisible(true);
            }
        });
    }//GEN-LAST:event_BotonTablaDePosicionesActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonProximosEnfrentamientos;
    private javax.swing.JButton BotonTablaDePosiciones;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField CampoDato1;
    private javax.swing.JTextField CampoDato2;
    private javax.swing.JTextField CampoDato3;
    private javax.swing.JTextField CampoDato4;
    private javax.swing.JTextField CampoDato5;
    private javax.swing.JLabel LOGO;
    public javax.swing.JPanel PanelDeFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables
}
