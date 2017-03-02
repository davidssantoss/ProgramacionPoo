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
    
}
