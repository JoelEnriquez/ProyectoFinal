package Juego;

import Agregados.SuperClaseAcciones;
import Main.MenuPrincipal;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Juego.Tablero.*;

/**
 *
 * @author joel
 */
public class Jugar extends javax.swing.JFrame {

    private Dimension dimension;
    private Toolkit toolkit;
    private MenuPrincipal menu;
    private Tablero tab;
    private final Icon confusedMan = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConfusedMonopolyMan.jpg"));
    ;
    private JPanel[][] casillas;
    private int filas = 15;
    private int columnas = 15;
    Cronometro cr = new Cronometro();
    static String TiempoCrono;

    public Jugar(MenuPrincipal menu) {
        initComponents();
        iniciarFrame();
        this.menu = menu;
        construirTablero();
        cr.iniciarCronometro();
        inicializarGifs();

    }
    public class Cronometro extends JFrame implements Runnable, ActionListener {    
    public  int onoff = 0;
    JLabel tiempo;
    Thread hilo;
    boolean cronometroActivo;
    public Cronometro()
    {
        setTitle("Cronometro");
        setSize( 75, 50 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLayout( new BorderLayout() );
        setUndecorated(true);
        //Etiqueta donde se colocara el tiempo 
        jLabel5 = new JLabel( "00:00" );
        jLabel5.setFont(new Font( Font.SERIF, Font.BOLD, 25));
        jLabel5.setHorizontalAlignment( JLabel.CENTER );
        jLabel5.setForeground( Color.BLUE );
        jLabel5.setBackground( Color.green );
        jLabel5.setOpaque( true );
        add( jLabel5, BorderLayout.CENTER );


        this.setLocation(1830, 42);
       // setVisible( true );
    }

    @Override
    public void run(){
        Integer minutos = 0 , segundos = 0, milesimas = 0;
        //min es minutos, seg es segundos y mil es milesimas de segundo
        String min, seg;
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


                if( minutos < 10 ) min = "0" + minutos;
                else min = minutos.toString();
                if( segundos < 10 ) seg = "0" + segundos;
                else seg = segundos.toString();


                //Colocamos en la etiqueta la informacion
                jLabel5.setText( min + ":" + seg);
            }
        }catch(InterruptedException e){}
        //Cuando se reincie se coloca nuevamente en 00:00:000
        jLabel5.setText( "00:00" );
    }

    //Esto es para el boton iniciar y reiniciar
    @Override
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

    public String getTiempo() {
        String tiempo1;
        tiempo1 = jLabel5.getText();
        return tiempo1;
    }
    
    
    
}
    
    
    private int caraActual;
    
    private class Dado1 extends Thread{
        @Override
        public void run(){
            
            
           boolean bandera = true;
           while(bandera){
               Random r = new Random();
               int dado = r.nextInt(6)+1;  
               //System.out.println(valorDado);
               switch(dado){
                   case 1:
                       Image img = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara1.png")).getImage();
                       img = img.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelUndeUno.setIcon(new ImageIcon(img));
                       jLabelUnodeDos.setIcon(new ImageIcon(img));
                       jLabelUnodeTres.setIcon(new ImageIcon(img));
                       bandera= false;
                    break;
                   case 2:
                       Image img2 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara2.png")).getImage();
                       img2 = img2.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelUndeUno.setIcon(new ImageIcon(img2));
                       jLabelUnodeDos.setIcon(new ImageIcon(img2));
                       jLabelUnodeTres.setIcon(new ImageIcon(img2));
                       bandera= false;
                    break;
                   case 3:
                       Image img3 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara3.png")).getImage();
                       img3 = img3.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelUndeUno.setIcon(new ImageIcon(img3));
                       jLabelUnodeDos.setIcon(new ImageIcon(img3));
                       jLabelUnodeTres.setIcon(new ImageIcon(img3));
                       bandera= false;
                    break;
                   case 4:
                       Image img4 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara4.png")).getImage();
                       img4 = img4.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelUndeUno.setIcon(new ImageIcon(img4));
                       jLabelUnodeDos.setIcon(new ImageIcon(img4));
                       jLabelUnodeTres.setIcon(new ImageIcon(img4));
                       bandera= false;
                    break;
                   case 5:
                       Image img5 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara5.png")).getImage();
                       img5 = img5.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelUndeUno.setIcon(new ImageIcon(img5));
                       jLabelUnodeDos.setIcon(new ImageIcon(img5));
                       jLabelUnodeTres.setIcon(new ImageIcon(img5));
                       bandera= false;
                    break;         
                   case 6:
                       Image img6 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara6.png")).getImage();
                       img6 = img6.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelUndeUno.setIcon(new ImageIcon(img6));
                       jLabelUnodeDos.setIcon(new ImageIcon(img6));
                       jLabelUnodeTres.setIcon(new ImageIcon(img6));
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
                       jLabelDosdeDos.setIcon(new ImageIcon(img));
                       jLabelDosdeTres.setIcon(new ImageIcon(img));
                       bandera= false;
                    break;
                   case 2:
                       Image img2 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara2.png")).getImage();
                       img2 = img2.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelDosdeDos.setIcon(new ImageIcon(img2));
                       jLabelDosdeTres.setIcon(new ImageIcon(img2));
                       bandera= false;
                    break;
                   case 3:
                       Image img3 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara3.png")).getImage();
                       img3 = img3.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelDosdeDos.setIcon(new ImageIcon(img3));
                       jLabelDosdeTres.setIcon(new ImageIcon(img3));
                       bandera= false;
                    break;
                   case 4:
                       Image img4 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara4.png")).getImage();
                       img4 = img4.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelDosdeDos.setIcon(new ImageIcon(img4));
                       jLabelDosdeTres.setIcon(new ImageIcon(img4));
                       bandera= false;
                    break;
                   case 5:
                       Image img5 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara5.png")).getImage();
                       img5 = img5.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelDosdeDos.setIcon(new ImageIcon(img5));
                       jLabelDosdeTres.setIcon(new ImageIcon(img5));
                       bandera= false;
                    break;         
                   case 6:
                       Image img6 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara6.png")).getImage();
                       img6 = img6.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelDosdeDos.setIcon(new ImageIcon(img6));
                       jLabelDosdeTres.setIcon(new ImageIcon(img6));
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
                      jLabelTresdeTres.setIcon(new ImageIcon(img));
                       bandera= false;
                    break;
                   case 2:
                       Image img2 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara2.png")).getImage();
                       img2 = img2.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                        jLabelTresdeTres.setIcon(new ImageIcon(img2));
                       bandera= false;
                    break;
                   case 3:
                       Image img3 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara3.png")).getImage();
                       img3 = img3.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                        jLabelTresdeTres.setIcon(new ImageIcon(img3));
                       bandera= false;
                    break;
                   case 4:
                       Image img4 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara4.png")).getImage();
                       img4 = img4.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelTresdeTres.setIcon(new ImageIcon(img4));
                       bandera= false;
                    break;
                   case 5:
                       Image img5 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara5.png")).getImage();
                       img5 = img5.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                        jLabelTresdeTres.setIcon(new ImageIcon(img5));
                       bandera= false;
                    break;         
                   case 6:
                       Image img6 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara6.png")).getImage();
                       img6 = img6.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       jLabelTresdeTres.setIcon(new ImageIcon(img6));
                       bandera= false;
                    break;   
               }
               
           }
        }
    }

    private void iniciarFrame() {
        toolkit = Toolkit.getDefaultToolkit();
        dimension = toolkit.getScreenSize();
        this.setSize(dimension);
    }

    private void construirTablero() {
        tablerojPanel.setLayout(null);

        casillas = new JPanel[filas][columnas];
        int x = 1;
        int y = 1;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                casillas[i][j] = new JPanel();
                casillas[i][j].setBackground(Color.blue);
                casillas[i][j].setBounds(x, y, 130, 195);

                tablerojPanel.add(casillas[i][j]);
                x += 132;
            }
            x = 1;
            y += 197;
        }

        tablerojPanel.setPreferredSize(new Dimension(130 * filas + 50, 195 * columnas + 50));
    }
    
    private void inicializarGifs(){
       // int noDados = tab.getNumeroDados();
        int noDados = 1;
        switch (noDados) {
            case 1:
                unDadoGifjPanel.setVisible(true);
                dosDadosGifjPanel.setVisible(false);
                tresDadosGifjPanel.setVisible(false);
                break;
            case 2:
                unDadoGifjPanel.setVisible(false);
                dosDadosGifjPanel.setVisible(true);
                tresDadosGifjPanel.setVisible(false);
                break;
            case 3:
                unDadoGifjPanel.setVisible(false);
                dosDadosGifjPanel.setVisible(false);
                tresDadosGifjPanel.setVisible(true);
                break;
            default:
                break;
        }
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
        jLabelTresdeTres = new javax.swing.JLabel();
        jLabelUnodeTres = new javax.swing.JLabel();
        jLabelDosdeTres = new javax.swing.JLabel();
        dosDadosjPanel = new javax.swing.JPanel();
        jLabelUnodeDos = new javax.swing.JLabel();
        jLabelDosdeDos = new javax.swing.JLabel();
        unDadojPanel = new javax.swing.JPanel();
        jLabelUndeUno = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        panelSuperiorjPanel = new javax.swing.JPanel();
        ClockjPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
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

        tresDadosjPanel.setLayout(new java.awt.GridLayout(1, 3));
        tresDadosjPanel.add(jLabelTresdeTres);
        tresDadosjPanel.add(jLabelUnodeTres);
        tresDadosjPanel.add(jLabelDosdeTres);

        dadosjPanel.add(tresDadosjPanel, "card5");

        dosDadosjPanel.setLayout(new java.awt.GridLayout(1, 2));
        dosDadosjPanel.add(jLabelUnodeDos);
        dosDadosjPanel.add(jLabelDosdeDos);

        dadosjPanel.add(dosDadosjPanel, "card6");

        unDadojPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        unDadojPanel.setMinimumSize(new java.awt.Dimension(150, 150));
        unDadojPanel.setPreferredSize(new java.awt.Dimension(150, 150));
        unDadojPanel.setLayout(new java.awt.GridLayout(1, 1));
        unDadojPanel.add(jLabelUndeUno);

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

        jLabel5.setBackground(new java.awt.Color(153, 255, 153));
        jLabel5.setFont(new java.awt.Font("Serif", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout ClockjPanelLayout = new javax.swing.GroupLayout(ClockjPanel);
        ClockjPanel.setLayout(ClockjPanelLayout);
        ClockjPanelLayout.setHorizontalGroup(
            ClockjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClockjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        ClockjPanelLayout.setVerticalGroup(
            ClockjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClockjPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
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
        if (opcion == 0) {
            menu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_outjButtonActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //lanzar Dados
        Dado1 dado1 = new Dado1();
        Dado2 dado2 = new Dado2();
        Dado3 dado3 = new Dado3();
        //int noDados = tab.getNumeroDados();
        int noDados = 1;
        
        if(noDados == 1){
           unDadoGifjPanel.setVisible(false);
           unDadojPanel.setVisible(true);
           dosDadosGifjPanel.setVisible(false);
           dosDadosjPanel.setVisible(false);
           tresDadosGifjPanel.setVisible(false);
           tresDadosjPanel.setVisible(false);
           dado1.start(); 
        }
        
        else if(noDados == 2){
           unDadoGifjPanel.setVisible(false);
           unDadojPanel.setVisible(false);
           dosDadosGifjPanel.setVisible(false);
           dosDadosjPanel.setVisible(true);
           tresDadosGifjPanel.setVisible(false);
           tresDadosjPanel.setVisible(false);
           dado1.start();
           dado2.start(); 
        }
        else if(noDados == 3){
           unDadoGifjPanel.setVisible(false);
           unDadojPanel.setVisible(false);
           dosDadosGifjPanel.setVisible(false);
           dosDadosjPanel.setVisible(false);
           tresDadosGifjPanel.setVisible(false);
           tresDadosjPanel.setVisible(true);
           dado1.start();
           dado2.start(); 
           dado3.start();
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel ClockjPanel;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDosdeDos;
    private javax.swing.JLabel jLabelDosdeTres;
    private javax.swing.JLabel jLabelTresdeTres;
    private javax.swing.JLabel jLabelUndeUno;
    private javax.swing.JLabel jLabelUnodeDos;
    private javax.swing.JLabel jLabelUnodeTres;
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
