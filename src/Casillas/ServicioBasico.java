package Casillas;


public class ServicioBasico extends Propiedad{

    public ServicioBasico(int fila, int columna, String nombrePropiedad, int precioCompra, int porcentajeHipoteca) {
        super(fila, columna, nombrePropiedad, precioCompra, porcentajeHipoteca);
    }

    
    
    

    @Override
    public void cobrarRenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
