package Juego;

import Agregados.SuperClaseAcciones;
import Casillas.*;
import EntidadesDinero.Jugador;
import PilasYColas.*;
import java.io.Serializable;
import javax.swing.JOptionPane;



public class AccionJuegoTarjetas extends SuperClaseAcciones implements Serializable {

    
    public AccionJuegoTarjetas(ListaDECircular<Casilla> recorridoJuego, Jugar jugar){
        super.setRecorridoJuego(recorridoJuego);
        super.setJuego(jugar);

    }

    /**
     * La fila y columna, represantan la posicion actual del jugador.
     * @param numeroPasos
     * @param posicionActual 
     * @param jugador 
     */
    public void caminar(int numeroPasos, int posicionActual, Jugador jugador) {
        
        Nodo<Casilla> casillaObtenida = null;
        
        if (numeroPasos>0) {
            try {
                casillaObtenida = recorridoJuego.obtenerNodoObjetivoDelante(posicionActual, numeroPasos);
            } catch (ListaDECircularException ex) {
                JOptionPane.showMessageDialog(juego, ex.getMessage());
            }
        }
        else{
            try {
                //Es necesario mandarlo con su valor absoluto puesto que esta como negativo por fines didacticos.
                casillaObtenida = recorridoJuego.obtenerNodoObjetivoDetras(posicionActual, Math.abs(numeroPasos));
            } catch (ListaDECircularException e) {
               JOptionPane.showMessageDialog(juego, e.getMessage()); 
            }
        }
        Casilla destino = casillaObtenida.getContenido();
        
        jugador.setPosicionActual(destino.getPosicionRecorrido());
    }
    
    public void darPremio(int cantidadDinero, Jugador jugadorBeneficiado){
        int dineroActual = jugadorBeneficiado.getCantidadDinero();
        jugadorBeneficiado.setCantidadDinero(dineroActual + cantidadDinero);
    }

    public void pagarAJugadores(Jugador jugadorGeneroso, int cantidadPagar){
        
    }
    
    //Pago a jugadores
    //Mover a casilla
    //Salga de la carcel
    //Personalizado
    
}
