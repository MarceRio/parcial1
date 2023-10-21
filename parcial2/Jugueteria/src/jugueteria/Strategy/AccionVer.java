/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import jugueteria.Juguete;
import jugueteria.Metodos;

/**
 *
 * @author Personal
 */
public class AccionVer implements Accion{
    
     Menu acceso= Menu.getInstance();  
        
    @Override
    public Set<Juguete> aplicar(Set<Juguete> juguetes) {
        
    Set<Juguete>jugueteCopia= new LinkedHashSet<>(juguetes);
        
    if (jugueteCopia.size()==0){
            
    System.out.println("Es necesario crear un juguete");
         
    acceso.mostrarMenu();
     
     }
                 
    Metodos metodo= new Metodos();
    
    metodo.mostrarJuguete(juguetes);
    
    return juguetes;
    
  
    
    }

    @Override
    public int getOpcion() {
        return 3;
    }

   
    
}
