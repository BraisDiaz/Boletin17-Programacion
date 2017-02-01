
package boletin17_programacion;

import java.util.Random;

/**
 *
 * @author Brais Núñez
 */
public class Numeros {
    
    int numeros [] = new int[6];
    
    public void cargarArray(){
        Random rand = new Random();
        int aux ;
       
        for (int i=0; i<numeros.length; i++){
            
            numeros[i] = rand.nextInt(50);
        }
        
    }
    public void visualizarAlReves(){
        
       for (int i = numeros.length-1; i>=0; i--){
           
           System.out.println(numeros[i]);
       }
    }
    
}
