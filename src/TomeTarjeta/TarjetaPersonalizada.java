
package TomeTarjeta;

import AdministradorGrupos.GrupoTarjeta;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class TarjetaPersonalizada extends TarjetaTomeTarjeta implements Serializable {
    
    public TarjetaPersonalizada(String texto, GrupoTarjeta grupo) {
        super(texto, grupo);
    }
    
}
