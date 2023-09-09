import Strategy.Accion;
import Strategy.AccionHandler;
import java.util.Map;
import java.util.Scanner;



public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static final int OPCION_SALIR = 6;
    public static void main(String[] args) {

        Menu menu = Menu.getInstance();

        Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        int opcion;

        do {
            System.out.println("");
            System.out.println("Ingrese una opcion: 1. Crear  2. Clonar 3. Ver 4. Eliminar  6.Salir");

            opcion = scanner.nextInt();

            scanner.nextLine();

            Accion accion =strategy.get(opcion);

            if (opcion == OPCION_SALIR ) {continue;}

            if (accion==null){
                System.out.println("Esta opcion no existe");
                System.out.print(" ");

            } else {

                accion.Aplicar();
            }


        } while (opcion != OPCION_SALIR);

        System.out.println("");

    }


    }
