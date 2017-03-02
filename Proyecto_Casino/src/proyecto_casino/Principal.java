
package proyecto_casino;
/**
 *
 * @author David Santos
 */
public class Principal {

  
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
