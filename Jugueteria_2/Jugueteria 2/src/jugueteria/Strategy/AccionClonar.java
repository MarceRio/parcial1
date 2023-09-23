/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jugueteria.Juguete;
import jugueteria.Metodos;

/**
 *
 * @author Personal
 */

public class AccionClonar implements Accion{
    
    private static Scanner scanner= new Scanner(System.in);
    
    Metodos metodo= new Metodos();
    
    Menu acceso= Menu.getInstance();  
    
       
    
    @Override
    public List<Juguete> aplicar(List<Juguete> juguetes) {
        
        List<Juguete>jugueteCopia= new ArrayList<>(juguetes);
        
         if (jugueteCopia.size()==0){
            
            System.out.println("Es necesario crear un juguete");
         
            acceso.mostrarMenu();
         
         }
        
              
        
        int num;
        int total;
        
        
        
        System.out.println("Ingrese el numero del juguete que quiere clonar");
        metodo.mostrarJuguete(juguetes);        
        num=scanner.nextInt();
        
        Juguete nuevo=juguetes.get(num-1);        
                
        System.out.println("Ingrese el número de veces que quiere clonar el juguete");
        num=scanner.nextInt();
        
        List<Juguete> juguetesCopia = new ArrayList<>(juguetes);
        for(int i = 0; i < num; i++) {
            Juguete jugueteClonado = nuevo.clone();
            jugueteClonado.setId(juguetesCopia.size()+1);
            juguetesCopia.add(jugueteClonado);
        }
        return juguetesCopia;    

    }

    
    
    
    @Override
    public int getOpcion() {
        return 2;
    }

    
}
