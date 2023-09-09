package factorymethod;

public class CreadorCarrito implements CreadorJuguete {


    @Override
    public Juguete crear() {

        return Carrito.builder();
    }
}
