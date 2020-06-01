package Juego;

import Agregados.SuperClaseAcciones;
import Casillas.Casilla;
import EntidadesDinero.Jugador;
import PilasYColas.*;


public class AccionJuegoTarjetas extends SuperClaseAcciones {
    
    private ListaDECircular<Casilla> recorridoJuego;
    
    //Caminar
    
    public AccionJuegoTarjetas(ListaDECircular<Casilla> recorridoJuego){
        this.recorridoJuego = recorridoJuego;
        
    }

    /**
     * La fila y columna, represantan la posicion actual del jugador.
     * @param numeroPasos
     * @param fila
     * @param columna 
     */
    public void caminar(int numeroPasos, int fila, int columna) {
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
