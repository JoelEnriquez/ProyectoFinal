
package AdministradorGrupos;

import TomeTarjeta.TarjetaTomeTarjeta;
import java.io.Serializable;

public class ManejadorTiposTomaTarjeta implements Serializable {
    
    /**
     * Se redimenciona el arreglo de Grupo y se agreagan las tarjetas nuevas
     * @param tarjetasNuevas
     * @param nombreGrupo 
     */
    public void agregarTarjetas(TarjetaTomeTarjeta[] tarjetasNuevas, GrupoTarjeta nombreGrupo){
        if (nombreGrupo.getTomeTarjeta()==null) {
            nombreGrupo.setTomeTarjeta(tarjetasNuevas);
        }
        else{
           TarjetaTomeTarjeta[] tarjetasAux = new TarjetaTomeTarjeta
           [nombreGrupo.getTomeTarjeta().length + tarjetasNuevas.length];
           
            for (int i = 0; i < nombreGrupo.getTomeTarjeta().length; i++) {
                tarjetasAux[i] = nombreGrupo.getTomeTarjeta()[i];
            }
            for (int i = nombreGrupo.getTomeTarjeta().length; i < tarjetasAux.length; i++) {
                tarjetasAux[i] = tarjetasNuevas[i-nombreGrupo.getTomeTarjeta().length];
            }
            
            nombreGrupo.setTomeTarjeta(tarjetasAux);
        }
    }
    
    //Partida partidas = 5 + 1
//    public void partidaRedimencionada(Partida[] listaPartidas) {
//        Partida[] partidasAux = new Partida[(partidas.length + listaPartidas.length)];
//
//        for (int i = 0; i < partidas.length; i++) {
//            partidasAux[i] = partidas[i];
//        }
//
//        for (int i = partidas.length; i < partidasAux.length; i++) {
//            partidasAux[i] = listaPartidas[i - partidas.length];
//        }
//
//        partidas = partidasAux;
         //nombreGrupo.setTomeTarjeta(partidasAux)
//    }
    
    public void eliminarTarjetas(int cantidadEliminar){
        
    }
    
    public void redimensionarGrupo(GrupoTarjeta nombreGrupo){
        
    }
    
    public void redimensionarGrupo(){
        
    }
    
}
