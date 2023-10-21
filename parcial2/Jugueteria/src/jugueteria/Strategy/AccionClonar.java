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
    public Set<Juguete> aplicar(Set<Juguete> juguetes) {
        
        Set<Juguete>jugueteCopia= new LinkedHashSet<>(juguetes);
        
         if (jugueteCopia.size()==0){
            
            System.out.println("Es necesario crear un juguete");
         
            acceso.mostrarMenu();
         
         }
        
              
        
        int num;
        int total;
        
        
        
        System.out.println("Ingrese el numero del juguete que quiere clonar");
        metodo.mostrarJuguete(juguetes);        
        num=scanner.nextInt()-1;
        
        Juguete[] juguete = juguetes.toArray(new Juguete[juguetes.size()]);
        
        Juguete nuevo= juguete[num];        
                
        System.out.println("Ingrese el número de veces que quiere clonar el juguete");
        num=scanner.nextInt();
        
        Set<Juguete> juguetesCopia = new LinkedHashSet<>(juguetes);
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
