/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Guardar.GuardarTablero;
import Main.MenuPrincipal;
import java.awt.HeadlessException;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author joel
 */
public class EscogerTipoJuego extends javax.swing.JDialog {

    private MenuPrincipal menuPrincipal;
    private GuardarTablero manejadorTablero;
    private Jugar jugar;
    private Tablero tablero;
    private int limiteJugadores;
    
    public EscogerTipoJuego(MenuPrincipal menuPrincipal, boolean modal,
            GuardarTablero manejadorTablero, Jugar jugar) {
        super(menuPrincipal, modal);
        initComponents();
        this.menuPrincipal = menuPrincipal;
        this.manejadorTablero = manejadorTablero;
        this.jugar = jugar;
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nuevoJuegojButton = new javax.swing.JButton();
        reanudarJuegojButton = new javax.swing.JButton();
        fondoTipoJuegjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(590, 368));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel2.setText("Nuevo Juego");
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 200, 50));

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel3.setText("Cargar Juego");
        jPanel2.add(jLabel3);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 200, 50));

        nuevoJuegojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        nuevoJuegojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoJuegojButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nuevoJuegojButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 80, 80));

        reanudarJuegojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar.png"))); // NOI18N
        getContentPane().add(reanudarJuegojButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 80, 80));

        fondoTipoJuegjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EleccionJugar.jpg"))); // NOI18N
        fondoTipoJuegjLabel.setPreferredSize(new java.awt.Dimension(580, 337));
        getContentPane().add(fondoTipoJuegjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoJuegojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoJuegojButtonActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Archivo de tablero", "board"));
            fileChooser.setAcceptAllFileFilterUsed(false);
            int seleccion = fileChooser.showOpenDialog(this);

            if (seleccion == APPROVE_OPTION) {
                tablero = manejadorTablero.leerTablero(fileChooser.getSelectedFile().getPath());
                limiteJugadores = tablero.getNumeroJugadores();
                jugar.setTablero(tablero);
            } 
        }catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Info", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_nuevoJuegojButtonActionPerformed

    public int getLimiteJugadores() {
        return limiteJugadores;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoTipoJuegjLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nuevoJuegojButton;
    private javax.swing.JButton reanudarJuegojButton;
    // End of variables declaration//GEN-END:variables
}