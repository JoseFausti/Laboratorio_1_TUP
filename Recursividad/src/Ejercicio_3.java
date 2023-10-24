import java.util.Scanner;

public class Ejercicio_3 {
    public class Ejercicio3 {
        public static void main(String[] args) {
            int n;
            Scanner uno = new Scanner(System.in);
            System.out.println("Ingrese un número:");
            n = uno.nextInt();
            long resultado = calcularPotenciaDeDos(n);
            System.out.println("2^" + n + " = " + resultado);
        }

        public static long calcularPotenciaDeDos(int n) {
            // Caso base: 2^0 = 1
            if (n == 0) {
                return 1;
            } else {
                // Caso recursivo: 2^n = 2 * 2^(n-1)
                return 2 * calcularPotenciaDeDos(n - 1);
            }
        }
    }
}
