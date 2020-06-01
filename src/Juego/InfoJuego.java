/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Main.MenuPrincipal;

/**
 *
 * @author joel
 */
public class InfoJuego extends javax.swing.JDialog {

    private MenuPrincipal menu;
    private Jugar jugar;
    private int limiteJugadores;
    
    public InfoJuego(MenuPrincipal menu, boolean modal, EscogerTipoJuego escoger) {
        super(menu, modal);
        initComponents();
        this.menu = menu;
        limiteJugadores = escoger.getLimiteJugadores();    
    }
    
    private void iniciarComponentes(){
        noJugadoresjSpinner.setModel(new javax.swing.SpinnerNumberModel(2, 2, limiteJugadores, 1));
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
        infoJuegojPanel = new javax.swing.JPanel();
        noJugadoresjSpinner = new javax.swing.JSpinner();
        nombreJugadoresjComboBox = new javax.swing.JComboBox<>();
        ingresarNombresjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        coloresjComboBox = new javax.swing.JComboBox<>();
        colorActualjPanel = new javax.swing.JPanel();
        agregarjButton = new javax.swing.JButton();
        textoNumeroJugadoresjLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        escogerjButton = new javax.swing.JButton();
        aceptarjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CreadorJoelEnriquez.jpg"))); // NOI18N
        jPanel1.add(jLabel2, java.awt.BorderLayout.WEST);

        infoJuegojPanel.setBackground(new java.awt.Color(153, 153, 153));
        infoJuegojPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        noJugadoresjSpinner.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        infoJuegojPanel.add(noJugadoresjSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 61, 55));

        nombreJugadoresjComboBox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        infoJuegojPanel.add(nombreJugadoresjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, 40));
        infoJuegojPanel.add(ingresarNombresjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 180, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Color Ficha");
        infoJuegojPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 140, 40));

        coloresjComboBox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        infoJuegojPanel.add(coloresjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 180, 40));

        javax.swing.GroupLayout colorActualjPanelLayout = new javax.swing.GroupLayout(colorActualjPanel);
        colorActualjPanel.setLayout(colorActualjPanelLayout);
        colorActualjPanelLayout.setHorizontalGroup(
            colorActualjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        colorActualjPanelLayout.setVerticalGroup(
            colorActualjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        infoJuegojPanel.add(colorActualjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 180, 30));

        agregarjButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        agregarjButton.setText("Agregar");
        infoJuegojPanel.add(agregarjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 180, 50));

        textoNumeroJugadoresjLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textoNumeroJugadoresjLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoNumeroJugadoresjLabel.setText("Numero Jugadores");
        infoJuegojPanel.add(textoNumeroJugadoresjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre Jugadores");
        infoJuegojPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, 40));

        escogerjButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        escogerjButton.setText("Escoger");
        infoJuegojPanel.add(escogerjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 180, 50));

        aceptarjButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        aceptarjButton.setText("Aceptar");
        infoJuegojPanel.add(aceptarjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 160, 50));

        jPanel1.add(infoJuegojPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarjButton;
    private javax.swing.JButton agregarjButton;
    private javax.swing.JPanel colorActualjPanel;
    private javax.swing.JComboBox<String> coloresjComboBox;
    private javax.swing.JButton escogerjButton;
    private javax.swing.JPanel infoJuegojPanel;
    private javax.swing.JTextField ingresarNombresjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner noJugadoresjSpinner;
    private javax.swing.JComboBox<String> nombreJugadoresjComboBox;
    private javax.swing.JLabel textoNumeroJugadoresjLabel;
    // End of variables declaration//GEN-END:variables
}
