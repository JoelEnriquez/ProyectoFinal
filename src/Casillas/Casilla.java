package Casillas;

import Agregados.Ficha;
import javax.swing.JLabel;


public class Casilla {
    
    protected int anchura;
    protected int altura;
    protected String nombreCasilla;
    protected int posicionRecorrido;
    protected Ficha fichita;

    public Casilla(int anchura, int altura) {
        this.anchura = anchura;
        this.altura = altura;  
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

    public int getPosicionRecorrido() {
        return posicionRecorrido;
    }    
     
}
