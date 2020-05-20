
package AdministradorGrupos;

import java.awt.Color;

public class Grupo {
    
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
