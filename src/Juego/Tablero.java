package Juego;

import Casillas.Casilla;
import PilasYColas.ListaDoblementeEnlazada;


public class Tablero {
    
    private int alto;
    private int ancho;
    private Casilla[][] tablero;
    private ListaDoblementeEnlazada <Casilla> recorrido;

    public Tablero(int alto, int ancho, Casilla[][] tablero, ListaDoblementeEnlazada<Casilla> recorrido) {
        this.alto = alto;
        this.ancho = ancho;
        this.tablero = tablero;
        this.recorrido = recorrido;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public Casilla[][] getTablero() {
        return tablero;
    }

    public void setTablero(Casilla[][] tablero) {
        this.tablero = tablero;
    }

    public ListaDoblementeEnlazada<Casilla> getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(ListaDoblementeEnlazada<Casilla> recorrido) {
        this.recorrido = recorrido;
    }
    
//    public boolean existenciaCasilla(Casilla casilla, Casilla[][] tablero){
//        for (int i = 0; i < alto; i++) {
//            for (int j = 0; j < ancho; j++) {
//                tablero[i][j].equals(casilla);
//                return true;
//            }
//        }
//        return false;
//    }

    
}
