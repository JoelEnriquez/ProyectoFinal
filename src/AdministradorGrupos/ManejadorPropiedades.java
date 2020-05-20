package AdministradorGrupos;

import Casillas.Propiedad;
import java.awt.Color;


public class ManejadorPropiedades {
    private GrupoLugar[] grupoLugar;
    private GrupoLugar grupo;
    private String[] nombreGrupo;
    private Color[] coloresGrupo;
    

    public void setNombresGrupo(){
        nombreGrupo = new String[grupoLugar.length];
        for (int i = 0; i < grupoLugar.length; i++) {
            nombreGrupo[i] = grupoLugar[i].getNombreGrupo();
        }
    }

    public void setColoresGrupo(){
        coloresGrupo = new Color[grupoLugar.length];
        for (int i = 0; i < grupoLugar.length; i++) {
            coloresGrupo[i] = grupoLugar[i].getColorGrupo();
        }
    }

    public String[] getNombreGrupo() {
        return nombreGrupo;
    }

    public Color[] getColoresGrupo() {
        return coloresGrupo;
    }
    
    public void setGrupoLugar(GrupoLugar[] grupoLugar) {
        this.grupoLugar = grupoLugar;
    }

    public GrupoLugar[] getGrupoLugar() {
        return grupoLugar;
    }

    
}
