import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        /*Fibonacci en java
La serie de fibonacci la forman una serie de números tales que:

El primer término de la serie es el número 1
El segundo término de la serie es el número 1
Los siguientes términos de la serie de fibonacci se obtienen de la suma de los dos anteriores:

1, 1, 2, 3, 5, 8, 13, .....

Vamos a escribir el programa java que muestra los N primeros números de la serie.
 El valor de N se lee por teclado.*/

        Scanner uno = new Scanner(System.in);
        int numero,fibo1,fibo2;

        do{
            System.out.print("Introduce un numero mayor que 1: ");
            numero = uno.nextInt();
        }while(numero<=1);

        System.out.println("Los " + numero + " primeros numeros de la serie de Fibonacci son:");

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(int i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}
