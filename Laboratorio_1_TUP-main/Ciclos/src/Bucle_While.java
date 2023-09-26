import java.util.Scanner;

public class Bucle_While {
    public static void main(String[] args) {
        String nombre="";
        int contador =0;
        Scanner lector = new Scanner(System.in);
        while (contador < 10){
            System.out.println("Ingrese su nombre: ");
            nombre= lector.next();
            System.out.println(nombre);
            contador += 1;
        }

    }
}