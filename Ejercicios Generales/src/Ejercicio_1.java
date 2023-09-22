
public class Ejercicio_1 {

    public static void main(String[] args) {

/* INTERCAMBIO DE VALORES ENTRE DOS VARIABLES UTILIZANDO UNA VARIABLE AUXILIAR.

Programa para intercambiar el valor de dos variables.
Los valores iniciales se leen por teclado.

Por ejemplo, suponiendo que las variables se llaman A y B,
si A contiene 3 y B contiene 5, después del intercambio A contendrá 5 y B 3.

En este ejemplo, para intercambiar el valor entre dos variables
utilizaremos una avariable auxiliar donde guardar el valor de una de ellas.
 Después veremos la forma de hacerlo sin usar una variable auxiliar para el intercambio.

Las instrucciones a realizar son:

AUX = A;
A = B;
B = AUX;
*/

        int A = 3;
        int B = 5;
        System.out.println("Antes del intercambio: A="+A+"; B="+B);
        int Aux = A;
        A = B;
        B = Aux;
        System.out.println("Después del intercambio: A="+A+"; B="+B);
    }
}
