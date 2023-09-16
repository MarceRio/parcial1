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
    
    ArrayList<Juguete> lista= new ArrayList();
    
      
      
    public Metodos(){
    
              
       
    }
    
    public void agregarJuguete(Juguete nuevo){
        
        lista.add(nuevo);
        
    }
    
    public void mostrarJuguete(){
        int i;
        for(i=0;i<lista.size();i=i+1){
    
         System.out.println(lista.get(i));
    
         }
    }
    
    public void imprimirLista(){
        
        
    
         System.out.println(lista);
    
        
        
    }
    
    
    public void eliminarJuguete(Juguete nuevo){
        
        lista.remove(nuevo);
        
    }
   
    

    
    
    
    
    
}
