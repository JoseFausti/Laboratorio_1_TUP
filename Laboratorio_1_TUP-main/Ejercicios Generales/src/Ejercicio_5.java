import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        /* Contar números acabados en 2
Programa que lea una serie de números por teclado hasta que se lea un número negativo.
 El programa indicará cuántos números acabados en 2 se han leído.

Para saber si un número acaba en dos o en general para saber en qué dígito termina
 un número entero se divide el número entre 10 y se obtiene el resto de esta división.
En Java el operador que obtiene el resto de una división es el operador %
En este caso para saber si el número acaba en 2 escribiremos la instrucción:
if(n%10==2)*/

        int num = 0;
        int contador = 0;
        System.out.println("Ingrese un numero (ingrese un número negativo para salir): ");
        do {
            Scanner uno = new Scanner(System.in);

            num = uno.nextInt();
            if(num % 10 == 2){
                contador += 1;
            }
        }while (num >= 0);
        System.out.println("Se introdujeron "+ contador + " números acabados en 2");


    }
}
