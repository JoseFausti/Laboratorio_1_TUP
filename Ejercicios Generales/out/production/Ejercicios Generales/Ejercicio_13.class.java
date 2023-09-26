import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = lector.nextInt();

        if (esCapicua(numero)) {
            System.out.println(numero + " es un número capicúa.");
        } else {
            System.out.println(numero + " no es un número capicúa.");
        }
    }

    public static boolean esCapicua(int numero) {
        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        return original == invertido;
    }
}

