import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner uno = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce un numero entero mayor 0: ");
            num = uno.nextInt();
        } while (num <= 0);
        System.out.println("Suma desde 1 hasta " + num + " = " + suma1N(num));

    }

    public static double suma1N(int n) {
        if (n == 1) { //caso base
            return 1;
        } else {
            return n + suma1N(n - 1);

        }
    }
}