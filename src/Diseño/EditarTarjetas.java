package Diseño;

import AdministradorGrupos.*;
import Casillas.Casilla;
import PilasYColas.ListaDECircular;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class EditarTarjetas extends javax.swing.JFrame implements Serializable{

    private GrupoTarjeta[] gruposTarjeta;
    private GrupoLugar[] gruposLugar;
    private ListaDECircular<Casilla> recorridoJuego;
    private Casilla[][] tablero;
    private CrearJuego crearJuego;
    private int activarBoton = 0;
    private CrearTablero crear;
    private FuncionesDiseño funcionesDiseño;
    private AdministradorGruposTomeTarjeta administradorTomeTarjeta;
    private AdministradorGruposLugar administradorGruposLugar;
    private ManejadorCasillasPropiedad manejadorPropiedades;
    private ManejadorTiposTomaTarjeta manejadorTiposTomaTarjeta;
    private NumeroTarjetasTomeTarjeta numeroTarjetas;
    private DiseñarAccionesTarjetas diseñarAcciones;
    private int[] cantidadTarjetas;

    public EditarTarjetas(ListaDECircular<Casilla> recorridoJuego,
            Casilla[][] tablero, AdministradorGruposTomeTarjeta administradorTomeTarjeta, AdministradorGruposLugar administradorGruposLugar,
            CrearJuego crearJuego, CrearTablero crear, FuncionesDiseño funcionesDiseño, ManejadorCasillasPropiedad manejadorPropiedades) {
        initComponents();
        this.crearJuego = crearJuego;
        this.administradorTomeTarjeta = administradorTomeTarjeta;
        this.administradorGruposLugar = administradorGruposLugar;
        this.crear = crear;
        this.funcionesDiseño = funcionesDiseño;
        this.manejadorPropiedades = manejadorPropiedades;
        this.recorridoJuego = recorridoJuego;
        this.tablero = tablero;
        cantidadTarjetas = new int[administradorTomeTarjeta.getNumeroGrupos()];
        gruposTarjeta = administradorTomeTarjeta.getGruposTarjeta();
        gruposLugar = administradorGruposLugar.getGrupoLugar();
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editarAccionesGruposjButton = new javax.swing.JButton();
        editarNumeroTarjetasjButton = new javax.swing.JButton();
        textoEditarTarjetasjLabel = new javax.swing.JLabel();
        finishjButton = new javax.swing.JButton();
        fondoEditarTarjetasjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1021, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editarAccionesGruposjButton.setBackground(new java.awt.Color(153, 255, 204));
        editarAccionesGruposjButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        editarAccionesGruposjButton.setForeground(new java.awt.Color(0, 0, 0));
        editarAccionesGruposjButton.setText("Acciones Grupos");
        editarAccionesGruposjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarAccionesGruposjButtonMouseClicked(evt);
            }
        });
        editarAccionesGruposjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAccionesGruposjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editarAccionesGruposjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 280, 70));
        editarAccionesGruposjButton.setEnabled(false);

        editarNumeroTarjetasjButton.setBackground(new java.awt.Color(153, 255, 204));
        editarNumeroTarjetasjButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        editarNumeroTarjetasjButton.setForeground(new java.awt.Color(0, 0, 0));
        editarNumeroTarjetasjButton.setText("Numero Tarjetas Grupos");
        editarNumeroTarjetasjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarNumeroTarjetasjButtonMouseClicked(evt);
            }
        });
        editarNumeroTarjetasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarNumeroTarjetasjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editarNumeroTarjetasjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 320, 70));

        textoEditarTarjetasjLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        textoEditarTarjetasjLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoEditarTarjetasjLabel.setText("Editar Tarjetas");
        textoEditarTarjetasjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(textoEditarTarjetasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 260, 100));

        finishjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprobar.png"))); // NOI18N
        finishjButton.setContentAreaFilled(false);
        finishjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(finishjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 580, 100, 100));
        finishjButton.setEnabled(false);

        fondoEditarTarjetasjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comunnity chest.jpg"))); // NOI18N
        getContentPane().add(fondoEditarTarjetasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarNumeroTarjetasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarNumeroTarjetasjButtonActionPerformed
        numeroTarjetas = new NumeroTarjetasTomeTarjeta(this, true, cantidadTarjetas, administradorTomeTarjeta, crear);
        numeroTarjetas.setLocationRelativeTo(this);
        numeroTarjetas.setVisible(true);
        editarAccionesGruposjButton.setEnabled(true);
    }//GEN-LAST:event_editarNumeroTarjetasjButtonActionPerformed

    private void editarAccionesGruposjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAccionesGruposjButtonActionPerformed
        diseñarAcciones = new DiseñarAccionesTarjetas(this, true, administradorTomeTarjeta, crear, funcionesDiseño, manejadorPropiedades);
        diseñarAcciones.setLocationRelativeTo(this);
        diseñarAcciones.setVisible(true);
        finishjButton.setEnabled(true);
    }//GEN-LAST:event_editarAccionesGruposjButtonActionPerformed

    private void finishjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishjButtonActionPerformed
        crearJuego.setVisible(true);
        crearJuego.deshabilitarComponentes();
        manejadorTiposTomaTarjeta = diseñarAcciones.getManejadorTomaTarjeta();
        crearJuego.transferirDatosTablero(manejadorPropiedades, manejadorTiposTomaTarjeta, administradorGruposLugar, administradorTomeTarjeta,
                tablero, recorridoJuego);
        this.setVisible(false);
    }//GEN-LAST:event_finishjButtonActionPerformed

    private void editarNumeroTarjetasjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarNumeroTarjetasjButtonMouseClicked

    }//GEN-LAST:event_editarNumeroTarjetasjButtonMouseClicked

    private void editarAccionesGruposjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarAccionesGruposjButtonMouseClicked

    }//GEN-LAST:event_editarAccionesGruposjButtonMouseClicked

    public int[] getCantidadTarjetas() {
        return cantidadTarjetas;
    }

    public void setCantidadTarjetas(int[] cantidadTarjetas) {
        this.cantidadTarjetas = cantidadTarjetas;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarAccionesGruposjButton;
    private javax.swing.JButton editarNumeroTarjetasjButton;
    private javax.swing.JButton finishjButton;
    private javax.swing.JLabel fondoEditarTarjetasjLabel;
    private javax.swing.JLabel textoEditarTarjetasjLabel;
    // End of variables declaration//GEN-END:variables
}
