/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import jugueteria.Carrito;
import jugueteria.Juguete;
import jugueteria.Peluche;

/**
 *
 * @author Personal
 */
public class Menu {
    
    private static Scanner scanner = new Scanner(System.in);
    
    private final AccionHandler accionHandler = new AccionHandler();

    private static final int OPCION_SALIR = 5;
    
    private Set<Juguete> juguetes= new LinkedHashSet<>();
    
        
    public static  Menu instance;
    
    public static Menu getInstance(){

        if (instance== null){

            instance= new Menu();            
        }

        return instance;
    }
            
      
    public Menu(){ 
       
    }
    
     
    public void mostrarMenu(){
        
        //inicializar();
        
         Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        int opcion;
      
        do {
            System.out.println("");
            System.out.println("Ingrese una opcion: 1. Crear  2. Clonar 3. Mostrar 4. Eliminar 5.Filtrar 6.Salir");

            opcion = scanner.nextInt();

            scanner.nextLine();

            Accion accion =strategy.get(opcion);

            if (opcion == OPCION_SALIR ) {continue;}

            if (accion==null){
                System.out.println("Esta opcion no existe");
                System.out.print(" ");

            } else {

                juguetes=accionHandler.getStrategy().get(opcion).aplicar(juguetes);
            }


        } while (opcion != OPCION_SALIR);

        System.out.println("");
         
    
        
    }
    
    
        
        
}

 
