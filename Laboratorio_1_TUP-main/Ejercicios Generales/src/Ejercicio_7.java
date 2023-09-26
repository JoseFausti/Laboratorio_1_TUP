import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        /*Números amigos en Java
COMPROBAR SI DOS NÚMEROS SON AMIGOS
Dos números enteros positivos A y B son números amigos si la suma de los divisores propios
de A es igual a B y la suma de los divisores propios de B es igual a A.

Los divisores propios de un número incluyen la unidad pero no el propio número.

Un ejemplo de números amigos son los números 220 y 284.
Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
La suma de los divisores propios de 220 da como resultado 284
Los divisores propios de 284 son 1, 2, 4, 71 y 142.
La suma de los divisores propios de 284 da como resultado 220.
Por lo tanto 220 y 284 son amigos.

Otras parejas de números amigos son:

 1184,   1210
 2620,   2924
 5020,   5564
 6232,   6368
10744, 10856
12285, 14595
17296, 18416

Vamos a escribir el programa que calcula si dos números son amigos:*/

        int numA;
        int sumaA = 0;
        int numB;
        int sumaB = 0;
        Scanner uno = new Scanner(System.in);
        System.out.println("Ingrese el 1º numero positivo: ");
        numA = uno.nextInt();
        Scanner dos = new Scanner(System.in);
        System.out.println("Ingrese el 2º numero positivo: ");
        numB = dos.nextInt();
        for (int i = 1; i < numA; i++){
            if (numA % i == 0){
                sumaA += i;
            }
        }
        for (int j = 1; j < numA; j++){
            if (numB % j == 0){
                sumaB += j;
            }
        }

        if (sumaA == numB && sumaB == numA){
            System.out.println( numA + " y el " + numB + " son numeros amigos.");
        }else{
            System.out.println( numA + " y el " + numB + " no son numeros amigos.");
        }




    }
}
