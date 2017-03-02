
package proyecto_casino;
/**
 *
 * @author David Santos
 */
public class Principal {

    /**
     * si la suma de los dados es 
     * 2->pierde la apuesta
     * 3->pierde el doble
     * 7->gana el doble
     * 11->no pierde nada
     * 12->gana la apuesta
     * otros valores->pierde el 1.5 de la apuesta
     * 
     * @param args
     */
    public static void main(String[] args) {
        Interfaz miInterfaz=new Interfaz();
        miInterfaz.setVisible(true);
        Jugador pepito=new Jugador();
        Dado dado1=new Dado();
        Dado dado2=new Dado();
        
        miInterfaz.dadoInterfaz=dado1;
        miInterfaz.dadoInterfaz2=dado2;
        miInterfaz.pepitoInterfaz=pepito;
        
    }
    
}
