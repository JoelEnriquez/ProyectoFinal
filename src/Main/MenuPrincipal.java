/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Diseño.CrearJuego;
import javax.swing.JOptionPane;

/**
 *
 * @author joel
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTittleDown = new javax.swing.JLabel();
        jButtonTitulo2 = new javax.swing.JButton();
        jButtonTitulo = new javax.swing.JButton();
        jLabelTittleUp = new javax.swing.JLabel();
        jButtonJugar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonRanking = new javax.swing.JButton();
        jButtonAcercaDe = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelFondoMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Way");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTittleDown.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabelTittleDown.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTittleDown.setText("ay");
        getContentPane().add(jLabelTittleDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jButtonTitulo2.setBackground(new java.awt.Color(51, 102, 255));
        jButtonTitulo2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButtonTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTitulo2.setText("W");
        jButtonTitulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTitulo2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jButtonTitulo.setBackground(new java.awt.Color(255, 51, 51));
        jButtonTitulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jButtonTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTitulo.setText("T");
        jButtonTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTituloActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jLabelTittleUp.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabelTittleUp.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTittleUp.setText("he");
        getContentPane().add(jLabelTittleUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        jButtonJugar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonJugar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonJugar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonJugar.setText("JUGAR");
        jButtonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJugarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 220, 90));

        jButtonEditar.setBackground(new java.awt.Color(220, 124, 18));
        jButtonEditar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("EDITAR");
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 210, 80));

        jButtonCrear.setBackground(new java.awt.Color(255, 255, 51));
        jButtonCrear.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonCrear.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCrear.setText("CREAR");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 220, 80));

        jButtonRanking.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonRanking.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BestPlayers.png"))); // NOI18N
        jButtonRanking.setToolTipText("Mejores Puntuaciones");
        jButtonRanking.setOpaque(false);
        jButtonRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRankingActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, 140, 140));

        jButtonAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ayuda.jpg"))); // NOI18N
        jButtonAcercaDe.setToolTipText("Acerca De");
        jButtonAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcercaDeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 80, 80));

        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Out.png"))); // NOI18N
        jButtonExit.setToolTipText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 100, 100));

        jLabelFondoMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/monopoly-ubisoft-hasbro.jpg"))); // NOI18N
        getContentPane().add(jLabelFondoMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTitulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTitulo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTitulo2ActionPerformed

    private void jButtonTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTituloActionPerformed

    private void jButtonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJugarActionPerformed

    }//GEN-LAST:event_jButtonJugarActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        CrearJuego creacion = new CrearJuego();
        creacion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButtonAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcercaDeActionPerformed
        JOptionPane.showMessageDialog(this,
                "The Way \nVersion 1.0 \nJuego de Rol \nJoel Enriquez \nSalcaja, 2020 ",
                "Acerca De", -1);
    }//GEN-LAST:event_jButtonAcercaDeActionPerformed

    private void jButtonRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRankingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRankingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcercaDe;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonJugar;
    private javax.swing.JButton jButtonRanking;
    private javax.swing.JButton jButtonTitulo;
    private javax.swing.JButton jButtonTitulo2;
    private javax.swing.JLabel jLabelFondoMain;
    private javax.swing.JLabel jLabelTittleDown;
    private javax.swing.JLabel jLabelTittleUp;
    // End of variables declaration//GEN-END:variables
}
