
package boletin17_programacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class Dni {
    
    char letra[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
    public void calcularLetraDni(){

       int dni = (Integer.parseInt(JOptionPane.showInputDialog("Introduce  numero DNI")));

       System.out.println("A letra para o DNI " + dni + " é " + letra[dni%23]);

    }
}

    

