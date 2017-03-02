
package proyecto_casino;

/**
 *
 * @author David Samtos
 */
public class Jugador {
    
    double Apuesta;
    double Billetera;
    double resultado;
    
    public double resultado_dados2(){
        
        resultado=Billetera-Apuesta;       
    return resultado;
    }
    
    public double resultado_dados3(){
        
        resultado=Billetera-(2*Apuesta);       
    return resultado;
    }
    public double resultado_dados7(){
        
        resultado=Billetera+(2*Apuesta);       
    return resultado;
    }
    public double resultado_dados11(){
        
        resultado=Billetera;       
    return resultado;
    }
    public double resultado_dados12(){
        
        resultado=Billetera+Apuesta;       
    return resultado;
    }
    public double resultado_dadosotros(){
        
        resultado=Billetera-(1.5*Apuesta);       
    return resultado;
    }
}
