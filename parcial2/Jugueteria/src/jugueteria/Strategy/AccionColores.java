/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import jugueteria.Juguete;
import jugueteria.Metodos;

/**
 *
 * @author Personal
 */
public class AccionColores implements Accion{
    Metodos metodo= new Metodos();  
    private static Scanner scanner= new Scanner(System.in);
    Menu acceso= Menu.getInstance(); 
     
    String opcion;
    
    @Override
    public Set<Juguete> aplicar(Set<Juguete> juguetes) {
        
         Set<Juguete>jugueteCopia= new LinkedHashSet<>(juguetes);
         
         List <Juguete> juguete = new ArrayList<>(juguetes); 
         
         
         if (jugueteCopia.size()==0){
            
            System.out.println("Es necesario crear un juguete");
         
            acceso.mostrarMenu();
         
         }
                           
         Set<String> color =jugueteCopia.stream()
                .map(colores -> colores.getColor())
                .collect(Collectors.toSet());
         
         System.out.println("Se tienen juguetes de los siguientes colores");
         
         System.out.println(color);
         
         System.out.println("Ingrese el color de los juguetes que desea eliminar");
         opcion = metodo.validarString();
         
                  
         List<Juguete> jugueteColor= jugueteCopia.stream()
                .filter(colores -> !opcion.equalsIgnoreCase(colores.getColor()))     
                .collect(Collectors.toList());
                        
         
            
         
         for(int i = 0; i < jugueteColor.size(); i++) {            
            
                    
                     
            jugueteColor.get(i).setId(i+1);            
                       
            }
        
        Set<Juguete>jugueteNuevo=new LinkedHashSet<>(jugueteColor);         
                 
                  
         return jugueteNuevo;              
         
    }

    @Override
    public int getOpcion() {
        return 8;
    }
    
}
