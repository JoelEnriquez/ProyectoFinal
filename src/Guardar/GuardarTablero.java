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
    
    
    public void guardarTablero(String path, Tablero tablero) throws Exception{
        try {
            try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(path))) {
                salida.writeObject(tablero);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public Tablero leerTablero(String path) throws Exception {
        try {
            Object salida;
            try (ObjectInputStream flujoSalida = new ObjectInputStream(new FileInputStream(path))) {
                salida = flujoSalida.readObject();
            }
            return (Tablero) salida;
        } catch (IOException | ClassNotFoundException e) {
            throw new Exception(e.getMessage());
        } 
    }
    
}
