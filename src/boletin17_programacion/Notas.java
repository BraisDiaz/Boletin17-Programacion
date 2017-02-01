
package boletin17_programacion;


import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class Notas {
    
    int notas [] = new int[4];
    String nomes [] = new String[4];
    
    public int pedirNota(){
        int resultado;
        
        do{
          
          resultado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o resultado"));
        }while(resultado<1||resultado>10);
        return resultado;
        
    }
    
    public String pedirNome(){
        
        String nome = JOptionPane.showInputDialog("Introducir nome do alumno");
        return nome;
        
    }
    
    public void cargarArray(){
        
        for(int i=0; i<notas.length; i++){
         
            notas[i] = pedirNota();
            nomes[i] = pedirNome();
        }
        
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
        
        int notaM = notas[0];
        
        for(int i=0; i<notas.length; i++){
            
            if(notas[i]>notaM){
            notaM = notas[i];
        }
            
        }
        System.out.println("La nota más Alta es " + notaM);
    }
    
    public void alumnosAprobados(){
        
        for (int i=0; i<notas.length; i++){
            
            if(notas[i]>=5){
                
                System.out.println("O alumno " + nomes[i] + " con nota " + notas[i] + " está aprobado");
            }
            else
                System.out.println("O alumno " + nomes[i] + " con nota " + notas[i] + " está suspenso");
            
        }
        
    }
    
    public void visualizarAlumno(){
        
        String auxNome = JOptionPane.showInputDialog("Introducir nome a buscar");
        boolean atopado = false;
        
        for (int i=0; i<notas.length; i++){
            
            if(auxNome.equals(nomes[i])){
                System.out.println("A nota do alumno : " + nomes[i] + " é " + notas[i]);
                atopado = true;
            }  
                    
        
    }
            if(atopado==false){
                System.out.println("O alumno introducido non está na lista");
                
            }
 
}
    
    public void ordenarNotasCrecente(){
        
        for(int i=0;i<(notas.length-1);i++){
            for(int j=i+1;j<notas.length;j++){
                
		if(notas[i]>notas[j]){
					
		int variableauxiliar=notas[i];
	        notas[i]=notas[j];
	        notas[j]=variableauxiliar;
            }
        }
        }
    }
}