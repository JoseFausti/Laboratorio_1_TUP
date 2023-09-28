import java.util.Scanner;

public class Ejercicio_24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, auxiliar, cifra, numero_de_cifras = 0;
        double suma;

        do {
            System.out.print("_Ingrese un número entero positivo: ");
            numero = sc.nextInt();
            if (numero <= 0) {
                System.out.println("El numero ingresado no es valido");
            }
        } while (numero <= 0);

        //Se cuentan las cifras del número
        auxiliar = numero;
        while (auxiliar != 0) {
            numero_de_cifras++;
            auxiliar /= 10;
        }

        suma = 0; //Variable que contendrá la suma de las cifras
        auxiliar = numero;
        while (auxiliar != 0) {
            cifra = auxiliar % 10; //Se obtiene la última cifra
            suma = suma + Math.pow(cifra, numero_de_cifras); //Se eleva la cifra al número de cifras y se suma
            auxiliar /= 10;     //Se quita al número la última cifra
        }

        if (suma == numero) {
            System.out.println("Es narcisista");
        } else {
            System.out.println("No es narcisista");
        }
    }

}