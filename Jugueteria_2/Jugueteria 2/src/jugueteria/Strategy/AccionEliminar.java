/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.ArrayList;
import java.util.List;
import jugueteria.Juguete;
import jugueteria.Metodos;

import java.util.Scanner;


/**
 *
 * @author Personal
 */
public class AccionEliminar implements Accion{
    
    Metodos metodo= new Metodos();
    private final Scanner scanner = new Scanner(System.in);
    int num;
    
    @Override
    public List<Juguete> aplicar(List<Juguete> juguetes) {
        
         Menu acceso= Menu.getInstance();  
        
         List<Juguete>jugueteCopia= new ArrayList<>(juguetes);
        
         if (jugueteCopia.size()==0){
            
            System.out.println("Es necesario crear un juguete");
         
            acceso.mostrarMenu();
         
         }
        
        
        System.out.println("Ingrese el numero del juguete que quiere eliminar");
        
        metodo.mostrarJuguete(juguetes);
        
        num=scanner.nextInt();
        
                      
        metodo.eliminarJuguete(jugueteCopia,num);
        
             
        for(int i = num-1; i < jugueteCopia.size(); i++) {
            jugueteCopia.get(i).setId(i+1);
           
        }
        return jugueteCopia;
        
        
    }

    @Override
    public int getOpcion() {
        return 4;
    }

    


}

