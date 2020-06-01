package Diseño;

import java.io.Serializable;


public class DiseñoRecorrido implements Serializable{
    
    private int filas;
    private int columnas;
    //Que cuadrante estas?
    private boolean tieneFilasPares(){
        return filas%2==0;
    }
    
    private boolean tieneColumnasPares(){
        return columnas%2==0;
    }
    
    public DiseñoRecorrido(int filas, int columnas){
        
    }
    
    public void definirCuadrante(int i, int j){
        
    }
}
