/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilasYColas;

import java.io.Serializable;

/**
 *
 * @author joel
 */
public class Cola<T> implements Serializable {

    private int tamaño;
    private T[] cola;
    private int ultimoIndice;

    public Cola(int tamaño) {
        this.cola = (T[]) new Object[tamaño];
        this.tamaño = tamaño;
        this.ultimoIndice = -1;
    }

    public boolean esVacia() {
        return ultimoIndice == -1;
    }

    public void encolar(T elemento)
            throws Exception {
        if (ultimoIndice < tamaño - 1) {
            ultimoIndice++;
            cola[ultimoIndice] = elemento;
        } else {
            throw new Exception("La cola está llena, no se puede insertar el elemento: " + elemento);
        }
    }

    public T desencolar()
            throws Exception {
        if (!esVacia()) {
            T elemento = cola[0];

            for (int i = 0; i < ultimoIndice; i++) {
                cola[i] = cola[i + 1];
            }
            ultimoIndice--;

            return elemento;
        } else {
            throw new Exception("La cola está vacía.");
        }
    }

    public T inspeccionarFrente()
            throws Exception {
        if (esVacia()) {
            throw new Exception("La cola está vacía.");
        }
        return cola[0];
    }

    public T inspeccionarFin()
            throws Exception {
        if (esVacia()) {
            throw new Exception("La cola está vacía.");
        }
        return cola[ultimoIndice];
    }

    public T verIndice(int indice) {
        return cola[indice];
    }

    public int getTamaño() {
        return tamaño;
    }
}

