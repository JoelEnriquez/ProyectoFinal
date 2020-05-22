package Diseño;

import Casillas.Casilla;
import Casillas.Inicio;
import Casillas.Propiedad;
import PilasYColas.ListaDECircular;
import PilasYColas.ListaDECircularException;
import PilasYColas.Nodo;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class FuncionesDiseño {

    CrearTablero crearTablero;
    private int numeroFilas;
    private int numeroColumnas;

    public FuncionesDiseño(int numeroFilas, int numeroColumnas, CrearTablero crearTablero) {
        this.crearTablero = crearTablero;
        this.numeroFilas = numeroFilas;
        this.numeroColumnas = numeroColumnas;
    }

    public int numeroPropiedades(JButton[][] matrizBotones) {

        int ContadorCasillas = 0;
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                matrizBotones[i][j].getName().equals("1");
                ContadorCasillas++;
            }
        }
        return ContadorCasillas;
    }

    /**
     * Cuando ocurre una transicion de panel, la idea es poner los paneles en
     * color blanco
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
    
    public void insertarCasillasAlRecorrido(){
        
    }

    public void colocarInicioAlPrincipio(ListaDECircular recorrido) {
        Nodo<Casilla> casillaInicio;

        try {
            for (int i = 0; i < recorrido.getUltimoIndice(); i++) {
                casillaInicio = recorrido.obtenerNodoPorIndice(i);
                if (casillaInicio.getContenido() instanceof Inicio) {
                    recorrido.setPrimerNodo(casillaInicio);
                }
            }
        } catch (ListaDECircularException ex) {
            JOptionPane.showMessageDialog(crearTablero, ex.getMessage());
        }
    }
}
