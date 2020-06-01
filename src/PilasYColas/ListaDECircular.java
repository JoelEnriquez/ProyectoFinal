/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilasYColas;

import Casillas.Carcel;
import java.io.Serializable;

/**
 *
 * @author joel
 */
public class ListaDECircular<T> implements Serializable{

    private Nodo<T> primerNodo;
    private Nodo<T> ultimoNodo;
    private int tamañoLista = 0;
    private int ultimoIndice = -1;

    public ListaDECircular() {
        primerNodo = null;
        ultimoNodo = null;
    }

    public void insertarAlInicio(T contenido) {

        if (esVacia()) {
            Nodo<T> nuevoNodo = new Nodo<>(contenido);
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
            primerNodo.setSiguiente(ultimoNodo);
            ultimoNodo.setSiguiente(primerNodo);
            primerNodo.setAnterior(ultimoNodo);
            ultimoNodo.setAnterior(primerNodo);
        } else {
            Nodo<T> nuevoNodo = new Nodo<>(contenido, ultimoNodo, primerNodo);
            primerNodo.setAnterior(nuevoNodo);
            ultimoNodo.setSiguiente(nuevoNodo);
            primerNodo = nuevoNodo;
        }
        ultimoIndice++;
        tamañoLista++;
    }

    public void insertarAlFinal(T contenido) {

        if (esVacia()) {
            Nodo<T> nuevoNodo = new Nodo<>(contenido);
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo;
            primerNodo.setSiguiente(ultimoNodo);
            ultimoNodo.setSiguiente(primerNodo);
            primerNodo.setAnterior(ultimoNodo);
            ultimoNodo.setAnterior(primerNodo);
        } else {
            Nodo<T> nuevoNodo = new Nodo<>(contenido, ultimoNodo, primerNodo);
            ultimoNodo.setSiguiente(nuevoNodo);
            primerNodo.setAnterior(nuevoNodo);
            ultimoNodo = nuevoNodo;
        }
        ultimoIndice++;
        tamañoLista++;
    }

    public void eliminarPrimerNodo() throws ListaDECircularException {
        if (esVacia()) {
            throw new ListaDECircularException("No hay elementos por eliminar");
        } else if (primerNodo.equals(ultimoNodo)) {
            primerNodo = null;
            ultimoNodo = null;
        } else {
            primerNodo = primerNodo.getSiguiente();
            primerNodo.setAnterior(ultimoNodo);
            ultimoNodo.setSiguiente(primerNodo);
        }
        ultimoIndice--;
        tamañoLista--;

    }

    public void eliminarUltimoNodo() throws ListaDECircularException {
        if (esVacia()) {
            throw new ListaDECircularException("No hay elementos por eliminar");
        } else if (primerNodo.equals(ultimoNodo)) {
            primerNodo = null;
            ultimoNodo = null;
        } else {
            ultimoNodo = ultimoNodo.getAnterior();
            ultimoNodo.setSiguiente(primerNodo);
            primerNodo.setAnterior(ultimoNodo);
        }
        ultimoIndice--;
        tamañoLista--;
    }

    public void eliminarPorElemento(T buscado) throws ListaDECircularException {
        if (esVacia()) {
            throw new ListaDECircularException("No hay elementos en la lista");

        } else {

            Nodo<T> AuxPrimero = primerNodo.getSiguiente();
            Nodo<T> Anterior = primerNodo;

            if (buscado == primerNodo.getContenido()) {
                eliminarPrimerNodo();
            } else if (buscado == ultimoNodo.getContenido()) {
                eliminarPrimerNodo();
            } else {
                while (AuxPrimero.getContenido() != buscado && AuxPrimero.getSiguiente() != primerNodo) {
                    AuxPrimero = AuxPrimero.getSiguiente();
                    Anterior = Anterior.getAnterior();
                }
                if (AuxPrimero.getSiguiente() != primerNodo) {
                    Anterior.setSiguiente(AuxPrimero.getSiguiente());
                    AuxPrimero = AuxPrimero.getSiguiente();
                    AuxPrimero.setAnterior(Anterior);
                } else {
                    throw new ListaDECircularException("No hay dicho elemento");
                }
            }

        }
    }

    public Nodo<T> obtenerNodoPorIndice(int indice)
            throws ListaDECircularException {
        if (esVacia() || indice > ultimoIndice) {
            throw new ListaDECircularException("Indice fuera de rango");
        } else {
            Nodo<T> buscado = primerNodo;
            for (int i = 0; i < indice; i++) {
                buscado = buscado.getSiguiente();
            }
            return buscado;
        }
    }

    
    public int posicionNodoObjetivo(T dato) throws ListaDECircularException {
        int posicionActual = 0;
        if (esVacia()) {
            throw new ListaDECircularException("No hay elementos");
        } else {
            
            if (dato == primerNodo.getContenido()) {
                return posicionActual;
            }
            else{
                posicionActual++;
                Nodo<T> nodoAux = primerNodo.getSiguiente();
                
                do {     
                    if (dato==nodoAux.getContenido()) {
                        return posicionActual;
                    }
                    else{
                        nodoAux = nodoAux.getSiguiente();
                        posicionActual++;
                    }
                } while (nodoAux!= ultimoNodo.getSiguiente());
            }
        }
        throw new ListaDECircularException("No hay ningun elemento");
    }
    

    public void modificarDato(int indice, T dato) throws ListaDECircularException {
        if (esVacia()) {
            throw new ListaDECircularException("Lista Vacia");
        } else {
            if (indice == 0) {
                primerNodo.setContenido(dato);
            } else {
                if (indice > 0 && indice < ultimoIndice) {
                    Nodo<T> auxiliar = primerNodo;
                    for (int i = 0; i < ultimoIndice; i++) {
                        if (i == indice - 1) {
                            Nodo<T> nodo = auxiliar.getSiguiente();
                            nodo.setContenido(dato);

                            auxiliar.setSiguiente(nodo);
                        } else {
                            auxiliar = auxiliar.getSiguiente();
                        }
                    }
                } else {
                    throw new ListaDECircularException("Posicion fuera de rango");
                }
            }
        }
    }
    
    public Nodo<T> obtenerNodoObjetivoDelante(int posicionActual, int posicionesDelante)
            throws ListaDECircularException{
        if (esVacia()) {
            throw new ListaDECircularException("Lista Vacia");
        }
        else{
            Nodo <T> aux = obtenerNodoPorIndice(posicionActual);
            for (int i = 0; i < posicionesDelante; i++) {
                aux = aux.getSiguiente();
            }
            return aux;
        }
    }
    
    public Nodo<T> obtenerNodoObjetivoDetras(int posicionActual, int posicionesDetras)
            throws ListaDECircularException{
        if (esVacia()) {
            throw new ListaDECircularException("Lista Vacia");
        }
        else{
            Nodo <T> aux = obtenerNodoPorIndice(posicionActual);
            for (int i = 0; i < posicionesDetras; i++) {
                aux = aux.getAnterior();
            }
            return aux;
        }
    }
    
    public Nodo<T> obtenerNodoSiguiente(int posicionActual)
            throws ListaDECircularException{
        if (esVacia()) {
            throw new ListaDECircularException("Lista Vacia");
        }
        else{
            Nodo <T> aux = obtenerNodoPorIndice(posicionActual);
            aux.getSiguiente();
            return aux;
        }
    }

    public int calcularCarcelHaciaAdelante(int indiceActual) throws ListaDECircularException{
        Nodo<T> auxiliar = obtenerNodoPorIndice(indiceActual);
        int contador = 0;
        do {
            auxiliar = auxiliar.getSiguiente();          
            contador++;
        } while (!(auxiliar.getContenido() instanceof Carcel));
        
        return contador;
    }
    
    public int calcularCarcelHaciaAtras(int indiceActual) throws ListaDECircularException{
        Nodo<T> auxiliar = obtenerNodoPorIndice(indiceActual);
        int contador = 0;
        do {
            auxiliar = auxiliar.getAnterior();          
            contador++;
        } while (!(auxiliar.getContenido() instanceof Carcel));
        
        return contador;
    }
    
    

    public void imprimirContenido() {
        if (primerNodo == null) {
            System.out.println("Nulo");
        } else {
            Nodo<T> aux = primerNodo;
            int recorrido = 1;
            System.out.print("Comienzo ");
            do {
                System.out.print(recorrido + ")" + aux.getContenido() + "");
                aux = aux.getSiguiente();
                recorrido++;
            } while (aux != primerNodo);
            System.out.println("Fin");
        }
    }

    public boolean esVacia() {
        return ultimoNodo == null;
    }

    public Nodo<T> getPrimerNodo() {
        return primerNodo;
    }

    public Nodo<T> getUltimoNodo() {
        return ultimoNodo;
    }

    public int getUltimoIndice() {
        return ultimoIndice;
    }

    public int getTamañoLista() {
        return tamañoLista;
    }

    public void setPrimerNodo(Nodo<T> primerNodo) {
        this.primerNodo = primerNodo;
    }

    public void setUltimoNodo(Nodo<T> ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }
}
