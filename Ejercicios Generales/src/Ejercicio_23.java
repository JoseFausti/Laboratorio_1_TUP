import java.util.Scanner;

public class Ejercicio_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, suma, cifra;

        do {
            System.out.print("_Ingrese un numero entero positivo: ");
            numero = sc.nextInt();
            if (numero <= 0) {
                System.out.println("El numero ingresado no es valido");
            }
        } while (numero <= 0);

        suma = 0;     //Variable que contendrá la suma de las cifras del número

        while (numero != 0) {
            cifra = numero % 10;  //Se obtiene la ultima cifra del número
            suma = suma + cifra;  //Se suma la última cifra de n
            numero = numero / 10; //Se quita a numero la última cifra
        }

        System.out.println("La suma de las cifras es: " + suma);
    }

}