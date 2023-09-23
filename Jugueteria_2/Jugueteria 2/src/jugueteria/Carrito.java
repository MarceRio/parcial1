/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria;

import jugueteria.Juguete;

/**
 *
 * @author Personal
 */
public class Carrito implements Juguete{
    
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

    @Override
    public Juguete clone() {   
        
        return Carrito.builder()
                .marca(this.marca)
                .color(this.color)
                .numeroPuertas(this.numeroPuertas)
                .build();
        
    }
    
    public static CarritoBuilder builder(){
        
        return new CarritoBuilder();
    }

    public static class CarritoBuilder{
        
        private int id;
        private String marca;
        private String color;
        private int numeroPuertas;
        

             
        public CarritoBuilder id(int id){
            
            this.id=id;
            return this;
            
        }
        
        public CarritoBuilder color(String color){
            
            this.color=color;
            return this;
            
        }
        public CarritoBuilder numeroPuertas(int numeroPuertas){
            
            this.numeroPuertas=numeroPuertas;
            return this;
            
        }
        
        public CarritoBuilder marca(String marca){
            
            this.marca=marca;
            return this;
            
        }
        
        public Carrito build(){
            
            return new Carrito(id, marca,color,numeroPuertas);
        }
        
        
    } 

    @Override
    public String toString() {
        return "Carrito{" + "id=" + id + ", marca=" + marca + ", color=" + color + ", numeroPuertas=" + numeroPuertas + '}';
    }
    
    
    
    
}
