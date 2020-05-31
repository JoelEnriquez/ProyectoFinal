package TomeTarjeta;

import AdministradorGrupos.GrupoTarjeta;
import java.io.Serializable;


public class TarjetaTomeTarjeta implements Serializable {
    
    protected String texto;
    protected GrupoTarjeta grupo;

    public TarjetaTomeTarjeta(String texto, GrupoTarjeta grupo) {
        this.texto = texto;
        this.grupo = grupo;
    }
    
}
