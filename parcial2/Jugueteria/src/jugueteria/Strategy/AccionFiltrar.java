/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.Set;
import jugueteria.Juguete;

/**
 *
 * @author A01-1-0503-04
 */
public class AccionFiltrar implements Accion{

    @Override
    public Set<Juguete> aplicar(Set<Juguete> juguetes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getOpcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getOpcion() {
        
        return 5;
        
    }
    
}

     
