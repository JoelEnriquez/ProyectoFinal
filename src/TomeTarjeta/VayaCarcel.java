package TomeTarjeta;

import AdministradorGrupos.GrupoTarjeta;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class VayaCarcel extends TarjetaTomeTarjeta implements Serializable {
    
    public VayaCarcel(String texto, GrupoTarjeta grupo) {
        super(texto, grupo);
    }
    
}
