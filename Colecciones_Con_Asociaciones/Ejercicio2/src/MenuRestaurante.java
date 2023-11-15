import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurante {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<Plato> platos= new ArrayList<>();

        boolean salirPlato;
        do {
            // Crear un nuevo plato
            System.out.println("INGRESE INFO DEL PLATO");
            System.out.print("INGRESE NOMBRE COMPLETO: ");
            String nombreCompleto = scanner.nextLine();
            System.out.print("INGRESE PRECIO: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("¿INGRESE SI ES BEBIDA? (true/false): ");
            boolean esBebida = scanner.nextBoolean();
            scanner.nextLine();

            ArrayList<Ingrediente> ingredientes = new ArrayList<>();
            boolean salirIngredientes;
            if (!esBebida) {
                do {
                    // Crear una nuevo ingrediente
                    System.out.println("INGRESE INGREDIENTES");
                    System.out.print("INGRESE NOMBRE: ");
                    String nombre = scanner.nextLine();
                    System.out.print("INGRESE CANTIDAD: ");
                    double cantidad = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("INGRESE UNIDAD DE MEDIDA: ");
                    String unidadDeMedida = scanner.nextLine();


                    // Agregar la nota a la lista de ingredientes del plato
                    ingredientes.add(new Ingrediente(nombre, cantidad, unidadDeMedida));

                    // Preguntar si desea salir de la carga de ingredientes
                    System.out.print("¿DESEA SALIR DE LA CARGA DE INGREDIENTES? (true/false): ");
                    salirIngredientes = scanner.nextBoolean();
                    scanner.nextLine();

                } while (!salirIngredientes);
            }

            // Crear el objeto Plato con los Ingredientes y agregarlo a la lista de platos
            platos.add(new Plato(nombreCompleto, precio, esBebida, ingredientes));

            // Preguntar si desea salir de la carga de platos
            System.out.print("¿DESEA SALIR DE LA CARGA DE PLATOS? (true/false): ");
            salirPlato = scanner.nextBoolean();
            scanner.nextLine();

        } while (!salirPlato);

        System.out.println("-----------MENÚ-----------");
        for (Plato plato: platos ) {
            System.out.println(plato.getNombreCompleto());
            System.out.println("$"+plato.getPrecio());
            if (!plato.getEsBebida()){
                System.out.println("Ingredientes: ");
                for (Ingrediente ingre: plato.getArrayIngredientes()) {
                    System.out.println(ingre.getNombre()+": "+ingre.getCantidad()+" "+ingre.getUnidadDeMedida());
                }
            }
            System.out.println("--------------------------");
        }
    }
}