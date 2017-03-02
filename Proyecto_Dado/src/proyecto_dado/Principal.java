
package proyecto_dado;

/**
 *
 * @author labing506
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interfaz miInterfaz=new Interfaz();
        //miInterfaz.setVisible(true);
        Jugador pepito=new Jugador();
        Dado dado1=new Dado();
        Dado dado2=new Dado();
        dado2.lanzar();
    }
    
}
