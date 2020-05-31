package TomeTarjeta;

import AdministradorGrupos.GrupoTarjeta;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class Multa extends TarjetaTomeTarjeta implements Serializable{
    
    private int dineroMulta;
    
    public Multa(String texto, GrupoTarjeta grupo, int dineroMulta) {
        super(texto, grupo);
        this.dineroMulta = dineroMulta;
    }
    
}
