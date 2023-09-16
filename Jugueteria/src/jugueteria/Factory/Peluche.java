package jugueteria.Factory;

import jugueteria.Juguete;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class Peluche implements JugueteIF{
    
       
    private int id; 
    private String materialExterior;
    private String color;
    private String relleno;

    public Peluche(int id, String materialExterior, String color, String relleno) {
        this.id = id;
        this.materialExterior = materialExterior;
        this.color = color;
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return "Peluche{" + "id=" + id + ", materialExterior=" + materialExterior + ", color=" + color + ", relleno=" + relleno + '}';
    }
    
    
    
    
    public String getMaterialExterior() {
        return materialExterior;
    }

    public void setMaterialExterior(String materialExterior) {
        this.materialExterior = materialExterior;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
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
