import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {

        int numero, auxiliar, posicion_mayor, cifra, mayor, posicion, numero_de_cifras;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("_ Ingrese un número mayor a 0: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        // Se copia el número en una variable auxiliar
        auxiliar = numero;
        //Se obtiene el número de cifras que tiene el número ingresado
        numero_de_cifras = 0;
        while (auxiliar != 0) {
            numero_de_cifras++;
            auxiliar= auxiliar / 10;
        }

        mayor = 0;//Variable que contendrá el valor de la cifra mayor
        posicion_mayor = 0; //Variable que contendrá la posición donde se encuentra la cifra mayor del número
        posicion = 0; //Variable que contendrá la posición de la cifra con la que se esta trabajando
        for(int i = numero_de_cifras-1; i >= 0; i--){
            posicion++;
            cifra = numero / (int)Math.pow(10, i); //Se obtiene la primera cifra de la izquierda del número
            if (cifra > mayor) {
                mayor = cifra;
                posicion_mayor = posicion;
            }
            numero = numero % (int)Math.pow(10, i); //Se le quita al número su primera cifra de la izquierda.
        }

        System.out.print("La cifra mayor: " + mayor);
        System.out.println(" Posición de la cifra: " + posicion_mayor);
    }
}
