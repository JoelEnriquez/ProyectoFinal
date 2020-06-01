/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import AdministradorGrupos.*;
import TomeTarjeta.*;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class DiseñarAccionesTarjetas extends javax.swing.JDialog implements Serializable {

    CrearTablero crear;
    FuncionesDiseño funciones;
    EditarTarjetas editarTarjetas;
    AdministradorGruposTomeTarjeta administrador;
    ManejadorCasillasPropiedad manejadorPropiedades;
    ManejadorTiposTomaTarjeta manejadorTomaTarjeta;

    GrupoTarjeta grupoTarjeta;
    String[] nombresGrupos;
    String[] nombreTiposCasilla;
    String[] nombrePropiedadesConInicio;
    int[] numeroTarjetasGrupo;
    private String textoEnTarjeta;
    boolean avanzar = false;

    public DiseñarAccionesTarjetas(EditarTarjetas editarTarjetas, boolean modal, AdministradorGruposTomeTarjeta administrador,
            CrearTablero crear, FuncionesDiseño funciones, ManejadorCasillasPropiedad manejadorPropiedades) {
        super(editarTarjetas, modal);
        initComponents();
        manejadorTomaTarjeta = new ManejadorTiposTomaTarjeta();
        this.crear = crear;
        this.funciones = funciones;
        this.editarTarjetas = editarTarjetas;
        this.administrador = administrador;
        this.manejadorPropiedades = manejadorPropiedades;
        nombresGrupos = administrador.getNombresGrupos();
        numeroTarjetasGrupo = editarTarjetas.getCantidadTarjetas();
        nombreTiposCasilla = funciones.getNombreTiposCasilla();
        nombrePropiedadesConInicio = manejadorPropiedades.nombresPropiedadConInicio();

        grupoActualjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(nombresGrupos));
        elegirDestinoTipoCasillajComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(nombreTiposCasilla));
        elegirDestinoPropiedadjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(nombrePropiedadesConInicio));
        tarjetasDisponiblesjTextField.setText(Integer.toString(numeroTarjetasGrupo[grupoActualjComboBox.getSelectedIndex()]));

    }

    public ManejadorTiposTomaTarjeta getManejadorTomaTarjeta() {
        return manejadorTomaTarjeta;
    }
    
    

    private void mostrarElementosCaminar() {
        if (eleccionCaminarjCheckBox.isSelected()) {
            caminarNoCasillasContainerjPanel.setVisible(true);
            caminarContainerjScrollPane.setVisible(true);
            consejoCaminarContainerjScrollPane.setVisible(true);
        }
    }

    private void ocultarElementosCaminar() {
        if (eleccionCaminarjCheckBox.isSelected() == false) {
            caminarNoCasillasContainerjPanel.setVisible(false);
            caminarContainerjScrollPane.setVisible(false);
            consejoCaminarContainerjScrollPane.setVisible(false);
        }
    }

    private void mostrarElementosPremio() {
        if (eleccionPremiojCheckBox.isSelected()) {
            premioCantDineroContainerjPanel.setVisible(true);
            premioContainerjScrollPane.setVisible(true);

        }
    }

    private void ocultarElementosPremio() {
        if (eleccionPremiojCheckBox.isSelected() == false) {
            premioCantDineroContainerjPanel.setVisible(false);
            premioContainerjScrollPane.setVisible(false);
        }
    }

    private void mostrarElementosMulta() {
        if (eleccionMultajCheckBox.isSelected()) {
            multaDineroContainerjPanel.setVisible(true);
            multaContainerjScrollPane.setVisible(true);
        }
    }

    private void ocultarElementosMulta() {
        if (eleccionMultajCheckBox.isSelected() == false) {
            multaDineroContainerjPanel.setVisible(false);
            multaContainerjScrollPane.setVisible(false);
        }
    }

    private void mostrarElementosPagoJugadores() {
        if (eleccionPagoPlayersjCheckBox.isSelected()) {
            pagoContainerjScrollPane.setVisible(true);
            pagoAJugadoresDineroContainerjPanel.setVisible(true);
        }
    }

    private void ocultarElementosPagoJugadores() {
        if (eleccionPagoPlayersjCheckBox.isSelected() == false) {
            pagoContainerjScrollPane.setVisible(false);
            pagoAJugadoresDineroContainerjPanel.setVisible(false);
        }
    }

    private void mostrarElementosMoverA() {
        if (eleccionMoverAjCheckBox.isSelected()) {
            moverAContainerjScrollPane.setVisible(true);
            consejoMoverAContainerjScrollPane.setVisible(true);
        }
    }

    private void ocultarElementosMoverA() {
        if (eleccionMoverAjCheckBox.isSelected() == false) {
            moverAContainerjScrollPane.setVisible(false);
            consejoMoverAContainerjScrollPane.setVisible(false);
            elegirDestinoPropiedadjComboBox.setVisible(false);
            elegirDestinoTipoCasillajComboBox.setVisible(false);
        }
    }

    private void mostrarElementosPerderTurno() {
        if (eleccionPerderTurnojCheckBox.isSelected()) {
            turnosPerdidosContainerjPanel.setVisible(true);
            perderTurnoContainerjScrollPane.setVisible(true);
        }
    }

    private void ocultarElementosPerderTurno() {
        if (eleccionPerderTurnojCheckBox.isSelected() == false) {
            turnosPerdidosContainerjPanel.setVisible(false);
            perderTurnoContainerjScrollPane.setVisible(false);
        }
    }

    private void mostrarElementosSalgaCarcel() {
        if (eleccionSalgaCarceljCheckBox.isSelected()) {
            salirCarcelContainerjScrollPane.setVisible(true);
            textoEnTarjetajPanel.setVisible(false);
        }
    }

    private void ocultarElementosSalgaCarcel() {
        if (eleccionSalgaCarceljCheckBox.isSelected() == false) {
            salirCarcelContainerjScrollPane.setVisible(false);
            if (eleccionVayaCarceljCheckBox.isSelected()) {
                textoEnTarjetajPanel.setVisible(false);
            } else {
                textoEnTarjetajPanel.setVisible(true);
            }
        }
    }

    private void mostrarElementosVayaCarcel() {
        if (eleccionVayaCarceljCheckBox.isSelected()) {
            vayaACarcelContainerjScrollPane.setVisible(true);
            textoEnTarjetajPanel.setVisible(false);
        }
    }

    private void ocultarElementosVayaCarcel() {
        if (eleccionVayaCarceljCheckBox.isSelected() == false) {
            vayaACarcelContainerjScrollPane.setVisible(false);

            if (eleccionSalgaCarceljCheckBox.isSelected()) {
                textoEnTarjetajPanel.setVisible(false);
            } else {
                textoEnTarjetajPanel.setVisible(true);
            }
        }
    }

    private String textoVayaCarcel() {
        String[] textosVayaCarcel = new String[5];
        textosVayaCarcel[0] = "Usted ha sido arrestado por negocios ilegales.\n Vaya a la cárcel y no pase por INICIO.";
        textosVayaCarcel[1] = "Ha sido condenado por robo de identidad.\n Vaya a la cárcel y no pase por INICIO.";
        textosVayaCarcel[2] = "Se le ha inculpado de asesinato.\n Vaya a la cárcel y no pase por INICIO.";
        textosVayaCarcel[3] = "Tiene denuncias por lavado de dinero.\n Vaya a la cárcel y no pase por INICIO.";
        textosVayaCarcel[4] = "Ha sido condenado por ser demasiado sexy.\n Vaya a la cárcel y no pase por INICIO.";

        int posicionRandom = (int) (Math.random() * textosVayaCarcel.length);

        return textosVayaCarcel[posicionRandom];
    }

    private String textoSalgaCarcel() {
        String[] textosSalgaCarcel = new String[5];
        textosSalgaCarcel[0] = "Usted ha obtenido un perdon presidencial.\n SALGA DE LA CARCEL GRATIS.\n Puede vender esta tarjeta o usarla cuando lo necesite.";
        textosSalgaCarcel[1] = "Usted ha sido absuelto.\n SALGA DE LA CARCEL GRATIS.\n Puede vender esta tarjeta o usarla cuando lo necesite.";
        textosSalgaCarcel[2] = "Ha cumplido su condena.\n SALGA DE LA CARCEL GRATIS.\n Puede vender esta tarjeta o usarla cuando lo necesite.";
        textosSalgaCarcel[3] = "El Chapo Guzman le ha ayudado a escapar.\n SALGA DE LA CARCEL GRATIS.\n Puede vender esta tarjeta o usarla cuando lo necesite.";
        textosSalgaCarcel[4] = "Ha adquirido poderes de teletransportacion.\n SALGA DE LA CARCEL GRATIS.\n Puede vender esta tarjeta o usarla cuando lo necesite.";

        int textoRandom = (int) (Math.random() * textosSalgaCarcel.length);

        return textosSalgaCarcel[textoRandom];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accionesTarjetabuttonGroup = new javax.swing.ButtonGroup();
        grupoActualjComboBox = new javax.swing.JComboBox<>();
        textoSeleccioneGrupojLabel = new javax.swing.JLabel();
        caminarContainerjScrollPane = new javax.swing.JScrollPane();
        caminarEjemplojTextArea = new javax.swing.JTextArea();
        containerEleccionAccionesjPanel = new javax.swing.JPanel();
        eleccionCaminarjCheckBox = new javax.swing.JCheckBox();
        eleccionPremiojCheckBox = new javax.swing.JCheckBox();
        eleccionMultajCheckBox = new javax.swing.JCheckBox();
        eleccionPagoPlayersjCheckBox = new javax.swing.JCheckBox();
        eleccionMoverAjCheckBox = new javax.swing.JCheckBox();
        eleccionPerderTurnojCheckBox = new javax.swing.JCheckBox();
        eleccionSalgaCarceljCheckBox = new javax.swing.JCheckBox();
        eleccionVayaCarceljCheckBox = new javax.swing.JCheckBox();
        eleccionTarjetaPersojCheckBox = new javax.swing.JCheckBox();
        textoAccionesTarjetasjLabel = new javax.swing.JLabel();
        tarjetasDisponiblesjTextField = new javax.swing.JTextField();
        containerTextoElegirjPanel = new javax.swing.JPanel();
        textoElegirAccionjLabel = new javax.swing.JLabel();
        checkjButton = new javax.swing.JButton();
        premioContainerjScrollPane = new javax.swing.JScrollPane();
        premioEjemplojTextArea = new javax.swing.JTextArea();
        pagoContainerjScrollPane = new javax.swing.JScrollPane();
        pagoAJugadoresEjemplojTextArea = new javax.swing.JTextArea();
        perderTurnoContainerjScrollPane = new javax.swing.JScrollPane();
        perderTurnoEjemplojTextArea = new javax.swing.JTextArea();
        tarjetaPersonalizadaContainerjScrollPane = new javax.swing.JScrollPane();
        tarjetaPersonalizadaEjemplojTextArea = new javax.swing.JTextArea();
        moverAContainerjScrollPane = new javax.swing.JScrollPane();
        moverACasillaEjemplojTextArea = new javax.swing.JTextArea();
        multaContainerjScrollPane = new javax.swing.JScrollPane();
        multaEjemplojTextArea = new javax.swing.JTextArea();
        noCrearTarjetasjSpinner = new javax.swing.JSpinner();
        textoNoCopiasjLabel = new javax.swing.JLabel();
        textoEnTarjetajPanel = new javax.swing.JPanel();
        textoTextoEnTarjetajLabel = new javax.swing.JLabel();
        ingresarTextoTarjetajTextField = new javax.swing.JTextField();
        agregarjButton = new javax.swing.JButton();
        consejoCaminarContainerjScrollPane = new javax.swing.JScrollPane();
        caminarConsejojTextArea = new javax.swing.JTextArea();
        caminarNoCasillasContainerjPanel = new javax.swing.JPanel();
        textoCasillasAvanzarjLabel = new javax.swing.JLabel();
        noCasillasDesplazarsejSpinner = new javax.swing.JSpinner();
        premioCantDineroContainerjPanel = new javax.swing.JPanel();
        textoCantidadDineroPremiojLabel = new javax.swing.JLabel();
        cantidadDineroPremiojSpinner = new javax.swing.JSpinner();
        multaDineroContainerjPanel = new javax.swing.JPanel();
        textoDineroMultajLabel = new javax.swing.JLabel();
        cantDineroMultajSpinner = new javax.swing.JSpinner();
        pagoAJugadoresDineroContainerjPanel = new javax.swing.JPanel();
        textoDineroCadaJugadorjLabel = new javax.swing.JLabel();
        cantidadDineroParaJugadoresjSpinner = new javax.swing.JSpinner();
        elegirDestinoPropiedadjComboBox = new javax.swing.JComboBox<>();
        elegirDestinoTipoCasillajComboBox = new javax.swing.JComboBox<>();
        consejoMoverAContainerjScrollPane = new javax.swing.JScrollPane();
        moverAConsejojTextArea = new javax.swing.JTextArea();
        turnosPerdidosContainerjPanel = new javax.swing.JPanel();
        textoNumeroTurnosPerdidosjLabel = new javax.swing.JLabel();
        noTurnosAPerderjSpinner = new javax.swing.JSpinner();
        salirCarcelContainerjScrollPane = new javax.swing.JScrollPane();
        salirCarcelConsejojTextArea = new javax.swing.JTextArea();
        vayaACarcelContainerjScrollPane = new javax.swing.JScrollPane();
        vayaCarcelConsejojTextArea = new javax.swing.JTextArea();
        textoTarjetasDisponiblesjLabel = new javax.swing.JLabel();
        fondoAccionesTarjetasjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1015, 568));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grupoActualjComboBox.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        grupoActualjComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                grupoActualjComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(grupoActualjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 40));

        textoSeleccioneGrupojLabel.setFont(new java.awt.Font("DialogInput", 1, 26)); // NOI18N
        textoSeleccioneGrupojLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoSeleccioneGrupojLabel.setText("Seleccione Grupo");
        getContentPane().add(textoSeleccioneGrupojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 40));

        caminarEjemplojTextArea.setEditable(false);
        caminarEjemplojTextArea.setColumns(20);
        caminarEjemplojTextArea.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        caminarEjemplojTextArea.setRows(5);
        caminarEjemplojTextArea.setText("Ejemplo: “​ Hoy es su\ndia de suerte,\nlos vuelos son gratis por \nlo que puede avanzar\n3 casillas.​”");
        caminarContainerjScrollPane.setViewportView(caminarEjemplojTextArea);

        getContentPane().add(caminarContainerjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 230, 140));
        caminarContainerjScrollPane.setVisible(false);

        accionesTarjetabuttonGroup.add(eleccionCaminarjCheckBox);
        eleccionCaminarjCheckBox.setText("Caminar");
        eleccionCaminarjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionCaminarjCheckBoxActionPerformed(evt);
            }
        });
        containerEleccionAccionesjPanel.add(eleccionCaminarjCheckBox);

        accionesTarjetabuttonGroup.add(eleccionPremiojCheckBox);
        eleccionPremiojCheckBox.setText("Premio");
        eleccionPremiojCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionPremiojCheckBoxActionPerformed(evt);
            }
        });
        containerEleccionAccionesjPanel.add(eleccionPremiojCheckBox);

        accionesTarjetabuttonGroup.add(eleccionMultajCheckBox);
        eleccionMultajCheckBox.setText("Multa");
        eleccionMultajCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionMultajCheckBoxActionPerformed(evt);
            }
        });
        containerEleccionAccionesjPanel.add(eleccionMultajCheckBox);

        accionesTarjetabuttonGroup.add(eleccionPagoPlayersjCheckBox);
        eleccionPagoPlayersjCheckBox.setText("Pago a Jugadores");
        eleccionPagoPlayersjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionPagoPlayersjCheckBoxActionPerformed(evt);
            }
        });
        containerEleccionAccionesjPanel.add(eleccionPagoPlayersjCheckBox);

        accionesTarjetabuttonGroup.add(eleccionMoverAjCheckBox);
        eleccionMoverAjCheckBox.setText("Mover a Casilla");
        eleccionMoverAjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionMoverAjCheckBoxActionPerformed(evt);
            }
        });
        containerEleccionAccionesjPanel.add(eleccionMoverAjCheckBox);

        accionesTarjetabuttonGroup.add(eleccionPerderTurnojCheckBox);
        eleccionPerderTurnojCheckBox.setText("Perder Turno");
        eleccionPerderTurnojCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionPerderTurnojCheckBoxActionPerformed(evt);
            }
        });
        containerEleccionAccionesjPanel.add(eleccionPerderTurnojCheckBox);

        accionesTarjetabuttonGroup.add(eleccionSalgaCarceljCheckBox);
        eleccionSalgaCarceljCheckBox.setText("Salga de la Carcel");
        eleccionSalgaCarceljCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionSalgaCarceljCheckBoxActionPerformed(evt);
            }
        });
        containerEleccionAccionesjPanel.add(eleccionSalgaCarceljCheckBox);

        accionesTarjetabuttonGroup.add(eleccionVayaCarceljCheckBox);
        eleccionVayaCarceljCheckBox.setText("Vaya a la Carcel");
        eleccionVayaCarceljCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionVayaCarceljCheckBoxActionPerformed(evt);
            }
        });
        containerEleccionAccionesjPanel.add(eleccionVayaCarceljCheckBox);

        accionesTarjetabuttonGroup.add(eleccionTarjetaPersojCheckBox);
        eleccionTarjetaPersojCheckBox.setText("Tarjeta Personalizada");
        eleccionTarjetaPersojCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionTarjetaPersojCheckBoxActionPerformed(evt);
            }
        });
        containerEleccionAccionesjPanel.add(eleccionTarjetaPersojCheckBox);

        getContentPane().add(containerEleccionAccionesjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 280, 150));

        textoAccionesTarjetasjLabel.setFont(new java.awt.Font("DialogInput", 1, 38)); // NOI18N
        textoAccionesTarjetasjLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoAccionesTarjetasjLabel.setText("Acciones Tarjetas");
        getContentPane().add(textoAccionesTarjetasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 400, 80));

        tarjetasDisponiblesjTextField.setEditable(false);
        tarjetasDisponiblesjTextField.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        getContentPane().add(tarjetasDisponiblesjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 50, -1));

        textoElegirAccionjLabel.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        textoElegirAccionjLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoElegirAccionjLabel.setText("Elegir Accion");
        containerTextoElegirjPanel.add(textoElegirAccionjLabel);

        getContentPane().add(containerTextoElegirjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 230, 30));

        checkjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.png"))); // NOI18N
        checkjButton.setContentAreaFilled(false);
        checkjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(checkjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 490, 70, 70));

        premioEjemplojTextArea.setEditable(false);
        premioEjemplojTextArea.setColumns(20);
        premioEjemplojTextArea.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        premioEjemplojTextArea.setRows(5);
        premioEjemplojTextArea.setText("Ejemplo: “​ Usted ha\nganado el 2do lugar\nen un concurso\nde belleza, recibe un\npremio de Q125.00”.");
        premioContainerjScrollPane.setViewportView(premioEjemplojTextArea);

        getContentPane().add(premioContainerjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 230, 140));
        premioContainerjScrollPane.setVisible(false);

        pagoAJugadoresEjemplojTextArea.setEditable(false);
        pagoAJugadoresEjemplojTextArea.setColumns(20);
        pagoAJugadoresEjemplojTextArea.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        pagoAJugadoresEjemplojTextArea.setRows(5);
        pagoAJugadoresEjemplojTextArea.setText("“​Usted hoy se siente\nmuy bondadoso,\ny decide premiar\na sus contrincantes,\ndandole a cada\nuno Q25.00” ​.");
        pagoContainerjScrollPane.setViewportView(pagoAJugadoresEjemplojTextArea);

        getContentPane().add(pagoContainerjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 230, 140));
        pagoContainerjScrollPane.setVisible(false);

        perderTurnoEjemplojTextArea.setEditable(false);
        perderTurnoEjemplojTextArea.setColumns(20);
        perderTurnoEjemplojTextArea.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        perderTurnoEjemplojTextArea.setRows(5);
        perderTurnoEjemplojTextArea.setText("​ “Hoy ha chocado\nel auto, por lo que\nno puede avanzar\n(Pierde un turno)”.");
        perderTurnoContainerjScrollPane.setViewportView(perderTurnoEjemplojTextArea);

        getContentPane().add(perderTurnoContainerjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 230, 140));
        perderTurnoContainerjScrollPane.setVisible(false);

        tarjetaPersonalizadaEjemplojTextArea.setEditable(false);
        tarjetaPersonalizadaEjemplojTextArea.setColumns(20);
        tarjetaPersonalizadaEjemplojTextArea.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        tarjetaPersonalizadaEjemplojTextArea.setRows(5);
        tarjetaPersonalizadaEjemplojTextArea.setText("Esta tarjeta permite\nla mezcla de las tarjetas\n1 a la 6 y la de vaya\na la carcel, para crear\ntarjetas con acciones\nmás avanzadas.\nEj: “​Usted a enfermado\npor lo que pierde\nun turno, a lo que su\naseguradora le extiende\nun bono de Q200.00 ” ​ .");
        tarjetaPersonalizadaContainerjScrollPane.setViewportView(tarjetaPersonalizadaEjemplojTextArea);

        getContentPane().add(tarjetaPersonalizadaContainerjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 230, 140));
        tarjetaPersonalizadaContainerjScrollPane.setVisible(false);

        moverACasillaEjemplojTextArea.setEditable(false);
        moverACasillaEjemplojTextArea.setColumns(20);
        moverACasillaEjemplojTextArea.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        moverACasillaEjemplojTextArea.setRows(5);
        moverACasillaEjemplojTextArea.setText("​Ejemplo:  “Hoy ha\nhallado un buen\nsamaritano\ny lo lleva al inicio\ndel juego”.");
        moverAContainerjScrollPane.setViewportView(moverACasillaEjemplojTextArea);

        getContentPane().add(moverAContainerjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 230, 140));
        moverAContainerjScrollPane.setVisible(false);

        multaEjemplojTextArea.setEditable(false);
        multaEjemplojTextArea.setColumns(20);
        multaEjemplojTextArea.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        multaEjemplojTextArea.setRows(5);
        multaEjemplojTextArea.setText("Ejemplo: “​ En su último\nviaje daño una reliquia\nMaya, por lo que debe\npagar unamulta\nde Q300.00 ” ​");
        multaContainerjScrollPane.setViewportView(multaEjemplojTextArea);

        getContentPane().add(multaContainerjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 230, 140));
        multaContainerjScrollPane.setVisible(false);

        noCrearTarjetasjSpinner.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        noCrearTarjetasjSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(noCrearTarjetasjSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 80, 50));

        textoNoCopiasjLabel.setFont(new java.awt.Font("DialogInput", 1, 30)); // NOI18N
        textoNoCopiasjLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoNoCopiasjLabel.setText("No. Copias");
        getContentPane().add(textoNoCopiasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 200, 30));

        textoEnTarjetajPanel.setLayout(new java.awt.BorderLayout());

        textoTextoEnTarjetajLabel.setFont(new java.awt.Font("DialogInput", 1, 30)); // NOI18N
        textoTextoEnTarjetajLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoTextoEnTarjetajLabel.setText("    Texto en Tarjeta");
        textoEnTarjetajPanel.add(textoTextoEnTarjetajLabel, java.awt.BorderLayout.CENTER);

        ingresarTextoTarjetajTextField.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        ingresarTextoTarjetajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresarTextoTarjetajTextFieldKeyTyped(evt);
            }
        });
        textoEnTarjetajPanel.add(ingresarTextoTarjetajTextField, java.awt.BorderLayout.SOUTH);

        getContentPane().add(textoEnTarjetajPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 450, 90));

        agregarjButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        agregarjButton.setText("Agregar");
        agregarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(agregarjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 140, 50));
        agregarjButton.setEnabled(false);

        caminarConsejojTextArea.setEditable(false);
        caminarConsejojTextArea.setColumns(20);
        caminarConsejojTextArea.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        caminarConsejojTextArea.setRows(5);
        caminarConsejojTextArea.setText("NOTA: Ingrese la palabra\nclave \"Felicidades\" o\n\"Mala Suerte\" para\nactivar las funciones. \nLuego poner la cantidad\nde casillas a mover.");
        consejoCaminarContainerjScrollPane.setViewportView(caminarConsejojTextArea);

        getContentPane().add(consejoCaminarContainerjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 250, 170));
        consejoCaminarContainerjScrollPane.setVisible(false);

        caminarNoCasillasContainerjPanel.setLayout(new java.awt.BorderLayout());

        textoCasillasAvanzarjLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textoCasillasAvanzarjLabel.setText("   Casillas para retroceder/avanzar");
        caminarNoCasillasContainerjPanel.add(textoCasillasAvanzarjLabel, java.awt.BorderLayout.CENTER);

        noCasillasDesplazarsejSpinner.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        caminarNoCasillasContainerjPanel.add(noCasillasDesplazarsejSpinner, java.awt.BorderLayout.EAST);
        noCasillasDesplazarsejSpinner.setEnabled(false);

        getContentPane().add(caminarNoCasillasContainerjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 450, 50));
        caminarNoCasillasContainerjPanel.setVisible(false);

        premioCantDineroContainerjPanel.setLayout(new javax.swing.BoxLayout(premioCantDineroContainerjPanel, javax.swing.BoxLayout.LINE_AXIS));

        textoCantidadDineroPremiojLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textoCantidadDineroPremiojLabel.setText("Premio a obtener  Q");
        premioCantDineroContainerjPanel.add(textoCantidadDineroPremiojLabel);

        cantidadDineroPremiojSpinner.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cantidadDineroPremiojSpinner.setModel(new javax.swing.SpinnerNumberModel(125, 1, null, 25));
        premioCantDineroContainerjPanel.add(cantidadDineroPremiojSpinner);

        getContentPane().add(premioCantDineroContainerjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 310, 50));
        premioCantDineroContainerjPanel.setVisible(false);

        multaDineroContainerjPanel.setLayout(new javax.swing.BoxLayout(multaDineroContainerjPanel, javax.swing.BoxLayout.LINE_AXIS));

        textoDineroMultajLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textoDineroMultajLabel.setText("Dinero a pagar  Q");
        multaDineroContainerjPanel.add(textoDineroMultajLabel);

        cantDineroMultajSpinner.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cantDineroMultajSpinner.setModel(new javax.swing.SpinnerNumberModel(300, 1, null, 50));
        multaDineroContainerjPanel.add(cantDineroMultajSpinner);

        getContentPane().add(multaDineroContainerjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 270, 50));
        multaDineroContainerjPanel.setVisible(false);

        pagoAJugadoresDineroContainerjPanel.setLayout(new javax.swing.BoxLayout(pagoAJugadoresDineroContainerjPanel, javax.swing.BoxLayout.LINE_AXIS));

        textoDineroCadaJugadorjLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textoDineroCadaJugadorjLabel.setText("Dinero para cada jugador");
        pagoAJugadoresDineroContainerjPanel.add(textoDineroCadaJugadorjLabel);

        cantidadDineroParaJugadoresjSpinner.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cantidadDineroParaJugadoresjSpinner.setModel(new javax.swing.SpinnerNumberModel(25, 1, null, 10));
        pagoAJugadoresDineroContainerjPanel.add(cantidadDineroParaJugadoresjSpinner);

        getContentPane().add(pagoAJugadoresDineroContainerjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 370, 50));
        pagoAJugadoresDineroContainerjPanel.setVisible(false);

        elegirDestinoPropiedadjComboBox.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        getContentPane().add(elegirDestinoPropiedadjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 320, 50));
        elegirDestinoPropiedadjComboBox.setVisible(false);

        elegirDestinoTipoCasillajComboBox.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        getContentPane().add(elegirDestinoTipoCasillajComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 320, 50));
        elegirDestinoTipoCasillajComboBox.setVisible(false);

        moverAConsejojTextArea.setEditable(false);
        moverAConsejojTextArea.setColumns(20);
        moverAConsejojTextArea.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        moverAConsejojTextArea.setRows(5);
        moverAConsejojTextArea.setText("NOTA: Ingrese la palabra\nclave \"mas cercano\"\npara saltar a dicha casilla\no \"avance hasta\" o \"avance\na\", para especificar\nel lugar de destino.\n");
        consejoMoverAContainerjScrollPane.setViewportView(moverAConsejojTextArea);

        getContentPane().add(consejoMoverAContainerjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 250, 150));
        consejoMoverAContainerjScrollPane.setVisible(false);

        turnosPerdidosContainerjPanel.setLayout(new javax.swing.BoxLayout(turnosPerdidosContainerjPanel, javax.swing.BoxLayout.LINE_AXIS));

        textoNumeroTurnosPerdidosjLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textoNumeroTurnosPerdidosjLabel.setText("Numero Turnos a Perder");
        turnosPerdidosContainerjPanel.add(textoNumeroTurnosPerdidosjLabel);

        noTurnosAPerderjSpinner.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        noTurnosAPerderjSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        turnosPerdidosContainerjPanel.add(noTurnosAPerderjSpinner);

        getContentPane().add(turnosPerdidosContainerjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 350, 50));
        turnosPerdidosContainerjPanel.setVisible(false);

        salirCarcelConsejojTextArea.setColumns(20);
        salirCarcelConsejojTextArea.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        salirCarcelConsejojTextArea.setRows(5);
        salirCarcelConsejojTextArea.setText("Elige el numero de \ntarjetas de salir a la\ncarcel a su conveniencia.");
        salirCarcelContainerjScrollPane.setViewportView(salirCarcelConsejojTextArea);

        getContentPane().add(salirCarcelContainerjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 450, 130));
        salirCarcelContainerjScrollPane.setVisible(false);

        vayaCarcelConsejojTextArea.setColumns(20);
        vayaCarcelConsejojTextArea.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        vayaCarcelConsejojTextArea.setRows(5);
        vayaCarcelConsejojTextArea.setText("Escoja la cantidad de \ncartas a crear de vaya\na la carcel.");
        vayaACarcelContainerjScrollPane.setViewportView(vayaCarcelConsejojTextArea);

        getContentPane().add(vayaACarcelContainerjScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 330, 130));
        vayaACarcelContainerjScrollPane.setVisible(false);

        textoTarjetasDisponiblesjLabel.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        textoTarjetasDisponiblesjLabel.setForeground(new java.awt.Color(0, 0, 0));
        textoTarjetasDisponiblesjLabel.setText("Tarjetas Disponibles");
        getContentPane().add(textoTarjetasDisponiblesjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        fondoAccionesTarjetasjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/monopoly-tablero.jpg"))); // NOI18N
        getContentPane().add(fondoAccionesTarjetasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grupoActualjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_grupoActualjComboBoxItemStateChanged
        tarjetasDisponiblesjTextField.setText(Integer.toString(numeroTarjetasGrupo[grupoActualjComboBox.getSelectedIndex()]));
    }//GEN-LAST:event_grupoActualjComboBoxItemStateChanged

    private boolean espaciosLibres(){
        for (int i = 0; i < numeroTarjetasGrupo.length; i++) {
            if (numeroTarjetasGrupo[i] > 0) {
                return true;
            }
        }
        return false;
    }
    
    private void checkjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkjButtonActionPerformed
        if (espaciosLibres()) {
            crear.mensajeError("Todavia hay espacios por llenar");
        }
        this.setVisible(false);
    }//GEN-LAST:event_checkjButtonActionPerformed

    private void limitesJSpinnerCaminar(String setLimites) {
        if (setLimites.contains("Felicidades") || setLimites.contains("felicidades")) {
            noCasillasDesplazarsejSpinner.setEnabled(true);
            noCasillasDesplazarsejSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        } else if (setLimites.contains("Mala Suerte") || setLimites.contains("mala suerte")) {
            noCasillasDesplazarsejSpinner.setEnabled(true);
            noCasillasDesplazarsejSpinner.setModel(new javax.swing.SpinnerNumberModel(-1, null, -1, 1));
        } else {
            noCasillasDesplazarsejSpinner.setEnabled(false);
        }
    }

    private void activarDestinos(String setLimites) {
        if (setLimites.contains("mas cercano")) {
            elegirDestinoTipoCasillajComboBox.setVisible(true);
            elegirDestinoPropiedadjComboBox.setVisible(false);
        } else if (setLimites.contains("avance hasta") || setLimites.contains("avance a")) {
            elegirDestinoTipoCasillajComboBox.setVisible(false);
            elegirDestinoPropiedadjComboBox.setVisible(true);
        } else {
            elegirDestinoTipoCasillajComboBox.setVisible(false);
            elegirDestinoPropiedadjComboBox.setVisible(false);
        }
    }

    private void ingresarTextoTarjetajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresarTextoTarjetajTextFieldKeyTyped
        crear.validarSoloLetras(evt, "Solo se admiten letras para la accion");
        String setLimites = ingresarTextoTarjetajTextField.getText();

        if (eleccionCaminarjCheckBox.isSelected()) {
            limitesJSpinnerCaminar(setLimites);
        } else if (eleccionMoverAjCheckBox.isSelected()) {
            activarDestinos(setLimites);
        }


    }//GEN-LAST:event_ingresarTextoTarjetajTextFieldKeyTyped


    private void eleccionCaminarjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionCaminarjCheckBoxActionPerformed
        agregarjButton.setEnabled(true);
        mostrarElementosCaminar();
        ocultarElementosPremio();
        ocultarElementosMulta();
        ocultarElementosPagoJugadores();
        ocultarElementosMoverA();
        ocultarElementosPerderTurno();
        ocultarElementosSalgaCarcel();
        ocultarElementosVayaCarcel();
    }//GEN-LAST:event_eleccionCaminarjCheckBoxActionPerformed

    private void eleccionPremiojCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionPremiojCheckBoxActionPerformed
        agregarjButton.setEnabled(true);
        ocultarElementosCaminar();
        mostrarElementosPremio();
        ocultarElementosMulta();
        ocultarElementosPagoJugadores();
        ocultarElementosMoverA();
        ocultarElementosPerderTurno();
        ocultarElementosSalgaCarcel();
        ocultarElementosVayaCarcel();
    }//GEN-LAST:event_eleccionPremiojCheckBoxActionPerformed

    private void agregarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarjButtonActionPerformed

        if (numeroTarjetasGrupo[grupoActualjComboBox.getSelectedIndex()] == 0) {
            crear.mensajeError("Ya no hay tarjetas disponibles");

        } else if ((Integer) noCrearTarjetasjSpinner.getValue() > numeroTarjetasGrupo[grupoActualjComboBox.getSelectedIndex()]) {
            crear.mensajeError("Cantidad excedente de tarjetas");
            
        } else {
            grupoTarjeta = administrador.getGruposTarjeta()[grupoActualjComboBox.getSelectedIndex()];
            TarjetaTomeTarjeta[] tarjetasNuevas = new TarjetaTomeTarjeta[(Integer) noCrearTarjetasjSpinner.getValue()];

            if (eleccionCaminarjCheckBox.isSelected()) {
                if (!estanHabilitados()) {
                    crear.mensajeError("No estan habilitados los objetos correspondientes");
                } else {
                    agregarTarjetasCaminar(tarjetasNuevas);
                }

            } else if (eleccionPremiojCheckBox.isSelected()) {
                agregarTarjetasPremio(tarjetasNuevas);

            } else if (eleccionMultajCheckBox.isSelected()) {
                agregarTarjetasMulta(tarjetasNuevas);

            } else if (eleccionPagoPlayersjCheckBox.isSelected()) {
                agregarTarjetasPagoJugadores(tarjetasNuevas);

            } else if (eleccionMoverAjCheckBox.isSelected()) {
                if (!estanHabilitados()) {
                    crear.mensajeError("No estan habilitados los objetos correspondientes");
                } else {
                    agregarTarjetasMoverA(tarjetasNuevas);
                }

            } else if (eleccionPerderTurnojCheckBox.isSelected()) {
                agregarTarjetasPerderTurno(tarjetasNuevas);

            } else if (eleccionSalgaCarceljCheckBox.isSelected()) {
                agregarTarjetasSalgaCarcel(tarjetasNuevas);

            } else if (eleccionVayaCarceljCheckBox.isSelected()) {
                agregarTarjetasVayaACarcel(tarjetasNuevas);

            } else if (eleccionTarjetaPersojCheckBox.isSelected()) {

            }

            if (avanzar) {
                manejadorTomaTarjeta.agregarTarjetas(tarjetasNuevas, grupoTarjeta);

                int tarjetasDisponibles = numeroTarjetasGrupo[grupoActualjComboBox.getSelectedIndex()];
                int cantidadActual = tarjetasDisponibles - (Integer) noCrearTarjetasjSpinner.getValue();
                numeroTarjetasGrupo[grupoActualjComboBox.getSelectedIndex()] = cantidadActual;
                tarjetasDisponiblesjTextField.setText(Integer.toString(cantidadActual));

                ingresarTextoTarjetajTextField.setText("");
                avanzar = false;
            }
        }

    }//GEN-LAST:event_agregarjButtonActionPerformed

    private boolean existenciaTexto() {
        return !ingresarTextoTarjetajTextField.getText().isEmpty();
    }

    private boolean estanHabilitados() {
        if (eleccionCaminarjCheckBox.isSelected()) {
            return noCasillasDesplazarsejSpinner.isEnabled();
        } else {
            return elegirDestinoPropiedadjComboBox.isVisible() || elegirDestinoTipoCasillajComboBox.isVisible();
        }
    }

    private void agregarTarjetasCaminar(TarjetaTomeTarjeta[] tarjetasNuevas) {

        if (existenciaTexto()) {
            int contador = 0;
            do {
                textoEnTarjeta = ingresarTextoTarjetajTextField.getText().trim();
                int noCasillasMoverse = (Integer) noCasillasDesplazarsejSpinner.getValue();
                Caminar caminar = new Caminar(textoEnTarjeta, grupoTarjeta, noCasillasMoverse);
                tarjetasNuevas[contador] = caminar;
                contador++;
            } while (contador < tarjetasNuevas.length);
            avanzar = true;
        } else {
            crear.mensajeError("No hay nada escrito");
        }
    }

    private void agregarTarjetasPremio(TarjetaTomeTarjeta[] tarjetasNuevas) {
        if (existenciaTexto()) {
            int contador = 0;
            do {
                textoEnTarjeta = ingresarTextoTarjetajTextField.getText().trim();
                int dineroPremio = (Integer) cantidadDineroPremiojSpinner.getValue();
                Premio premio = new Premio(textoEnTarjeta, grupoTarjeta, dineroPremio);
                tarjetasNuevas[contador] = premio;
                contador++;
            } while (contador < tarjetasNuevas.length);
            avanzar = true;
        } else {
            crear.mensajeError("No hay ningun texto");
        }
    }

    private void agregarTarjetasMulta(TarjetaTomeTarjeta[] tarjetasNuevas) {
        if (existenciaTexto()) {
            int contador = 0;
            do {
                textoEnTarjeta = ingresarTextoTarjetajTextField.getText().trim();
                int dineroMulta = (Integer) cantDineroMultajSpinner.getValue();
                Multa multa = new Multa(textoEnTarjeta, grupoTarjeta, dineroMulta);
                tarjetasNuevas[contador] = multa;
                contador++;
            } while (contador < tarjetasNuevas.length);
            avanzar = true;
        } else {
            crear.mensajeError("No hay ningun texto");
        }
    }

    private void agregarTarjetasPagoJugadores(TarjetaTomeTarjeta[] tarjetasNuevas) {
        if (existenciaTexto()) {
            int contador = 0;
            do {
                textoEnTarjeta = ingresarTextoTarjetajTextField.getText().trim();
                int dineroPagoJugadores = (Integer) cantDineroMultajSpinner.getValue();
                PagoAJugadores pagoJugadores = new PagoAJugadores(textoEnTarjeta, grupoTarjeta, dineroPagoJugadores);
                tarjetasNuevas[contador] = pagoJugadores;
                contador++;
            } while (contador < tarjetasNuevas.length);
            avanzar = true;
        } else {
            crear.mensajeError("No hay nada escrito");
        }
    }

    private void agregarTarjetasMoverA(TarjetaTomeTarjeta[] tarjetasNuevas) {
        if (elegirDestinoPropiedadjComboBox.isVisible() || elegirDestinoTipoCasillajComboBox.isVisible()) {
            int aux = 0;
            do {
                String eleccion = "";
                textoEnTarjeta = ingresarTextoTarjetajTextField.getText().trim();

                if (elegirDestinoPropiedadjComboBox.isVisible()) {
                    eleccion = elegirDestinoPropiedadjComboBox.getSelectedItem().toString();

                } else if (elegirDestinoTipoCasillajComboBox.isVisible()) {
                    eleccion = elegirDestinoTipoCasillajComboBox.getSelectedItem().toString();
                }

                MoverACasilla moverA = new MoverACasilla(textoEnTarjeta, grupoTarjeta, eleccion);
                tarjetasNuevas[aux] = moverA;
                aux++;
            } while (aux < tarjetasNuevas.length);
            avanzar = true;
        }
    }

    private void agregarTarjetasPerderTurno(TarjetaTomeTarjeta[] tarjetasNuevas) {
        if (existenciaTexto()) {
            int aux = 0;
            do {
                textoEnTarjeta = ingresarTextoTarjetajTextField.getText().trim();
                int turnosPerder = (Integer) noTurnosAPerderjSpinner.getValue();
                PerderTurno perderTurno = new PerderTurno(textoEnTarjeta, grupoTarjeta, turnosPerder);
                tarjetasNuevas[aux] = perderTurno;
                aux++;
            } while (aux < tarjetasNuevas.length);
            avanzar = true;
        } else {
            crear.mensajeError("No hay nada escrito");
        }
    }

    private void agregarTarjetasSalgaCarcel(TarjetaTomeTarjeta[] tarjetasNuevas) {
        int auxiliar = 0;
        do {
            String textoEnTarjeta = textoSalgaCarcel();
            tarjetasNuevas[auxiliar] = new SalgaCarcel(textoEnTarjeta, grupoTarjeta);
            auxiliar++;
        } while (auxiliar < tarjetasNuevas.length);
        avanzar = true;
    }

    private void agregarTarjetasVayaACarcel(TarjetaTomeTarjeta[] tarjetasNuevas) {
        int auxiliar = 0;
        do {
            String textoEnTarjeta = textoVayaCarcel();
            tarjetasNuevas[auxiliar] = new SalgaCarcel(textoEnTarjeta, grupoTarjeta);
            auxiliar++;
        } while (auxiliar < tarjetasNuevas.length);
        avanzar = true;
    }


    private void eleccionMultajCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionMultajCheckBoxActionPerformed
        agregarjButton.setEnabled(true);
        ocultarElementosCaminar();
        ocultarElementosPremio();
        mostrarElementosMulta();
        ocultarElementosPagoJugadores();
        ocultarElementosMoverA();
        ocultarElementosPerderTurno();
        ocultarElementosSalgaCarcel();
        ocultarElementosVayaCarcel();
    }//GEN-LAST:event_eleccionMultajCheckBoxActionPerformed

    private void eleccionPagoPlayersjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionPagoPlayersjCheckBoxActionPerformed
        agregarjButton.setEnabled(true);
        ocultarElementosCaminar();
        ocultarElementosPremio();
        ocultarElementosMulta();
        mostrarElementosPagoJugadores();
        ocultarElementosMoverA();
        ocultarElementosPerderTurno();
        ocultarElementosVayaCarcel();
    }//GEN-LAST:event_eleccionPagoPlayersjCheckBoxActionPerformed

    private void eleccionMoverAjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionMoverAjCheckBoxActionPerformed
        agregarjButton.setEnabled(true);
        ocultarElementosCaminar();
        ocultarElementosPremio();
        ocultarElementosMulta();
        ocultarElementosPagoJugadores();
        mostrarElementosMoverA();
        ocultarElementosPerderTurno();
        ocultarElementosSalgaCarcel();
        ocultarElementosVayaCarcel();
    }//GEN-LAST:event_eleccionMoverAjCheckBoxActionPerformed

    private void eleccionPerderTurnojCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionPerderTurnojCheckBoxActionPerformed
        agregarjButton.setEnabled(true);
        ocultarElementosCaminar();
        ocultarElementosPremio();
        ocultarElementosMulta();
        ocultarElementosPagoJugadores();
        ocultarElementosMoverA();
        mostrarElementosPerderTurno();
        ocultarElementosSalgaCarcel();
        ocultarElementosVayaCarcel();
    }//GEN-LAST:event_eleccionPerderTurnojCheckBoxActionPerformed

    private void eleccionSalgaCarceljCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionSalgaCarceljCheckBoxActionPerformed
        agregarjButton.setEnabled(true);
        ocultarElementosCaminar();
        ocultarElementosPremio();
        ocultarElementosMulta();
        ocultarElementosPagoJugadores();
        ocultarElementosMoverA();
        ocultarElementosPerderTurno();
        mostrarElementosSalgaCarcel();
        ocultarElementosVayaCarcel();
    }//GEN-LAST:event_eleccionSalgaCarceljCheckBoxActionPerformed

    private void eleccionVayaCarceljCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionVayaCarceljCheckBoxActionPerformed
        agregarjButton.setEnabled(true);
        ocultarElementosCaminar();
        ocultarElementosPremio();
        ocultarElementosMulta();
        ocultarElementosPagoJugadores();
        ocultarElementosMoverA();
        ocultarElementosPerderTurno();
        ocultarElementosSalgaCarcel();
        mostrarElementosVayaCarcel();
    }//GEN-LAST:event_eleccionVayaCarceljCheckBoxActionPerformed

    private void eleccionTarjetaPersojCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionTarjetaPersojCheckBoxActionPerformed
        agregarjButton.setEnabled(true);
    }//GEN-LAST:event_eleccionTarjetaPersojCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup accionesTarjetabuttonGroup;
    private javax.swing.JButton agregarjButton;
    private javax.swing.JTextArea caminarConsejojTextArea;
    private javax.swing.JScrollPane caminarContainerjScrollPane;
    private javax.swing.JTextArea caminarEjemplojTextArea;
    private javax.swing.JPanel caminarNoCasillasContainerjPanel;
    private javax.swing.JSpinner cantDineroMultajSpinner;
    private javax.swing.JSpinner cantidadDineroParaJugadoresjSpinner;
    private javax.swing.JSpinner cantidadDineroPremiojSpinner;
    private javax.swing.JButton checkjButton;
    private javax.swing.JScrollPane consejoCaminarContainerjScrollPane;
    private javax.swing.JScrollPane consejoMoverAContainerjScrollPane;
    private javax.swing.JPanel containerEleccionAccionesjPanel;
    private javax.swing.JPanel containerTextoElegirjPanel;
    private javax.swing.JCheckBox eleccionCaminarjCheckBox;
    private javax.swing.JCheckBox eleccionMoverAjCheckBox;
    private javax.swing.JCheckBox eleccionMultajCheckBox;
    private javax.swing.JCheckBox eleccionPagoPlayersjCheckBox;
    private javax.swing.JCheckBox eleccionPerderTurnojCheckBox;
    private javax.swing.JCheckBox eleccionPremiojCheckBox;
    private javax.swing.JCheckBox eleccionSalgaCarceljCheckBox;
    private javax.swing.JCheckBox eleccionTarjetaPersojCheckBox;
    private javax.swing.JCheckBox eleccionVayaCarceljCheckBox;
    private javax.swing.JComboBox<String> elegirDestinoPropiedadjComboBox;
    private javax.swing.JComboBox<String> elegirDestinoTipoCasillajComboBox;
    private javax.swing.JLabel fondoAccionesTarjetasjLabel;
    private javax.swing.JComboBox<String> grupoActualjComboBox;
    private javax.swing.JTextField ingresarTextoTarjetajTextField;
    private javax.swing.JTextArea moverACasillaEjemplojTextArea;
    private javax.swing.JTextArea moverAConsejojTextArea;
    private javax.swing.JScrollPane moverAContainerjScrollPane;
    private javax.swing.JScrollPane multaContainerjScrollPane;
    private javax.swing.JPanel multaDineroContainerjPanel;
    private javax.swing.JTextArea multaEjemplojTextArea;
    private javax.swing.JSpinner noCasillasDesplazarsejSpinner;
    private javax.swing.JSpinner noCrearTarjetasjSpinner;
    private javax.swing.JSpinner noTurnosAPerderjSpinner;
    private javax.swing.JPanel pagoAJugadoresDineroContainerjPanel;
    private javax.swing.JTextArea pagoAJugadoresEjemplojTextArea;
    private javax.swing.JScrollPane pagoContainerjScrollPane;
    private javax.swing.JScrollPane perderTurnoContainerjScrollPane;
    private javax.swing.JTextArea perderTurnoEjemplojTextArea;
    private javax.swing.JPanel premioCantDineroContainerjPanel;
    private javax.swing.JScrollPane premioContainerjScrollPane;
    private javax.swing.JTextArea premioEjemplojTextArea;
    private javax.swing.JTextArea salirCarcelConsejojTextArea;
    private javax.swing.JScrollPane salirCarcelContainerjScrollPane;
    private javax.swing.JScrollPane tarjetaPersonalizadaContainerjScrollPane;
    private javax.swing.JTextArea tarjetaPersonalizadaEjemplojTextArea;
    private javax.swing.JTextField tarjetasDisponiblesjTextField;
    private javax.swing.JLabel textoAccionesTarjetasjLabel;
    private javax.swing.JLabel textoCantidadDineroPremiojLabel;
    private javax.swing.JLabel textoCasillasAvanzarjLabel;
    private javax.swing.JLabel textoDineroCadaJugadorjLabel;
    private javax.swing.JLabel textoDineroMultajLabel;
    private javax.swing.JLabel textoElegirAccionjLabel;
    private javax.swing.JPanel textoEnTarjetajPanel;
    private javax.swing.JLabel textoNoCopiasjLabel;
    private javax.swing.JLabel textoNumeroTurnosPerdidosjLabel;
    private javax.swing.JLabel textoSeleccioneGrupojLabel;
    private javax.swing.JLabel textoTarjetasDisponiblesjLabel;
    private javax.swing.JLabel textoTextoEnTarjetajLabel;
    private javax.swing.JPanel turnosPerdidosContainerjPanel;
    private javax.swing.JScrollPane vayaACarcelContainerjScrollPane;
    private javax.swing.JTextArea vayaCarcelConsejojTextArea;
    // End of variables declaration//GEN-END:variables
}
