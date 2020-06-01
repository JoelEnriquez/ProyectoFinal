package Casillas;

import AdministradorGrupos.GrupoLugar;
import java.awt.Color;
import java.io.Serializable;

public class Lugar extends Propiedad implements Serializable{
    
    private GrupoLugar grupoLugar;
    private int cantidadCasas;
    private int cantidadHoteles;
    private int precioCasa;
    private int precioHotel;
    private int aumentoPorCasa;
    private int aumentoPorHotel;

    public Lugar(GrupoLugar grupoLugar, int costoEstancia,
            int precioCasa, int precioHotel, int aumentoPorCasa,
            int aumentoPorHotel,int fila, int columna, String nombrePropiedad,
            int precioCompra, int porcentajeHipoteca) {
        super(fila, columna, nombrePropiedad, precioCompra, porcentajeHipoteca, costoEstancia);
        this.grupoLugar = grupoLugar;
        this.precioCasa = precioCasa;
        this.precioHotel = precioHotel;
        this.aumentoPorCasa = aumentoPorCasa;
        this.aumentoPorHotel = aumentoPorHotel;
        tipoCasilla = "Lugar";
       
    }


    @Override
    public void cobrarRenta() {
       
    }
    
    @Override
    public Color getColor(){
        return grupoLugar.getColorGrupo();
    }
//    
//    public int pagoPorCadaCasa(){
//        
//    }
//    public int pagoPorCadaHotel(){
//        
//    }
//    public int cantidadHoteles(){
//        
//    }
//cantidadCasas
//precioCasa
//precioHotel
//grupoPropiedades
    
}
