/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Comparator;
import jugueteria.Juguete;
import jugueteria.Peluche;
import java.util.stream.Collectors;
import jugueteria.Carrito;
import jugueteria.Metodos;

/**
 *
 * @author A01-1-0503-04
 */
public class AccionFiltrar implements Accion{
    
    private static Scanner scanner= new Scanner(System.in);
    Metodos metodo= new Metodos(); 
    Menu acceso= Menu.getInstance();  

    @Override
    public Set<Juguete> aplicar(Set<Juguete> juguetes) {
        
    Set<Juguete>jugueteCopia= new LinkedHashSet<>(juguetes);
        
        if (jugueteCopia.size()==0){
            
            System.out.println("Es necesario crear un juguete");
         
            acceso.mostrarMenu();
         
         }
        
     
     int num;
     
        
     System.out.println("Seleccione el juguete que desee imprimir: 1. Peluches, 2. Carritos");
     
     num=metodo.leerInt();
    
     
     if (num==1){      
    
    
     List <Juguete> peluches =jugueteCopia.stream()
                .filter(juguete -> juguete instanceof Peluche)
                .sorted(Comparator.comparingInt(Juguete::getId))    
                .collect(Collectors.toList()); 
     
                peluches.forEach(System.out::println);         
         
         
         
     }
     
     if (num==2){
         
         List <Juguete> carritos =jugueteCopia.stream()
                .filter(juguete -> juguete instanceof Carrito)
                .sorted(Comparator.comparingInt(Juguete::getId))    
                .collect(Collectors.toList()); 
     
                carritos.forEach(System.out::println);      
         
         
         
     }
     
     return jugueteCopia;
     
    }
          
        
    

    @Override
    public int getOpcion() {
        
        return 5;
    }
       
    


}
     
