package factorymethod;

public class CreadorPeluche implements CreadorJuguete{


    @Override
    public Juguete crear() {
        return new Peluche();
    }
}
