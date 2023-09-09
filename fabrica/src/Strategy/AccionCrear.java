package Strategy;


import java.util.Scanner;

public class AccionCrear implements Accion{

    private static Scanner scanner = new Scanner(System.in);

    private String color;
    private String relleno;
    private String materialExterior;
    private String marca;
    private int numeroPuertas;



    int opcion;
    @Override
    public void Aplicar() {

        System.out.println("Ingrese una opcion: 1. Crear Peluche 2. Crear Carrito ");

        opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion ==1){

            System.out.println("Ingrese un color para el peluche ");
            color= scanner.next();

            System.out.println("Ingrese el tipo de material de relleno (Algodon, espuma)");
            relleno= scanner.next();

            System.out.println("Ingrese el tipo de material exterior (Tela, Plastico)");
            materialExterior= scanner.next();





        }

        if (opcion ==2){

            System.out.println("Ingrese un color para el carrito ");
            color= scanner.next();

            System.out.println("Ingrese el tipo de marca del carrito");
            marca= scanner.next();

            System.out.println("Ingrese el numero de puertas");
            numeroPuertas= scanner.nextInt();

        }


    }

    @Override
    public int getOpcion() {
        return 1;
    }
}
