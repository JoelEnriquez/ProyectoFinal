package Casillas;

import java.awt.Color;
import java.io.Serializable;


public class ServicioBasico extends Propiedad implements Serializable{

    
    public ServicioBasico(int fila, int columna, String nombrePropiedad, int precioCompra,
            int porcentajeHipoteca, int costoUsoServicio, Color colorCasilla) {
        super(fila, columna, nombrePropiedad, precioCompra, porcentajeHipoteca, costoUsoServicio);
        super.color = colorCasilla;
        tipoCasilla = "Servicio Basico";
    }

    @Override
    public void cobrarRenta() {
        
    }
    
}
