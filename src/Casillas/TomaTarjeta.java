package Casillas;

import AdministradorGrupos.GrupoTarjeta;
import java.io.Serializable;


public class TomaTarjeta extends Casilla implements Serializable{
    
    GrupoTarjeta grupoTarjeta;
    
    public TomaTarjeta(int fila, int columna, GrupoTarjeta grupoTarjeta) {
        super(fila, columna);
        this.grupoTarjeta = grupoTarjeta;
    }
    
}
