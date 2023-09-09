package factorymethod;

public class Peluche implements Juguete{

    private String materialExterior;
    private String relleno;

    private int id;

    private String color;



    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getId() {
        return 0;
    }


    public String getMaterialExterior() {
        return materialExterior;
    }

    public String getRelleno() {
        return relleno;
    }


}
