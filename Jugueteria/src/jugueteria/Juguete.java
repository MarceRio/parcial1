/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Personal
 */
public class Juguete {
    
    private int id;
    private String relleno;
    private String color;
    private String material;
    private int num_puertas;
    private String marca;
    
    
    
    
    //public static Juguete instance;
    
    //public static Juguete getInstance(int id,String relleno, String color,String material,int num_puertas,String marca){

      //  if (instance== null){

        //    instance= new Juguete(id,relleno,color,material,num_puertas,marca);
            
        //}

        //return instance;
    //}
       
    
    @Override
    public Juguete clone() {
        return new Juguete(this);
    }
    
    public Juguete (Juguete juguete) {
                       
        this.relleno=juguete.relleno;
        this.color=juguete.color;
        this.material=juguete.material;
        this.num_puertas=juguete.num_puertas;
        this.marca=juguete.marca;

        }
    

    public Juguete (int id,String relleno, String color,String material,int num_puertas,String marca){
        
        this.id=id;
        this.relleno=relleno;
        this.color=color;
        this.material=material;
        this.num_puertas=num_puertas;
        this.marca=marca;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Juguete{" + "id=" + id + ", relleno=" + relleno + ", color=" + color + ", material=" + material + ", num_puertas=" + num_puertas + ", marca=" + marca + '}';
    }

    
    
    

}
    
