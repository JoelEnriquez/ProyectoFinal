package Dados;

import Agregados.SuperClaseAcciones;
import java.awt.Image;
import java.awt.Label;
import java.io.Serializable;
import java.util.Random;
import javax.swing.ImageIcon;



public class Dado extends SuperClaseAcciones implements Serializable{
    
    private int caraActual;
    private Label labelCara;
    
        private class Dado1 extends Thread{
        
        public void run(Label jLabel1){
            
            
           boolean bandera = true;
           while(bandera){
               Random r = new Random();
               int dado = r.nextInt(6)+1;  
               //System.out.println(valorDado);
               switch(dado){
                   case 1:
                       Image img = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara1.png")).getImage();
                       img = img.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel1.setIcon(new ImageIcon(img));
                       bandera= false;
                    break;
                   case 2:
                       Image img2 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara2.png")).getImage();
                       img2 = img2.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel1.setIcon(new ImageIcon(img2));
                       bandera= false;
                    break;
                   case 3:
                       Image img3 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara3.png")).getImage();
                       img3 = img3.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel1.setIcon(new ImageIcon(img3));
                       bandera= false;
                    break;
                   case 4:
                       Image img4 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara4.png")).getImage();
                       img4 = img4.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel1.setIcon(new ImageIcon(img4));
                       bandera= false;
                    break;
                   case 5:
                       Image img5 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara5.png")).getImage();
                       img5 = img5.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel1.setIcon(new ImageIcon(img5));
                       bandera= false;
                    break;         
                   case 6:
                       Image img6 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara6.png")).getImage();
                       img6 = img6.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel1.setIcon(new ImageIcon(img6));
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
                       //jLabel2.setIcon(new ImageIcon(img));
                       bandera= false;
                    break;
                   case 2:
                       Image img2 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara2.png")).getImage();
                       img2 = img2.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel2.setIcon(new ImageIcon(img2));
                       bandera= false;
                    break;
                   case 3:
                       Image img3 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara3.png")).getImage();
                       img3 = img3.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel2.setIcon(new ImageIcon(img3));
                       bandera= false;
                    break;
                   case 4:
                       Image img4 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara4.png")).getImage();
                       img4 = img4.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel2.setIcon(new ImageIcon(img4));
                       bandera= false;
                    break;
                   case 5:
                       Image img5 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara5.png")).getImage();
                       img5 = img5.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel2.setIcon(new ImageIcon(img5));
                       bandera= false;
                    break;         
                   case 6:
                       Image img6 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara6.png")).getImage();
                       img6 = img6.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel2.setIcon(new ImageIcon(img6));
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
                       //jLabel3.setIcon(new ImageIcon(img));
                       bandera= false;
                    break;
                   case 2:
                       Image img2 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara2.png")).getImage();
                       img2 = img2.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel3.setIcon(new ImageIcon(img2));
                       bandera= false;
                    break;
                   case 3:
                       Image img3 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara3.png")).getImage();
                       img3 = img3.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel3.setIcon(new ImageIcon(img3));
                       bandera= false;
                    break;
                   case 4:
                       Image img4 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara4.png")).getImage();
                       img4 = img4.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel3.setIcon(new ImageIcon(img4));
                       bandera= false;
                    break;
                   case 5:
                       Image img5 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara5.png")).getImage();
                       img5 = img5.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel3.setIcon(new ImageIcon(img5));
                       bandera= false;
                    break;         
                   case 6:
                       Image img6 = new ImageIcon(this.getClass().getResource("/Imagenes/DadoCara6.png")).getImage();
                       img6 = img6.getScaledInstance(63, 69,  java.awt.Image.SCALE_SMOOTH);
                       //jLabel3.setIcon(new ImageIcon(img6));
                       bandera= false;
                    break;   
               }
               
           }
        }
    }
}
