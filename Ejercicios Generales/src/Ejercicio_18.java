import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        int numero, cifra, nuevoNumero;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Ingrese  un numero mayor a 0: ");
            numero = sc.nextInt();
        } while (numero < 1);

        nuevoNumero = 0;

        while (numero != 0) {
            cifra = numero % 10;
            numero = numero / 10;
            nuevoNumero = nuevoNumero * 10 + cifra;
        }

        numero = nuevoNumero;

        System.out.println("El número invertido es:" + numero);
    }
}

