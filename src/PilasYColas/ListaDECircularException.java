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
public class ListaDECircularException extends Exception implements Serializable{

    public ListaDECircularException(String message) {
        super(message);
    }
}
