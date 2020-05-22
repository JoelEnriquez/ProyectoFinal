package Casillas;

import AdministradorGrupos.GrupoTarjeta;


public class TomaTarjeta extends Casilla {
    
    GrupoTarjeta grupoTarjeta;
    
    public TomaTarjeta(int fila, int columna, GrupoTarjeta grupoTarjeta) {
        super(fila, columna);
        this.grupoTarjeta = grupoTarjeta;
    }
    
}
