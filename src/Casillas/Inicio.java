package Casillas;

import java.io.Serializable;


public class Inicio extends Casilla implements Serializable {
    
    public Inicio(int fila, int columna){
        super(fila, columna);
        super.tipoCasilla = "Inicio";
    }
    
    
    
}
