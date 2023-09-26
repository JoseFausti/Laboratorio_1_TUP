import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        
        /*Decimal a binario en java
En esta entrada vamos a escribir el programa java para convertir un número de decimal a binario.

Para escribir el programa nos vamos a basar en la forma clásica de pasar de decimal a binario, 
o sea, dividir el número entre 2 y quedarnos con el resto de la división. Esta cifra, que será 
un cero o un uno, es el dígito de menos peso (más a la derecha) del número binario. 
A continuación volvemos a dividir el cociente que hemos obtenido entre 2 y nos quedamos
 con el resto de la división. Esta cifra será la segunda por la derecha del número binario.
  Esta operación se repite hasta que obtengamos un cero como cociente.
*/
        
        int numero;
        int digito;
        String binario="";
        Scanner uno = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo para transformarlo a binario: ");
        do{
            numero = uno.nextInt();
            if (numero < 0){
                System.out.println("Intente de nuevo...");
            }
        }while (numero < 0);

        while (numero > 0){
             digito = numero % 2;
             binario = digito + " " + binario ;
             numero /= 2;
        }
        System.out.println("Su numero transformado a binario es: ");
        System.out.println(binario);
    }
}
