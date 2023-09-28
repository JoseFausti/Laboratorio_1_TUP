import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        int num, numCifras, aux, i, digito;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingrese un número mayor a 0: ");
            num = sc.nextInt();
        } while (num < 1);


        aux = num;
        numCifras = 0;
        while (aux != 0) {
            aux = aux / 10;
            numCifras++;
        }

        for (i = numCifras - 1; i >= 0; i--) {
            digito = num / (int) Math.pow(10, i);
            System.out.print(digito + " ");
            num = num % (int) Math.pow(10, i);
        }
    }
}
