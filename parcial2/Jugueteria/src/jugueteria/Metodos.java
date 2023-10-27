/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria;

/**
 *
 * @author Personal
 */


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Metodos {
    
    private Set<Juguete> juguetes= new TreeSet<>();
    
      
      
    public Metodos(){
    
              
       
    }
    
    public void agregarJuguete(Set<Juguete> nuevo){
        
        juguetes.add((Juguete) nuevo);
        
    }
    
    public void mostrarJuguete(Set<Juguete> juguetes){
        
        int i;
        
                
        for (Juguete juguete : juguetes) {
            
            System.out.println(juguete);
            
        }
        
    }
    
       
       
    
    public Set<Juguete> eliminarJuguete(Set<Juguete> juguetes,int num){
        
                
        List <Juguete> juguete = new ArrayList<>(juguetes);
        
               
        juguete.remove(num);
        
        return new LinkedHashSet(juguete);
        
    }
   
    
    public static int leerInt(){
        
        Integer y= 0;
        boolean esNumero=false;
        
        Scanner teclado = new Scanner(System.in);
        do{
            
            String x = teclado.next();
            
            try {
	        y= Integer.parseInt(x);
		esNumero=true;
	     }  catch (NumberFormatException e) {
	       System.out.println("Debe ingresar un numero entero ");
               
             }   
            
           }while ( !esNumero);
        
          
        return y;
    }
    
    public static String validarString(){
        
       Scanner entrada = new Scanner(System.in);
       String caracter="";
       boolean texto;
       do {
        
        caracter = entrada.next();
        if (caracter.matches("^[A-Za-z ]*$")) {
            
            texto = true;
 
        } else {
            System.out.println("No ha ingresado un texto");
            texto = false;
        }
        } while (!texto);
    
        return caracter;
    }
       
    
    
}
