package Casillas;


import EntidadesDinero.Jugador;
import java.awt.Color;
import java.io.Serializable;

public abstract class Propiedad extends Casilla implements Serializable {

    protected Jugador jugadorDueño;
    protected String nombrePropiedad;
    protected int precioCompra;
    protected Color color;
    protected int precioHipoteca;
    protected int costoEstancia;
    protected int porcentajeHipoteca;
    protected int cantidadDesipotecar;
    protected boolean estadoPropiedad;
    

    public Propiedad(int fila, int columna, String nombrePropiedad,
            int precioCompra, int porcentajeHipoteca, int costoEstancia) {
        super(fila, columna);
        this.nombrePropiedad = nombrePropiedad;
        this.precioCompra = precioCompra;
        precioHipoteca = precioCompra/2;
        this.costoEstancia = costoEstancia;
        this.porcentajeHipoteca = porcentajeHipoteca;
        definirCantidadDesipotecar(); 
    }
    
    private void definirCantidadDesipotecar(){
        cantidadDesipotecar = (1+(porcentajeHipoteca/100))*precioHipoteca;
    }

   public abstract void cobrarRenta();
   
    public void precioCompra(){
        
    }
 
    public void hipotecarPropiedad () throws Exception{
        if (estadoPropiedad==false) {
            throw new Exception("La propiedad ya se encuentra hipotecada");
        }
        else{
            
        }
    }
    
    public int dineroPorHipoteca(){
        return precioHipoteca;
    }
    
    public void pagarHipoteca() throws Exception{
        if (jugadorDueño.getCantidadDinero()<precioHipoteca) {
            throw new Exception("No tiene suficiente dinero para pagar la hipoteca");
        }
    }

    public Jugador getJugadorDueño() {
        return jugadorDueño;
    }

    public void setJugadorDueño(Jugador jugadorDueño) {
        this.jugadorDueño = jugadorDueño;
    }

    public boolean getEstadoPropiedad() {
        return estadoPropiedad;
    }

    public void setEstadoPropiedad(boolean estadoPropiedad) {
        this.estadoPropiedad = estadoPropiedad;
    }

    public String getNombrePropiedad() {
        return nombrePropiedad;
    }

    public Color getColor() {
        return color;
    }

    public Propiedad getPorNombre(String nombrePropiedad) throws Exception{
        if (nombrePropiedad.equals(this.nombrePropiedad)) {
            return this;
        }
        throw new Exception("No hay coincidencia de nombres");
    }
}
