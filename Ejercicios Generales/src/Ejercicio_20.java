import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        int numero, posicion_mayor, cifra, mayor, posicion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("_ Ingrese un número entero: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        mayor = 0; //Esta variable contendra el valor de la cifra mayor.
        posicion_mayor = 0; //Esta variable contendra la posición donde se encuentra la cifra mayor del número
        posicion = 0; //Esta variable contendrá la posición de la cifra con la que estamos trabajando

        while (numero != 0) {
            posicion++;
            cifra = numero % 10; //Se obtiene la cifra de la derecha del número
            if (cifra >= mayor) {
                mayor = cifra; // Se toma como nueva mayor
                posicion_mayor = posicion; //Se guarda su posición
            }
            numero = numero / 10; //Se le quita al número su última cifra de la derecha.
        }                         //Se repite el proceso mientras al número le queden cifras (num!=0)

        System.out.print("La cifra mayor es: " + mayor);

        System.out.println("Su posición es: " + posicion_mayor);
    }
}
