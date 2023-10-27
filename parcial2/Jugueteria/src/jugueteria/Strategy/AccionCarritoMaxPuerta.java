package jugueteria.Strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import jugueteria.Carrito;
import jugueteria.Juguete;
import jugueteria.Metodos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class AccionCarritoMaxPuerta implements Accion {
    
    Metodos metodo= new Metodos();

    @Override
    public Set<Juguete> aplicar(Set<Juguete> juguetes) {
        
        Menu acceso= Menu.getInstance();  
        
        Set<Juguete>jugueteCopia= new LinkedHashSet<>(juguetes);
        
        //List<Juguete>juguete= new ArrayList<>(juguetes);
        
                
         if (jugueteCopia.size()==0){
            
          System.out.println("Es necesario crear un juguete");
         
          acceso.mostrarMenu();
        
         
         
         }
         
         
         Set <Juguete> carritos =jugueteCopia.stream()
                .filter(j -> j instanceof Carrito)
                .collect(Collectors.toSet());
         
                                          
         Optional <Carrito> maxNumeroPuertas =carritos.stream()
                 .map(juguete ->(Carrito)juguete)
                 .max(Comparator.comparing(carrito -> carrito.getNumeroPuertas())); 
         
         
            
                     
         if (maxNumeroPuertas.isPresent()){  

              System.out.println("El carrito con el máximo número de puertas es");
                        
              System.out.println(maxNumeroPuertas);  
         }
         else {
         System.out.println("No hay carritos");   
         
         }               
                       
          return jugueteCopia;
    }

    @Override
    public int getOpcion() {
        return 6;
    }
    
}
