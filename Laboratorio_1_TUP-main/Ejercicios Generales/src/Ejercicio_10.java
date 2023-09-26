import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        /*Pasar un número de binario a decimal en Java
CONVERTIR UN NÚMERO DE BINARIO A DECIMAL EN JAVA
El programa para pasar un número expresado en binario a decimal se basa en la forma tradicional
 de hacerlo. Los dígitos del número binario ocupan una posición que se numera de derecha a
  izquierda empezando por cero. La posición del dígito más a la derecha es la 0.
Numero Binario:
110101
Posición que ocupa cada dígito
543210
Para pasar el número a decimal se multiplica cada dígito binario por 2 elevado a la posición que ocupa.
 La suma de todos los productos es el equivalente en decimal.*/

        long numero, aux, digito, decimal;
        int exponente;
        boolean esBinario;
        Scanner sc = new Scanner(System.in);

        //Leer un número por teclado y comprobar que es binario
        do {
            System.out.print("Introduce un numero binario: ");
            numero = sc.nextLong();
            //comprobamos que sea un número binario es decir
            //que este formado solo por ceros y unos
            esBinario = true;
            aux = numero;
            while (aux != 0) {
                digito = aux % 10; //última cifra del números
                if (digito != 0 && digito != 1) { //si no es 0 ó 1
                    esBinario = false; //no es un número binario
                }
                aux = aux / 10; //quitamos la última cifra para repetir el proceso
            }
        } while (!esBinario); //se vuelve a pedir si no es binario

        //proceso para pasar de binario a decimal
        exponente = 0;
        decimal = 0; //será el equivalente en base decimal
        while (numero != 0) {
            //se toma la última cifra
            digito = numero % 10;
            //se multiplica por la potencia de 2 correspondiente y se suma al número
            decimal = decimal + digito * (int) Math.pow(2, exponente);
            //se aumenta el exponente
            exponente++;
            //se quita la última cifra para repetir el proceso
            numero = numero / 10;
        }
        System.out.println("Decimal: " + decimal);
    }
}