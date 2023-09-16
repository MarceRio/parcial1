/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.ArrayList;
import java.util.Scanner;
import jugueteria.Factory.CreadorCarrito;
import jugueteria.Factory.CreadorJuguete;
import jugueteria.Factory.CreadorPeluche;
import jugueteria.Factory.JugueteIF;
import jugueteria.Factory.Peluche;
import jugueteria.Juguete;
import jugueteria.Metodos;

/**
 *
 * @author Personal
 */
public class AccionCrear implements Accion {
    
 private static Scanner scanner= new Scanner(System.in);
 
    private String color;
    private String relleno;
    private String materialExterior;
    private String marca;
    private int numeroPuertas;
    private int id;
    
    int opcion;
    
    

             
    @Override
    public void Aplicar() {

        System.out.println("Ingrese una opcion: 1. Crear Peluche 2. Crear Carrito ");

        opcion = scanner.nextInt();
        scanner.nextLine();
        id=id+1;
        
        

        if (opcion ==1){
            
                      
            CreadorJuguete juguete= new CreadorPeluche();
            
            JugueteIF nuevo= crearJuguete(juguete);
    
            System.out.println(nuevo);
            
            relleno=this.relleno;
            materialExterior=this.materialExterior;
            
            
            
            
            
        }

        if (opcion ==2){

            
            
            CreadorJuguete juguete= new CreadorCarrito();
    
            JugueteIF nuevo= crearJuguete(juguete);
    
            System.out.println(nuevo);
            
            
            marca=this.marca;
            numeroPuertas=this.numeroPuertas;
            
            //ArrayList<Juguete> lista= new ArrayList();      
             
    
       
            //Metodos metodo= new Metodos();
           
            //Juguete carrito= new Juguete(id,"",nuevo.getColor(),"",numeroPuertas,marca);
    
            //metodo.agregarJuguete(carrito);

        }
        
        
        
              
        
    }

    @Override
    public int getOpcion() {
        return 1;
        
    }
    
    public static JugueteIF crearJuguete(CreadorJuguete juguete){
        return juguete.creadorJuguete();
    
    }
    
}
