/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria;

/**
 *
 * @author Personal
 */
public interface Juguete {    
    
          
     public int getId();
     
     void setId(int id);
           
     public String getColor();
     
     void setColor(String color);
     
     Juguete clone();
     
     
          
       
        
}
