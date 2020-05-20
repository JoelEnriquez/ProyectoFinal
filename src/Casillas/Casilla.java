package Casillas;

import Agregados.Ficha;
import javax.swing.JLabel;


public class Casilla {
    
    protected int anchura;
    protected int altura;
    private int x, y;
    protected String nombreCasilla;
    protected JLabel casillaLabel;
    protected Ficha fichita;

    public Casilla(int anchura, int altura) {
        this.anchura = anchura;
        this.altura = altura;
        casillaLabel = new JLabel();
        casillaLabel.setSize(anchura, altura);      
    }

    public String getNombreCasilla() {
        return nombreCasilla;
    }

    public void setNombreCasilla(String nombreCasilla) {
        this.nombreCasilla = nombreCasilla;
    }

    public int getAltura() {
        return altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public JLabel getCasillaLabel() {
        return casillaLabel;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    
   
}
