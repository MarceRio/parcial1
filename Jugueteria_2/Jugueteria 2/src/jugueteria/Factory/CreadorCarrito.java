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
    
    @Override
    public Juguete creadorJuguete(){     
        
               
    int id;
    String marca;
    String color;
    int numeroPuertas;
        
        
        System.out.println("Ingrese un color para el carrito ");
        color= scanner.next();

        System.out.println("Ingrese el tipo de marca del carrito");
        marca= scanner.next();

        System.out.println("Ingrese el numero de puertas");
        numeroPuertas= scanner.nextInt();       
             
           
                  
                
        return Carrito.builder()
                .marca(marca)
                .color(color)
                .numeroPuertas(numeroPuertas)
                .build();
            
       // Carrito nuevo= new Carrito(2,"tela,"rojo","algodon");   
        
        //Juguete carrito=Juguete.getInstance(nuevo.getId(),nuevo.getColor(),nuevo.getMarca(),relleno,nuevo.getNumeroPuertas(),materialExterior);
         
        //Metodos metodo= new Metodos();
        
       // metodo.agregarJuguete(carrito);
        
    
    
    }
}
