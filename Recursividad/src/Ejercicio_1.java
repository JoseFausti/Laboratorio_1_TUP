import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, divi;

        System.out.print("Introduzca dividendo: ");
        num = sc.nextInt();

        do {
            System.out.println("Introdusca el divisor mayor a 0: ");
            divi = sc.nextInt();
        } while (divi < 0);

        int result = cociente(num, divi);
        System.out.println("El cociente de " + num + " y " + divi + " es " + result);

    }

    public static int cociente(int n1, int n2) {

        if (n1 < n2) {
            return 0;
        } else {
            return 1 + cociente(n1 - n2, n2);
        }
    }
}
