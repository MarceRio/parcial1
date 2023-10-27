/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Factory;


import java.util.ArrayList;
import java.util.Scanner;

import jugueteria.Metodos;
import jugueteria.Strategy.Menu;
import jugueteria.Juguete;
import jugueteria.Peluche;


/**
 *
 * @author Personal
 */
public class CreadorPeluche implements CreadorJuguete {
    
    private static Scanner scanner= new Scanner(System.in);
    
    Metodos metodo= new Metodos(); 

    @Override
    public Juguete creadorJuguete() {
               
    String color;
    String relleno;
    String materialExterior;
    int id;


    System.out.println ("Ingrese el tipo de material de relleno");
    relleno  = metodo.validarString();
    
    System.out.println ("Ingrese un color para el peluche ");
    color  = metodo.validarString();

    System.out.println ("Ingrese el tipo de material exterior");
     materialExterior  = metodo.validarString();
      
                   

    return Peluche.builder()
                .materialExterior(materialExterior)
                .color(color)
                .relleno(relleno)
                .build();    
       
        
                
    }
    
}
