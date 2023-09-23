/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria;

/**
 *
 * @author Personal
 */


import java.util.ArrayList;
import java.util.List;

public class Metodos {
    
    private List<Juguete> juguetes= new ArrayList<>();
    
      
      
    public Metodos(){
    
              
       
    }
    
    public void agregarJuguete(List<Juguete> nuevo){
        
        juguetes.add((Juguete) nuevo);
        
    }
    
    public void mostrarJuguete(List<Juguete> juguetes){
        
        int i;
        
        for(i=0;i<juguetes.size();i=i+1){
    
                 
         System.out.println((i+1) + "." + juguetes.get(i).toString());        
         
    
         }
    }
    
       
    
    public void eliminarJuguete(List<Juguete> juguetes,int num){
        
        juguetes.remove(num-1);
        
    }
   
    

    
    
    
    
    
}
