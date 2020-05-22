package Casillas;

import java.awt.Color;


public class ServicioBasico extends Propiedad{

    Color colorCasilla;
    
    public ServicioBasico(int fila, int columna, String nombrePropiedad, int precioCompra,
            int porcentajeHipoteca, int costoUsoServicio, Color colorCasilla) {
        super(fila, columna, nombrePropiedad, precioCompra, porcentajeHipoteca, costoUsoServicio);
        this.colorCasilla = colorCasilla;
    }

    @Override
    public void cobrarRenta() {
        
    }
    
}
