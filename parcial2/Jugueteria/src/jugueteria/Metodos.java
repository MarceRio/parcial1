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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Metodos {
    
    private Set<Juguete> juguetes= new TreeSet<>();
    
      
      
    public Metodos(){
    
              
       
    }
    
    public void agregarJuguete(Set<Juguete> nuevo){
        
        juguetes.add((Juguete) nuevo);
        
    }
    
    public void mostrarJuguete(Set<Juguete> juguetes){
        
        int i;
        
        //for(i=0;i<juguetes.size();i=i+1){
    
                 
         //System.out.println((i+1) + "." + juguetes.get(i).toString());        
         
    
         //}
        
        for (Juguete juguete : juguetes) {
            
            System.out.println(juguete);
            
        
        }
        
    }
    
       
    
    public Set<Juguete> eliminarJuguete(Set<Juguete> juguetes,int num){
        
                
        List <Juguete> juguete = new ArrayList<>(juguetes);
        
               
        juguete.remove(num);
        
        return new LinkedHashSet(juguete);
        
    }
   
    

    
    
    
    
    
}
