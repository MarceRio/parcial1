/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Personal
 */
public class AccionHandler {

    public AccionHandler(){}

    private static final List<Accion> ListaDeAcciones =
            
            Stream.of(new AccionCrear(),
                new AccionVer(),
                  new AccionClonar(),
               new AccionEliminar()).collect(Collectors.toList());           
            

            //List.of(new AccionCrear(),
              //      new AccionVer(),
                //    new AccionClonar(),
                  //  new AccionEliminar());

    public static Map<Integer, Accion> getStrategy(){

        Map<Integer, Accion> strategy = new HashMap<>();
        for (Accion accion: ListaDeAcciones) {

            strategy.put(accion.getOpcion(),accion);
        }
        return strategy;
    }
}
