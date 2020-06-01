
package TomeTarjeta;

import AdministradorGrupos.GrupoTarjeta;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class Premio extends TarjetaTomeTarjeta implements Serializable{
    
    private int dineroPremio;
            
    public Premio(String texto, GrupoTarjeta grupo, int dineroPremio) {
        super(texto, grupo);
        this.dineroPremio = dineroPremio;
    }
    
}
