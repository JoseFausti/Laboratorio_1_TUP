import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Ingrese un número mayor a 0: ");
            n = sc.nextInt();
        } while (n < 1);

        if (n == 1) {
            System.out.println("No es primo");
        } else {
            i = 2;    //i es el divisor
            while (n % i != 0) {
                i++;
            }
            if (i == n) {
                System.out.println("Primo");
            } else {
                System.out.println("No es primo");
            }
        }
    }
}