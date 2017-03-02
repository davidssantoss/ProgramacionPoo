/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_casino;

import java.util.Random;

/**
 *
 * @author David Santos
 */
public class Dado {
    
    int valor;
    
    
    public void lanzar(){
        Random rnd=new Random();
        valor=rnd.nextInt(6)+1;
    }
      /**
     * si la suma de los dados es 
     * 2->pierde la apuesta
     * 3->pierde el doble
     * 7->gana el doble
     * 11->no pierde nada
     * 12->gana la apuesta
     * otros valores->pierde el 1.5 de la apuesta
     * 
     */
    
    
}
