package Casillas;

import java.io.Serializable;

public class Carcel extends Casilla implements Serializable{
    
    
    public Carcel(int fila, int columna) {
        super(fila, columna);
        super.tipoCasilla = "Carcel";
    }

    
    
    
}
