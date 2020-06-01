package Diseño;

import Casillas.*;
import PilasYColas.ListaDECircular;
import PilasYColas.ListaDECircularException;
import PilasYColas.Nodo;
import java.awt.Color;
import java.io.Serializable;
import javax.swing.JButton;
public class FuncionesDiseño implements Serializable {

    CrearTablero crearTablero;
    private int numeroFilas;
    private int numeroColumnas;
    private int contadorPropiedades = 0;
    Propiedad[] propiedadesNuevas;
    private Casilla[] casillasPorOrdenar;
    private String[] nombreTiposCasilla;
    

    public FuncionesDiseño(int numeroFilas, int numeroColumnas, CrearTablero crearTablero) {
        this.crearTablero = crearTablero;
        this.numeroFilas = numeroFilas;
        this.numeroColumnas = numeroColumnas;
    }

    /**
     * Devuelve el numero de propiedades seleccionadas
     * @param matrizBotones
     * @return 
     */
    public int numeroPropiedades(JButton[][] matrizBotones) {

        int ContadorCasillas = 0;
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                if (matrizBotones[i][j].getName().equals("1")) {
                    ContadorCasillas++;
                }  
            }
        }
        return ContadorCasillas;
    }

    /**
     * Cuando ocurre una transicion de panel, la idea es poner los paneles en
     * color gris
     * @param matrizBotones
     */
    public void despintarBotones(JButton[][] matrizBotones) {
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                matrizBotones[i][j].setBackground(Color.LIGHT_GRAY);
            }
        }
    }

    /**
     * Su fin es que no se repitan dos casillas Inicio
     *
     * @param tablero
     * @return
     */
    public boolean existenciaInicio(Casilla[][] tablero) {
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                if (tablero[i][j] instanceof Inicio) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Obliga a colocar una propiedad como minimo
     * @param tablero
     * @return 
     */
    public boolean existenciaPropiedad(Casilla[][] tablero) {
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                if (tablero[i][j] instanceof Propiedad) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean existenciaCarcel(Casilla[][] tablero){
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                if (tablero[i][j] instanceof Carcel) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean llenadoCasillas(JButton[][] matrizBotones, int casillasSeleccionadas){
        int contadorCasillas = 0;
        
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                if (matrizBotones[i][j].isEnabled()) {
                    if (matrizBotones[i][j].getBackground()!=Color.LIGHT_GRAY) {
                        contadorCasillas++;
                    }
                }
            }
        }
        return contadorCasillas<casillasSeleccionadas;
    }

    
    public void obtenerPropiedades(Casilla[][] tablero, int posicionRecorrido) {
        casillasPorOrdenar = new Casilla[posicionRecorrido - 1];
        int auxiliar = 0;

        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                if (tablero[i][j] instanceof Casilla) {
                    casillasPorOrdenar[auxiliar] = tablero[i][j];
                    auxiliar++;
                }
            }
        }
    }

    
    private void ordenarPropiedades(int primero, int ultimo) {
        int pivote;
        int i = primero;
        int j = ultimo;
        Casilla casillaAuxiliar;
        pivote = casillasPorOrdenar[(primero+ultimo)/2].getPosicionRecorrido();

        do {
            while (casillasPorOrdenar[i].getPosicionRecorrido()<pivote) {
                i++;
            }
            while (casillasPorOrdenar[j].getPosicionRecorrido()>pivote) {
                j--;
            }

            if (i <= j) {
                casillaAuxiliar = casillasPorOrdenar[i];
                casillasPorOrdenar[i] = casillasPorOrdenar[j];
                casillasPorOrdenar[j] = casillaAuxiliar;
                i++;
                j--;
            }
        } while (i <= j);

        if (primero < j) {
            ordenarPropiedades(primero, j);
        }
        if (ultimo > i) {
            ordenarPropiedades(i, ultimo);
        }
    }

    /**
     * Toma las casillas ya ordenedas por coordenada y define el recorrido
     * @param recorrido 
     */
    public void insertarCasillasAlRecorrido(ListaDECircular<Casilla> recorrido) {
        ordenarPropiedades(0, casillasPorOrdenar.length - 1); //Se manda a ordenar antes de ingresarla al recorrido

        for (int i = 0; i < casillasPorOrdenar.length; i++) {
            recorrido.insertarAlFinal(casillasPorOrdenar[i]);
        }
    }

    
    /**
     * Nos permite agarrar el apuntador de primerNodo y darselo a Inicio siempre
     * @param recorrido 
     */
    public void colocarInicioAlPrincipio(ListaDECircular<Casilla> recorrido) {
        Nodo<Casilla> casillaInicio;

        try {
            for (int i = 0; i < recorrido.getUltimoIndice(); i++) {
                casillaInicio = recorrido.obtenerNodoPorIndice(i);
                if (casillaInicio.getContenido() instanceof Inicio) { //Si encuentra una instancia de inicio, ponerla como primerNodo
                    recorrido.setPrimerNodo(casillaInicio);
                    recorrido.setUltimoNodo(casillaInicio.getAnterior());
                }
            }
        } catch (ListaDECircularException ex) {
            crearTablero.mensajeError(ex.getMessage());
        }
        
        //recorrido.imprimirContenido();
    }
    
    public void ajustarPosicionCasillas(ListaDECircular<Casilla> recorrido){
        for (int i = 0; i < recorrido.getUltimoIndice(); i++) {
            try {
                Nodo<Casilla> casilla= recorrido.obtenerNodoPorIndice(i);
                casillasPorOrdenar[i] = casilla.getContenido();
                casillasPorOrdenar[i].setPosicionRecorrido(i);
            } catch (ListaDECircularException ex) {
                crearTablero.mensajeError(ex.getMessage());
            }
        }
    }
    
    public void nombreTiposCasillaTablero(boolean neutro, boolean trampa,
            boolean lugar, boolean servicio, boolean estacion){
        int espacio=0;
        
        if (neutro==true) {
            espacio++;
        }
        if (trampa==true) {
            espacio++;
        }
        if (lugar==true) {
            espacio++;
        }
        if (servicio==true) {
            espacio++;
        }
        if (estacion==true) {
            espacio++;
        }
        
        nombreTiposCasilla = new String[espacio];
        nombresTiposCasilla(neutro, trampa, lugar, servicio, estacion);
    }
    
    /**
     * Asigna nombre a las tipos de propiedad exitentes
     * @param neutro
     * @param trampa
     * @param lugar
     * @param servicio
     * @param estacion 
     */
    private void nombresTiposCasilla(boolean neutro, boolean trampa,
            boolean lugar, boolean servicio, boolean estacion){
        
        for (int i = 0; i < nombreTiposCasilla.length; i++) {
            if (neutro==true) {
                nombreTiposCasilla[i] = "Neutro";
                neutro=false;
            }
            else if (trampa==true) {
                nombreTiposCasilla[i] = "Trampa";
                trampa=false;
            }
            else if (lugar==true) {
                nombreTiposCasilla[i] = "Lugar";
                lugar=false;
            }
            else if (servicio==true) {
                nombreTiposCasilla[i] = "Servicio Basico";
                servicio=false;
            }
            else if (estacion==true) {
                nombreTiposCasilla[i] = "Estacion";
                estacion=false;
            }
        }
    }

    public String[] getNombreTiposCasilla() {
        return nombreTiposCasilla;
    }
    
    public Casilla[] tiposCasilla(){
        Casilla[] tiposCasilla = new Casilla[nombreTiposCasilla.length];
        Neutro neutro = null;
        Trampa trampa = null;
        Lugar lugar = null;
        ServicioBasico servicio = null;
        Estacion estacion = null;
        
        
        for (int i = 0; i < tiposCasilla.length; i++) {
            switch (nombreTiposCasilla[i]) {
                case "Neutro":
                    tiposCasilla[i] = neutro;
                    break;
                case "Trampa":
                    tiposCasilla[i] = trampa;
                    break;
                case "Lugar":
                    tiposCasilla[i] = lugar;
                    break;
                case "Servicio Basico":
                    tiposCasilla[i] = servicio;
                    break;
                case "Estacion":
                    tiposCasilla[i] = estacion;
                    break;
                default:
                    break;
            }
        }
        return tiposCasilla;
    }
    
    private void contadorCasillasPropiedad(){
        
        for (int i = 0; i < casillasPorOrdenar.length; i++) {
            if (casillasPorOrdenar[i] instanceof Propiedad) {
                contadorPropiedades++;
            }
        }
    }
    
    
    public void setCasillasPropiedad(){
        contadorCasillasPropiedad();
        
        propiedadesNuevas = new Propiedad[contadorPropiedades];
        int posicionAux=0;
        
        for (int i = 0; i < casillasPorOrdenar.length; i++) {
            if (casillasPorOrdenar[i] instanceof Propiedad) {
                propiedadesNuevas[posicionAux] = (Propiedad) casillasPorOrdenar[i];
                posicionAux++;
            }    
        }
    }

    public Propiedad[] getPropiedadesNuevas() {
        return propiedadesNuevas;
    }
    
    public void imprimirPosicion(ListaDECircular<Casilla> recorrido){
        Propiedad prueba = propiedadesNuevas[0];
        try {
            int a = recorrido.posicionNodoObjetivo(prueba);
            System.out.println(a);
        } catch (ListaDECircularException ex) {
            ex.getMessage();
        }
    }
    
}
