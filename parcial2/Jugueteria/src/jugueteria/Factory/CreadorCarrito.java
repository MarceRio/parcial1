/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Factory;

import jugueteria.Carrito;
import java.util.ArrayList;
import java.util.Scanner;
import jugueteria.Juguete;
import jugueteria.Metodos;
import jugueteria.Strategy.Menu;


/**
 *
 * @author Personal
 */
public class CreadorCarrito implements CreadorJuguete{
    
    
    private static Scanner scanner= new Scanner(System.in);
    
    Metodos metodo= new Metodos(); 
    
    @Override
    public Juguete creadorJuguete(){     
        
               
    int id;
    String marca;
    String color;
    int numeroPuertas;
        
        
        System.out.println("Ingrese un color para el carrito "); 
             
        color= metodo.validarString();

        System.out.println("Ingrese el tipo de marca del carrito");
        
        marca= metodo.validarString();

        System.out.println("Ingrese el numero de puertas");
        
        numeroPuertas= metodo.leerInt(); 
           
                  
                
        return Carrito.builder()
                .marca(marca)
                .color(color)
                .numeroPuertas(numeroPuertas)
                .build();
            
      
    
    
    }
}
