package Ejercicios;
// next.charAt(0)..sirve para leer un solo caracter (en la posicion 0 en este caso) de un string //

/* Programa java para comprobar si un año es bisiesto.

El programa pide que se introduzca el valor de un año por teclado y calcula si es un año bisiesto
 o no lo es.

Un año es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400. */
import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner uno = new Scanner(System.in);
        int Anio;
        System.out.println("Ingrese un año: ");
        Anio = uno.nextInt();
        if (((Anio % 4 == 0) && (Anio % 10 != 0)) || (Anio % 400 == 0)) {
            System.out.println("El Año "+ Anio +" es un año bisiesto.");
        }else {
            System.out.println("El Año "+ Anio +" no es un año bisiesto.");
        }
    }
}

