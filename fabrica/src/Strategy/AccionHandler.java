package Strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccionHandler {

    public AccionHandler(){}

    private static final List<Accion> ListaDeAcciones =

            List.of(new AccionCrear(),
                    new AccionVer(),
                    new AccionClonar(),
                    new AccionEliminar());

    public static Map<Integer, Accion> getStrategy(){

        Map<Integer, Accion> strategy = new HashMap<>();
        for (Accion accion: ListaDeAcciones) {

            strategy.put(accion.getOpcion(),accion);
        }
        return strategy;
    }
}
