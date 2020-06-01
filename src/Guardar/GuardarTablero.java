/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guardar;

import EntidadesDinero.Jugador;
import Juego.Tablero;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author joel
 */
public class GuardarTablero {
    
    
    public void guardarTablero(String path, Tablero tablero){
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(path));
            salida.writeObject(tablero);
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Jugador[] leerTablero(String path) throws Exception {
        try {
            ObjectInputStream flujoSalida = new ObjectInputStream(new FileInputStream(path));
            Object salida = flujoSalida.readObject();
            flujoSalida.close();
            return (Jugador[]) salida;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new Exception("Error al cargar el tablero");
        }
    }
    
}
