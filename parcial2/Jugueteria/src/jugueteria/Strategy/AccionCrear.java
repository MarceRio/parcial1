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
import java.util.TreeSet;
import jugueteria.Factory.CreadorCarrito;
import jugueteria.Factory.CreadorJuguete;
import jugueteria.Factory.CreadorPeluche;
import jugueteria.Peluche;
import jugueteria.Juguete;
import jugueteria.Metodos;


/**
 *
 * @author Personal
 */
public class AccionCrear implements Accion {
    
 private static Scanner scanner= new Scanner(System.in);
 
 Metodos metodo= new Metodos(); 
     
    int opcion;
    
    private final CreadorPeluche creadorPeluche =new CreadorPeluche();
    private final CreadorCarrito creadorCarrito =new CreadorCarrito();
    Menu acceso= Menu.getInstance(); 
    
    
    
    
                 
    @Override
    public Set<Juguete> aplicar(Set<Juguete> juguetes) {
        
        Set<Juguete> jugueteCopia= new LinkedHashSet<>(juguetes);
        
         if (jugueteCopia.size()==0){
            
            System.out.println("Es necesario crear un juguete");
         
            acceso.mostrarMenu();
         
         }

        System.out.println("Ingrese una opcion: 1. Crear Peluche 2. Crear Carrito ");
       
        opcion=metodo.leerInt();
        
             
                                            

        if (opcion ==1){            
                    
            CreadorJuguete juguete= new CreadorPeluche();
            
            Juguete nuevo= crearJuguete(juguete);
            
            nuevo.setId(generarId(juguetes));
            
            jugueteCopia.add(nuevo);          
                                     
            
        }

        if (opcion ==2){

            
            CreadorJuguete juguete= new CreadorCarrito();
    
            Juguete nuevo= crearJuguete(juguete);
            
            nuevo.setId(generarId(juguetes));
            
             
            jugueteCopia.add(nuevo);   
                       
            
     }
        
          
           
    return jugueteCopia;         
        
        
    }
    
   

    @Override
    public int getOpcion() {
        return 1;
        
    }
    
    private int generarId(Set<Juguete> juguetes) {
        
        return juguetes.size() + 1;
    }
    
    public static Juguete crearJuguete(CreadorJuguete juguete){
        return juguete.creadorJuguete();
    
    }

   
    
}
