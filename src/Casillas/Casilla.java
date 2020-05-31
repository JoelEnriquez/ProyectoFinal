package Casillas;

import Agregados.Ficha;
import Agregados.SuperClaseAcciones;
import java.io.Serializable;


public class Casilla extends SuperClaseAcciones implements Serializable{
    
    protected int fila;
    protected int columna;
    protected int posicionRecorrido;
    protected String tipoCasilla;
    protected Ficha fichita;

    public Casilla(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;  
    }

    public int getAltura() {
        return fila;
    }

    public int getAnchura() {
        return columna;
    }

    public int getPosicionRecorrido() {
        return posicionRecorrido;
    }  

    public void setPosicionRecorrido(int posicionRecorrido) {
        this.posicionRecorrido = posicionRecorrido;
    }

    public String getTipoCasilla() {
        return tipoCasilla;
    }

    public void setTipoCasilla(String tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }
    
    public Casilla getPorString(String tipoCasilla) throws Exception{
        if (tipoCasilla.equals(this.tipoCasilla)) {
            return this;
        }
        throw new Exception("No hay coincidencia");
    }
    
    
    
    
}
