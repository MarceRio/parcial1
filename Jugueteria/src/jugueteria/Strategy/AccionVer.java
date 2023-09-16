/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.ArrayList;
import jugueteria.Juguete;
import jugueteria.Metodos;

/**
 *
 * @author Personal
 */
public class AccionVer implements Accion{
    @Override
    public void Aplicar() {
        
        
    Menu nuevo= Menu.getInstance();
    
           
    Metodos metodo= new Metodos();
    
    metodo.mostrarJuguete();
    
   
    }

    @Override
    public int getOpcion() {
        return 3;
    }
    
}
