package Ejercicios;
// next.charAt(0)..sirve para leer un solo caracter (en la posicion 0 en este caso) de un string

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

