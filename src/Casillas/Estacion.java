package Casillas;

import java.awt.Color;
import java.io.Serializable;


public class Estacion extends Propiedad implements Serializable{
    

    public Estacion(int fila, int columna, String nombrePropiedad, int precioCompra,
            int porcentajeHipoteca, int costoEstancia, Color colorCasilla) {
        super(fila, columna, nombrePropiedad, precioCompra, porcentajeHipoteca, costoEstancia);
        super.color = colorCasilla;
        tipoCasilla = "Estacion";
    }

 
    @Override
    public void cobrarRenta() {
        
    }
    
    
    
}
