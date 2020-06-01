package Agregados;

import Casillas.Casilla;
import Casillas.Inicio;
import EntidadesDinero.Jugador;
import Juego.Jugar;
import Juego.Tablero;
import PilasYColas.*;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author joel
 */
public class SuperClaseAcciones implements Serializable{

    protected Tablero tablero;
    protected ListaDECircular<Casilla> recorridoJuego;
    protected Jugar juego;
    private int pasosAdelante;
    private int pasosAtras;

    /**
     * Nos permite avanzar y si caemos o pasamos por inicio, sumar a cantidad de Dinero establecido.
     * @param posicionActual
     * @param posicionDestino
     * @param jugador 
     */
    protected void moverseHaciaAdelante(int posicionActual, int posicionDestino, Jugador jugador){
        Nodo<Casilla> nodoAux;
        int contadorAux = posicionDestino;
        try {
            nodoAux = recorridoJuego.obtenerNodoPorIndice(posicionActual);
            do {
                nodoAux.getSiguiente();
                if (nodoAux.getContenido() instanceof Inicio) { //Para comprobar si paso por inicio
                    jugador.aumentarDinero(tablero.getDineroPorVuelta());
                }
                contadorAux--;
            } while (contadorAux>0);
            
            jugador.setPosicionActual(nodoAux.getContenido().getPosicionRecorrido());
         
        } catch (ListaDECircularException e) {
            JOptionPane.showMessageDialog(juego, e.getMessage());
        }
    }

    /**
     * Nos sirve para saber cual es la instancia de carcel mas cercana mandando como
     * parametro la posicionActual en la que nos encontramos.
     * @param posicionActual
     * @param jugador 
     */
    protected void dirigirseACarcel(int posicionActual, Jugador jugador){
        Nodo<Casilla> nodoAux;
        try {
            calcularCarcelMasCercana(posicionActual);
            //Si la carcel mas cercana queda adelante, dirigirse hacia ella y no cobrando peaje.
            if (pasosAdelante>pasosAtras) {
                nodoAux = recorridoJuego.obtenerNodoObjetivoDelante(posicionActual, pasosAdelante);
            }
            else{
                nodoAux = recorridoJuego.obtenerNodoObjetivoDetras(posicionActual, pasosAtras);
            }
            
            jugador.setPosicionActual(nodoAux.getContenido().getPosicionRecorrido());
            
        } catch (ListaDECircularException ex) {
            JOptionPane.showMessageDialog(juego, ex.getMessage());
        }
    }
    
    private void calcularCarcelMasCercana(int posicionActual) throws ListaDECircularException{
       pasosAdelante =recorridoJuego.calcularCarcelHaciaAdelante(posicionActual);
       pasosAtras = recorridoJuego.calcularCarcelHaciaAtras(posicionActual);
    }
    
    protected void perderTurno(int cantidadTurnosPerdidos, Jugador jugador){
        jugador.setPierdeTurno(true);
        jugador.setContadorPierdeTurno(cantidadTurnosPerdidos);
    }
    
    protected void imponerMulta(int cantidadPagar, Jugador jugador){
        jugador.descontarDinero(cantidadPagar);
    }

    
    public void setJuego(Jugar juego) {
        this.juego = juego;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public void setRecorridoJuego(ListaDECircular<Casilla> recorridoJuego) {
        this.recorridoJuego = recorridoJuego;
    }  
    
}

