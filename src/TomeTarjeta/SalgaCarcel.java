
package TomeTarjeta;

import AdministradorGrupos.GrupoTarjeta;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class SalgaCarcel extends TarjetaTomeTarjeta implements Serializable{
    
    public SalgaCarcel(String texto, GrupoTarjeta grupo) {
        super(texto, grupo);
    }
    
}
