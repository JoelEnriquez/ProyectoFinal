package Casillas;

import java.io.Serializable;


public class Trampa extends Casilla implements Serializable {
    
    private String castigo;
    
    public Trampa(int fila, int columna, String castigo) {
        super(fila, columna);
        this.castigo = castigo;
    }
    
    
    
}
