package Juego;

import EntidadesDinero.Jugador;
import java.io.Serializable;

public class ControladorTurnos implements Serializable{
    Jugador[] jugadoresEnPartida;

    public ControladorTurnos(Jugador[] jugadoresEnPartida) {
        this.jugadoresEnPartida = jugadoresEnPartida;
    }
    
    
    
}
