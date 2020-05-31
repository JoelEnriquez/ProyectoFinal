
package TomeTarjeta;

import AdministradorGrupos.GrupoTarjeta;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class PagoAJugadores extends TarjetaTomeTarjeta implements Serializable{
    
    private int dineroPagoJugadores;
    
    public PagoAJugadores(String texto, GrupoTarjeta grupo, int dineroPagoJugadores) {
        super(texto, grupo);
        this.dineroPagoJugadores = dineroPagoJugadores;
    }
    
}
