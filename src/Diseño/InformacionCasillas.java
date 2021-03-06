/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseño;

import AdministradorGrupos.*;
import java.awt.Color;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author joel
 */
public class InformacionCasillas extends javax.swing.JDialog implements Serializable{

    private AdministradorGruposTomeTarjeta administradorGrupos;
    private AdministradorGruposLugar adminGrupoLugar;
    private CrearTablero crearTablero;
    private GrupoLugar[] grupoLugar;
    private GrupoTarjeta[] grupoTarjeta;
    private Color colorGrupo = null;
    private Color colorTarjetas = null;
    private DefaultComboBoxModel defaultComboLugar = new DefaultComboBoxModel();
    private DefaultComboBoxModel defaultComboTarjeta = new DefaultComboBoxModel();

    Icon warningIcon = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MonopolyConfundido.png"));
    private int auxGrupoTarjeta = 0;
    private int auxGrupoLugar = 0;
    private int casillasDisponibles;
    private int limiteGrupos;
    private int limiteTomeTarjeta;


    /**
     *
     * @param crearTablero
     * @param modal
     */
    public InformacionCasillas(CrearTablero crearTablero, boolean modal) {
        super(crearTablero, modal);
        initComponents();
        this.crearTablero = crearTablero;
        administradorGrupos = new AdministradorGruposTomeTarjeta();
        adminGrupoLugar = new AdministradorGruposLugar();

    }

    public void setCasillasDisponibles(int casillasDisponibles) {
        this.casillasDisponibles = casillasDisponibles;
        limitesJspiners();
        CasillasTotalesjTextField.setText(Integer.toString(casillasDisponibles));

    }

    private void agregarLugar(String nombreL) {
        defaultComboLugar.addElement(nombreL);
        grupoLugarjComboBox.setModel(defaultComboLugar);
    }

    private void agregarGrupo(String nombreG) {
        defaultComboTarjeta.addElement(nombreG);
        grupoTarjetajComboBox.setModel(defaultComboTarjeta);
    }

    private void mensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje,
                "ALERTA", JOptionPane.INFORMATION_MESSAGE, warningIcon);
    }

    /**
     * Limitar para que pueda haber
     */
    public void limitesJspiners() {
        if (casillasDisponibles == 1 || casillasDisponibles == 2) {
            limiteGrupos = 1;
            noGruposTomeTarjetajSpinner.setEnabled(false);
            seletColorTarjetajButton.setEnabled(false);
            gruposLugarjSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, limiteGrupos, 1));
        } else if (casillasDisponibles > 2) {
            limiteGrupos = casillasDisponibles / 2;
            limiteTomeTarjeta = casillasDisponibles / 2;
            gruposLugarjSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, limiteGrupos, 1));
            noGruposTomeTarjetajSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, limiteTomeTarjeta, 1));

        }
    }

    private int valorJSpinnerGruposL() {
        return (Integer) gruposLugarjSpinner.getValue();
    }

    private int valorJSpinnerTarjetas() {
        return (Integer) noGruposTomeTarjetajSpinner.getValue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoPropiedadesjLabel = new javax.swing.JLabel();
        textoPrecioPorEstacionjLabel = new javax.swing.JLabel();
        textoGruposDeLugarjLabel1 = new javax.swing.JLabel();
        precioCostoEstacionjSpinner = new javax.swing.JSpinner();
        gruposLugarjSpinner = new javax.swing.JSpinner();
        textoTomeTarjetajLabel = new javax.swing.JLabel();
        textoDineroPorVueltajLabel = new javax.swing.JLabel();
        noGruposTomeTarjetajSpinner = new javax.swing.JSpinner();
        grupoLugarjComboBox = new javax.swing.JComboBox<>();
        ingresarGruposLugarjTextField = new javax.swing.JTextField();
        aceptarjButton = new javax.swing.JButton();
        borrarGrupoLugarjButton = new javax.swing.JButton();
        añadirGrupoLugarjButton = new javax.swing.JButton();
        grupoTarjetajComboBox = new javax.swing.JComboBox<>();
        ingresarNombresGrupojTextField = new javax.swing.JTextField();
        añadirGrupoTarjetajButton = new javax.swing.JButton();
        borrarGrupoTarjetajButton = new javax.swing.JButton();
        textoCasillasDisponiblesjLabel = new javax.swing.JLabel();
        CasillasTotalesjTextField = new javax.swing.JTextField();
        textoNotajLabel = new javax.swing.JLabel();
        seletColorGrupojButton = new javax.swing.JButton();
        textoColorTarjetajLabel = new javax.swing.JLabel();
        colorSeleccionadoGrupojPanel = new javax.swing.JPanel();
        textoColorGrupojLabel = new javax.swing.JLabel();
        seletColorTarjetajButton = new javax.swing.JButton();
        colorSeleccionadoTarjetajPanel = new javax.swing.JPanel();
        textoCostoUsoEstacionjLabel = new javax.swing.JLabel();
        costoUsoEstacionjSpinner = new javax.swing.JSpinner();
        textoGruposPropiedadesjLabel = new javax.swing.JLabel();
        fondoInfoCasillasjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1050, 596));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoPropiedadesjLabel.setBackground(new java.awt.Color(204, 204, 255));
        textoPropiedadesjLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        textoPropiedadesjLabel.setForeground(new java.awt.Color(255, 102, 0));
        textoPropiedadesjLabel.setText("Propiedades Estacion");
        textoPropiedadesjLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(textoPropiedadesjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 390, 50));

        textoPrecioPorEstacionjLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoPrecioPorEstacionjLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoPrecioPorEstacionjLabel.setForeground(new java.awt.Color(198, 38, 38));
        textoPrecioPorEstacionjLabel.setText("Precio por cada Estacion");
        textoPrecioPorEstacionjLabel.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(textoPrecioPorEstacionjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, 40));

        textoGruposDeLugarjLabel1.setBackground(new java.awt.Color(255, 255, 255));
        textoGruposDeLugarjLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoGruposDeLugarjLabel1.setForeground(new java.awt.Color(198, 38, 38));
        textoGruposDeLugarjLabel1.setText("¿Cuantos grupos de lugar?");
        textoGruposDeLugarjLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(textoGruposDeLugarjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 320, 40));

        precioCostoEstacionjSpinner.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        precioCostoEstacionjSpinner.setModel(new javax.swing.SpinnerNumberModel(200, 1, null, 50));
        getContentPane().add(precioCostoEstacionjSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 100, 40));

        gruposLugarjSpinner.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        gruposLugarjSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gruposLugarjSpinnerStateChanged(evt);
            }
        });
        getContentPane().add(gruposLugarjSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 100, 40));

        textoTomeTarjetajLabel.setBackground(new java.awt.Color(204, 204, 255));
        textoTomeTarjetajLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        textoTomeTarjetajLabel.setForeground(new java.awt.Color(255, 102, 0));
        textoTomeTarjetajLabel.setText("Toma una tarjeta");
        textoTomeTarjetajLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(textoTomeTarjetajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 300, 40));

        textoDineroPorVueltajLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoDineroPorVueltajLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoDineroPorVueltajLabel.setForeground(new java.awt.Color(198, 38, 38));
        textoDineroPorVueltajLabel.setText("Numero de grupos de tarjeta");
        textoDineroPorVueltajLabel.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(textoDineroPorVueltajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 350, 40));

        noGruposTomeTarjetajSpinner.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        noGruposTomeTarjetajSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                noGruposTomeTarjetajSpinnerStateChanged(evt);
            }
        });
        getContentPane().add(noGruposTomeTarjetajSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 100, 40));

        grupoLugarjComboBox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        grupoLugarjComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                grupoLugarjComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(grupoLugarjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 290, 40));

        ingresarGruposLugarjTextField.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ingresarGruposLugarjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresarGruposLugarjTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(ingresarGruposLugarjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 290, 40));

        aceptarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/complete.png"))); // NOI18N
        aceptarjButton.setContentAreaFilled(false);
        aceptarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(aceptarjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, 110, 110));

        borrarGrupoLugarjButton.setText("Borrar");
        borrarGrupoLugarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarGrupoLugarjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(borrarGrupoLugarjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 90, 40));

        añadirGrupoLugarjButton.setText("Añadir");
        añadirGrupoLugarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirGrupoLugarjButtonActionPerformed(evt);
            }
        });
        getContentPane().add(añadirGrupoLugarjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 100, 40));

        grupoTarjetajComboBox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        grupoTarjetajComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                grupoTarjetajComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(grupoTarjetajComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 290, 40));

        ingresarNombresGrupojTextField.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ingresarNombresGrupojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresarNombresGrupojTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(ingresarNombresGrupojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 290, 40));

        añadirGrupoTarjetajButton.setText("Añadir");
        añadirGrupoTarjetajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirGrupoTarjetajButtonActionPerformed(evt);
            }
        });
        getContentPane().add(añadirGrupoTarjetajButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 100, 40));

        borrarGrupoTarjetajButton.setText("Borrar");
        borrarGrupoTarjetajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarGrupoTarjetajButtonActionPerformed(evt);
            }
        });
        getContentPane().add(borrarGrupoTarjetajButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, 90, 40));

        textoCasillasDisponiblesjLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        textoCasillasDisponiblesjLabel.setForeground(new java.awt.Color(198, 38, 38));
        textoCasillasDisponiblesjLabel.setText("Casillas Disponibles");
        getContentPane().add(textoCasillasDisponiblesjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 240, 40));

        CasillasTotalesjTextField.setEditable(false);
        CasillasTotalesjTextField.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        CasillasTotalesjTextField.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(CasillasTotalesjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 60, 50));

        textoNotajLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textoNotajLabel.setForeground(new java.awt.Color(255, 51, 51));
        textoNotajLabel.setText("<html>Nota: Por cada grupo de lugar creado, se consideran como minimo dos casillas disponibles<html>");
        getContentPane().add(textoNotajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 260, 90));

        seletColorGrupojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paleta-de-color.png"))); // NOI18N
        seletColorGrupojButton.setText("jButton1");
        seletColorGrupojButton.setContentAreaFilled(false);
        seletColorGrupojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seletColorGrupojButtonActionPerformed(evt);
            }
        });
        getContentPane().add(seletColorGrupojButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 100, 90));

        textoColorTarjetajLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textoColorTarjetajLabel.setForeground(new java.awt.Color(255, 0, 0));
        textoColorTarjetajLabel.setText("Color Grupo de Tarjeta");
        getContentPane().add(textoColorTarjetajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 210, 40));

        colorSeleccionadoGrupojPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        getContentPane().add(colorSeleccionadoGrupojPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 100, 50));

        textoColorGrupojLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textoColorGrupojLabel.setForeground(new java.awt.Color(255, 0, 0));
        textoColorGrupojLabel.setText("Color Grupo de Lugar");
        getContentPane().add(textoColorGrupojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 200, 30));

        seletColorTarjetajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paleta-de-color.png"))); // NOI18N
        seletColorTarjetajButton.setText("jButton1");
        seletColorTarjetajButton.setContentAreaFilled(false);
        seletColorTarjetajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seletColorTarjetajButtonActionPerformed(evt);
            }
        });
        getContentPane().add(seletColorTarjetajButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 100, 90));

        colorSeleccionadoTarjetajPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        getContentPane().add(colorSeleccionadoTarjetajPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 100, 50));

        textoCostoUsoEstacionjLabel.setBackground(new java.awt.Color(255, 255, 255));
        textoCostoUsoEstacionjLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        textoCostoUsoEstacionjLabel.setForeground(new java.awt.Color(198, 38, 38));
        textoCostoUsoEstacionjLabel.setText("Costo Uso Estacion");
        textoCostoUsoEstacionjLabel.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(textoCostoUsoEstacionjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 300, 40));

        costoUsoEstacionjSpinner.setFont(new java.awt.Font("Capture it", 1, 24)); // NOI18N
        costoUsoEstacionjSpinner.setModel(new javax.swing.SpinnerNumberModel(25, 1, null, 5));
        getContentPane().add(costoUsoEstacionjSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 100, 40));

        textoGruposPropiedadesjLabel.setBackground(new java.awt.Color(204, 204, 255));
        textoGruposPropiedadesjLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        textoGruposPropiedadesjLabel.setForeground(new java.awt.Color(255, 102, 0));
        textoGruposPropiedadesjLabel.setText("Grupos de Propiedades");
        textoGruposPropiedadesjLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(textoGruposPropiedadesjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 420, 50));

        fondoInfoCasillasjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Monopoly Sonriendo.png"))); // NOI18N
        fondoInfoCasillasjLabel.setRequestFocusEnabled(false);
        getContentPane().add(fondoInfoCasillasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarjButtonActionPerformed
        if (valorJSpinnerGruposL() == 0 && valorJSpinnerTarjetas()==0) {
            crearTablero.mensajeError("No hay informacion");
        }
        else if(valorJSpinnerGruposL() == 0 || valorJSpinnerTarjetas()==0){
            crearTablero.mensajeError("Por favor, llene ambos grupos");
            
        } else if ((valorJSpinnerTarjetas() * 2) + valorJSpinnerGruposL() > casillasDisponibles) {
            mensajeError("Sobrepaso los elementos disponibles. Porfavor,"
                    + " elimine algunos digitos y pruebe de nuevo");
            
        } else if (auxGrupoLugar < (Integer) gruposLugarjSpinner.getValue()
                || auxGrupoTarjeta < (Integer) noGruposTomeTarjetajSpinner.getValue()) {
            mensajeError("Campos incompletos. Porfavor completarlos para avanzar");
            
        } else{
            //Seteo de manejadores y, costo y uso de estacion
            adminGrupoLugar.setGrupoLugar(grupoLugar);
            adminGrupoLugar.setNombresGrupo();
            adminGrupoLugar.setColoresGrupo();
            
            administradorGrupos.setGruposTarjeta(grupoTarjeta);
            administradorGrupos.setNombresGrupos();
            administradorGrupos.setColoresGrupos();
            
            crearTablero.setAdministradores(adminGrupoLugar, administradorGrupos);
            
            crearTablero.setCostoPorEstacion((Integer)precioCostoEstacionjSpinner.getValue());
            crearTablero.setUsoEstacion((Integer)costoUsoEstacionjSpinner.getValue());
            this.setVisible(false);  
        }
        
   
        
    }//GEN-LAST:event_aceptarjButtonActionPerformed
    /**
     * Agrega elementos al comboBox y arreglo de Colores
     *
     * @param evt
     */
    private void añadirGrupoLugarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirGrupoLugarjButtonActionPerformed
        if (auxGrupoLugar < (Integer) gruposLugarjSpinner.getValue()) {
            if (colorGrupo != null) {
                if (ingresarGruposLugarjTextField.getText().trim().isEmpty()) {
                    mensajeError("No hay nada escrito");
                }
                else{
                //IntanciarObjetoTipoGrupoLugar donde nos apoyamos del auxiliar
                agregarLugar(ingresarGruposLugarjTextField.getText().trim());
                grupoLugar[auxGrupoLugar] = new GrupoLugar(ingresarGruposLugarjTextField.getText(), colorGrupo);

                //Reinicio eleccion color y su panel, y aumento de aux
                ingresarGruposLugarjTextField.setText("");
                ingresarGruposLugarjTextField.requestFocus();
                
                auxGrupoLugar++;
                }
            } else {
                mensajeError("No has seleccionado, ningun color para el grupo");
            }
        } else {
            mensajeError("Ya no puede agregar mas elementos");
        }
    }//GEN-LAST:event_añadirGrupoLugarjButtonActionPerformed


    private void añadirGrupoTarjetajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirGrupoTarjetajButtonActionPerformed
        if (auxGrupoTarjeta < (Integer) noGruposTomeTarjetajSpinner.getValue()) {
            if (colorTarjetas != null) {
                if (ingresarNombresGrupojTextField.getText().trim().isEmpty()) {
                    mensajeError("No hay nada escrito.");
                }
                else{
                //Nos apoyamos del aux para llenar en la posicion correcta para instancia de Grupo Tarjeta
                agregarGrupo(ingresarNombresGrupojTextField.getText().trim());
                grupoTarjeta[auxGrupoTarjeta] = new GrupoTarjeta(ingresarNombresGrupojTextField.getText().trim(), colorTarjetas);

                //Reinicio eleccion color y su panel
                ingresarNombresGrupojTextField.setText("");
                ingresarNombresGrupojTextField.requestFocus();
                
                auxGrupoTarjeta++;
                }
            } else {
                mensajeError("No has seleccionado, ningun color para el grupo de tarjetas");
            }

        } else {
            mensajeError("Ya no puede agregar mas elementos");
        }
    }//GEN-LAST:event_añadirGrupoTarjetajButtonActionPerformed


    private void grupoLugarjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_grupoLugarjComboBoxItemStateChanged
        //Sincronizacion de ComboBox con TextField
        ingresarGruposLugarjTextField.setText(grupoLugarjComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_grupoLugarjComboBoxItemStateChanged

    private void borrarContGrupoLugar() {
        defaultComboLugar = new DefaultComboBoxModel();
        grupoLugarjComboBox.setModel(defaultComboLugar);
        auxGrupoLugar = 0;
    }
    private void borrarGrupoLugarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarGrupoLugarjButtonActionPerformed
        borrarContGrupoLugar();
        grupoLugar = null;
        grupoLugar = new GrupoLugar[valorJSpinnerGruposL()];
    }//GEN-LAST:event_borrarGrupoLugarjButtonActionPerformed

    private void gruposLugarjSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gruposLugarjSpinnerStateChanged
        borrarContGrupoLugar();
        //grupoLugar = null;
        grupoLugar = new GrupoLugar[valorJSpinnerGruposL()];
    }//GEN-LAST:event_gruposLugarjSpinnerStateChanged

    private void borrarContGrupoTarjeta() {
        defaultComboTarjeta = new DefaultComboBoxModel();
        grupoTarjetajComboBox.setModel(defaultComboTarjeta);
        auxGrupoTarjeta = 0;
    }
    private void borrarGrupoTarjetajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarGrupoTarjetajButtonActionPerformed
        borrarContGrupoTarjeta();
        grupoTarjeta = null;
    }//GEN-LAST:event_borrarGrupoTarjetajButtonActionPerformed

    private void noGruposTomeTarjetajSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_noGruposTomeTarjetajSpinnerStateChanged
        borrarContGrupoTarjeta();
        grupoTarjeta = null;
        grupoTarjeta = new GrupoTarjeta[valorJSpinnerTarjetas()];
    }//GEN-LAST:event_noGruposTomeTarjetajSpinnerStateChanged

    private void grupoTarjetajComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_grupoTarjetajComboBoxItemStateChanged
        //Sincronizacion de ComboBox con TextField
        ingresarNombresGrupojTextField.setText(grupoTarjetajComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_grupoTarjetajComboBoxItemStateChanged

    private void seletColorGrupojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seletColorGrupojButtonActionPerformed

        do {
            colorGrupo = JColorChooser.showDialog(this, "Elegir color de fondo", null);
        } while (colorGrupo == null);
        colorSeleccionadoGrupojPanel.setBackground(colorGrupo);

    }//GEN-LAST:event_seletColorGrupojButtonActionPerformed

    private void seletColorTarjetajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seletColorTarjetajButtonActionPerformed

        do {
            colorTarjetas = JColorChooser.showDialog(this, "Elegir color de fondo", null);
        } while (colorTarjetas == null);
        colorSeleccionadoTarjetajPanel.setBackground(colorTarjetas);
    }//GEN-LAST:event_seletColorTarjetajButtonActionPerformed

    private void ingresarGruposLugarjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresarGruposLugarjTextFieldKeyTyped
        crearTablero.validarSoloLetras(evt, "Solo se admiten letras");
        
        if (ingresarGruposLugarjTextField.getText().length()== CrearTablero.LIMITE_NOMBRE) {
            evt.consume();
            crearTablero.mensajeError("No pueden haber mas de 25 caracteres");
        } 
    }//GEN-LAST:event_ingresarGruposLugarjTextFieldKeyTyped

    private void ingresarNombresGrupojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresarNombresGrupojTextFieldKeyTyped
        crearTablero.validarSoloLetras(evt, "Solo se admiten letras");
        
        if (ingresarNombresGrupojTextField.getText().length()== CrearTablero.LIMITE_NOMBRE) {
            evt.consume();
            crearTablero.mensajeError("No pueden haber mas de 25 caracteres");
        } 
    }//GEN-LAST:event_ingresarNombresGrupojTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CasillasTotalesjTextField;
    private javax.swing.JButton aceptarjButton;
    private javax.swing.JButton añadirGrupoLugarjButton;
    private javax.swing.JButton añadirGrupoTarjetajButton;
    private javax.swing.JButton borrarGrupoLugarjButton;
    private javax.swing.JButton borrarGrupoTarjetajButton;
    private javax.swing.JPanel colorSeleccionadoGrupojPanel;
    private javax.swing.JPanel colorSeleccionadoTarjetajPanel;
    private javax.swing.JSpinner costoUsoEstacionjSpinner;
    private javax.swing.JLabel fondoInfoCasillasjLabel;
    private javax.swing.JComboBox<String> grupoLugarjComboBox;
    private javax.swing.JComboBox<String> grupoTarjetajComboBox;
    private javax.swing.JSpinner gruposLugarjSpinner;
    private javax.swing.JTextField ingresarGruposLugarjTextField;
    private javax.swing.JTextField ingresarNombresGrupojTextField;
    private javax.swing.JSpinner noGruposTomeTarjetajSpinner;
    private javax.swing.JSpinner precioCostoEstacionjSpinner;
    private javax.swing.JButton seletColorGrupojButton;
    private javax.swing.JButton seletColorTarjetajButton;
    private javax.swing.JLabel textoCasillasDisponiblesjLabel;
    private javax.swing.JLabel textoColorGrupojLabel;
    private javax.swing.JLabel textoColorTarjetajLabel;
    private javax.swing.JLabel textoCostoUsoEstacionjLabel;
    private javax.swing.JLabel textoDineroPorVueltajLabel;
    private javax.swing.JLabel textoGruposDeLugarjLabel1;
    private javax.swing.JLabel textoGruposPropiedadesjLabel;
    private javax.swing.JLabel textoNotajLabel;
    private javax.swing.JLabel textoPrecioPorEstacionjLabel;
    private javax.swing.JLabel textoPropiedadesjLabel;
    private javax.swing.JLabel textoTomeTarjetajLabel;
    // End of variables declaration//GEN-END:variables
}
