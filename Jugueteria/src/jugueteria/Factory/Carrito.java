/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria.Factory;

import jugueteria.Juguete;

/**
 *
 * @author Personal
 */
public class Carrito implements JugueteIF{
    
    private int id;
    private String marca;
    private String color;
    private int numeroPuertas;

    public Carrito(int id, String marca, String color,int numeroPuertas) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Carrito{" + "id=" + id + ", marca=" + marca + ", color=" + color + ", numeroPuertas=" + numeroPuertas + '}';
    }
    
 
   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        
        this.color=color;
        
    }

    @Override
    public int getId() {
        
        return id;
    }

    @Override
    public void setId(int id) {
        
        this.id=id;
        
        
    }

      
    
    
}
