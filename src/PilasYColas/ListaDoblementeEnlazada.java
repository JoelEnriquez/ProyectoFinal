/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilasYColas;

/**
 *
 * @author joel
 */
public class ListaDoblementeEnlazada<T> {

    private Nodo<T> primerNodo;
    private Nodo<T> ultimoNodo;
    private int ultimoIndice = -1;
 

    public void insertar (T contenido) {
        ultimoIndice++;
        Nodo<T> nuevoNodo = new Nodo<>(contenido);
        
        if (esVacia()) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
        } else {
            ultimoNodo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimoNodo);
            ultimoNodo = nuevoNodo;
        }
    }


    public void eliminarUltimoNodo() throws ListaDoblementeEnlazadaException {
        if (esVacia()) {
            throw new ListaDoblementeEnlazadaException("No hay elementos por eliminar");
        }
        
        if (primerNodo.equals(ultimoNodo)) {
            primerNodo = null;
            ultimoNodo = null;
        } else {
            Nodo<T> penultimoNodo = ultimoNodo.getAnterior();
            penultimoNodo.setSiguiente(null);
            ultimoNodo.setAnterior(null);
            ultimoNodo = penultimoNodo;
        }
        ultimoIndice--;
    }

    public boolean esVacia() {
        return ultimoNodo == null;
    }

    public Nodo<T> obtenerNodoPorIndice(int indice)
            throws ListaDoblementeEnlazadaException {
        if (esVacia() || indice > ultimoIndice) {
            throw new ListaDoblementeEnlazadaException("Indice fuera de rango");
        }
        
        Nodo<T> buscado = primerNodo;
        for (int i = 0; i < indice; i++) {
            buscado = buscado.getSiguiente();
        }

        return buscado;
    }

    public Nodo<T> getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(Nodo<T> primerNodo) {
        this.primerNodo = primerNodo;
    }

    public Nodo<T> getUltimoNodo() {
        return ultimoNodo;
    }

    public void setUltimoNodo(Nodo<T> ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }

    public int getUltimoIndice() {
        return ultimoIndice;
    }

}
