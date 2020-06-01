package AdministradorGrupos;

import TomeTarjeta.TarjetaTomeTarjeta;
import java.awt.Color;
import java.io.Serializable;


public class GrupoTarjeta extends Grupo implements Serializable{
    
    private TarjetaTomeTarjeta[] tomeTarjeta;
    
    public GrupoTarjeta(String nombreGrupo, Color colorGrupo) {
        super(nombreGrupo, colorGrupo);
    }

    public TarjetaTomeTarjeta[] getTomeTarjeta() {
        return tomeTarjeta;
    }

    public void setTomeTarjeta(TarjetaTomeTarjeta[] tomeTarjeta) {
        this.tomeTarjeta = tomeTarjeta;
    }
    
}
