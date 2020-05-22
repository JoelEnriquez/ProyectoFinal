/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author joel
 */
public class tableroJuego extends javax.swing.JFrame {

    /**
     * Creates new form tableroJuego
     */
    public tableroJuego() {
        initComponents();
    }
    
    private class Dado1 extends Thread{
        
        @Override
        public void run(){
            boolean bandera = true;
           while(bandera){
               Random r = new Random();
               int dado = r.nextInt(6)+1;  // Entre 0 y 5, más 1.
               //System.out.println(valorDado);
               switch(dado){
                   case 1:
                       Image img = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara1.png")).getImage();
                       img = img.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel1.setIcon(new ImageIcon(img));
                       bandera= false;
                    break;
                   case 2:
                       Image img2 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara2.png")).getImage();
                       img2 = img2.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel1.setIcon(new ImageIcon(img2));
                       bandera= false;
                    break;
                   case 3:
                       Image img3 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara3.png")).getImage();
                       img3 = img3.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel1.setIcon(new ImageIcon(img3));
                       bandera= false;
                    break;
                   case 4:
                       Image img4 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara4.png")).getImage();
                       img4 = img4.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel1.setIcon(new ImageIcon(img4));
                       bandera= false;
                    break;
                   case 5:
                       Image img5 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara5.png")).getImage();
                       img5 = img5.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel1.setIcon(new ImageIcon(img5));
                       bandera= false;
                    break;         
                   case 6:
                       Image img6 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara6.png")).getImage();
                       img6 = img6.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel1.setIcon(new ImageIcon(img6));
                       bandera= false;
                    break;   
               }
               
           }
        }
    }
    
    private class Dado2 extends Thread{
        
        @Override
        public void run(){
            boolean bandera = true;
           while(bandera){
               Random r = new Random();
               int dado = r.nextInt(6)+1;  // Entre 0 y 5, más 1.
               //System.out.println(valorDado);
               switch(dado){
                   case 1:
                       Image img = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara1.png")).getImage();
                       img = img.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel2.setIcon(new ImageIcon(img));
                       bandera= false;
                    break;
                   case 2:
                       Image img2 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara2.png")).getImage();
                       img2 = img2.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel2.setIcon(new ImageIcon(img2));
                       bandera= false;
                    break;
                   case 3:
                       Image img3 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara3.png")).getImage();
                       img3 = img3.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel2.setIcon(new ImageIcon(img3));
                       bandera= false;
                    break;
                   case 4:
                       Image img4 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara4.png")).getImage();
                       img4 = img4.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel2.setIcon(new ImageIcon(img4));
                       bandera= false;
                    break;
                   case 5:
                       Image img5 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara5.png")).getImage();
                       img5 = img5.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel2.setIcon(new ImageIcon(img5));
                       bandera= false;
                    break;         
                   case 6:
                       Image img6 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara6.png")).getImage();
                       img6 = img6.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel2.setIcon(new ImageIcon(img6));
                       bandera= false;
                    break;   
               }
               
           }
        }
    }
    
    private class Dado3 extends Thread{
        
        @Override
        public void run(){
            boolean bandera = true;
           while(bandera){
               Random r = new Random();
               int dado = r.nextInt(6)+1;  // Entre 0 y 5, más 1.
               //System.out.println(valorDado);
               switch(dado){
                   case 1:
                       Image img = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara1.png")).getImage();
                       img = img.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel3.setIcon(new ImageIcon(img));
                       bandera= false;
                    break;
                   case 2:
                       Image img2 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara2.png")).getImage();
                       img2 = img2.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel3.setIcon(new ImageIcon(img2));
                       bandera= false;
                    break;
                   case 3:
                       Image img3 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara3.png")).getImage();
                       img3 = img3.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel3.setIcon(new ImageIcon(img3));
                       bandera= false;
                    break;
                   case 4:
                       Image img4 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara4.png")).getImage();
                       img4 = img4.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel3.setIcon(new ImageIcon(img4));
                       bandera= false;
                    break;
                   case 5:
                       Image img5 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara5.png")).getImage();
                       img5 = img5.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel3.setIcon(new ImageIcon(img5));
                       bandera= false;
                    break;         
                   case 6:
                       Image img6 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara6.png")).getImage();
                       img6 = img6.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabel3.setIcon(new ImageIcon(img6));
                       bandera= false;
                    break;   
               }
               
           }
        }
    }
    
    
    public class Cronometro extends JFrame implements Runnable, ActionListener{
    public  int onoff = 0;
    public Cronometro()
    {
        setTitle("Cronometro");
        setSize( 300, 200 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLayout( new BorderLayout() );

        //Etiqueta donde se colocara el tiempo 
        tiempo = new JLabel( "00:00:000" );
        tiempo.setFont(new Font( Font.SERIF, Font.BOLD, 50));
        tiempo.setHorizontalAlignment( JLabel.CENTER );
        tiempo.setForeground( Color.BLUE );
        tiempo.setBackground( Color.WHITE );
        tiempo.setOpaque( true );

        add( tiempo, BorderLayout.CENTER );

        //Boton iniciar
//        JButton btn = new JButton( "Iniciar" );
//        btn.addActionListener( this );
//        add( btn, BorderLayout.NORTH );

        //Boton reiniciar inicia nuevamente desde 0
//        JButton btnP = new JButton( "Reiniciar" );
//        btnP.addActionListener( this );
//        add( btnP, BorderLayout.SOUTH );

        this.setLocationRelativeTo( null );
        setVisible( true );
    }

    public void run(){
        Integer minutos = 0 , segundos = 0, milesimas = 0;
        //min es minutos, seg es segundos y mil es milesimas de segundo
        String min="", seg="", mil="";
        try
        {
            //Mientras cronometroActivo sea verdadero entonces seguira
            //aumentando el tiempo
            while( cronometroActivo )
            {
                Thread.sleep( 4 );
                //Incrementamos 4 milesimas de segundo
                milesimas += 4;

                //Cuando llega a 1000 osea 1 segundo aumenta 1 segundo
                //y las milesimas de segundo de nuevo a 0
                if( milesimas == 1000 )
                {
                    milesimas = 0;
                    segundos += 1;
                    //Si los segundos llegan a 60 entonces aumenta 1 los minutos
                    //y los segundos vuelven a 0
                    if( segundos == 60 )
                    {
                        segundos = 0;
                        minutos++;
                    }
                }

                //Esto solamente es estetica para que siempre este en formato
                //00:00:000
                if( minutos < 10 ) min = "0" + minutos;
                else min = minutos.toString();
                if( segundos < 10 ) seg = "0" + segundos;
                else seg = segundos.toString();

                if( milesimas < 10 ) mil = "00" + milesimas;
                else if( milesimas < 100 ) mil = "0" + milesimas;
                else mil = milesimas.toString();

                //Colocamos en la etiqueta la informacion
                tiempo.setText( min + ":" + seg + ":" + mil );
            }
        }catch(Exception e){}
        //Cuando se reincie se coloca nuevamente en 00:00:000
        tiempo.setText( "00:00:000" );
    }

    //Esto es para el boton iniciar y reiniciar
    public void actionPerformed( ActionEvent evt ) {
        Object o = evt.getSource();
        if( o instanceof JButton )
        {
            JButton btn = (JButton)o;
            if( btn.getText().equals("Iniciar") ){
                if(onoff == 0){
                   onoff = 1;
                   iniciarCronometro();
                }
            }
            if( btn.getText().equals("Reiniciar") ) {
                if (onoff == 1){
                   onoff = 0;
                   pararCronometro();
                }
            }
        }
    }

    //Iniciar el cronometro poniendo cronometroActivo 
    //en verdadero para que entre en el while
    public void iniciarCronometro() {
        cronometroActivo = true;
        hilo = new Thread( this );
        hilo.start();
    }

    //Esto es para parar el cronometro
    public void pararCronometro(){
        cronometroActivo = false;
    }
   }

    JLabel tiempo;
    Thread hilo;
    boolean cronometroActivo;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonTirarDados = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonTirarDados.setText("Tirar Dados");
        jButtonTirarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTirarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(jButtonTirarDados)))
                .addContainerGap(505, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61)
                .addComponent(jButtonTirarDados)
                .addContainerGap(540, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void jButtonTirarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTirarDadosActionPerformed
        Dado1 dado1 = new Dado1();
        Dado2 dado2 = new Dado2();
        Dado3 dado3 = new Dado3();
        Cronometro cr = new Cronometro();
        dado1.start();
        dado2.start();
        dado3.start();
        cr.iniciarCronometro();
    }//GEN-LAST:event_jButtonTirarDadosActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTirarDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
