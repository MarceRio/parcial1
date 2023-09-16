/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Strategy;

import jugueteria.Metodos;

/**
 *
 * @author Personal
 */
public class AccionEliminar implements Accion{
    @Override
    public void Aplicar() {
        
        Metodos metodo= new Metodos();
        //metodo.eliminarJuguete(carro);

    }

    @Override
    public int getOpcion() {
        return 4;
    }


}

