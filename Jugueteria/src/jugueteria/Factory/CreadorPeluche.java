/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Factory;

import java.util.ArrayList;
import java.util.Scanner;
import jugueteria.Juguete;

import jugueteria.Metodos;
import jugueteria.Strategy.Menu;

/**
 *
 * @author Personal
 */
public class CreadorPeluche implements CreadorJuguete {
    
    private static Scanner scanner= new Scanner(System.in);

    @Override
    public JugueteIF creadorJuguete() {

               
    String color;
    String relleno;
    String materialExterior;
    int id;

    System.out.println ("Ingrese un id para el peluche ");
    id  = scanner.nextInt();

    System.out.println (
    "Ingrese el tipo de material de relleno (Algodon, espuma)");
    relleno  = scanner.next();
    
    System.out.println (
    "Ingrese un color para el peluche ");
    color  = scanner.next();

    System.out.println (
    "Ingrese el tipo de material exterior (Tela, Plastico)");
    materialExterior  = scanner.next();
    
                    
            Metodos metodo= new Metodos();
           
            Juguete peluche= new Juguete(id,relleno,color,materialExterior,0,"");
    
            metodo.agregarJuguete(peluche);
            
            metodo.mostrarJuguete();

    return new Peluche(id,materialExterior,color,relleno);
        
        
        //return new Peluche(2,"tela","rojo","algodon");  
        
        
        
        //Juguete peluche=Juguete.getInstance(nuevo.getId(),nuevo.getColor(),nuevo.getMaterialExterior(),nuevo.getRelleno(),numero,marca);
         
        //Metodos metodo= new Metodos();
        
        //metodo.agregarJuguete(peluche);
        
                
    }
    
}
