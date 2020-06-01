/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import AdministradorGrupos.AdministradorGruposLugar;
import AdministradorGrupos.AdministradorGruposTomeTarjeta;
import AdministradorGrupos.GrupoTarjeta;
import AdministradorGrupos.ManejadorCasillasPropiedad;
import Casillas.Carcel;
import Casillas.Casilla;
import Casillas.Inicio;
import Casillas.Neutro;
import Casillas.Propiedad;
import Casillas.TomaTarjeta;
import Casillas.Trampa;
import Juego.Tablero;
import PilasYColas.ListaDECircular;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author joel
 */
public class CrearTablero extends javax.swing.JFrame implements Serializable {

    private ListaDECircular<Casilla> recorridoJuego;
    private Tablero nuevoTablero;
    private JButton[][] matrizBotones;
    private Casilla[][] tablero;
    private Casilla nuevaCasilla;
    private int numeroFilas;
    private int numeroColumnas;
    private int porcentajeHipoteca;
    private int numeroCasillasDisponibles = 0;
    private int posicionRecorrido = 1;
    private int tamX;
    private int tamY;

    private boolean pintarCasillas = true;
    private CrearJuego crear;
    private DiseñoRecorrido diseño;
    private InformacionCasillas infoCasillas;
    private InstanciaLugar instanciaLugar;
    private InstanciaServicioBasico instanciaServicio;
    private InstanciarEstacion instanciarEstacion;
    private FuncionesDiseño funciones;
    private ManejadorCasillasPropiedad manejadorPropiedades;
    private AdministradorGruposLugar adminGruposLugar;
    private AdministradorGruposTomeTarjeta administradorTomeTarjeta;
    private String[] arregloNombreTarjetas;
    private String[] arregloNombreGruposLugar;
    private boolean existenciaNeutro=false;
    private boolean existenciaTrampa=false;
    private boolean existenciaLugar=false;
    private boolean existenciaServicio=false;
    private boolean existenciaEstacion=false;
    private int[] posicionCasillaRecorrido;
    private int costoPorEstacion;
    private int usoEstacion;
    private final Icon iconoError = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MonopolyConfundido.png"));

    public CrearTablero(int noFilas, int noColumnas, int porcentajeHipoteca, CrearJuego crear) {
        numeroFilas = noFilas;
        numeroColumnas = noColumnas;
        this.porcentajeHipoteca = porcentajeHipoteca;
        this.crear = crear;

        initComponents();
        this.setLocationRelativeTo(null);
        panelEdit1jPanel.setVisible(true);
        panelEdit2jPanel.setVisible(false);
        diseño = new DiseñoRecorrido(numeroFilas,numeroColumnas);
        recorridoJuego = new ListaDECircular<>();
        tablero = new Casilla[numeroFilas][numeroColumnas];
        funciones = new FuncionesDiseño(numeroFilas, numeroColumnas, this);
        iniciarMatriz();
    }

    public void iniciarMatriz() {
        matrizBotones = new JButton[numeroFilas][numeroColumnas];
        panelBotonesjPanel.setLayout(new GridLayout(numeroFilas, numeroColumnas));

        //Se obtiene el tamaño de los botones acorde a su cantidad
        tamañoBotones(numeroFilas, numeroColumnas);

        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                JButton botonNuevo = new JButton();
                botonNuevo.setSize(tamX, tamY);
                //Se agrega a la matriz el botón recien creado
                matrizBotones[i][j] = botonNuevo;
                matrizBotones[i][j].setBackground(java.awt.Color.white);
                matrizBotones[i][j].setName("0");

                matrizBotones[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        if (pintarCasillas) {
                            pintarCasillas(event);

                        }
                        if (!pintarCasillas) {
                            establecerTipoCasilla(event);
                        }
                    }
                });

                matrizBotones[i][j].addMouseListener(new java.awt.event.MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent event) {
                        if (pintarCasillas) {
                            pintarColorOriginal(event);

                        }
                    }
                });

                panelBotonesjPanel.add(matrizBotones[i][j]);
            }
        }
    }

    /**
     * Metodo que permite obtener el tamaño de los botones
     *
     * @param cantX
     * @param cantY
     */
    private void tamañoBotones(int cantX, int cantY) {
        tamX = panelBotonesjPanel.getWidth() / cantX;
        tamY = panelBotonesjPanel.getHeight() / cantY;
    }

    private void pintarCasillas(ActionEvent e) {
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                if (e.getSource().equals(matrizBotones[i][j])) {
                    
                    diseño.definirCuadrante(i,j);
                    if (esPrimeraCasilla()) {
                        nuevaCasilla = new Casilla(i,j);
                        matrizBotones[i][j].setBackground(java.awt.Color.green);
                        nuevaCasilla.setPosicionRecorrido(posicionRecorrido);
                        tablero[i][j] = nuevaCasilla;
                        matrizBotones[i][j].setName("1");
                        
                        posicionRecorrido++;
                        numeroCasillasDisponibles++;
                    }
                    else if(matrizBotones[i][j].getBackground() == java.awt.Color.white) {
                        nuevaCasilla = new Casilla(i, j);
                        nuevaCasilla.setPosicionRecorrido(posicionRecorrido);
                        tablero[i][j] = nuevaCasilla;

                        matrizBotones[i][j].setBackground(java.awt.Color.black);
                        matrizBotones[i][j].setName("1");

                        posicionRecorrido++;
                        numeroCasillasDisponibles++;
                    }
                }
            }
        }
    }

    private void pintarColorOriginal(java.awt.event.MouseEvent event) {
        if (SwingUtilities.isRightMouseButton(event)) {

            for (int i = 0; i < numeroFilas; i++) {
                for (int j = 0; j < numeroColumnas; j++) {
                    if (event.getSource().equals(matrizBotones[i][j])) {

                        if (matrizBotones[i][j].getBackground() == java.awt.Color.black ||
                            matrizBotones[i][j].getBackground() == java.awt.Color.green) {
                            tablero[i][j] = null;
                            
                            posicionRecorrido--;
                            numeroCasillasDisponibles--;
                            
                            matrizBotones[i][j].setBackground(java.awt.Color.white);
                            matrizBotones[i][j].setName("0");
                            
                        }

                    }
                }

            }
        }
    }
    
    private boolean esPrimeraCasilla(){
        return posicionRecorrido==1;
    }

    /**
     * Permite transcionar de panel para editar otros atributos
     */
    private void transicionEditTablero() {
        panelEdit1jPanel.setVisible(false);
        panelEdit2jPanel.setVisible(true);
        pintarCasillas = false;

        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                if (matrizBotones[i][j].getName().equals("0")) {
                    matrizBotones[i][j].setVisible(false);
                }
            }
        }
    }

    /**
     * Atrapa el nombre de grupo de tarjetas y lo pone en el comboBox para poder
     * ser visualizado
     */
    public void establecerNombreGrupoTarjetas() {
        arregloNombreTarjetas = administradorTomeTarjeta.getNombresGrupos();
        if (arregloNombreTarjetas != null) {
            tipoTomaTarjetajComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(arregloNombreTarjetas));
        }
    }


    /**
     * Nos permite instanciar casillas en nuestra matriz tablero
     * @param evento 
     */
    private void establecerTipoCasilla(ActionEvent evento) {

        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                if (evento.getSource().equals(matrizBotones[i][j])) {

                    if (tipoCasillajComboBox.getSelectedItem().toString().equals("Inicio")) {
                        if (!funciones.existenciaInicio(tablero)) {
                            matrizBotones[i][j].setBackground(Color.green);
                            nuevaCasilla = new Inicio(i, j);
                            tablero[i][j] = nuevaCasilla;
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pueden tener dos casillas inicio", "ERROR",
                                    JOptionPane.INFORMATION_MESSAGE, iconoError);
                        }
                    } else if (tipoCasillajComboBox.getSelectedItem().toString().equals("Neutro")) {
                        matrizBotones[i][j].setBackground(Color.white);
                        nuevaCasilla = new Neutro(i, j);
                        tablero[i][j] = nuevaCasilla;
                        existenciaNeutro=true;

                    } else if (tipoCasillajComboBox.getSelectedItem().toString().equals("Trampa")) {
                        String castigo = (String) JOptionPane.showInputDialog(this, "Selecciona el castigo", "Tipo de Castigo",
                                JOptionPane.PLAIN_MESSAGE, null, new String[]{"Perder Turno", "Ir a la carcel", "Pagar multa"},
                                null);
                        if (castigo != null) {
                            matrizBotones[i][j].setBackground(Color.red);
                            nuevaCasilla = new Trampa(i, j, castigo);
                            tablero[i][j] = nuevaCasilla;
                            existenciaTrampa=true;
                        } else {
                            break;
                        }

                    } else if (tipoCasillajComboBox.getSelectedItem().toString().equals("Propiedad")) {

                        switch (tipoPropiedadjComboBox.getSelectedItem().toString()) {
                            case "Lugar":
                                instanciaLugar = new InstanciaLugar(this, true, adminGruposLugar, i, j, porcentajeHipoteca);
                                instanciaLugar.setLocationRelativeTo(this);
                                instanciaLugar.setVisible(true);
                                nuevaCasilla = instanciaLugar.getLugar();
                                tablero[i][j] = nuevaCasilla;
                                matrizBotones[i][j].setBackground(instanciaLugar.getColor());
                                existenciaLugar=true;
                                break;
                                
                            case "Servicio Basico":
                                instanciaServicio = new InstanciaServicioBasico(this, true, i, j, porcentajeHipoteca);
                                instanciaServicio.setLocationRelativeTo(this);
                                instanciaServicio.setVisible(true);
                                nuevaCasilla = instanciaServicio.getServicioBasico();
                                tablero[i][j] = nuevaCasilla;
                                matrizBotones[i][j].setBackground(instanciaServicio.getColorServicio());
                                matrizBotones[i][j].setText(instanciaServicio.getNombreServicio());
                                existenciaServicio=true;
                                break;
                                
                            case "Estacion":
                                instanciarEstacion = new InstanciarEstacion(this, true, i, j,
                                        porcentajeHipoteca, costoPorEstacion, usoEstacion);
                                instanciarEstacion.setLocationRelativeTo(this);
                                instanciarEstacion.setVisible(true);
                                nuevaCasilla = instanciarEstacion.getEstacion();
                                tablero[i][j] = nuevaCasilla;
                                matrizBotones[i][j].setBackground(instanciarEstacion.getColorEstacion());
                                matrizBotones[i][j].setText("Estacion");
                                existenciaEstacion=true;
                                break;
                            default:
                                break;
                        }
                    } else if (tipoCasillajComboBox.getSelectedItem().toString().equals("Toma una tarjeta")) {

                        GrupoTarjeta[] grupoT = administradorTomeTarjeta.getGruposTarjeta();
                        GrupoTarjeta grupoTarjeta = grupoT[tipoTomaTarjetajComboBox.getSelectedIndex()];
                        nuevaCasilla = new TomaTarjeta(i, j, grupoTarjeta);
                        tablero[i][j] = nuevaCasilla;
                        matrizBotones[i][j].setBackground(grupoT[tipoTomaTarjetajComboBox.getSelectedIndex()].getColorGrupo());

                    } else if (tipoCasillajComboBox.getSelectedItem().toString().equals("Carcel")) {
                        matrizBotones[i][j].setBackground(Color.black);
                        nuevaCasilla = new Carcel(i, j);
                        tablero[i][j] = nuevaCasilla;
                    }

                }
            }
        }
    }

    /**
     * Switch entre los combo box para mostrar la info correspondiente
     */
    private void cambiarTipoCasilla() {
        String tipoCasilla = tipoCasillajComboBox.getSelectedItem().toString();
        if (tipoCasilla.equals("Propiedad")) {
            textoTipoPropiedadjLabel.setVisible(true);
            tipoPropiedadjComboBox.setVisible(true);
            textoTomaTarjetajLabel.setVisible(false);
            tipoTomaTarjetajComboBox.setVisible(false);

        } else if (tipoCasilla.equals("Toma una tarjeta")) {
            textoTomaTarjetajLabel.setVisible(true);
            tipoTomaTarjetajComboBox.setVisible(true);
            textoTipoPropiedadjLabel.setVisible(false);
            tipoPropiedadjComboBox.setVisible(false);
        } else {
            textoTomaTarjetajLabel.setVisible(false);
            tipoTomaTarjetajComboBox.setVisible(false);
            textoTipoPropiedadjLabel.setVisible(false);
            tipoPropiedadjComboBox.setVisible(false);
        }
    }

    public void mensajeError(String mensajeError) {
        JOptionPane.showMessageDialog(this, mensajeError,
                "ALERTA", JOptionPane.INFORMATION_MESSAGE, iconoError);
    }
    
    /**
     * Permite que en los text field solo se puedan ingresar letras
     * @param evt
     * @param mensajeError 
     */
    public void validarSoloLetras(java.awt.event.KeyEvent evt, String mensajeError){
        char validar = evt.getKeyChar();

        if ((validar<'a' || validar>'z') && (validar<'A' || validar>'Z') && validar!=' '){
            evt.consume();
            mensajeError(mensajeError);
       }

    }
    
    private void obtenerNombrePosicion(){
        posicionCasillaRecorrido = new int[posicionRecorrido-1];
        int aux = 0;
        
        for (int i = 0; i <numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                if (tablero[i][j]!=null) {        
                    posicionCasillaRecorrido[aux] = tablero[i][j].getPosicionRecorrido();
                    aux++;
                }
            }
        }
    }
    
    private void ingresarNumeroPosicion(){
        int aux = 0;
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                if (tablero[i][j] instanceof Casilla) {
                    tablero[i][j].setPosicionRecorrido(posicionCasillaRecorrido[aux]);
                    aux++;
                }
            }
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBaseCrearTablerojPanel = new javax.swing.JPanel();
        panelBotonesjPanel = new javax.swing.JPanel();
        panelEdit1jPanel = new javax.swing.JPanel();
        nextjButton = new javax.swing.JButton();
        textoDiseñoPreviojLabel = new javax.swing.JLabel();
        panelEdit2jPanel = new javax.swing.JPanel();
        FinishjButton = new javax.swing.JButton();
        tipoPropiedadjComboBox = new javax.swing.JComboBox<>();
        textoTipoPropiedadjLabel = new javax.swing.JLabel();
        textoTipoCasillajLabel = new javax.swing.JLabel();
        tipoCasillajComboBox = new javax.swing.JComboBox<>();
        textoTomaTarjetajLabel = new javax.swing.JLabel();
        tipoTomaTarjetajComboBox = new javax.swing.JComboBox<>();
        fondoCrearTablerojLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBaseCrearTablerojPanel.setBackground(new java.awt.Color(204, 204, 204));
        panelBaseCrearTablerojPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBotonesjPanel.setBackground(new java.awt.Color(153, 153, 153));
        panelBaseCrearTablerojPanel.add(panelBotonesjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 620));

        panelEdit1jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Next (1).png"))); // NOI18N
        nextjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextjButtonActionPerformed(evt);
            }
        });
        panelEdit1jPanel.add(nextjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 150, 100));

        textoDiseñoPreviojLabel.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        textoDiseñoPreviojLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoDiseñoPreviojLabel.setText("Diseño Previo");
        panelEdit1jPanel.add(textoDiseñoPreviojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 270, 80));

        panelBaseCrearTablerojPanel.add(panelEdit1jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1160, 150));
        panelEdit1jPanel.setOpaque(false);

        panelEdit2jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FinishjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/complete.png"))); // NOI18N
        FinishjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishjButtonActionPerformed(evt);
            }
        });
        panelEdit2jPanel.add(FinishjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 110, 110));

        tipoPropiedadjComboBox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tipoPropiedadjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lugar", "Servicio Basico", "Estacion" }));
        tipoPropiedadjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPropiedadjComboBoxActionPerformed(evt);
            }
        });
        panelEdit2jPanel.add(tipoPropiedadjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 230, 70));
        tipoPropiedadjComboBox.setVisible(false);

        textoTipoPropiedadjLabel.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        textoTipoPropiedadjLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoTipoPropiedadjLabel.setText("Tipo de Propiedad");
        panelEdit2jPanel.add(textoTipoPropiedadjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 260, 50));
        textoTipoPropiedadjLabel.setVisible(false);

        textoTipoCasillajLabel.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        textoTipoCasillajLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoTipoCasillajLabel.setText("Tipo de Casilla");
        panelEdit2jPanel.add(textoTipoCasillajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 210, 50));

        tipoCasillajComboBox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        tipoCasillajComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inicio", "Neutro", "Trampa", "Propiedad", "Toma una tarjeta", "Carcel" }));
        tipoCasillajComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoCasillajComboBoxActionPerformed(evt);
            }
        });
        panelEdit2jPanel.add(tipoCasillajComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 230, 70));

        textoTomaTarjetajLabel.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        textoTomaTarjetajLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoTomaTarjetajLabel.setText("Toma una Tarjeta");
        panelEdit2jPanel.add(textoTomaTarjetajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 260, 50));
        textoTomaTarjetajLabel.setVisible(false);

        tipoTomaTarjetajComboBox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        panelEdit2jPanel.add(tipoTomaTarjetajComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 230, 70));
        tipoTomaTarjetajComboBox.setVisible(false);

        panelBaseCrearTablerojPanel.add(panelEdit2jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1160, 150));

        fondoCrearTablerojLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TableroMonopoly.png"))); // NOI18N
        panelBaseCrearTablerojPanel.add(fondoCrearTablerojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1170, 770));

        getContentPane().add(panelBaseCrearTablerojPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextjButtonActionPerformed
        obtenerNombrePosicion();
        if (numeroCasillasDisponibles < 4) {
            mensajeError("No hay suficientes casillas para jugar");
        } else {
            transicionEditTablero();
            infoCasillas = new InformacionCasillas(this, true);
            infoCasillas.setLocationRelativeTo(this);
            infoCasillas.setCasillasDisponibles(numeroCasillasDisponibles - 1);
            infoCasillas.setVisible(true);
            establecerNombreGrupoTarjetas();
            funciones.despintarBotones(matrizBotones);
        }
    }//GEN-LAST:event_nextjButtonActionPerformed

    private void FinishjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishjButtonActionPerformed
        if (!funciones.existenciaInicio(tablero)) {
            mensajeError("No hay una casilla Inicio. Porfavor ingresela");
        } else if (!funciones.existenciaPropiedad(tablero)) {
            mensajeError("No hay ninguna propiedad. Porfavor coloque una");
        } else {
            ingresarNumeroPosicion();
            funciones.obtenerPropiedades(tablero, posicionRecorrido);
            funciones.insertarCasillasAlRecorrido(recorridoJuego);
            funciones.colocarInicioAlPrincipio(recorridoJuego);
            funciones.nombreTiposCasillaTablero(existenciaNeutro, existenciaTrampa,
            existenciaLugar, existenciaServicio, existenciaEstacion);
            funciones.setCasillasPropiedad();
            funciones.imprimirPosicion(recorridoJuego);
            Propiedad[] propiedades = funciones.getPropiedadesNuevas();
            manejadorPropiedades = new ManejadorCasillasPropiedad(propiedades);
            
            
            EditarTarjetas editar = new EditarTarjetas(recorridoJuego, tablero, administradorTomeTarjeta, adminGruposLugar, crear, this, funciones, manejadorPropiedades);
            editar.setLocationRelativeTo(this);
            editar.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_FinishjButtonActionPerformed

    private void tipoCasillajComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCasillajComboBoxActionPerformed
        cambiarTipoCasilla();
    }//GEN-LAST:event_tipoCasillajComboBoxActionPerformed

    private void tipoPropiedadjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPropiedadjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoPropiedadjComboBoxActionPerformed

    public void setArregloNombreTarjetas(String[] arregloNombreTarjetas) {
        this.arregloNombreTarjetas = arregloNombreTarjetas;
    }

    public void setArregloNombreGruposLugar(String[] arregloNombreGruposLugar) {
        this.arregloNombreGruposLugar = arregloNombreGruposLugar;
    }

    public void setAdministradores(AdministradorGruposLugar adminGruposLugar, AdministradorGruposTomeTarjeta administradorGrupos) {
        this.adminGruposLugar = adminGruposLugar;
        this.administradorTomeTarjeta = administradorGrupos;
    }

    public void setCostoPorEstacion(int costoPorEstacion) {
        this.costoPorEstacion = costoPorEstacion;
    }

    public void setUsoEstacion(int usoEstacion) {
        this.usoEstacion = usoEstacion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FinishjButton;
    private javax.swing.JLabel fondoCrearTablerojLabel;
    private javax.swing.JButton nextjButton;
    private javax.swing.JPanel panelBaseCrearTablerojPanel;
    private javax.swing.JPanel panelBotonesjPanel;
    private javax.swing.JPanel panelEdit1jPanel;
    private javax.swing.JPanel panelEdit2jPanel;
    private javax.swing.JLabel textoDiseñoPreviojLabel;
    private javax.swing.JLabel textoTipoCasillajLabel;
    private javax.swing.JLabel textoTipoPropiedadjLabel;
    private javax.swing.JLabel textoTomaTarjetajLabel;
    private javax.swing.JComboBox<String> tipoCasillajComboBox;
    private javax.swing.JComboBox<String> tipoPropiedadjComboBox;
    private javax.swing.JComboBox<String> tipoTomaTarjetajComboBox;
    // End of variables declaration//GEN-END:variables
}
