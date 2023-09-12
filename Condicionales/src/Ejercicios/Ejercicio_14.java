package Ejercicios;
/*Comprobar si un número de tres cifras es capicúa

Programa java para comprobar si un número entero de tres cifras es capicúa.

El programa pide que se introduzca un número entero y comprueba si el número es capicúa
o no lo es. Si el número introducido no tiene tres cifras se muestra un mensaje indicándolo y el programa finaliza.

Un número es capicúa si se puede leer igual de izquierda a derecha que de derecha a izquierda. Por ejemplo los números 1221,
35053, 969 ... son capicúa.

Como el programa pide que el número introducido sea de tres ciftras, para comprobar si es capicúa solo tendremos que comprobar
si la primera cifra y la última son iguales. */

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        int numero;
        Scanner dos = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        numero = dos.nextInt();
        if (numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 && numero % 7 != 0){
            System.out.println("El numero "+numero+" es un número primo");
        }else {
            System.out.println("El numero "+numero+" no es un número primo");
        }
    }
}
