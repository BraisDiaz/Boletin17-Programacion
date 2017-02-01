
package boletin17_programacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class Notas {
    
    int notas [] = new int[4];
    
    public void cargarArray(){
        
        for(int i=0; i<notas.length; i++){
         
            notas[i] = pedirNota();
        }
        
    }
    
    public int pedirNota(){
        int resultado;
        
        do{
          
          resultado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o resultado"));
        }while(resultado<1||resultado>10);
        return resultado;
        
    }
    
    public void visualizarValoracion(){
        
        int naprobados = 0;
        int nsuspensos = 0;
        
        for(int i=0; i<notas.length; i++)
            
            if(notas[i]>=5){
                naprobados++;
                
            }
            else if(notas[i]<5){
                nsuspensos++;
                
            }
        System.out.println("O nº de aprobados é de " + naprobados);
        System.out.println("O nº de suspensos é de " + nsuspensos);
    }
    
    public void notaMediaClase(){
        
        int acu=0;
        
        for(int i=0; i<notas.length; i++){
            
            acu = acu + notas[i]; 
        }
        System.out.println("A nota media da clase é de " + acu/notas.length);
    }
    
    public void notaMasAlta(){
        
        for(int i=0; i<notas.length; i++){
            
            
          
            
            
        }
    }
}
