package TomeTarjeta;

import AdministradorGrupos.GrupoTarjeta;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class Caminar extends TarjetaTomeTarjeta implements Serializable{
    
    private int casillasCaminar;
    public Caminar(String texto, GrupoTarjeta grupo, int casillasCaminar) {
        super(texto, grupo);
        this.casillasCaminar = casillasCaminar;
    }
    
}
