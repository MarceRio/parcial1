/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import jugueteria.Juguete;

/**
 *
 * @author Personal
 */
public class Menu {
    
     private static Scanner scanner = new Scanner(System.in);

    private static final int OPCION_SALIR = 5;
    
        
    public static Menu instance;
    
    public static Menu getInstance(){

        if (instance== null){

            instance= new Menu();            
        }

        return instance;
    }
    
    ArrayList<Juguete> lista= new ArrayList();
    
      
      
    public Menu(){
    
        this.lista=new ArrayList<>();
         
       
    }

    @Override
    public String toString() {
        return "Menu{" + "lista=" + lista + '}';
    }
    
    
    
    
    
    public void mostrarMenu(){
        
         Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        int opcion;
      
        do {
            System.out.println("");
            System.out.println("Ingrese una opcion: 1. Crear  2. Clonar 3. Mostrar 4. Eliminar  5.Salir");

            opcion = scanner.nextInt();

            scanner.nextLine();

            Accion accion =strategy.get(opcion);

            if (opcion == OPCION_SALIR ) {continue;}

            if (accion==null){
                System.out.println("Esta opcion no existe");
                System.out.print(" ");

            } else {

                accion.Aplicar();
            }


        } while (opcion != OPCION_SALIR);

        System.out.println("");
    
    
}
    
}
