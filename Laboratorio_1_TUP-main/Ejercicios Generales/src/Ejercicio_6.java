import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        /* Número perfecto en java
Qué es un número perfecto?

Un número es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio número.

Por ejemplo, el número 6 es perfecto.

El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor para comprobar si es perfecto.

Si sumamos 1 + 2 + 3 = 6

Los siguientes números perfectos después del 6 son 28, 496, 8128, 33550336, 8589869056.

En esta entrada vamos a desarrollar el algoritmo para comprobar si un número es perfecto.
El programa pide por teclado un número y muestra si es perfecto o no. mediante un bucle
for sumaremos los divisores del número.
 Al final si esta suma es igual al número mostraremos el mensaje correspondiente.*/
        int numero;
        int suma = 0;
        System.out.println("Ingrese un número para saber si es o no perfecto: (El numero debe ser positivo)");
        Scanner uno = new Scanner(System.in);
        numero = uno.nextInt();
        if (numero > 0){
            for (int i = 1; i < numero; i++){
                if (numero % i == 0){
                    suma += i;
                }
            }
            if (suma == numero){
                System.out.println("El número "+ numero + " es un número perfecto.");
            }else {
                System.out.println("El número "+ numero + " no es un número perfecto.");
            }
        }else{
            System.out.println("Numero incorrecto. Reinicie el programa.");
        }

    }
}
