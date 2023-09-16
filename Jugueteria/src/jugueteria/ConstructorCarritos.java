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
public class ConstructorCarritos {
    
     private int id;
     private String color;
     private String marca;
     private int num_puertas;
        
    
   
    public ConstructorCarritos(int id, String color, String marca, int num_puertas) {
        this.id = id;
        this.color=color;
        this.marca=marca;
        this.num_puertas=num_puertas;
        
    }

    
    public static Constructor builder (){

        return new Constructor();

    }


    public static class Constructor{
        
        private int id;
        private String color;
        private String marca;
        private int num_puertas;

               
        public Constructor id(int id){

              this.id= id;

              return this;

        }
        
        public Constructor color(String color){
            
            this.color=color;
            
            return this;
        }
        
        public Constructor marca(String marca){
            
            this.marca=marca;
            
            return this;
        }
        
        public Constructor num_puertas(int num_puertas){
            
            this.num_puertas=num_puertas;
            
            return this;
        }

            

        public ConstructorCarritos build(){

              return new ConstructorCarritos( id,color,marca,num_puertas);
          }



      }
    
}
