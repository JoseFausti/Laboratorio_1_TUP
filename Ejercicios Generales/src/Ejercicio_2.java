import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {


/* Contar las cifras de un número entero en Java
Programa Java que pide un número entero por teclado y calcula y muestra el número
 de cifras que tiene.

Por ejemplo si se introduce el número 54391 el programa mostrará el mensaje:

El número tiene 5 cifras

Si se introduce el número 101 se mostrará el mensaje:

El número tiene 3 cifras

El proceso leer un número y contar sus cifras se repetirá hasta que se conteste ‘N’
 a la pregunta Continuar? (S/N)
Si se responde 'S' se volverá a pedir otro número.

 */
        String operador ="S";

        while (!(operador.equals("N"))){
            int contador = 0;
            Scanner uno = new Scanner(System.in);
            System.out.println("Ingrese un numero entero: ");
            int numero = uno.nextInt();
            while (numero != 0){

                contador = contador + 1;
                numero = numero / 10;

                }
            System.out.println("Su número contiene: "+contador+" cifras.");
            System.out.println("Ingrese N para salir");
            System.out.println("Ingrese S para continuar");

            Scanner dos = new Scanner(System.in);
            operador = dos.next();

            if(operador == "N" || operador == "n"){
                break;
            }

        }
    }

}

