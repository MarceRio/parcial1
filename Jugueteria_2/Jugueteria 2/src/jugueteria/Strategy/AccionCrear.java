/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
     
    int opcion;
    
    private final CreadorPeluche creadorPeluche =new CreadorPeluche();
    private final CreadorCarrito creadorCarrito =new CreadorCarrito();
    
                 
    @Override
    public List<Juguete> aplicar(List<Juguete> juguetes) {

        System.out.println("Ingrese una opcion: 1. Crear Peluche 2. Crear Carrito ");
        opcion = scanner.nextInt();
        
        List<Juguete> jugueteCopia= new ArrayList<>(juguetes);
                                    

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
    
    private int generarId(List<Juguete> juguetes) {
        
        return juguetes.size() + 1;
    }
    
    public static Juguete crearJuguete(CreadorJuguete juguete){
        return juguete.creadorJuguete();
    
    }

   
    
}
