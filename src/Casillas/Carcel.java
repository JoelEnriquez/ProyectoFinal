package Casillas;

import java.io.Serializable;

public class Carcel extends Casilla implements Serializable{
    
    private int precioSalirCarcel;
    
    public Carcel(int fila, int columna, int precioSalirCarcel) {
        super(fila, columna);
        super.tipoCasilla = "Carcel";
        this.precioSalirCarcel = precioSalirCarcel;
    }

    public int getPrecioSalirCarcel() {
        return precioSalirCarcel;
    }    
    
    
}
