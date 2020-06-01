
package AdministradorGrupos;

import Casillas.*;
import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class ManejadorCasillasPropiedad implements Serializable{
    private Propiedad[] propiedades;
    private Lugar[] casillasLugar;
    private ServicioBasico[] casillasServicio;
    private Estacion[] casillasEstacion;
    private String[] nombrePropiedades;
    private Color[] coloresPropiedades;
    private int numeroPropiedades;
    private int numeroLugares=0;
    private int numeroServicios=0;
    private int numeroEstaciones=0;
    private boolean existenciaLugar = false;
    private boolean existenciaServicio = false;
    private boolean existenciaEstacion = false;
    
    public ManejadorCasillasPropiedad(Propiedad[] propiedades) {
        this.propiedades = propiedades;
        numeroPropiedades = propiedades.length;
        nombrePropiedades = new String[numeroPropiedades];
    }

    public Propiedad[] getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }

    public int getNumeroPropiedades() {
        return numeroPropiedades;
    }
    
    public void setNumeroPropiedades(){
        for (int i = 0; i < numeroPropiedades; i++) {
            if (propiedades[i] instanceof Lugar) {
                numeroLugares++;
                existenciaLugar = true;
            }
            else if (propiedades[i] instanceof ServicioBasico) {
                numeroServicios++;
                existenciaServicio = true;
            }
            else if (propiedades[i] instanceof Estacion) {
                numeroEstaciones++;
                existenciaEstacion = true;
            }
        }
    }
    
    public void setTamañoPropiedades(){
        if (numeroLugares>0) {
            casillasLugar = new Lugar[numeroLugares];
        }
        if (numeroServicios>0) {
            casillasServicio = new ServicioBasico[numeroServicios];
        }
        if (numeroEstaciones>0) {
            casillasEstacion = new Estacion[numeroEstaciones];
        }
    }
    
    /**
     * Separa el arreglo general de propiedades, en subdivisiones mas especificas.
     */
    public void setContArreglos(){
        int auxLugar=0;
        int auxServicio=0;
        int auxEstacion=0;
        
        for (int i = 0; i < numeroPropiedades; i++) {
            
            if (propiedades[i] instanceof Lugar) {
                if (existenciaLugar) {
                    casillasLugar[auxLugar] = (Lugar) propiedades[i];
                    auxLugar++;
                }
            } 
            else if (propiedades[i] instanceof ServicioBasico) {
                if (existenciaServicio) {
                    casillasServicio[auxServicio] = (ServicioBasico) propiedades[i];
                    auxServicio++;
                }
            }
            else if (propiedades[i] instanceof Estacion) {
                if (existenciaEstacion) {
                    casillasEstacion[auxEstacion] = (Estacion) propiedades[i];
                    auxEstacion++;
                }
            }
            
        }
    }
    
    public String[] nombresPropiedades(){
        for (int i = 0; i < numeroPropiedades; i++) {
            nombrePropiedades[i] = propiedades[i].getNombrePropiedad();
        }
        return nombrePropiedades;
    }
    
    public String[] nombresPropiedadConInicio(){
        String [] nombrePropiedadesConInicio = new String [nombresPropiedades().length+1];
        String[] aux = nombresPropiedades();
        
        for (int i = 0; i < nombrePropiedadesConInicio.length; i++) {
            if (i==0) {
                nombrePropiedadesConInicio[i] = "Inicio";
            }
            else if (i>0) {
                nombrePropiedadesConInicio[i] = aux [i-1];
            }
        }
        
        return nombrePropiedadesConInicio;
    }
    
    public Color[] obtenerColoresPropiedades(){
        
        for (int i = 0; i < numeroPropiedades; i++) {
            coloresPropiedades[i] = propiedades[i].getColor();
        }
        
        return coloresPropiedades;
    }

    public Lugar[] getCasillasLugar() {
        return casillasLugar;
    }

    public ServicioBasico[] getCasillasServicio() {
        return casillasServicio;
    }

    public Estacion[] getCasillasEstacion() {
        return casillasEstacion;
    }
    
    
}
