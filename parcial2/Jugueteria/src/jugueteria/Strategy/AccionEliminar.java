/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import jugueteria.Juguete;
import jugueteria.Metodos;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author Personal
 */
public class AccionEliminar implements Accion{
    
    Metodos metodo= new Metodos();
    private final Scanner scanner = new Scanner(System.in);
    int num;
    
    @Override
    public Set<Juguete> aplicar(Set<Juguete> juguetes) {
        
         Menu acceso= Menu.getInstance();  
        
         Set<Juguete>jugueteCopia= new LinkedHashSet<>(juguetes);
        
         if (jugueteCopia.size()==0){
            
            System.out.println("Es necesario crear un juguete");
         
            acceso.mostrarMenu();
         
            
         }
        
        
        System.out.println("Ingrese el numero del juguete que quiere eliminar");
        
        metodo.mostrarJuguete(juguetes);
        
        num=metodo.leerInt()-1;
                      
        Set<Juguete> jugueteModificados = metodo.eliminarJuguete(jugueteCopia,num);
        
        List <Juguete> juguete = new ArrayList<>(jugueteModificados);
                    
        for(int i = 0; i < juguete.size(); i++) {            
            
                    
                        
            juguete.get(i).setId(i+1);            
                       
        }
        
        Set<Juguete>jugueteNuevo=new LinkedHashSet<>(juguete);
        
        
        return jugueteNuevo;        
        
    }

    @Override
    public int getOpcion() {
        return 4;
    }

    


}

