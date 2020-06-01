
package AdministradorGrupos;

import java.awt.Color;
import java.io.Serializable;

public class Grupo implements Serializable{
    
    protected String nombreGrupo;
    protected Color colorGrupo;
    
    public Grupo(String nombreGrupo, Color colorGrupo) {
        this.nombreGrupo = nombreGrupo;
        this.colorGrupo = colorGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public Color getColorGrupo() {
        return colorGrupo;
    }
}
