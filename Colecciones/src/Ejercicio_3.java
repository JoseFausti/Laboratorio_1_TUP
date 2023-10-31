import java.util.ArrayList;
import java.util.Random;

public class Ejercicio_3 {

    public static void main(String[] args) {
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        Random random = new Random();
        System.out.println("----------------------------------");
        System.out.println("      _ NUMEROS ALEATORIOS _      ");
        System.out.println("----------------------------------");
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = random.nextInt(100);
            numerosAleatorios.add(numeroAleatorio);
        }
        int suma = 0;
        for (int numero : numerosAleatorios) {
            suma += numero;
        }
        double promedio = (double) suma / numerosAleatorios.size();
        int mayoresQuePromedio = 0;
        int menoresQuePromedio = 0;

        for (int numero : numerosAleatorios) {
            System.out.print("_" + numero + " ");
            if (numero > promedio) {
                mayoresQuePromedio++;
            } else if (numero < promedio) {
                menoresQuePromedio++;
            }
        }

        System.out.println("\n----------------------------------");
        System.out.println("_ El promedio aritmético es: " + promedio);
        System.out.println("_ Números mayores que el promedio: " + mayoresQuePromedio);
        System.out.println("_ Números menores que el promedio: " + menoresQuePromedio);
    }
}
