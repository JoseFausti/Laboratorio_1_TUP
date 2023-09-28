import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, mayor;

        System.out.print("Ingrese número o 0 para finalizar la ejecución : ");
        n = sc.nextInt();

        mayor = n;

        while (n != 0) {
            if (n > mayor) {
                mayor = n;
            }
            System.out.print("Introduce número, para acabar introduce 0: ");
            n = sc.nextInt();
        }


        if (mayor == 0) {
            System.out.println("No se han ingreado números");
        } else {
            System.out.println("El número mas grande es : " + mayor);
        }
    }
}
