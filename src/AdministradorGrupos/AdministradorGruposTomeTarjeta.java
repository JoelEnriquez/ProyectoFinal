package AdministradorGrupos;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author joel
 */

public class AdministradorGruposTomeTarjeta implements Serializable {
    private GrupoTarjeta[] gruposTarjeta;
    private String[] nombresGrupos;
    private Color[] colorGrupos;
    private int numeroGrupos;
    
    public GrupoTarjeta[] getGruposTarjeta() {
        return gruposTarjeta;
    }

    public void setGruposTarjeta(GrupoTarjeta[] gruposTarjeta) {
        this.gruposTarjeta = gruposTarjeta;
        numeroGrupos = gruposTarjeta.length;
    }
    
    public void setNombresGrupos(){
        nombresGrupos = new String[numeroGrupos];
        String aux;
        
        for (int i = 0; i < numeroGrupos; i++) {
            aux = gruposTarjeta[i].getNombreGrupo();
            nombresGrupos[i] = aux;
        }
    }
    
    public void setColoresGrupos(){
        colorGrupos = new Color[numeroGrupos];
        Color auxiliar;
        
        for (int i = 0; i < numeroGrupos; i++) {
            auxiliar = gruposTarjeta[i].getColorGrupo();
            colorGrupos[i] = auxiliar;
        }
    }

    public String[] getNombresGrupos() {
        return nombresGrupos;
    }

    public Color[] getColorGrupos() {
        return colorGrupos;
    }

    public int getNumeroGrupos() {
        return numeroGrupos;
    }
    
    
    
    


}
