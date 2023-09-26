import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = lector.nextInt();
        long factorial = calcularFactorial(numero);

        System.out.println(numero + "! = " + factorial);
    }

    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
