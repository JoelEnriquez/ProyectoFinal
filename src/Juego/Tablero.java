package Juego;

import AdministradorGrupos.*;
import Casillas.*;
import PilasYColas.ListaDECircular;
import java.io.Serializable;
import Diseño.CrearJuego.*;


public class Tablero implements Serializable{
    
    private int filas;
    private int columnas;
    private int porcentajeHipotecta;
    private Casilla[][] tablero;
    private ListaDECircular <Casilla> recorrido;
    private GrupoLugar[] grupoLugar;
    private GrupoTarjeta[] grupoTarjeta;
    private AdministradorGruposLugar administradorGruposLugar;
    private AdministradorGruposTomeTarjeta administradorGruposTomeTarjeta;
    private ManejadorCasillasPropiedad manejadorCasillasPropiedad;
    private ManejadorTiposTomaTarjeta manejadorTiposTomaTarjeta;
    
    private String nombreJuego;
    private int numeroJugadores;
    private int limiteCasas;
    private int limiteHoteles;
    private int dineroInicialJugador;
    private int dineroPorVuelta;
    private int numeroDados;

    public Tablero(int filas, int columnas,int porcentajeHipotecta, Casilla[][] tablero, ListaDECircular<Casilla> recorrido, String nombreJuego,
            int numeroJugadores, int limiteCasas, int limiteHoteles, int dineroInicialJugador, int dineroPorVuelta, int numeroDados,
            AdministradorGruposLugar administradorGruposLugar, AdministradorGruposTomeTarjeta administradorGruposTomeTarjeta,
            ManejadorCasillasPropiedad manejadorCasillasPropiedad,ManejadorTiposTomaTarjeta manejadorTiposTomaTarjeta) {
        this.filas = filas;
        this.columnas = columnas;
        this.porcentajeHipotecta = porcentajeHipotecta;
        this.tablero = tablero;
        this.recorrido = recorrido;
        this.nombreJuego = nombreJuego;
        this.numeroJugadores = numeroJugadores;
        this.limiteCasas = limiteCasas;
        this.limiteHoteles = limiteHoteles;
        this.dineroInicialJugador = dineroInicialJugador;
        this.dineroPorVuelta = dineroPorVuelta;
        this.numeroDados = numeroDados;
        this.administradorGruposLugar = administradorGruposLugar;
        this.administradorGruposTomeTarjeta = administradorGruposTomeTarjeta;
        this.manejadorCasillasPropiedad = manejadorCasillasPropiedad;
        this.manejadorTiposTomaTarjeta = manejadorTiposTomaTarjeta;
        grupoTarjeta = this.administradorGruposTomeTarjeta.getGruposTarjeta();
        grupoLugar = this.administradorGruposLugar.getGrupoLugar();
    }

    public int getAlto() {
        return filas;
    }

    public void setAlto(int alto) {
        this.filas = alto;
    }

    public int getAncho() {
        return columnas;
    }

    public void setAncho(int ancho) {
        this.columnas = ancho;
    }

    public Casilla[][] getTablero() {
        return tablero;
    }

    public void setTablero(Casilla[][] tablero) {
        this.tablero = tablero;
    }

    public ListaDECircular<Casilla> getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(ListaDECircular<Casilla> recorrido) {
        this.recorrido = recorrido;
    }


    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getPorcentajeHipotecta() {
        return porcentajeHipotecta;
    }

    public void setPorcentajeHipotecta(int porcentajeHipotecta) {
        this.porcentajeHipotecta = porcentajeHipotecta;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public int getLimiteCasas() {
        return limiteCasas;
    }

    public void setLimiteCasas(int limiteCasas) {
        this.limiteCasas = limiteCasas;
    }

    public int getLimiteHoteles() {
        return limiteHoteles;
    }

    public void setLimiteHoteles(int limiteHoteles) {
        this.limiteHoteles = limiteHoteles;
    }

    public int getDineroInicialJugador() {
        return dineroInicialJugador;
    }

    public void setDineroInicialJugador(int dineroInicialJugador) {
        this.dineroInicialJugador = dineroInicialJugador;
    }

    public int getDineroPorVuelta() {
        return dineroPorVuelta;
    }

    public void setDineroPorVuelta(int dineroPorVuelta) {
        this.dineroPorVuelta = dineroPorVuelta;
    }

    public int getNumeroDados() {
        return numeroDados;
    }

    public void setNumeroDados(int numeroDados) {
        this.numeroDados = numeroDados;
    }

    public GrupoLugar[] getGrupoLugar() {
        return grupoLugar;
    }
    
    public GrupoTarjeta[] getGrupoTarjeta() {
        return grupoTarjeta;
    }

    
    
    
    
    
    
    


    
}
