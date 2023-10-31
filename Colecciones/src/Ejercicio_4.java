import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_4 {

    public class Main {
        public static int busquedaSecuencial(ArrayList<Integer> listaDeEnteros, int num) {
            for (int i = 0; i < listaDeEnteros.size(); i++) {
                if (listaDeEnteros.get(i) == num) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            ArrayList<Integer> listaDeEnteros = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 50; i++) {
                int numeroAleatorio = random.nextInt(100);
                listaDeEnteros.add(numeroAleatorio);
            }
            Scanner lector = new Scanner(System.in);
            System.out.println("Ingrese un número aleatorio entre 0 y 100 para saber si se encuentra en una lista de números generados al azar:");
            int num = lector.nextInt();
            int indice = busquedaSecuencial(listaDeEnteros, num);
            if (indice != -1) {
                System.out.println("El número ingresado " + num + " está en el array en el índice " + indice);
            } else {
                System.out.println("El número ingresado " + num + " no está en el array.");

            }
        }
    }
}
