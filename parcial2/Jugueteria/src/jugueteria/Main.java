/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import jugueteria.Factory.CreadorJuguete;
import jugueteria.Factory.CreadorPeluche;
import jugueteria.Metodos;
import jugueteria.Strategy.Accion;
import jugueteria.Strategy.AccionHandler;
import jugueteria.Strategy.Menu;

/**
 *
 * @author Personal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    private static Scanner scanner = new Scanner(System.in);

    private static final int OPCION_SALIR = 9;

    public static void main(String[] args) {
        
    Menu acceso= Menu.getInstance();  
    
    acceso.inicializarLista();
        
    acceso.mostrarMenu();
         
       
   
    
    }
    
    
    
    }
    
   