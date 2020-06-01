
package TomeTarjeta;

import AdministradorGrupos.GrupoTarjeta;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class PerderTurno extends TarjetaTomeTarjeta implements Serializable{
    
    private int numeroTurnosPerder;
    
    public PerderTurno(String texto, GrupoTarjeta grupo, int numeroTurnosPerder) {
        super(texto, grupo);
        this.numeroTurnosPerder = numeroTurnosPerder;
    }
    
}
