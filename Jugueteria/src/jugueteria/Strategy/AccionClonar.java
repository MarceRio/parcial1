/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.Scanner;
import jugueteria.Juguete;

/**
 *
 * @author Personal
 */

public class AccionClonar implements Accion{
    
    private static Scanner scanner= new Scanner(System.in);
    
    @Override
    public void Aplicar() {
        
        int num;
        
        System.out.println("Ingrese el id el elemento de la lista que quiere clonar");
        num=scanner.nextInt();
        
        //numero=getId(num) 
        
        //Juguete juguete = new Juguete(numero);

        //Juguete juguete2= juguete.clone();

        //System.out.println(juguete ==juguete2);

       

    }

    @Override
    public int getOpcion() {
        return 2;
    }
}
