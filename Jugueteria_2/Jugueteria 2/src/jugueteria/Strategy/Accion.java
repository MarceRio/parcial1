/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.List;
import jugueteria.Juguete;

/**
 *
 * @author Personal
 */
public interface Accion {
    
    List<Juguete> aplicar(List<Juguete> juguetes);
    
    int getOpcion ();
    
}
