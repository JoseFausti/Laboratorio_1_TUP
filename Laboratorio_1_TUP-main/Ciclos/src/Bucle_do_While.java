import java.util.Scanner;

public class Bucle_do_While {
    public static void main(String[] args) {
        String nombre = "";
        int contador = 10;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("Ingrese su nombre: ");
            nombre = lector.next();
            System.out.println(nombre);
            contador -= 1;
        } while (contador < 4);
    }
}

