
package AdministradorGrupos;

import java.awt.Color;

public class ManejadorTomeTarjeta {
    
    private GrupoTarjeta[] grupoTarjeta;
    private GrupoTarjeta grupoT;
    private String[] nombreGrupo;
    private Color[] coloresGrupo;

    public GrupoTarjeta[] getGrupoTarjeta() {
        return grupoTarjeta;
    }

    public void setGrupoTarjeta(GrupoTarjeta[] grupoTarjeta) {
        this.grupoTarjeta = grupoTarjeta;
    }
    
    public void setNombresGrupo(){
        nombreGrupo = new String[grupoTarjeta.length];
        for (int i = 0; i < grupoTarjeta.length; i++) {
            nombreGrupo[i] = grupoTarjeta[i].getNombreGrupo();
        }
    }

    public void setColoresGrupo(){
        coloresGrupo = new Color[grupoTarjeta.length];
        for (int i = 0; i < grupoTarjeta.length; i++) {
            coloresGrupo[i] = grupoTarjeta[i].getColorGrupo();
        }
    }
    
    public String[] getNombreGrupo() {
        return nombreGrupo;
    }

    public Color[] getColoresGrupo() {
        return coloresGrupo;
    }
    
}
