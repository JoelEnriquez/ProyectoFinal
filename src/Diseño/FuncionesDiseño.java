
package Diseño;

import Casillas.Casilla;
import Casillas.Inicio;
import java.awt.Color;
import javax.swing.JButton;


public class FuncionesDiseño {
    
    private int numeroFilas;
    private int numeroColumnas;

    public FuncionesDiseño(int numeroFilas, int numeroColumnas) {
        this.numeroFilas = numeroFilas;
        this.numeroColumnas = numeroColumnas;
    }
    

    public int numeroPropiedades(JButton[][] matrizBotones){
        
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
     * Cuando ocurre una transicion de panel, la idea es poner los paneles en color blanco
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
}
