package EntidadesDinero;

import Agregados.Ficha;
import Agregados.SuperClaseAcciones;
import Casillas.Propiedad;
import java.io.Serializable;

public class Jugador extends SuperClaseAcciones implements Serializable{

    private String nombreJugador;
    private int posicionActual;
    private int cantidadDinero;
    private int deuda;
    private Propiedad propiedades[];
    private Ficha ficha;
    private boolean pierdeTurno;
    private int contadorPierdeTurno;

    public Jugador(String nombreJugador, int cantidadDinero, Ficha ficha) {
        this.nombreJugador = nombreJugador;
        this.cantidadDinero = cantidadDinero;
        this.ficha = ficha;
    }
    
    public void aumentarDinero(int aumentar){
        cantidadDinero += aumentar;
    }
    
    public void descontarDinero(int descontar){
        cantidadDinero -= descontar;
    }
    
    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(int cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public Propiedad[] getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public boolean getPierdeTurno() {
        return pierdeTurno;
    }

    public void setPierdeTurno(boolean pierdeTurno) {
        this.pierdeTurno = pierdeTurno;
    }

    public int getContadorPierdeTurno() {
        return contadorPierdeTurno;
    }

    public void setContadorPierdeTurno(int contadorPierdeTurno) {
        this.contadorPierdeTurno = contadorPierdeTurno;
    }
    
    
    
    
    
    
}
