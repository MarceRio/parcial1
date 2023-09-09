package factorymethod;

public class Carrito implements Juguete{


    private int id;
    private String marca;
    private String numeroPuertas;

    private String color;




    public Carrito (int id, String marca, String numeroPuertas,String color ){

        this.id = id;
        this.marca=marca;
        this.numeroPuertas= numeroPuertas;
        this.color=color;

    }

    public static CarritoBuilder builder (){

        return new CarritoBuilder();

    }

    public static class CarritoBuilder{

        public CarritoBuilder id(int id){
            this.id= id;
            return this;

        }

        public CarritoBuilder color (String color){

            this.color= color;

            return this;

        }

        public Empleado build(){

            return new Empleado(nombre, id);
        }


        @Override
    public String getColor() {

        return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroPuertas() {

        return numeroPuertas;
    }


}
