package Casillas;

import AdministradorGrupos.GrupoLugar;

public class Lugar extends Propiedad{
    
    private GrupoLugar grupoLugar;
    private int cantidadCasas;
    private int cantidadHoteles;
    private int costoEstancia;
    private int precioCasa;
    private int precioHotel;
    private int aumentoPorCasa;
    private int aumentoPorHotel;

    public Lugar(GrupoLugar grupoLugar, int costoEstancia,
            int precioCasa, int precioHotel, int aumentoPorCasa,
            int aumentoPorHotel,int fila, int columna, String nombrePropiedad,
            int precioCompra, int porcentajeHipoteca) {
        super(fila, columna, nombrePropiedad, precioCompra, porcentajeHipoteca);
        this.grupoLugar = grupoLugar;
        this.costoEstancia = costoEstancia;
        this.precioCasa = precioCasa;
        this.precioHotel = precioHotel;
        this.aumentoPorCasa = aumentoPorCasa;
        this.aumentoPorHotel = aumentoPorHotel;
       
    }


    
    

    @Override
    public void cobrarRenta() {
       
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
