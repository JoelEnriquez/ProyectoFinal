/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TomeTarjeta;

import AdministradorGrupos.GrupoTarjeta;
import Casillas.*;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class MoverACasilla extends TarjetaTomeTarjeta implements Serializable{
    
    private Casilla casillaDestino;
    private String nombreCasillaDestino;
    
    public MoverACasilla(String texto, GrupoTarjeta grupo, Casilla casillaDestino) {
        super(texto, grupo);
        this.casillaDestino = casillaDestino;
    }

    public MoverACasilla(String texto, GrupoTarjeta grupo, String nombreCasillaDestino) {
        super(texto, grupo);
        this.nombreCasillaDestino = nombreCasillaDestino;
    }
    
}
