package Juego;


import Casillas.Casilla;
import Dados.Dado;
import Main.MenuPrincipal;
import PilasYColas.ListaDECircular;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author joel
 */
public class Jugar extends javax.swing.JFrame implements Serializable {

    private Tablero tablero;
    private JPanel[][] casillas;
    private ListaDECircular<Casilla> recorrido;
    private Casilla[][] tableroCasillas;
    private Dimension dimension;
    private Toolkit toolkit;
    private MenuPrincipal menu;
    private int filas = 15;
    private int columnas = 15;
    private Dado dados;
    private final Icon confusedMan = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConfusedMonopolyMan.jpg"));
    
    public Jugar(MenuPrincipal menu) {
        
        initComponents();
        iniciarFrame();
        construirTablero();
        this.menu = menu;
    }
    
    private void iniciarFrame(){
        toolkit = Toolkit.getDefaultToolkit();
        dimension=toolkit.getScreenSize();
        this.setSize(dimension);
    }
    
    private void construirTablero(){
        tablerojPanel.setLayout(null);
        
        casillas = new JPanel[filas][columnas];
        int x=1;
        int y=1;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                casillas[i][j] = new JPanel();
                casillas[i][j].setBackground(Color.gray);
                casillas[i][j].setBounds(x, y, 130, 195);
                
                tablerojPanel.add(casillas[i][j]);
                x+=132;
            }
            x=1;
            y+=197;
        }
        
        tablerojPanel.setPreferredSize(new Dimension(130*filas+50, 195*columnas+50));
    }
    
    private void sustituirPaneles(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                
            }
        }
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelFondojPanel = new javax.swing.JPanel();
        panelDerechajPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dadosjPanel = new javax.swing.JPanel();
        tresDadosGifjPanel = new javax.swing.JPanel();
        gifUnoDeTresjLabel = new javax.swing.JLabel();
        gifTresDeTresjLabeljLabel = new javax.swing.JLabel();
        gifDosDeTresjLabel = new javax.swing.JLabel();
        dosDadosGifjPanel = new javax.swing.JPanel();
        gifUnoDeDosjLabel = new javax.swing.JLabel();
        gifDosDeDosjLabel = new javax.swing.JLabel();
        unDadoGifjPanel = new javax.swing.JPanel();
        gifUnoDeUnojLabel = new javax.swing.JLabel();
        tresDadosjPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dosDadosjPanel = new javax.swing.JPanel();
        unDadojPanel = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        panelSuperiorjPanel = new javax.swing.JPanel();
        ClockjPanel = new javax.swing.JPanel();
        ComponentesSuperioresjPanel = new javax.swing.JPanel();
        contairjButtonOutjPanel = new javax.swing.JPanel();
        outjButton = new javax.swing.JButton();
        containerJTextFieldjPanel = new javax.swing.JPanel();
        nombreJugadorTurnojTextField = new javax.swing.JTextField();
        fichaJugadorjPanel = new javax.swing.JPanel();
        containerTextTurnojPanel = new javax.swing.JPanel();
        textoTurnoDejLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablerojPanel = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelFondojPanel.setLayout(new java.awt.BorderLayout());

        panelDerechajPanel.setBackground(new java.awt.Color(255, 153, 51));
        panelDerechajPanel.setLayout(new java.awt.GridLayout(6, 1, 6, 0));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setText("Hipotecar");
        panelDerechajPanel.add(jButton1);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setText("Visualizar Propiedades");
        panelDerechajPanel.add(jButton2);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casas y Hoteles.jpg"))); // NOI18N
        jButton3.setText("Edificar");
        panelDerechajPanel.add(jButton3);

        dadosjPanel.setLayout(new java.awt.CardLayout());

        tresDadosGifjPanel.setLayout(new java.awt.BorderLayout());

        gifUnoDeTresjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DadoGif4.gif"))); // NOI18N
        tresDadosGifjPanel.add(gifUnoDeTresjLabel, java.awt.BorderLayout.WEST);

        gifTresDeTresjLabeljLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DadoGif4.gif"))); // NOI18N
        tresDadosGifjPanel.add(gifTresDeTresjLabeljLabel, java.awt.BorderLayout.EAST);

        gifDosDeTresjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DadoGif4.gif"))); // NOI18N
        tresDadosGifjPanel.add(gifDosDeTresjLabel, java.awt.BorderLayout.CENTER);
        gifDosDeTresjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gifDosDeTresjLabel.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

        dadosjPanel.add(tresDadosGifjPanel, "card2");

        dosDadosGifjPanel.setLayout(new java.awt.GridLayout(1, 0));

        gifUnoDeDosjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DadoGif4.gif"))); // NOI18N
        dosDadosGifjPanel.add(gifUnoDeDosjLabel);
        gifUnoDeDosjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gifUnoDeDosjLabel.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

        gifDosDeDosjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DadoGif4.gif"))); // NOI18N
        dosDadosGifjPanel.add(gifDosDeDosjLabel);
        gifDosDeDosjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gifDosDeDosjLabel.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

        dadosjPanel.add(dosDadosGifjPanel, "card3");

        unDadoGifjPanel.setLayout(new java.awt.CardLayout());

        gifUnoDeUnojLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DadosGif (150).gif"))); // NOI18N
        unDadoGifjPanel.add(gifUnoDeUnojLabel, "card2");
        gifUnoDeUnojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gifUnoDeUnojLabel.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

        dadosjPanel.add(unDadoGifjPanel, "card4");

        tresDadosjPanel.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Dado 1");
        tresDadosjPanel.add(jLabel2, java.awt.BorderLayout.LINE_START);

        jLabel3.setText("jLabel3");
        tresDadosjPanel.add(jLabel3, java.awt.BorderLayout.LINE_END);

        jLabel4.setText("jLabel4");
        tresDadosjPanel.add(jLabel4, java.awt.BorderLayout.CENTER);

        dadosjPanel.add(tresDadosjPanel, "card5");

        javax.swing.GroupLayout dosDadosjPanelLayout = new javax.swing.GroupLayout(dosDadosjPanel);
        dosDadosjPanel.setLayout(dosDadosjPanelLayout);
        dosDadosjPanelLayout.setHorizontalGroup(
            dosDadosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        dosDadosjPanelLayout.setVerticalGroup(
            dosDadosjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        dadosjPanel.add(dosDadosjPanel, "card6");

        javax.swing.GroupLayout unDadojPanelLayout = new javax.swing.GroupLayout(unDadojPanel);
        unDadojPanel.setLayout(unDadojPanelLayout);
        unDadojPanelLayout.setHorizontalGroup(
            unDadojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        unDadojPanelLayout.setVerticalGroup(
            unDadojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        dadosjPanel.add(unDadojPanel, "card7");

        panelDerechajPanel.add(dadosjPanel);

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Lanzar");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelDerechajPanel.add(jButton4);

        jButton6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton6.setText("Terminar Turno");
        panelDerechajPanel.add(jButton6);

        panelFondojPanel.add(panelDerechajPanel, java.awt.BorderLayout.EAST);

        panelSuperiorjPanel.setBackground(new java.awt.Color(255, 255, 102));
        panelSuperiorjPanel.setLayout(new java.awt.BorderLayout());

        ClockjPanel.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout ClockjPanelLayout = new javax.swing.GroupLayout(ClockjPanel);
        ClockjPanel.setLayout(ClockjPanelLayout);
        ClockjPanelLayout.setHorizontalGroup(
            ClockjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ClockjPanelLayout.setVerticalGroup(
            ClockjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        panelSuperiorjPanel.add(ClockjPanel, java.awt.BorderLayout.LINE_END);

        ComponentesSuperioresjPanel.setBackground(new java.awt.Color(153, 255, 204));
        ComponentesSuperioresjPanel.setLayout(new java.awt.BorderLayout());

        contairjButtonOutjPanel.setLayout(new java.awt.GridLayout(1, 0));

        outjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Out.png"))); // NOI18N
        outjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outjButtonActionPerformed(evt);
            }
        });
        contairjButtonOutjPanel.add(outjButton);

        ComponentesSuperioresjPanel.add(contairjButtonOutjPanel, java.awt.BorderLayout.LINE_END);

        containerJTextFieldjPanel.setLayout(new java.awt.BorderLayout());

        nombreJugadorTurnojTextField.setFont(new java.awt.Font("Capture it", 0, 36)); // NOI18N
        nombreJugadorTurnojTextField.setText("jTextField1");
        containerJTextFieldjPanel.add(nombreJugadorTurnojTextField, java.awt.BorderLayout.CENTER);
        nombreJugadorTurnojTextField.setHorizontalAlignment(JTextField.CENTER);

        fichaJugadorjPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fichaJugadorjPanelLayout = new javax.swing.GroupLayout(fichaJugadorjPanel);
        fichaJugadorjPanel.setLayout(fichaJugadorjPanelLayout);
        fichaJugadorjPanelLayout.setHorizontalGroup(
            fichaJugadorjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fichaJugadorjPanelLayout.setVerticalGroup(
            fichaJugadorjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        containerJTextFieldjPanel.add(fichaJugadorjPanel, java.awt.BorderLayout.LINE_END);

        containerTextTurnojPanel.setBackground(new java.awt.Color(255, 255, 255));
        containerTextTurnojPanel.setLayout(new java.awt.GridLayout(1, 0));

        textoTurnoDejLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoTurnoDejLabel.setFont(new java.awt.Font("Capture it", 1, 36)); // NOI18N
        textoTurnoDejLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoTurnoDejLabel.setText("Turno de:");
        containerTextTurnojPanel.add(textoTurnoDejLabel);

        containerJTextFieldjPanel.add(containerTextTurnojPanel, java.awt.BorderLayout.LINE_START);

        ComponentesSuperioresjPanel.add(containerJTextFieldjPanel, java.awt.BorderLayout.CENTER);

        panelSuperiorjPanel.add(ComponentesSuperioresjPanel, java.awt.BorderLayout.CENTER);

        panelFondojPanel.add(panelSuperiorjPanel, java.awt.BorderLayout.NORTH);

        tablerojPanel.setBackground(new java.awt.Color(204, 204, 255));
        tablerojPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(tablerojPanel);

        panelFondojPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelFondojPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outjButtonActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Realmente desea salir del juego",
                "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, confusedMan);
        if (opcion==0) {
           menu.setVisible(true);
           this.setVisible(false); 
        }
    }//GEN-LAST:event_outjButtonActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //lanzar Dados
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClockjPanel;
    private javax.swing.JPanel ComponentesSuperioresjPanel;
    private javax.swing.JPanel containerJTextFieldjPanel;
    private javax.swing.JPanel containerTextTurnojPanel;
    private javax.swing.JPanel contairjButtonOutjPanel;
    private javax.swing.JPanel dadosjPanel;
    private javax.swing.JPanel dosDadosGifjPanel;
    private javax.swing.JPanel dosDadosjPanel;
    private javax.swing.JPanel fichaJugadorjPanel;
    private javax.swing.JLabel gifDosDeDosjLabel;
    private javax.swing.JLabel gifDosDeTresjLabel;
    private javax.swing.JLabel gifTresDeTresjLabeljLabel;
    private javax.swing.JLabel gifUnoDeDosjLabel;
    private javax.swing.JLabel gifUnoDeTresjLabel;
    private javax.swing.JLabel gifUnoDeUnojLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreJugadorTurnojTextField;
    private javax.swing.JButton outjButton;
    private javax.swing.JPanel panelDerechajPanel;
    private javax.swing.JPanel panelFondojPanel;
    private javax.swing.JPanel panelSuperiorjPanel;
    private javax.swing.JPanel tablerojPanel;
    private javax.swing.JLabel textoTurnoDejLabel;
    private javax.swing.JPanel tresDadosGifjPanel;
    private javax.swing.JPanel tresDadosjPanel;
    private javax.swing.JPanel unDadoGifjPanel;
    private javax.swing.JPanel unDadojPanel;
    // End of variables declaration//GEN-END:variables
}
