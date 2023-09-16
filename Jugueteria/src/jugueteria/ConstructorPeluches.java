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
public class ConstructorPeluches {
    
        
    private int id;
    private String relleno;
    private String color;
    private String material;
        
    
   
    public ConstructorPeluches(int id, String relleno, String color, String material) {
        this.id = id;
        this.relleno = relleno;
        this.color = color;
        this.material = material;
        
    }

    
    public static Constructor builder (){

        return new Constructor();

    }

   
    public static class Constructor{
        
        private int id;
        private String relleno;
        private String color;
        private String material;

               
        public Constructor id(int id){

              this.id= id;

              return this;

        }
        
        public Constructor relleno(String relleno){
            
            this.relleno=relleno;
            
            return this;
        }
        
        public Constructor color(String color){
            
            this.color=color;
            
            return this;
        }
        
        public Constructor material(String material){
            
            this.material=material;
            
            return this;
        }

            

        public ConstructorPeluches build(){

              return new ConstructorPeluches( id,relleno,color,material);
          }



      }


    }

    
    
    
    

