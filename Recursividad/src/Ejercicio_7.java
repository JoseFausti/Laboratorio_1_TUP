import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduzca dividendo: ");
        n1 = sc.nextInt();
        do {
            System.out.print("Introduzca divisor (>0): ");
            n2 = sc.nextInt();
        } while (n1 <= 0);
        System.out.printf("%d%%%d = %d %n", n1, n2, restoRecursivo(n1, n2));
    }

    //método que calcula el resto de la división de forma recursiva
    public static int restoRecursivo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return restoRecursivo(a - b, b);
        }
    }
}
