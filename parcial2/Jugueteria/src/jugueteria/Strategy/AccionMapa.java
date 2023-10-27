/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import jugueteria.Juguete;

/**
 *
 * @author Personal
 */
public class AccionMapa implements Accion{

    @Override
    public Set<Juguete> aplicar(Set<Juguete> juguetes) {
        
        Menu acceso= Menu.getInstance();
        
        Set<Juguete>jugueteCopia= new LinkedHashSet<>(juguetes);
        
         if (jugueteCopia.size()==0){
            
            System.out.println("Es necesario crear un juguete");
         
            acceso.mostrarMenu();
         
         }
        
              
       Map<Integer,Juguete> mapa=jugueteCopia.stream()
               .collect(Collectors.toMap(nuevo -> nuevo.getId(),nuevo -> nuevo));      
       
         
       mapa.forEach((key,value)-> System.out.println("Key ->" +key+":"+"Value->"+mapa.get(key)));                    
        
       return jugueteCopia;
        
        
    }

    @Override
    public int getOpcion() {
        return 7;
    }
    
}
