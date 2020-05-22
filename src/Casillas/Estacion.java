package Casillas;

import java.awt.Color;


public class Estacion extends Propiedad{
    
    Color colorCasilla;

    public Estacion(int fila, int columna, String nombrePropiedad, int precioCompra,
            int porcentajeHipoteca, int costoEstancia, Color colorCasilla) {
        super(fila, columna, nombrePropiedad, precioCompra, porcentajeHipoteca, costoEstancia);
        this.colorCasilla = colorCasilla;
    }

 
    @Override
    public void cobrarRenta() {
        
    }
    
    
    
}
