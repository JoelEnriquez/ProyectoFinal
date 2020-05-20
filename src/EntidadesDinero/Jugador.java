package EntidadesDinero;

import Agregados.Ficha;
import Casillas.Propiedad;

public class Jugador {

    private String nombreJugador;
    private int cantidadDinero;
    private Propiedad propiedades[];
    private int deuda;
    private Ficha ficha;
    private boolean pierdeTurno;

    public Jugador(String nombreJugador, int cantidadDinero, Ficha ficha) {
        this.nombreJugador = nombreJugador;
        this.cantidadDinero = cantidadDinero;
        this.ficha = ficha;
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
    
    
}
