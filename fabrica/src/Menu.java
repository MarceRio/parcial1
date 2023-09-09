import Strategy.AccionHandler;
import factorymethod.Juguete;

import java.util.ArrayList;
import java.util.List;

public class Menu {


    private List<Juguete> juguete = new ArrayList<>();

    private AccionHandler accion = new AccionHandler();

    private static Menu instance;

    private Menu (){

    }
    public static Menu getInstance(){

        if (instance== null){

            instance= new Menu ();
        }

        return instance;
    }

    public static void retornarMenu (){



    }

}
