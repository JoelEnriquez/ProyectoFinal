package Main;

import Juego.tableroJuego;

/**
 *
 * @author joel
 */
public class Arranque {

    
    public static void main(String[] args) {
        MenuPrincipal menuArranque = new MenuPrincipal();
        menuArranque.setVisible(true);
        tableroJuego tab = new tableroJuego();
        tab.setVisible(true);
    }
    
}
